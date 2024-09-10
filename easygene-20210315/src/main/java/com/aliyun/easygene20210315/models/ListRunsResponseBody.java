// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListRunsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2P1dvcmtzcGFjZT93cy1mMDE4OTgxNGU1ZTkK</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Runs")
    public java.util.List<ListRunsResponseBodyRuns> runs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunsResponseBody self = new ListRunsResponseBody();
        return TeaModel.build(map, self);
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

    public ListRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRunsResponseBody setRuns(java.util.List<ListRunsResponseBodyRuns> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<ListRunsResponseBodyRuns> getRuns() {
        return this.runs;
    }

    public ListRunsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRunsResponseBodyRunsExecuteOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CallCaching")
        public Boolean callCaching;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeleteIntermediateResults")
        public Boolean deleteIntermediateResults;

        /**
         * <strong>example:</strong>
         * <p>NoNewCalls</p>
         */
        @NameInMap("FailureMode")
        public String failureMode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseRelativeOutputPaths")
        public Boolean useRelativeOutputPaths;

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

        public ListRunsResponseBodyRunsExecuteOptions setUseRelativeOutputPaths(Boolean useRelativeOutputPaths) {
            this.useRelativeOutputPaths = useRelativeOutputPaths;
            return this;
        }
        public Boolean getUseRelativeOutputPaths() {
            return this.useRelativeOutputPaths;
        }

    }

    public static class ListRunsResponseBodyRuns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MyApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppRevision")
        public String appRevision;

        /**
         * <strong>example:</strong>
         * <p>2021-06-10T13:30:20.414557061Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("DefaultRuntime")
        public String defaultRuntime;

        /**
         * <strong>example:</strong>
         * <p>2021-06-10T13:38:20.414557061Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>s1</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <strong>example:</strong>
         * <p>sample</p>
         */
        @NameInMap("EntityType")
        public String entityType;

        /**
         * <strong>example:</strong>
         * <p>oss://my-bucket/my-execdir/</p>
         */
        @NameInMap("ExecuteDirectory")
        public String executeDirectory;

        @NameInMap("ExecuteOptions")
        public ListRunsResponseBodyRunsExecuteOptions executeOptions;

        /**
         * <strong>example:</strong>
         * <p>{     &quot;workflow1.task1.param1&quot;: &quot;helloooo.txt&quot;,     &quot;workflow1.task1.param2&quot;: &quot;abc&quot;,     &quot;workflow1.task2.param1&quot;: &quot;new_helloooo.txt&quot;,     &quot;workflow1.task2.param2&quot;: &quot;def&quot; }</p>
         */
        @NameInMap("Inputs")
        public String inputs;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>run-13BeYuxc0fxO24uA75UppTiMRoQ</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>test-run</p>
         */
        @NameInMap("RunName")
        public String runName;

        /**
         * <strong>example:</strong>
         * <p>EasyGene</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>2021-06-10T13:31:20.414557061Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>sub-13BeXWnGvrOl3MC124tazcJVKaV</p>
         */
        @NameInMap("SubmissionId")
        public String submissionId;

        /**
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
        @NameInMap("Workspace")
        public String workspace;

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

        public ListRunsResponseBodyRuns setAppRevision(String appRevision) {
            this.appRevision = appRevision;
            return this;
        }
        public String getAppRevision() {
            return this.appRevision;
        }

        public ListRunsResponseBodyRuns setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRunsResponseBodyRuns setDefaultRuntime(String defaultRuntime) {
            this.defaultRuntime = defaultRuntime;
            return this;
        }
        public String getDefaultRuntime() {
            return this.defaultRuntime;
        }

        public ListRunsResponseBodyRuns setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
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

        public ListRunsResponseBodyRuns setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListRunsResponseBodyRuns setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRunsResponseBodyRuns setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListRunsResponseBodyRuns setRunName(String runName) {
            this.runName = runName;
            return this;
        }
        public String getRunName() {
            return this.runName;
        }

        public ListRunsResponseBodyRuns setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRunsResponseBodyRuns setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListRunsResponseBodyRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRunsResponseBodyRuns setSubmissionId(String submissionId) {
            this.submissionId = submissionId;
            return this;
        }
        public String getSubmissionId() {
            return this.submissionId;
        }

        public ListRunsResponseBodyRuns setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
