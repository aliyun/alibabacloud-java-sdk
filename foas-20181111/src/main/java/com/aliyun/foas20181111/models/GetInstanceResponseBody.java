// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("ActualState")
        public String actualState;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("AutoScaleParams")
        public String autoScaleParams;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Code")
        public String code;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EngineJobHandler")
        public String engineJobHandler;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpectState")
        public String expectState;

        /**
         * <p>InstanceID</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("InputDelay")
        public Long inputDelay;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        @NameInMap("LastErrorTime")
        public Long lastErrorTime;

        @NameInMap("LastOperateTime")
        public Long lastOperateTime;

        @NameInMap("LastOperator")
        public String lastOperator;

        @NameInMap("Packages")
        public String packages;

        @NameInMap("PlanJson")
        public String planJson;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Properties")
        public String properties;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Starter")
        public String starter;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setActualState(String actualState) {
            this.actualState = actualState;
            return this;
        }
        public String getActualState() {
            return this.actualState;
        }

        public GetInstanceResponseBodyInstance setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetInstanceResponseBodyInstance setAutoScaleParams(String autoScaleParams) {
            this.autoScaleParams = autoScaleParams;
            return this;
        }
        public String getAutoScaleParams() {
            return this.autoScaleParams;
        }

        public GetInstanceResponseBodyInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetInstanceResponseBodyInstance setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetInstanceResponseBodyInstance setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetInstanceResponseBodyInstance setEngineJobHandler(String engineJobHandler) {
            this.engineJobHandler = engineJobHandler;
            return this;
        }
        public String getEngineJobHandler() {
            return this.engineJobHandler;
        }

        public GetInstanceResponseBodyInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetInstanceResponseBodyInstance setExpectState(String expectState) {
            this.expectState = expectState;
            return this;
        }
        public String getExpectState() {
            return this.expectState;
        }

        public GetInstanceResponseBodyInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetInstanceResponseBodyInstance setInputDelay(Long inputDelay) {
            this.inputDelay = inputDelay;
            return this;
        }
        public Long getInputDelay() {
            return this.inputDelay;
        }

        public GetInstanceResponseBodyInstance setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetInstanceResponseBodyInstance setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetInstanceResponseBodyInstance setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public GetInstanceResponseBodyInstance setLastErrorTime(Long lastErrorTime) {
            this.lastErrorTime = lastErrorTime;
            return this;
        }
        public Long getLastErrorTime() {
            return this.lastErrorTime;
        }

        public GetInstanceResponseBodyInstance setLastOperateTime(Long lastOperateTime) {
            this.lastOperateTime = lastOperateTime;
            return this;
        }
        public Long getLastOperateTime() {
            return this.lastOperateTime;
        }

        public GetInstanceResponseBodyInstance setLastOperator(String lastOperator) {
            this.lastOperator = lastOperator;
            return this;
        }
        public String getLastOperator() {
            return this.lastOperator;
        }

        public GetInstanceResponseBodyInstance setPackages(String packages) {
            this.packages = packages;
            return this;
        }
        public String getPackages() {
            return this.packages;
        }

        public GetInstanceResponseBodyInstance setPlanJson(String planJson) {
            this.planJson = planJson;
            return this;
        }
        public String getPlanJson() {
            return this.planJson;
        }

        public GetInstanceResponseBodyInstance setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetInstanceResponseBodyInstance setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetInstanceResponseBodyInstance setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public GetInstanceResponseBodyInstance setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetInstanceResponseBodyInstance setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetInstanceResponseBodyInstance setStarter(String starter) {
            this.starter = starter;
            return this;
        }
        public String getStarter() {
            return this.starter;
        }

    }

}
