// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListJobRunsResponseBody extends TeaModel {
    /**
     * <p>The list of Spark jobs.</p>
     */
    @NameInMap("jobRuns")
    public java.util.List<ListJobRunsResponseBodyJobRuns> jobRuns;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
        /**
         * <p>The SparkConf objects.</p>
         */
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
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
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
         * <p>The code type of the job. Valid values:</p>
         * <p>SQL</p>
         * <p>JAR</p>
         * <p>PYTHON</p>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("codeType")
        public String codeType;

        /**
         * <p>The advanced configurations of Spark.</p>
         */
        @NameInMap("configurationOverrides")
        public ListJobRunsResponseBodyJobRunsConfigurationOverrides configurationOverrides;

        /**
         * <p>The ID of the user who created the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1509789347011222</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <p>The end time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1684119314000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The timeout period of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("executionTimeoutSeconds")
        public Integer executionTimeoutSeconds;

        /**
         * <p>The information about Spark Driver.</p>
         */
        @NameInMap("jobDriver")
        public JobDriver jobDriver;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-231231</p>
         */
        @NameInMap("jobRunId")
        public String jobRunId;

        /**
         * <p>The path where the operational logs are stored.</p>
         */
        @NameInMap("log")
        public RunLog log;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>jobName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of Spark on which the jobs run.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-native-3.4.0</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The job state.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The reason of the job status change.</p>
         */
        @NameInMap("stateChangeReason")
        public ListJobRunsResponseBodyJobRunsStateChangeReason stateChangeReason;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>1684119314000</p>
         */
        @NameInMap("submitTime")
        public Long submitTime;

        /**
         * <p>The tags of the job.</p>
         */
        @NameInMap("tags")
        public java.util.List<Tag> tags;

        /**
         * <p>The web UI of the job.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://spark-ui">http://spark-ui</a></p>
         */
        @NameInMap("webUI")
        public String webUI;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
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
