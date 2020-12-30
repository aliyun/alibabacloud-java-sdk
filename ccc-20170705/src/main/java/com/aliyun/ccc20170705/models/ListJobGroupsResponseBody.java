// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobGroupsResponseBody extends TeaModel {
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

    @NameInMap("JobGroups")
    public ListJobGroupsResponseBodyJobGroups jobGroups;

    public static ListJobGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsResponseBody self = new ListJobGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobGroupsResponseBody setJobGroups(ListJobGroupsResponseBodyJobGroups jobGroups) {
        this.jobGroups = jobGroups;
        return this;
    }
    public ListJobGroupsResponseBodyJobGroups getJobGroups() {
        return this.jobGroups;
    }

    public static class ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BeginTime")
        public String beginTime;

        public static ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime self = new ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsListStrategy extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("WorkingTime")
        public java.util.List<ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime> workingTime;

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

        public static ListJobGroupsResponseBodyJobGroupsListStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListStrategy self = new ListJobGroupsResponseBodyJobGroupsListStrategy();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setWorkingTime(java.util.List<ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<ListJobGroupsResponseBodyJobGroupsListStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsListProgressCategories extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListJobGroupsResponseBodyJobGroupsListProgressCategories build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListProgressCategories self = new ListJobGroupsResponseBodyJobGroupsListProgressCategories();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListProgressCategories setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgressCategories setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsListProgress extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalNotAnswered")
        public Integer totalNotAnswered;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Categories")
        public java.util.List<ListJobGroupsResponseBodyJobGroupsListProgressCategories> categories;

        @NameInMap("TotalJobs")
        public Integer totalJobs;

        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        @NameInMap("Duration")
        public Integer duration;

        public static ListJobGroupsResponseBodyJobGroupsListProgress build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListProgress self = new ListJobGroupsResponseBodyJobGroupsListProgress();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setTotalNotAnswered(Integer totalNotAnswered) {
            this.totalNotAnswered = totalNotAnswered;
            return this;
        }
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setCategories(java.util.List<ListJobGroupsResponseBodyJobGroupsListProgressCategories> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<ListJobGroupsResponseBodyJobGroupsListProgressCategories> getCategories() {
            return this.categories;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsList extends TeaModel {
        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("Strategy")
        public ListJobGroupsResponseBodyJobGroupsListStrategy strategy;

        @NameInMap("CallingNumbers")
        public java.util.List<String> callingNumbers;

        @NameInMap("Progress")
        public ListJobGroupsResponseBodyJobGroupsListProgress progress;

        @NameInMap("Description")
        public String description;

        @NameInMap("JobFilePath")
        public String jobFilePath;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListJobGroupsResponseBodyJobGroupsList build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsList self = new ListJobGroupsResponseBodyJobGroupsList();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsList setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListJobGroupsResponseBodyJobGroupsList setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListJobGroupsResponseBodyJobGroupsList setStrategy(ListJobGroupsResponseBodyJobGroupsListStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListJobGroupsResponseBodyJobGroupsListStrategy getStrategy() {
            return this.strategy;
        }

        public ListJobGroupsResponseBodyJobGroupsList setCallingNumbers(java.util.List<String> callingNumbers) {
            this.callingNumbers = callingNumbers;
            return this;
        }
        public java.util.List<String> getCallingNumbers() {
            return this.callingNumbers;
        }

        public ListJobGroupsResponseBodyJobGroupsList setProgress(ListJobGroupsResponseBodyJobGroupsListProgress progress) {
            this.progress = progress;
            return this;
        }
        public ListJobGroupsResponseBodyJobGroupsListProgress getProgress() {
            return this.progress;
        }

        public ListJobGroupsResponseBodyJobGroupsList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListJobGroupsResponseBodyJobGroupsList setJobFilePath(String jobFilePath) {
            this.jobFilePath = jobFilePath;
            return this;
        }
        public String getJobFilePath() {
            return this.jobFilePath;
        }

        public ListJobGroupsResponseBodyJobGroupsList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListJobGroupsResponseBodyJobGroupsList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroups extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListJobGroupsResponseBodyJobGroupsList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListJobGroupsResponseBodyJobGroups build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroups self = new ListJobGroupsResponseBodyJobGroups();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroups setList(java.util.List<ListJobGroupsResponseBodyJobGroupsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListJobGroupsResponseBodyJobGroupsList> getList() {
            return this.list;
        }

        public ListJobGroupsResponseBodyJobGroups setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobGroupsResponseBodyJobGroups setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobGroupsResponseBodyJobGroups setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
