// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetRunResponseBody extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppRevision")
    public String appRevision;

    @NameInMap("Calls")
    public String calls;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DefaultRuntime")
    public String defaultRuntime;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EntityName")
    public String entityName;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("ExecuteDirectory")
    public String executeDirectory;

    @NameInMap("ExecuteOptions")
    public GetRunResponseBodyExecuteOptions executeOptions;

    @NameInMap("Failures")
    public String failures;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("Inputs")
    public String inputs;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    @NameInMap("OutputFolder")
    public String outputFolder;

    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunId")
    public String runId;

    @NameInMap("RunName")
    public String runName;

    @NameInMap("Source")
    public String source;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubmissionId")
    public String submissionId;

    @NameInMap("Timing")
    public String timing;

    @NameInMap("User")
    public String user;

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
        @NameInMap("CallCaching")
        public Boolean callCaching;

        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        @NameInMap("FailureMode")
        public String failureMode;

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
