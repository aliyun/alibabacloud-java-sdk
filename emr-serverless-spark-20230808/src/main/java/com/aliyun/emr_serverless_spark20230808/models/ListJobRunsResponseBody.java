// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsResponseBody extends TeaModel {
    @NameInMap("jobRuns")
    public java.util.List<ListJobRunsResponseBodyJobRuns> jobRuns;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListJobRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobRunsResponseBody self = new ListJobRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobRunsResponseBody setJobRuns(java.util.List<ListJobRunsResponseBodyJobRuns> jobRuns) {
        this.jobRuns = jobRuns;
        return this;
    }
    public java.util.List<ListJobRunsResponseBodyJobRuns> getJobRuns() {
        return this.jobRuns;
    }

    public ListJobRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJobRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJobRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobRunsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListJobRunsResponseBodyJobRunsConfigurationOverrides extends TeaModel {
        @NameInMap("configurations")
        public java.util.List<Configuration> configurations;

        public static ListJobRunsResponseBodyJobRunsConfigurationOverrides build(java.util.Map<String, ?> map) throws Exception {
            ListJobRunsResponseBodyJobRunsConfigurationOverrides self = new ListJobRunsResponseBodyJobRunsConfigurationOverrides();
            return TeaModel.build(map, self);
        }

        public ListJobRunsResponseBodyJobRunsConfigurationOverrides setConfigurations(java.util.List<Configuration> configurations) {
            this.configurations = configurations;
            return this;
        }
        public java.util.List<Configuration> getConfigurations() {
            return this.configurations;
        }

    }

    public static class ListJobRunsResponseBodyJobRunsStateChangeReason extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static ListJobRunsResponseBodyJobRunsStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            ListJobRunsResponseBodyJobRunsStateChangeReason self = new ListJobRunsResponseBodyJobRunsStateChangeReason();
            return TeaModel.build(map, self);
        }

        public ListJobRunsResponseBodyJobRunsStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListJobRunsResponseBodyJobRunsStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListJobRunsResponseBodyJobRuns extends TeaModel {
        /**
         * <p>作业代码类型。</p>
         */
        @NameInMap("codeType")
        public String codeType;

        @NameInMap("configurationOverrides")
        public ListJobRunsResponseBodyJobRunsConfigurationOverrides configurationOverrides;

        /**
         * <p>创建用户Uid。</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>作业结束时间。</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>运行超时时间。</p>
         */
        @NameInMap("executionTimeoutSeconds")
        public Integer executionTimeoutSeconds;

        @NameInMap("jobDriver")
        public JobDriver jobDriver;

        /**
         * <p>任务实例ID。</p>
         */
        @NameInMap("jobRunId")
        public String jobRunId;

        @NameInMap("log")
        public RunLog log;

        /**
         * <p>作业实例名称。</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>作业状态。</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("stateChangeReason")
        public ListJobRunsResponseBodyJobRunsStateChangeReason stateChangeReason;

        /**
         * <p>作业提交时间。</p>
         */
        @NameInMap("submitTime")
        public Long submitTime;

        /**
         * <p>标签。</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>作业web ui。</p>
         */
        @NameInMap("webUI")
        public String webUI;

        /**
         * <p>工作空间id。</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListJobRunsResponseBodyJobRuns build(java.util.Map<String, ?> map) throws Exception {
            ListJobRunsResponseBodyJobRuns self = new ListJobRunsResponseBodyJobRuns();
            return TeaModel.build(map, self);
        }

        public ListJobRunsResponseBodyJobRuns setCodeType(String codeType) {
            this.codeType = codeType;
            return this;
        }
        public String getCodeType() {
            return this.codeType;
        }

        public ListJobRunsResponseBodyJobRuns setConfigurationOverrides(ListJobRunsResponseBodyJobRunsConfigurationOverrides configurationOverrides) {
            this.configurationOverrides = configurationOverrides;
            return this;
        }
        public ListJobRunsResponseBodyJobRunsConfigurationOverrides getConfigurationOverrides() {
            return this.configurationOverrides;
        }

        public ListJobRunsResponseBodyJobRuns setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListJobRunsResponseBodyJobRuns setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListJobRunsResponseBodyJobRuns setExecutionTimeoutSeconds(Integer executionTimeoutSeconds) {
            this.executionTimeoutSeconds = executionTimeoutSeconds;
            return this;
        }
        public Integer getExecutionTimeoutSeconds() {
            return this.executionTimeoutSeconds;
        }

        public ListJobRunsResponseBodyJobRuns setJobDriver(JobDriver jobDriver) {
            this.jobDriver = jobDriver;
            return this;
        }
        public JobDriver getJobDriver() {
            return this.jobDriver;
        }

        public ListJobRunsResponseBodyJobRuns setJobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }
        public String getJobRunId() {
            return this.jobRunId;
        }

        public ListJobRunsResponseBodyJobRuns setLog(RunLog log) {
            this.log = log;
            return this;
        }
        public RunLog getLog() {
            return this.log;
        }

        public ListJobRunsResponseBodyJobRuns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobRunsResponseBodyJobRuns setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListJobRunsResponseBodyJobRuns setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListJobRunsResponseBodyJobRuns setStateChangeReason(ListJobRunsResponseBodyJobRunsStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public ListJobRunsResponseBodyJobRunsStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public ListJobRunsResponseBodyJobRuns setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public ListJobRunsResponseBodyJobRuns setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public ListJobRunsResponseBodyJobRuns setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
        }

        public ListJobRunsResponseBodyJobRuns setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
