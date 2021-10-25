// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateRequest extends TeaModel {
    @NameInMap("CommandLine")
    public String commandLine;

    @NameInMap("Name")
    public String name;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("PackagePath")
    public String packagePath;

    @NameInMap("StdoutRedirectPath")
    public String stdoutRedirectPath;

    @NameInMap("StderrRedirectPath")
    public String stderrRedirectPath;

    @NameInMap("ReRunable")
    public Boolean reRunable;

    @NameInMap("ArrayRequest")
    public String arrayRequest;

    @NameInMap("Variables")
    public String variables;

    @NameInMap("Queue")
    public String queue;

    @NameInMap("ClockTime")
    public String clockTime;

    @NameInMap("Node")
    public Integer node;

    @NameInMap("Task")
    public Integer task;

    @NameInMap("Thread")
    public Integer thread;

    @NameInMap("Mem")
    public String mem;

    @NameInMap("Gpu")
    public Integer gpu;

    public static CreateJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateRequest self = new CreateJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public CreateJobTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateJobTemplateRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public CreateJobTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateJobTemplateRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public CreateJobTemplateRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public CreateJobTemplateRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public CreateJobTemplateRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public CreateJobTemplateRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public CreateJobTemplateRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public CreateJobTemplateRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public CreateJobTemplateRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
    }

    public CreateJobTemplateRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public CreateJobTemplateRequest setTask(Integer task) {
        this.task = task;
        return this;
    }
    public Integer getTask() {
        return this.task;
    }

    public CreateJobTemplateRequest setThread(Integer thread) {
        this.thread = thread;
        return this;
    }
    public Integer getThread() {
        return this.thread;
    }

    public CreateJobTemplateRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public CreateJobTemplateRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

}
