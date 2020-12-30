// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateScenarioResponseBody extends TeaModel {
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
    public CreateScenarioResponseBodyScenario scenario;

    public static CreateScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioResponseBody self = new CreateScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScenarioResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScenarioResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateScenarioResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScenarioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateScenarioResponseBody setScenario(CreateScenarioResponseBodyScenario scenario) {
        this.scenario = scenario;
        return this;
    }
    public CreateScenarioResponseBodyScenario getScenario() {
        return this.scenario;
    }

    public static class CreateScenarioResponseBodyScenarioStrategyWorkingTime extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BeginTime")
        public String beginTime;

        public static CreateScenarioResponseBodyScenarioStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioResponseBodyScenarioStrategyWorkingTime self = new CreateScenarioResponseBodyScenarioStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public CreateScenarioResponseBodyScenarioStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScenarioResponseBodyScenarioStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

    }

    public static class CreateScenarioResponseBodyScenarioStrategy extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("WorkingTime")
        public java.util.List<CreateScenarioResponseBodyScenarioStrategyWorkingTime> workingTime;

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

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("RepeatDays")
        public java.util.List<String> repeatDays;

        @NameInMap("RoutingStrategy")
        public String routingStrategy;

        @NameInMap("StrategyDescription")
        public String strategyDescription;

        @NameInMap("MinAttemptInterval")
        public Integer minAttemptInterval;

        @NameInMap("RepeatBy")
        public String repeatBy;

        public static CreateScenarioResponseBodyScenarioStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioResponseBodyScenarioStrategy self = new CreateScenarioResponseBodyScenarioStrategy();
            return TeaModel.build(map, self);
        }

        public CreateScenarioResponseBodyScenarioStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateScenarioResponseBodyScenarioStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public CreateScenarioResponseBodyScenarioStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public CreateScenarioResponseBodyScenarioStrategy setWorkingTime(java.util.List<CreateScenarioResponseBodyScenarioStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<CreateScenarioResponseBodyScenarioStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public CreateScenarioResponseBodyScenarioStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public CreateScenarioResponseBodyScenarioStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateScenarioResponseBodyScenarioStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public CreateScenarioResponseBodyScenarioStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CreateScenarioResponseBodyScenarioStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateScenarioResponseBodyScenarioStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public CreateScenarioResponseBodyScenarioStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public CreateScenarioResponseBodyScenarioStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public CreateScenarioResponseBodyScenarioStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public CreateScenarioResponseBodyScenarioStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public CreateScenarioResponseBodyScenarioStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

    }

    public static class CreateScenarioResponseBodyScenarioSurveysIntents extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("IntentId")
        public String intentId;

        public static CreateScenarioResponseBodyScenarioSurveysIntents build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioResponseBodyScenarioSurveysIntents self = new CreateScenarioResponseBodyScenarioSurveysIntents();
            return TeaModel.build(map, self);
        }

        public CreateScenarioResponseBodyScenarioSurveysIntents setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public CreateScenarioResponseBodyScenarioSurveysIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

    }

    public static class CreateScenarioResponseBodyScenarioSurveys extends TeaModel {
        @NameInMap("Round")
        public Integer round;

        @NameInMap("SurveyDescription")
        public String surveyDescription;

        @NameInMap("BeebotId")
        public String beebotId;

        @NameInMap("Intents")
        public java.util.List<CreateScenarioResponseBodyScenarioSurveysIntents> intents;

        @NameInMap("SurveyName")
        public String surveyName;

        @NameInMap("Role")
        public String role;

        @NameInMap("SurveyId")
        public String surveyId;

        public static CreateScenarioResponseBodyScenarioSurveys build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioResponseBodyScenarioSurveys self = new CreateScenarioResponseBodyScenarioSurveys();
            return TeaModel.build(map, self);
        }

        public CreateScenarioResponseBodyScenarioSurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public CreateScenarioResponseBodyScenarioSurveys setSurveyDescription(String surveyDescription) {
            this.surveyDescription = surveyDescription;
            return this;
        }
        public String getSurveyDescription() {
            return this.surveyDescription;
        }

        public CreateScenarioResponseBodyScenarioSurveys setBeebotId(String beebotId) {
            this.beebotId = beebotId;
            return this;
        }
        public String getBeebotId() {
            return this.beebotId;
        }

        public CreateScenarioResponseBodyScenarioSurveys setIntents(java.util.List<CreateScenarioResponseBodyScenarioSurveysIntents> intents) {
            this.intents = intents;
            return this;
        }
        public java.util.List<CreateScenarioResponseBodyScenarioSurveysIntents> getIntents() {
            return this.intents;
        }

        public CreateScenarioResponseBodyScenarioSurveys setSurveyName(String surveyName) {
            this.surveyName = surveyName;
            return this;
        }
        public String getSurveyName() {
            return this.surveyName;
        }

        public CreateScenarioResponseBodyScenarioSurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateScenarioResponseBodyScenarioSurveys setSurveyId(String surveyId) {
            this.surveyId = surveyId;
            return this;
        }
        public String getSurveyId() {
            return this.surveyId;
        }

    }

    public static class CreateScenarioResponseBodyScenarioVariables extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateScenarioResponseBodyScenarioVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioResponseBodyScenarioVariables self = new CreateScenarioResponseBodyScenarioVariables();
            return TeaModel.build(map, self);
        }

        public CreateScenarioResponseBodyScenarioVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateScenarioResponseBodyScenarioVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateScenarioResponseBodyScenario extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Strategy")
        public CreateScenarioResponseBodyScenarioStrategy strategy;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("ScenarioDescription")
        public String scenarioDescription;

        @NameInMap("ScenarioName")
        public String scenarioName;

        @NameInMap("Surveys")
        public java.util.List<CreateScenarioResponseBodyScenarioSurveys> surveys;

        @NameInMap("Variables")
        public java.util.List<CreateScenarioResponseBodyScenarioVariables> variables;

        public static CreateScenarioResponseBodyScenario build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioResponseBodyScenario self = new CreateScenarioResponseBodyScenario();
            return TeaModel.build(map, self);
        }

        public CreateScenarioResponseBodyScenario setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateScenarioResponseBodyScenario setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public CreateScenarioResponseBodyScenario setStrategy(CreateScenarioResponseBodyScenarioStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateScenarioResponseBodyScenarioStrategy getStrategy() {
            return this.strategy;
        }

        public CreateScenarioResponseBodyScenario setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateScenarioResponseBodyScenario setScenarioDescription(String scenarioDescription) {
            this.scenarioDescription = scenarioDescription;
            return this;
        }
        public String getScenarioDescription() {
            return this.scenarioDescription;
        }

        public CreateScenarioResponseBodyScenario setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

        public CreateScenarioResponseBodyScenario setSurveys(java.util.List<CreateScenarioResponseBodyScenarioSurveys> surveys) {
            this.surveys = surveys;
            return this;
        }
        public java.util.List<CreateScenarioResponseBodyScenarioSurveys> getSurveys() {
            return this.surveys;
        }

        public CreateScenarioResponseBodyScenario setVariables(java.util.List<CreateScenarioResponseBodyScenarioVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateScenarioResponseBodyScenarioVariables> getVariables() {
            return this.variables;
        }

    }

}
