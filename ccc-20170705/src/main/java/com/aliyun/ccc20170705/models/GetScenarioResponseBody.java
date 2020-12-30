// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetScenarioResponseBody extends TeaModel {
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

    @NameInMap("Scenario")
    public GetScenarioResponseBodyScenario scenario;

    public static GetScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioResponseBody self = new GetScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenarioResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenarioResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetScenarioResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScenarioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetScenarioResponseBody setScenario(GetScenarioResponseBodyScenario scenario) {
        this.scenario = scenario;
        return this;
    }
    public GetScenarioResponseBodyScenario getScenario() {
        return this.scenario;
    }

    public static class GetScenarioResponseBodyScenarioStrategyWorkingTime extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BeginTime")
        public String beginTime;

        public static GetScenarioResponseBodyScenarioStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            GetScenarioResponseBodyScenarioStrategyWorkingTime self = new GetScenarioResponseBodyScenarioStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public GetScenarioResponseBodyScenarioStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetScenarioResponseBodyScenarioStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

    }

    public static class GetScenarioResponseBodyScenarioStrategy extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("WorkingTime")
        public java.util.List<GetScenarioResponseBodyScenarioStrategyWorkingTime> workingTime;

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

        public static GetScenarioResponseBodyScenarioStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetScenarioResponseBodyScenarioStrategy self = new GetScenarioResponseBodyScenarioStrategy();
            return TeaModel.build(map, self);
        }

        public GetScenarioResponseBodyScenarioStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetScenarioResponseBodyScenarioStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public GetScenarioResponseBodyScenarioStrategy setWorkingTime(java.util.List<GetScenarioResponseBodyScenarioStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<GetScenarioResponseBodyScenarioStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public GetScenarioResponseBodyScenarioStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public GetScenarioResponseBodyScenarioStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetScenarioResponseBodyScenarioStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public GetScenarioResponseBodyScenarioStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetScenarioResponseBodyScenarioStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetScenarioResponseBodyScenarioStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public GetScenarioResponseBodyScenarioStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public GetScenarioResponseBodyScenarioStrategy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScenarioResponseBodyScenarioStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public GetScenarioResponseBodyScenarioStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public GetScenarioResponseBodyScenarioStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScenarioResponseBodyScenarioStrategy setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetScenarioResponseBodyScenarioSurveysIntents extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("IntentId")
        public String intentId;

        public static GetScenarioResponseBodyScenarioSurveysIntents build(java.util.Map<String, ?> map) throws Exception {
            GetScenarioResponseBodyScenarioSurveysIntents self = new GetScenarioResponseBodyScenarioSurveysIntents();
            return TeaModel.build(map, self);
        }

        public GetScenarioResponseBodyScenarioSurveysIntents setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetScenarioResponseBodyScenarioSurveysIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

    }

    public static class GetScenarioResponseBodyScenarioSurveys extends TeaModel {
        @NameInMap("Round")
        public Integer round;

        @NameInMap("Description")
        public String description;

        @NameInMap("BeebotId")
        public String beebotId;

        @NameInMap("Intents")
        public java.util.List<GetScenarioResponseBodyScenarioSurveysIntents> intents;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("Id")
        public String id;

        public static GetScenarioResponseBodyScenarioSurveys build(java.util.Map<String, ?> map) throws Exception {
            GetScenarioResponseBodyScenarioSurveys self = new GetScenarioResponseBodyScenarioSurveys();
            return TeaModel.build(map, self);
        }

        public GetScenarioResponseBodyScenarioSurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public GetScenarioResponseBodyScenarioSurveys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScenarioResponseBodyScenarioSurveys setBeebotId(String beebotId) {
            this.beebotId = beebotId;
            return this;
        }
        public String getBeebotId() {
            return this.beebotId;
        }

        public GetScenarioResponseBodyScenarioSurveys setIntents(java.util.List<GetScenarioResponseBodyScenarioSurveysIntents> intents) {
            this.intents = intents;
            return this;
        }
        public java.util.List<GetScenarioResponseBodyScenarioSurveysIntents> getIntents() {
            return this.intents;
        }

        public GetScenarioResponseBodyScenarioSurveys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScenarioResponseBodyScenarioSurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetScenarioResponseBodyScenarioSurveys setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetScenarioResponseBodyScenarioVariables extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetScenarioResponseBodyScenarioVariables build(java.util.Map<String, ?> map) throws Exception {
            GetScenarioResponseBodyScenarioVariables self = new GetScenarioResponseBodyScenarioVariables();
            return TeaModel.build(map, self);
        }

        public GetScenarioResponseBodyScenarioVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetScenarioResponseBodyScenarioVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetScenarioResponseBodyScenario extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Strategy")
        public GetScenarioResponseBodyScenarioStrategy strategy;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("Description")
        public String description;

        @NameInMap("Surveys")
        public java.util.List<GetScenarioResponseBodyScenarioSurveys> surveys;

        @NameInMap("Variables")
        public java.util.List<GetScenarioResponseBodyScenarioVariables> variables;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetScenarioResponseBodyScenario build(java.util.Map<String, ?> map) throws Exception {
            GetScenarioResponseBodyScenario self = new GetScenarioResponseBodyScenario();
            return TeaModel.build(map, self);
        }

        public GetScenarioResponseBodyScenario setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetScenarioResponseBodyScenario setStrategy(GetScenarioResponseBodyScenarioStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public GetScenarioResponseBodyScenarioStrategy getStrategy() {
            return this.strategy;
        }

        public GetScenarioResponseBodyScenario setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetScenarioResponseBodyScenario setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScenarioResponseBodyScenario setSurveys(java.util.List<GetScenarioResponseBodyScenarioSurveys> surveys) {
            this.surveys = surveys;
            return this;
        }
        public java.util.List<GetScenarioResponseBodyScenarioSurveys> getSurveys() {
            return this.surveys;
        }

        public GetScenarioResponseBodyScenario setVariables(java.util.List<GetScenarioResponseBodyScenarioVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetScenarioResponseBodyScenarioVariables> getVariables() {
            return this.variables;
        }

        public GetScenarioResponseBodyScenario setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScenarioResponseBodyScenario setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
