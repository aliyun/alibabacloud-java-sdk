// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetJobRunResponseBody extends TeaModel {
    /**
     * <p>The details of the job.</p>
     */
    @NameInMap("jobRun")
    public GetJobRunResponseBodyJobRun jobRun;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetJobRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobRunResponseBody self = new GetJobRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobRunResponseBody setJobRun(GetJobRunResponseBodyJobRun jobRun) {
        this.jobRun = jobRun;
        return this;
    }
    public GetJobRunResponseBodyJobRun getJobRun() {
        return this.jobRun;
    }

    public GetJobRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobRunResponseBodyJobRunConfigurationOverrides extends TeaModel {
        /**
         * <p>The configurations.</p>
         */
        @NameInMap("configurations")
        public java.util.List<Configuration> configurations;

        public static GetJobRunResponseBodyJobRunConfigurationOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetJobRunResponseBodyJobRunConfigurationOverrides self = new GetJobRunResponseBodyJobRunConfigurationOverrides();
            return TeaModel.build(map, self);
        }

        public GetJobRunResponseBodyJobRunConfigurationOverrides setConfigurations(java.util.List<Configuration> configurations) {
            this.configurations = configurations;
            return this;
        }
        public java.util.List<Configuration> getConfigurations() {
            return this.configurations;
        }

    }

    public static class GetJobRunResponseBodyJobRunStateChangeReason extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERR-100000</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>connection refused</p>
         */
        @NameInMap("message")
        public String message;

        public static GetJobRunResponseBodyJobRunStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
            GetJobRunResponseBodyJobRunStateChangeReason self = new GetJobRunResponseBodyJobRunStateChangeReason();
            return TeaModel.build(map, self);
        }

        public GetJobRunResponseBodyJobRunStateChangeReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetJobRunResponseBodyJobRunStateChangeReason setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetJobRunResponseBodyJobRun extends TeaModel {
        /**
         * <p>The code type of the job. Valid values:</p>
         * <ul>
         * <li>SQL</li>
         * <li>JAR</li>
         * <li>PYTHON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        @NameInMap("codeType")
        public String codeType;

        /**
         * <p>The task configurations of Spark.</p>
         */
        @NameInMap("configurationOverrides")
        public GetJobRunResponseBodyJobRunConfigurationOverrides configurationOverrides;

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
         * <p>The version of the Spark engine on which the job runs.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-3.3.1</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The ID of the user who created the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1509789347011222</p>
         */
        @NameInMap("resourceOwnerId")
        public String resourceOwnerId;

        /**
         * <p>The name of the queue on which the job runs.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("resourceQueueId")
        public String resourceQueueId;

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
        public GetJobRunResponseBodyJobRunStateChangeReason stateChangeReason;

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

        public static GetJobRunResponseBodyJobRun build(java.util.Map<String, ?> map) throws Exception {
            GetJobRunResponseBodyJobRun self = new GetJobRunResponseBodyJobRun();
            return TeaModel.build(map, self);
        }

        public GetJobRunResponseBodyJobRun setCodeType(String codeType) {
            this.codeType = codeType;
            return this;
        }
        public String getCodeType() {
            return this.codeType;
        }

        public GetJobRunResponseBodyJobRun setConfigurationOverrides(GetJobRunResponseBodyJobRunConfigurationOverrides configurationOverrides) {
            this.configurationOverrides = configurationOverrides;
            return this;
        }
        public GetJobRunResponseBodyJobRunConfigurationOverrides getConfigurationOverrides() {
            return this.configurationOverrides;
        }

        public GetJobRunResponseBodyJobRun setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetJobRunResponseBodyJobRun setExecutionTimeoutSeconds(Integer executionTimeoutSeconds) {
            this.executionTimeoutSeconds = executionTimeoutSeconds;
            return this;
        }
        public Integer getExecutionTimeoutSeconds() {
            return this.executionTimeoutSeconds;
        }

        public GetJobRunResponseBodyJobRun setJobDriver(JobDriver jobDriver) {
            this.jobDriver = jobDriver;
            return this;
        }
        public JobDriver getJobDriver() {
            return this.jobDriver;
        }

        public GetJobRunResponseBodyJobRun setJobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }
        public String getJobRunId() {
            return this.jobRunId;
        }

        public GetJobRunResponseBodyJobRun setLog(RunLog log) {
            this.log = log;
            return this;
        }
        public RunLog getLog() {
            return this.log;
        }

        public GetJobRunResponseBodyJobRun setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobRunResponseBodyJobRun setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public GetJobRunResponseBodyJobRun setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public GetJobRunResponseBodyJobRun setResourceQueueId(String resourceQueueId) {
            this.resourceQueueId = resourceQueueId;
            return this;
        }
        public String getResourceQueueId() {
            return this.resourceQueueId;
        }

        public GetJobRunResponseBodyJobRun setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobRunResponseBodyJobRun setStateChangeReason(GetJobRunResponseBodyJobRunStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }
        public GetJobRunResponseBodyJobRunStateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        public GetJobRunResponseBodyJobRun setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public GetJobRunResponseBodyJobRun setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        public GetJobRunResponseBodyJobRun setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
        }

        public GetJobRunResponseBodyJobRun setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
