// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetPredictiveJobGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobGroup")
    public GetPredictiveJobGroupResponseBodyJobGroup jobGroup;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPredictiveJobGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPredictiveJobGroupResponseBody self = new GetPredictiveJobGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPredictiveJobGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPredictiveJobGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPredictiveJobGroupResponseBody setJobGroup(GetPredictiveJobGroupResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public GetPredictiveJobGroupResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public GetPredictiveJobGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPredictiveJobGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPredictiveJobGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPredictiveJobGroupResponseBodyJobGroupProgressCategories extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetPredictiveJobGroupResponseBodyJobGroupProgressCategories build(java.util.Map<String, ?> map) throws Exception {
            GetPredictiveJobGroupResponseBodyJobGroupProgressCategories self = new GetPredictiveJobGroupResponseBodyJobGroupProgressCategories();
            return TeaModel.build(map, self);
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgressCategories setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgressCategories setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPredictiveJobGroupResponseBodyJobGroupProgress extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<GetPredictiveJobGroupResponseBodyJobGroupProgressCategories> categories;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        @NameInMap("TotalJobs")
        public Integer totalJobs;

        @NameInMap("TotalNotAnswered")
        public Integer totalNotAnswered;

        public static GetPredictiveJobGroupResponseBodyJobGroupProgress build(java.util.Map<String, ?> map) throws Exception {
            GetPredictiveJobGroupResponseBodyJobGroupProgress self = new GetPredictiveJobGroupResponseBodyJobGroupProgress();
            return TeaModel.build(map, self);
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setCategories(java.util.List<GetPredictiveJobGroupResponseBodyJobGroupProgressCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<GetPredictiveJobGroupResponseBodyJobGroupProgressCategories> getCategories() {
            return this.categories;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupProgress setTotalNotAnswered(Integer totalNotAnswered) {
            this.totalNotAnswered = totalNotAnswered;
            return this;
        }
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

    }

    public static class GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime self = new GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class GetPredictiveJobGroupResponseBodyJobGroupStrategy extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("WorkingTime")
        public java.util.List<GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime;

        public static GetPredictiveJobGroupResponseBodyJobGroupStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetPredictiveJobGroupResponseBodyJobGroupStrategy self = new GetPredictiveJobGroupResponseBodyJobGroupStrategy();
            return TeaModel.build(map, self);
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public GetPredictiveJobGroupResponseBodyJobGroupStrategy setWorkingTime(java.util.List<GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<GetPredictiveJobGroupResponseBodyJobGroupStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class GetPredictiveJobGroupResponseBodyJobGroup extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public GetPredictiveJobGroupResponseBodyJobGroupProgress progress;

        @NameInMap("Ratio")
        public Long ratio;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("Strategy")
        public GetPredictiveJobGroupResponseBodyJobGroupStrategy strategy;

        public static GetPredictiveJobGroupResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            GetPredictiveJobGroupResponseBodyJobGroup self = new GetPredictiveJobGroupResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setProgress(GetPredictiveJobGroupResponseBodyJobGroupProgress progress) {
            this.progress = progress;
            return this;
        }
        public GetPredictiveJobGroupResponseBodyJobGroupProgress getProgress() {
            return this.progress;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setRatio(Long ratio) {
            this.ratio = ratio;
            return this;
        }
        public Long getRatio() {
            return this.ratio;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public GetPredictiveJobGroupResponseBodyJobGroup setStrategy(GetPredictiveJobGroupResponseBodyJobGroupStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public GetPredictiveJobGroupResponseBodyJobGroupStrategy getStrategy() {
            return this.strategy;
        }

    }

}
