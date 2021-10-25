// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EditJobTemplateRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

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

    public static EditJobTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EditJobTemplateRequest self = new EditJobTemplateRequest();
        return TeaModel.build(map, self);
    }

    public EditJobTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EditJobTemplateRequest setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }
    public String getCommandLine() {
        return this.commandLine;
    }

    public EditJobTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EditJobTemplateRequest setRunasUser(String runasUser) {
        this.runasUser = runasUser;
        return this;
    }
    public String getRunasUser() {
        return this.runasUser;
    }

    public EditJobTemplateRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public EditJobTemplateRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public EditJobTemplateRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public EditJobTemplateRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public EditJobTemplateRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public EditJobTemplateRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public EditJobTemplateRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public EditJobTemplateRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

    public EditJobTemplateRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
    }

    public EditJobTemplateRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public EditJobTemplateRequest setTask(Integer task) {
        this.task = task;
        return this;
    }
    public Integer getTask() {
        return this.task;
    }

    public EditJobTemplateRequest setThread(Integer thread) {
        this.thread = thread;
        return this;
    }
    public Integer getThread() {
        return this.thread;
    }

    public EditJobTemplateRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public EditJobTemplateRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

}
