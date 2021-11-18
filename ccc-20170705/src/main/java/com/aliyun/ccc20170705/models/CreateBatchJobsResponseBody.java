// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateBatchJobsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobGroup")
    public CreateBatchJobsResponseBodyJobGroup jobGroup;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateBatchJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchJobsResponseBody self = new CreateBatchJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBatchJobsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBatchJobsResponseBody setJobGroup(CreateBatchJobsResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public CreateBatchJobsResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public CreateBatchJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBatchJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime self = new CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class CreateBatchJobsResponseBodyJobGroupStrategy extends TeaModel {
        @NameInMap("Customized")
        public String customized;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        @NameInMap("RepeatBy")
        public String repeatBy;

        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StrategyDescription")
        public String strategyDescription;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkingTime")
        public java.util.List<CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime> workingTime;

        public static CreateBatchJobsResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchJobsResponseBodyJobGroupStrategy self = new CreateBatchJobsResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateBatchJobsResponseBodyJobGroupStrategy setWorkingTime(java.util.List<CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<CreateBatchJobsResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class CreateBatchJobsResponseBodyJobGroup extends TeaModel {
        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Strategy")
        public CreateBatchJobsResponseBodyJobGroupStrategy strategy;

        public static CreateBatchJobsResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchJobsResponseBodyJobGroup self = new CreateBatchJobsResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public CreateBatchJobsResponseBodyJobGroup setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public CreateBatchJobsResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public CreateBatchJobsResponseBodyJobGroup setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public CreateBatchJobsResponseBodyJobGroup setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public CreateBatchJobsResponseBodyJobGroup setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public CreateBatchJobsResponseBodyJobGroup setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public CreateBatchJobsResponseBodyJobGroup setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public CreateBatchJobsResponseBodyJobGroup setStrategy(CreateBatchJobsResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateBatchJobsResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

    }

}
