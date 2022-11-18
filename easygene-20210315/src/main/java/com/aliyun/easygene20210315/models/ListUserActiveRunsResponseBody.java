// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListUserActiveRunsResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Runs")
    public java.util.List<ListUserActiveRunsResponseBodyRuns> runs;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserActiveRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserActiveRunsResponseBody self = new ListUserActiveRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserActiveRunsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListUserActiveRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserActiveRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserActiveRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserActiveRunsResponseBody setRuns(java.util.List<ListUserActiveRunsResponseBodyRuns> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<ListUserActiveRunsResponseBodyRuns> getRuns() {
        return this.runs;
    }

    public ListUserActiveRunsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserActiveRunsResponseBodyRunsExecuteOptions extends TeaModel {
        @NameInMap("CallCaching")
        public Boolean callCaching;

        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        @NameInMap("FailureMode")
        public String failureMode;

        @NameInMap("UseRelativeOutputPaths")
        public Boolean useRelativeOutputPaths;

        public static ListUserActiveRunsResponseBodyRunsExecuteOptions build(java.util.Map<String, ?> map) throws Exception {
            ListUserActiveRunsResponseBodyRunsExecuteOptions self = new ListUserActiveRunsResponseBodyRunsExecuteOptions();
            return TeaModel.build(map, self);
        }

        public ListUserActiveRunsResponseBodyRunsExecuteOptions setCallCaching(Boolean callCaching) {
            this.callCaching = callCaching;
            return this;
        }
        public Boolean getCallCaching() {
            return this.callCaching;
        }

        public ListUserActiveRunsResponseBodyRunsExecuteOptions setDeleteIntermediateResults(Boolean deleteIntermediateResults) {
            this.deleteIntermediateResults = deleteIntermediateResults;
            return this;
        }
        public Boolean getDeleteIntermediateResults() {
            return this.deleteIntermediateResults;
        }

        public ListUserActiveRunsResponseBodyRunsExecuteOptions setFailureMode(String failureMode) {
            this.failureMode = failureMode;
            return this;
        }
        public String getFailureMode() {
            return this.failureMode;
        }

        public ListUserActiveRunsResponseBodyRunsExecuteOptions setUseRelativeOutputPaths(Boolean useRelativeOutputPaths) {
            this.useRelativeOutputPaths = useRelativeOutputPaths;
            return this;
        }
        public Boolean getUseRelativeOutputPaths() {
            return this.useRelativeOutputPaths;
        }

    }

    public static class ListUserActiveRunsResponseBodyRuns extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppRevision")
        public String appRevision;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DefaultRuntime")
        public String defaultRuntime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EntityName")
        public String entityName;

        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("ExecuteDirectory")
        public String executeDirectory;

        @NameInMap("ExecuteOptions")
        public ListUserActiveRunsResponseBodyRunsExecuteOptions executeOptions;

        @NameInMap("Inputs")
        public String inputs;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("RegionId")
        public String regionId;

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

        @NameInMap("Workspace")
        public String workspace;

        public static ListUserActiveRunsResponseBodyRuns build(java.util.Map<String, ?> map) throws Exception {
            ListUserActiveRunsResponseBodyRuns self = new ListUserActiveRunsResponseBodyRuns();
            return TeaModel.build(map, self);
        }

        public ListUserActiveRunsResponseBodyRuns setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListUserActiveRunsResponseBodyRuns setAppRevision(String appRevision) {
            this.appRevision = appRevision;
            return this;
        }
        public String getAppRevision() {
            return this.appRevision;
        }

        public ListUserActiveRunsResponseBodyRuns setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserActiveRunsResponseBodyRuns setDefaultRuntime(String defaultRuntime) {
            this.defaultRuntime = defaultRuntime;
            return this;
        }
        public String getDefaultRuntime() {
            return this.defaultRuntime;
        }

        public ListUserActiveRunsResponseBodyRuns setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListUserActiveRunsResponseBodyRuns setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ListUserActiveRunsResponseBodyRuns setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListUserActiveRunsResponseBodyRuns setExecuteDirectory(String executeDirectory) {
            this.executeDirectory = executeDirectory;
            return this;
        }
        public String getExecuteDirectory() {
            return this.executeDirectory;
        }

        public ListUserActiveRunsResponseBodyRuns setExecuteOptions(ListUserActiveRunsResponseBodyRunsExecuteOptions executeOptions) {
            this.executeOptions = executeOptions;
            return this;
        }
        public ListUserActiveRunsResponseBodyRunsExecuteOptions getExecuteOptions() {
            return this.executeOptions;
        }

        public ListUserActiveRunsResponseBodyRuns setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public ListUserActiveRunsResponseBodyRuns setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListUserActiveRunsResponseBodyRuns setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListUserActiveRunsResponseBodyRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListUserActiveRunsResponseBodyRuns setRunName(String runName) {
            this.runName = runName;
            return this;
        }
        public String getRunName() {
            return this.runName;
        }

        public ListUserActiveRunsResponseBodyRuns setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUserActiveRunsResponseBodyRuns setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListUserActiveRunsResponseBodyRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserActiveRunsResponseBodyRuns setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public ListUserActiveRunsResponseBodyRuns setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
