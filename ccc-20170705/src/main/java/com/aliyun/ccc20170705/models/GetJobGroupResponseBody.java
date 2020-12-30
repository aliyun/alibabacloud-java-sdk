// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobGroupResponseBody extends TeaModel {
    @NameInMap("JobGroup")
    public GetJobGroupResponseBodyJobGroup jobGroup;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobGroupResponseBody self = new GetJobGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobGroupResponseBody setJobGroup(GetJobGroupResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public GetJobGroupResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public GetJobGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobGroupResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BeginTime")
        public String beginTime;

        public static GetJobGroupResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            GetJobGroupResponseBodyJobGroupStrategyWorkingTime self = new GetJobGroupResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public GetJobGroupResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobGroupResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

    }

    public static class GetJobGroupResponseBodyJobGroupStrategy extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("WorkingTime")
        public java.util.List<GetJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime;

        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Customized")
        public String customized;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("Description")
        public String description;

        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        @NameInMap("RepeatBy")
        public String repeatBy;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetJobGroupResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetJobGroupResponseBodyJobGroupStrategy self = new GetJobGroupResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public GetJobGroupResponseBodyJobGroupStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setWorkingTime(java.util.List<GetJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<GetJobGroupResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobGroupResponseBodyJobGroupStrategy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetJobGroupResponseBodyJobGroupProgressCategories extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetJobGroupResponseBodyJobGroupProgressCategories build(java.util.Map<String, ?> map) throws Exception {
            GetJobGroupResponseBodyJobGroupProgressCategories self = new GetJobGroupResponseBodyJobGroupProgressCategories();
            return TeaModel.build(map, self);
        }

        public GetJobGroupResponseBodyJobGroupProgressCategories setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobGroupResponseBodyJobGroupProgressCategories setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobGroupResponseBodyJobGroupProgress extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalNotAnswered")
        public Integer totalNotAnswered;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Categories")
        public java.util.List<GetJobGroupResponseBodyJobGroupProgressCategories> categories;

        @NameInMap("TotalJobs")
        public Integer totalJobs;

        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        @NameInMap("Duration")
        public Integer duration;

        public static GetJobGroupResponseBodyJobGroupProgress build(java.util.Map<String, ?> map) throws Exception {
            GetJobGroupResponseBodyJobGroupProgress self = new GetJobGroupResponseBodyJobGroupProgress();
            return TeaModel.build(map, self);
        }

        public GetJobGroupResponseBodyJobGroupProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobGroupResponseBodyJobGroupProgress setTotalNotAnswered(Integer totalNotAnswered) {
            this.totalNotAnswered = totalNotAnswered;
            return this;
        }
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

        public GetJobGroupResponseBodyJobGroupProgress setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetJobGroupResponseBodyJobGroupProgress setCategories(java.util.List<GetJobGroupResponseBodyJobGroupProgressCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<GetJobGroupResponseBodyJobGroupProgressCategories> getCategories() {
            return this.categories;
        }

        public GetJobGroupResponseBodyJobGroupProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public GetJobGroupResponseBodyJobGroupProgress setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        public GetJobGroupResponseBodyJobGroupProgress setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

    }

    public static class GetJobGroupResponseBodyJobGroup extends TeaModel {
        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("Strategy")
        public GetJobGroupResponseBodyJobGroupStrategy strategy;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Progress")
        public GetJobGroupResponseBodyJobGroupProgress progress;

        @NameInMap("Description")
        public String description;

        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetJobGroupResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            GetJobGroupResponseBodyJobGroup self = new GetJobGroupResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public GetJobGroupResponseBodyJobGroup setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public GetJobGroupResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public GetJobGroupResponseBodyJobGroup setStrategy(GetJobGroupResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public GetJobGroupResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

        public GetJobGroupResponseBodyJobGroup setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public GetJobGroupResponseBodyJobGroup setProgress(GetJobGroupResponseBodyJobGroupProgress progress) {
            this.progress = progress;
            return this;
        }
        public GetJobGroupResponseBodyJobGroupProgress getProgress() {
            return this.progress;
        }

        public GetJobGroupResponseBodyJobGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobGroupResponseBodyJobGroup setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public GetJobGroupResponseBodyJobGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobGroupResponseBodyJobGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
