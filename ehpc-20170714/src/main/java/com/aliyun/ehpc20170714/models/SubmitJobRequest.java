// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class SubmitJobRequest extends TeaModel {
    @NameInMap("ArrayRequest")
    public String arrayRequest;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CommandLine")
    public String commandLine;

    @NameInMap("Name")
    public String name;

    @NameInMap("PackagePath")
    public String packagePath;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ReRunable")
    public Boolean reRunable;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

    @NameInMap("StderrRedirectPath")
    public String stderrRedirectPath;

    @NameInMap("StdoutRedirectPath")
    public String stdoutRedirectPath;

    @NameInMap("Variables")
    public String variables;

    public static SubmitJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobRequest self = new SubmitJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitJobRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public SubmitJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SubmitJobRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public SubmitJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitJobRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public SubmitJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public SubmitJobRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public SubmitJobRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public SubmitJobRequest setRunasUserPassword(String runasUserPassword) {
        this.runasUserPassword = runasUserPassword;
        return this;
    }
    public String getRunasUserPassword() {
        return this.runasUserPassword;
    }

    public SubmitJobRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public SubmitJobRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public SubmitJobRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
