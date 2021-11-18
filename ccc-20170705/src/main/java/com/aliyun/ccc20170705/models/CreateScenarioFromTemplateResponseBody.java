// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateScenarioFromTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scenario")
    public CreateScenarioFromTemplateResponseBodyScenario scenario;

    @NameInMap("Success")
    public Boolean success;

    public static CreateScenarioFromTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScenarioFromTemplateResponseBody self = new CreateScenarioFromTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScenarioFromTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateScenarioFromTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateScenarioFromTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateScenarioFromTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScenarioFromTemplateResponseBody setScenario(CreateScenarioFromTemplateResponseBodyScenario scenario) {
        this.scenario = scenario;
        return this;
    }
    public CreateScenarioFromTemplateResponseBodyScenario getScenario() {
        return this.scenario;
    }

    public CreateScenarioFromTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime self = new CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class CreateScenarioFromTemplateResponseBodyScenarioStrategy extends TeaModel {
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
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime> workingTime;

        public static CreateScenarioFromTemplateResponseBodyScenarioStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioFromTemplateResponseBodyScenarioStrategy self = new CreateScenarioFromTemplateResponseBodyScenarioStrategy();
            return TeaModel.build(map, self);
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioStrategy setWorkingTime(java.util.List<CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

    }

    public static class CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents extends TeaModel {
        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("NodeId")
        public String nodeId;

        public static CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents self = new CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents();
            return TeaModel.build(map, self);
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class CreateScenarioFromTemplateResponseBodyScenarioSurveys extends TeaModel {
        @NameInMap("BeebotId")
        public String beebotId;

        @NameInMap("Intents")
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents> intents;

        @NameInMap("Role")
        public String role;

        @NameInMap("Round")
        public Integer round;

        @NameInMap("SurveyDescription")
        public String surveyDescription;

        @NameInMap("SurveyId")
        public String surveyId;

        @NameInMap("SurveyName")
        public String surveyName;

        public static CreateScenarioFromTemplateResponseBodyScenarioSurveys build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioFromTemplateResponseBodyScenarioSurveys self = new CreateScenarioFromTemplateResponseBodyScenarioSurveys();
            return TeaModel.build(map, self);
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setBeebotId(String beebotId) {
            this.beebotId = beebotId;
            return this;
        }
        public String getBeebotId() {
            return this.beebotId;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setIntents(java.util.List<CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents> intents) {
            this.intents = intents;
            return this;
        }
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioSurveysIntents> getIntents() {
            return this.intents;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setSurveyDescription(String surveyDescription) {
            this.surveyDescription = surveyDescription;
            return this;
        }
        public String getSurveyDescription() {
            return this.surveyDescription;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setSurveyId(String surveyId) {
            this.surveyId = surveyId;
            return this;
        }
        public String getSurveyId() {
            return this.surveyId;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioSurveys setSurveyName(String surveyName) {
            this.surveyName = surveyName;
            return this;
        }
        public String getSurveyName() {
            return this.surveyName;
        }

    }

    public static class CreateScenarioFromTemplateResponseBodyScenarioVariables extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateScenarioFromTemplateResponseBodyScenarioVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioFromTemplateResponseBodyScenarioVariables self = new CreateScenarioFromTemplateResponseBodyScenarioVariables();
            return TeaModel.build(map, self);
        }

        public CreateScenarioFromTemplateResponseBodyScenarioVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateScenarioFromTemplateResponseBodyScenarioVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateScenarioFromTemplateResponseBodyScenario extends TeaModel {
        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("ScenarioDescription")
        public String scenarioDescription;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("ScenarioName")
        public String scenarioName;

        @NameInMap("Strategy")
        public CreateScenarioFromTemplateResponseBodyScenarioStrategy strategy;

        @NameInMap("Surveys")
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioSurveys> surveys;

        @NameInMap("Type")
        public String type;

        @NameInMap("Variables")
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioVariables> variables;

        public static CreateScenarioFromTemplateResponseBodyScenario build(java.util.Map<String, ?> map) throws Exception {
            CreateScenarioFromTemplateResponseBodyScenario self = new CreateScenarioFromTemplateResponseBodyScenario();
            return TeaModel.build(map, self);
        }

        public CreateScenarioFromTemplateResponseBodyScenario setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setScenarioDescription(String scenarioDescription) {
            this.scenarioDescription = scenarioDescription;
            return this;
        }
        public String getScenarioDescription() {
            return this.scenarioDescription;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setStrategy(CreateScenarioFromTemplateResponseBodyScenarioStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public CreateScenarioFromTemplateResponseBodyScenarioStrategy getStrategy() {
            return this.strategy;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setSurveys(java.util.List<CreateScenarioFromTemplateResponseBodyScenarioSurveys> surveys) {
            this.surveys = surveys;
            return this;
        }
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioSurveys> getSurveys() {
            return this.surveys;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateScenarioFromTemplateResponseBodyScenario setVariables(java.util.List<CreateScenarioFromTemplateResponseBodyScenarioVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateScenarioFromTemplateResponseBodyScenarioVariables> getVariables() {
            return this.variables;
        }

    }

}
