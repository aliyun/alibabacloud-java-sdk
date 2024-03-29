// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListScenariosResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenarios")
    public java.util.List<ListScenariosResponseBodyScenarios> scenarios;

    @NameInMap("Success")
    public Boolean success;

    public static ListScenariosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenariosResponseBody self = new ListScenariosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenariosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScenariosResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScenariosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScenariosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenariosResponseBody setScenarios(java.util.List<ListScenariosResponseBodyScenarios> scenarios) {
        this.scenarios = scenarios;
        return this;
    }
    public java.util.List<ListScenariosResponseBodyScenarios> getScenarios() {
        return this.scenarios;
    }

    public ListScenariosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScenariosResponseBodyScenariosStrategyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static ListScenariosResponseBodyScenariosStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenariosStrategyWorkingTime self = new ListScenariosResponseBodyScenariosStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenariosStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public ListScenariosResponseBodyScenariosStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class ListScenariosResponseBodyScenariosStrategy extends TeaModel {
        @NameInMap("Customized")
        public String customized;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FollowUpStrategy")
        public String followUpStrategy;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        @NameInMap("Name")
        public String name;

        @NameInMap("RepeatBy")
        public String repeatBy;

        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkingTime")
        public java.util.List<ListScenariosResponseBodyScenariosStrategyWorkingTime> workingTime;

        public static ListScenariosResponseBodyScenariosStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenariosStrategy self = new ListScenariosResponseBodyScenariosStrategy();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenariosStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public ListScenariosResponseBodyScenariosStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenariosResponseBodyScenariosStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListScenariosResponseBodyScenariosStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public ListScenariosResponseBodyScenariosStrategy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScenariosResponseBodyScenariosStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListScenariosResponseBodyScenariosStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public ListScenariosResponseBodyScenariosStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ListScenariosResponseBodyScenariosStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenariosResponseBodyScenariosStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public ListScenariosResponseBodyScenariosStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public ListScenariosResponseBodyScenariosStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ListScenariosResponseBodyScenariosStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListScenariosResponseBodyScenariosStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListScenariosResponseBodyScenariosStrategy setWorkingTime(java.util.List<ListScenariosResponseBodyScenariosStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<ListScenariosResponseBodyScenariosStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class ListScenariosResponseBodyScenariosSurveysIntents extends TeaModel {
        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("NodeId")
        public String nodeId;

        public static ListScenariosResponseBodyScenariosSurveysIntents build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenariosSurveysIntents self = new ListScenariosResponseBodyScenariosSurveysIntents();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenariosSurveysIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public ListScenariosResponseBodyScenariosSurveysIntents setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListScenariosResponseBodyScenariosSurveys extends TeaModel {
        @NameInMap("BeebotId")
        public String beebotId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intents")
        public java.util.List<ListScenariosResponseBodyScenariosSurveysIntents> intents;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("Round")
        public Integer round;

        public static ListScenariosResponseBodyScenariosSurveys build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenariosSurveys self = new ListScenariosResponseBodyScenariosSurveys();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenariosSurveys setBeebotId(String beebotId) {
            this.beebotId = beebotId;
            return this;
        }
        public String getBeebotId() {
            return this.beebotId;
        }

        public ListScenariosResponseBodyScenariosSurveys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenariosResponseBodyScenariosSurveys setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScenariosResponseBodyScenariosSurveys setIntents(java.util.List<ListScenariosResponseBodyScenariosSurveysIntents> intents) {
            this.intents = intents;
            return this;
        }
        public java.util.List<ListScenariosResponseBodyScenariosSurveysIntents> getIntents() {
            return this.intents;
        }

        public ListScenariosResponseBodyScenariosSurveys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenariosResponseBodyScenariosSurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListScenariosResponseBodyScenariosSurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

    }

    public static class ListScenariosResponseBodyScenariosVariables extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListScenariosResponseBodyScenariosVariables build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenariosVariables self = new ListScenariosResponseBodyScenariosVariables();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenariosVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListScenariosResponseBodyScenariosVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListScenariosResponseBodyScenarios extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Strategy")
        public ListScenariosResponseBodyScenariosStrategy strategy;

        @NameInMap("Surveys")
        public java.util.List<ListScenariosResponseBodyScenariosSurveys> surveys;

        @NameInMap("Type")
        public String type;

        @NameInMap("Variables")
        public java.util.List<ListScenariosResponseBodyScenariosVariables> variables;

        public static ListScenariosResponseBodyScenarios build(java.util.Map<String, ?> map) throws Exception {
            ListScenariosResponseBodyScenarios self = new ListScenariosResponseBodyScenarios();
            return TeaModel.build(map, self);
        }

        public ListScenariosResponseBodyScenarios setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenariosResponseBodyScenarios setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScenariosResponseBodyScenarios setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListScenariosResponseBodyScenarios setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenariosResponseBodyScenarios setStrategy(ListScenariosResponseBodyScenariosStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListScenariosResponseBodyScenariosStrategy getStrategy() {
            return this.strategy;
        }

        public ListScenariosResponseBodyScenarios setSurveys(java.util.List<ListScenariosResponseBodyScenariosSurveys> surveys) {
            this.surveys = surveys;
            return this;
        }
        public java.util.List<ListScenariosResponseBodyScenariosSurveys> getSurveys() {
            return this.surveys;
        }

        public ListScenariosResponseBodyScenarios setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListScenariosResponseBodyScenarios setVariables(java.util.List<ListScenariosResponseBodyScenariosVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListScenariosResponseBodyScenariosVariables> getVariables() {
            return this.variables;
        }

    }

}
