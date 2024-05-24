// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ReleaseDetail extends TeaModel {
    @NameInMap("bizStatus")
    public String bizStatus;

    @NameInMap("envName")
    public String envName;

    @NameInMap("finishedTime")
    public String finishedTime;

    @NameInMap("gitEventSnapshot")
    public GitEventSnapshot gitEventSnapshot;

    @NameInMap("latestTaskExecError")
    public TaskExecError latestTaskExecError;

    @NameInMap("message")
    public String message;

    @NameInMap("pipelineName")
    public String pipelineName;

    @NameInMap("pipelineTriggerEventName")
    public String pipelineTriggerEventName;

    @NameInMap("releaseOutputs")
    public java.util.Map<String, ?> releaseOutputs;

    @NameInMap("repositorySnapshot")
    public RepositorySpec repositorySnapshot;

    @NameInMap("templateConfigSnapshot")
    public TemplateConfig templateConfigSnapshot;

    public static ReleaseDetail build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDetail self = new ReleaseDetail();
        return TeaModel.build(map, self);
    }

    public ReleaseDetail setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public ReleaseDetail setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public ReleaseDetail setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public ReleaseDetail setGitEventSnapshot(GitEventSnapshot gitEventSnapshot) {
        this.gitEventSnapshot = gitEventSnapshot;
        return this;
    }
    public GitEventSnapshot getGitEventSnapshot() {
        return this.gitEventSnapshot;
    }

    public ReleaseDetail setLatestTaskExecError(TaskExecError latestTaskExecError) {
        this.latestTaskExecError = latestTaskExecError;
        return this;
    }
    public TaskExecError getLatestTaskExecError() {
        return this.latestTaskExecError;
    }

    public ReleaseDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseDetail setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ReleaseDetail setPipelineTriggerEventName(String pipelineTriggerEventName) {
        this.pipelineTriggerEventName = pipelineTriggerEventName;
        return this;
    }
    public String getPipelineTriggerEventName() {
        return this.pipelineTriggerEventName;
    }

    public ReleaseDetail setReleaseOutputs(java.util.Map<String, ?> releaseOutputs) {
        this.releaseOutputs = releaseOutputs;
        return this;
    }
    public java.util.Map<String, ?> getReleaseOutputs() {
        return this.releaseOutputs;
    }

    public ReleaseDetail setRepositorySnapshot(RepositorySpec repositorySnapshot) {
        this.repositorySnapshot = repositorySnapshot;
        return this;
    }
    public RepositorySpec getRepositorySnapshot() {
        return this.repositorySnapshot;
    }

    public ReleaseDetail setTemplateConfigSnapshot(TemplateConfig templateConfigSnapshot) {
        this.templateConfigSnapshot = templateConfigSnapshot;
        return this;
    }
    public TemplateConfig getTemplateConfigSnapshot() {
        return this.templateConfigSnapshot;
    }

}
