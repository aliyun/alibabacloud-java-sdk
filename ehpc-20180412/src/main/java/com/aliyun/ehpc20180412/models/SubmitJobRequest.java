// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitJobRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CommandLine")
    public String commandLine;

    @NameInMap("RunasUser")
    public String runasUser;

    @NameInMap("RunasUserPassword")
    public String runasUserPassword;

    @NameInMap("Name")
    public String name;

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

    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    @NameInMap("UnzipCmd")
    public String unzipCmd;

    @NameInMap("PostCmdLine")
    public String postCmdLine;

    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("JobQueue")
    public String jobQueue;

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

    @NameInMap("ClockTime")
    public String clockTime;

    public static SubmitJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobRequest self = new SubmitJobRequest();
        return TeaModel.build(map, self);
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

    public SubmitJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public SubmitJobRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public SubmitJobRequest setStdoutRedirectPath(String stdoutRedirectPath) {
        this.stdoutRedirectPath = stdoutRedirectPath;
        return this;
    }
    public String getStdoutRedirectPath() {
        return this.stdoutRedirectPath;
    }

    public SubmitJobRequest setStderrRedirectPath(String stderrRedirectPath) {
        this.stderrRedirectPath = stderrRedirectPath;
        return this;
    }
    public String getStderrRedirectPath() {
        return this.stderrRedirectPath;
    }

    public SubmitJobRequest setReRunable(Boolean reRunable) {
        this.reRunable = reRunable;
        return this;
    }
    public Boolean getReRunable() {
        return this.reRunable;
    }

    public SubmitJobRequest setArrayRequest(String arrayRequest) {
        this.arrayRequest = arrayRequest;
        return this;
    }
    public String getArrayRequest() {
        return this.arrayRequest;
    }

    public SubmitJobRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

    public SubmitJobRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public SubmitJobRequest setUnzipCmd(String unzipCmd) {
        this.unzipCmd = unzipCmd;
        return this;
    }
    public String getUnzipCmd() {
        return this.unzipCmd;
    }

    public SubmitJobRequest setPostCmdLine(String postCmdLine) {
        this.postCmdLine = postCmdLine;
        return this;
    }
    public String getPostCmdLine() {
        return this.postCmdLine;
    }

    public SubmitJobRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SubmitJobRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public SubmitJobRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public SubmitJobRequest setTask(Integer task) {
        this.task = task;
        return this;
    }
    public Integer getTask() {
        return this.task;
    }

    public SubmitJobRequest setThread(Integer thread) {
        this.thread = thread;
        return this;
    }
    public Integer getThread() {
        return this.thread;
    }

    public SubmitJobRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public SubmitJobRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public SubmitJobRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
    }

}
