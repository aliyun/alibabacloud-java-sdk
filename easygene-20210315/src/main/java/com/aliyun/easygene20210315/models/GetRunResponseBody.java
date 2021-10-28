// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetRunResponseBody extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用版本
    @NameInMap("AppRevision")
    public String appRevision;

    // 作业信息
    @NameInMap("Calls")
    public String calls;

    // 提交时间
    @NameInMap("CreateTime")
    public String createTime;

    // 默认runtime值
    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    // 任务描述
    @NameInMap("Description")
    public String description;

    // 结束时间
    @NameInMap("EndTime")
    public String endTime;

    // 实体对象名称
    @NameInMap("EntityName")
    public String entityName;

    // 实体类型
    @NameInMap("EntityType")
    public String entityType;

    // 任务执行目录
    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    // 任务配置
    @NameInMap("ExecuteOptions")
    public GetRunResponseBodyExecuteOptions executeOptions;

    // 错误信息
    @NameInMap("Failures")
    public String failures;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 任务输入
    @NameInMap("Inputs")
    public String inputs;

    // 任务标签
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    // 输出拷贝目录
    @NameInMap("OutputFolder")
    public String outputFolder;

    // 任务输出
    @NameInMap("Outputs")
    public String outputs;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 任务ID
    @NameInMap("RunId")
    public String runId;

    // 任务名称
    @NameInMap("RunName")
    public String runName;

    // 应用来源
    @NameInMap("Source")
    public String source;

    // 开始时间
    @NameInMap("StartTime")
    public String startTime;

    // 任务状态
    @NameInMap("Status")
    public String status;

    // 提交ID
    @NameInMap("SubmissionId")
    public String submissionId;

    // 时序信息
    @NameInMap("Timing")
    public String timing;

    // 用户ID
    @NameInMap("User")
    public String user;

    // 工作空间名字
    @NameInMap("Workspace")
    public String workspace;

    public static GetRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunResponseBody self = new GetRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetRunResponseBody setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public GetRunResponseBody setCalls(String calls) {
        this.calls = calls;
        return this;
    }
    public String getCalls() {
        return this.calls;
    }

    public GetRunResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRunResponseBody setDefaultRuntime(String defaultRuntime) {
        this.defaultRuntime = defaultRuntime;
        return this;
    }
    public String getDefaultRuntime() {
        return this.defaultRuntime;
    }

    public GetRunResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRunResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRunResponseBody setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public GetRunResponseBody setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public GetRunResponseBody setExecuteDirectory(String executeDirectory) {
        this.executeDirectory = executeDirectory;
        return this;
    }
    public String getExecuteDirectory() {
        return this.executeDirectory;
    }

    public GetRunResponseBody setExecuteOptions(GetRunResponseBodyExecuteOptions executeOptions) {
        this.executeOptions = executeOptions;
        return this;
    }
    public GetRunResponseBodyExecuteOptions getExecuteOptions() {
        return this.executeOptions;
    }

    public GetRunResponseBody setFailures(String failures) {
        this.failures = failures;
        return this;
    }
    public String getFailures() {
        return this.failures;
    }

    public GetRunResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetRunResponseBody setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public GetRunResponseBody setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetRunResponseBody setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
        return this;
    }
    public String getOutputFolder() {
        return this.outputFolder;
    }

    public GetRunResponseBody setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public GetRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetRunResponseBody setRunName(String runName) {
        this.runName = runName;
        return this;
    }
    public String getRunName() {
        return this.runName;
    }

    public GetRunResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetRunResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRunResponseBody setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public GetRunResponseBody setTiming(String timing) {
        this.timing = timing;
        return this;
    }
    public String getTiming() {
        return this.timing;
    }

    public GetRunResponseBody setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public GetRunResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetRunResponseBodyExecuteOptions extends TeaModel {
        // 是否开启CallCaching
        @NameInMap("CallCaching")
        public Boolean callCaching;

        // 是否删除中间文件
        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        // 失败模式
        @NameInMap("FailureMode")
        public String failureMode;

        // 相对输出路径
        @NameInMap("UseRelativeOutputPaths")
        public Boolean useRelativeOutputPaths;

        public static GetRunResponseBodyExecuteOptions build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyExecuteOptions self = new GetRunResponseBodyExecuteOptions();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyExecuteOptions setCallCaching(Boolean callCaching) {
            this.callCaching = callCaching;
            return this;
        }
        public Boolean getCallCaching() {
            return this.callCaching;
        }

        public GetRunResponseBodyExecuteOptions setDeleteIntermediateResults(Boolean deleteIntermediateResults) {
            this.deleteIntermediateResults = deleteIntermediateResults;
            return this;
        }
        public Boolean getDeleteIntermediateResults() {
            return this.deleteIntermediateResults;
        }

        public GetRunResponseBodyExecuteOptions setFailureMode(String failureMode) {
            this.failureMode = failureMode;
            return this;
        }
        public String getFailureMode() {
            return this.failureMode;
        }

        public GetRunResponseBodyExecuteOptions setUseRelativeOutputPaths(Boolean useRelativeOutputPaths) {
            this.useRelativeOutputPaths = useRelativeOutputPaths;
            return this;
        }
        public Boolean getUseRelativeOutputPaths() {
            return this.useRelativeOutputPaths;
        }

    }

}
