// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitJobRequest extends TeaModel {
    @NameInMap("ArrayRequest")
    public String arrayRequest;

    @NameInMap("ClockTime")
    public String clockTime;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CommandLine")
    public String commandLine;

    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("Gpu")
    public Integer gpu;

    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("Mem")
    public String mem;

    @NameInMap("Name")
    public String name;

    @NameInMap("Node")
    public Integer node;

    @NameInMap("PackagePath")
    public String packagePath;

    @NameInMap("PostCmdLine")
    public String postCmdLine;

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

    @NameInMap("Task")
    public Integer task;

    @NameInMap("Thread")
    public Integer thread;

    @NameInMap("UnzipCmd")
    public String unzipCmd;

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

    public SubmitJobRequest setClockTime(String clockTime) {
        this.clockTime = clockTime;
        return this;
    }
    public String getClockTime() {
        return this.clockTime;
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

    public SubmitJobRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SubmitJobRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public SubmitJobRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public SubmitJobRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public SubmitJobRequest setMem(String mem) {
        this.mem = mem;
        return this;
    }
    public String getMem() {
        return this.mem;
    }

    public SubmitJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitJobRequest setNode(Integer node) {
        this.node = node;
        return this;
    }
    public Integer getNode() {
        return this.node;
    }

    public SubmitJobRequest setPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }
    public String getPackagePath() {
        return this.packagePath;
    }

    public SubmitJobRequest setPostCmdLine(String postCmdLine) {
        this.postCmdLine = postCmdLine;
        return this;
    }
    public String getPostCmdLine() {
        return this.postCmdLine;
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

    public SubmitJobRequest setUnzipCmd(String unzipCmd) {
        this.unzipCmd = unzipCmd;
        return this;
    }
    public String getUnzipCmd() {
        return this.unzipCmd;
    }

    public SubmitJobRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
