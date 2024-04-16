// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetJobRunResponseBody extends TeaModel {
    @NameInMap("jobRun")
    public GetJobRunResponseBodyJobRun jobRun;

    /**
     * <p>请求ID。</p>
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
        @NameInMap("code")
        public String code;

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
         * <p>作业代码类型。</p>
         */
        @NameInMap("codeType")
        public String codeType;

        @NameInMap("configurationOverrides")
        public GetJobRunResponseBodyJobRunConfigurationOverrides configurationOverrides;

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
         * <p>创建用户Uid。</p>
         */
        @NameInMap("resourceOwnerId")
        public String resourceOwnerId;

        @NameInMap("resourceQueueId")
        public String resourceQueueId;

        /**
         * <p>作业状态。</p>
         */
        @NameInMap("state")
        public String state;

        @NameInMap("stateChangeReason")
        public GetJobRunResponseBodyJobRunStateChangeReason stateChangeReason;

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
