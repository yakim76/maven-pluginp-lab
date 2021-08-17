package org.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    @Parameter(property = "sayhi.greeting", defaultValue = "Hello World from Plugin!!!")
    private String greeting;
    @Parameter
    private boolean myBoolean;
    @Parameter
    private Integer myInteger;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(greeting + " " + myBoolean + " " + myInteger);
    }
}
