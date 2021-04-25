// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListRunsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 最大返回结果
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 下次查询Token
    @NameInMap("NextToken")
    public String nextToken;

    // 返回个数
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 任务列表
    @NameInMap("Runs")
    public java.util.List<ListRunsResponseBodyRuns> runs;

    public static ListRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunsResponseBody self = new ListRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRunsResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRunsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRunsResponseBody setRuns(java.util.List<ListRunsResponseBodyRuns> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<ListRunsResponseBodyRuns> getRuns() {
        return this.runs;
    }

    public static class ListRunsResponseBodyRunsExecuteOptions extends TeaModel {
        @NameInMap("CallCaching")
        public Boolean callCaching;

        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        @NameInMap("FailureMode")
        public String failureMode;

        public static ListRunsResponseBodyRunsExecuteOptions build(java.util.Map<String, ?> map) throws Exception {
            ListRunsResponseBodyRunsExecuteOptions self = new ListRunsResponseBodyRunsExecuteOptions();
            return TeaModel.build(map, self);
        }

        public ListRunsResponseBodyRunsExecuteOptions setCallCaching(Boolean callCaching) {
            this.callCaching = callCaching;
            return this;
        }
        public Boolean getCallCaching() {
            return this.callCaching;
        }

        public ListRunsResponseBodyRunsExecuteOptions setDeleteIntermediateResults(Boolean deleteIntermediateResults) {
            this.deleteIntermediateResults = deleteIntermediateResults;
            return this;
        }
        public Boolean getDeleteIntermediateResults() {
            return this.deleteIntermediateResults;
        }

        public ListRunsResponseBodyRunsExecuteOptions setFailureMode(String failureMode) {
            this.failureMode = failureMode;
            return this;
        }
        public String getFailureMode() {
            return this.failureMode;
        }

    }

    public static class ListRunsResponseBodyRuns extends TeaModel {
        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // 应用来源
        @NameInMap("Source")
        public String source;

        // 应用命名空间
        @NameInMap("Namespace")
        public String namespace;

        // 应用原名
        @NameInMap("AppOrigName")
        public String appOrigName;

        // 任务标签
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        // 任务名称
        @NameInMap("Name")
        public String name;

        // 应用版本号
        @NameInMap("Revision")
        public String revision;

        // 任务ID
        @NameInMap("RunId")
        public String runId;

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 提交时间
        @NameInMap("CreateTime")
        public String createTime;

        // 开始时间
        @NameInMap("StartTime")
        public String startTime;

        // 结束时间
        @NameInMap("EndTime")
        public String endTime;

        // 提交ID
        @NameInMap("SubmissionId")
        public String submissionId;

        // 实体名称
        @NameInMap("EntityName")
        public String entityName;

        // 实体对象ID
        @NameInMap("EntityType")
        public String entityType;

        // 运行目录
        @NameInMap("ExecuteDirectory")
        public String executeDirectory;

        @NameInMap("ExecuteOptions")
        public ListRunsResponseBodyRunsExecuteOptions executeOptions;

        // 输入参数
        @NameInMap("Inputs")
        public String inputs;

        @NameInMap("DefaultRuntime")
        public String defaultRuntime;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("RegionId")
        public String regionId;

        public static ListRunsResponseBodyRuns build(java.util.Map<String, ?> map) throws Exception {
            ListRunsResponseBodyRuns self = new ListRunsResponseBodyRuns();
            return TeaModel.build(map, self);
        }

        public ListRunsResponseBodyRuns setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListRunsResponseBodyRuns setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRunsResponseBodyRuns setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListRunsResponseBodyRuns setAppOrigName(String appOrigName) {
            this.appOrigName = appOrigName;
            return this;
        }
        public String getAppOrigName() {
            return this.appOrigName;
        }

        public ListRunsResponseBodyRuns setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListRunsResponseBodyRuns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRunsResponseBodyRuns setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public ListRunsResponseBodyRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListRunsResponseBodyRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRunsResponseBodyRuns setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRunsResponseBodyRuns setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListRunsResponseBodyRuns setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListRunsResponseBodyRuns setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public ListRunsResponseBodyRuns setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ListRunsResponseBodyRuns setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListRunsResponseBodyRuns setExecuteDirectory(String executeDirectory) {
            this.executeDirectory = executeDirectory;
            return this;
        }
        public String getExecuteDirectory() {
            return this.executeDirectory;
        }

        public ListRunsResponseBodyRuns setExecuteOptions(ListRunsResponseBodyRunsExecuteOptions executeOptions) {
            this.executeOptions = executeOptions;
            return this;
        }
        public ListRunsResponseBodyRunsExecuteOptions getExecuteOptions() {
            return this.executeOptions;
        }

        public ListRunsResponseBodyRuns setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public ListRunsResponseBodyRuns setDefaultRuntime(String defaultRuntime) {
            this.defaultRuntime = defaultRuntime;
            return this;
        }
        public String getDefaultRuntime() {
            return this.defaultRuntime;
        }

        public ListRunsResponseBodyRuns setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public ListRunsResponseBodyRuns setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
