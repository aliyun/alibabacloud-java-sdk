// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyScenarioResponseBody extends TeaModel {
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
    public ModifyScenarioResponseBodyScenario scenario;

    public static ModifyScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScenarioResponseBody self = new ModifyScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScenarioResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScenarioResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyScenarioResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyScenarioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifyScenarioResponseBody setScenario(ModifyScenarioResponseBodyScenario scenario) {
        this.scenario = scenario;
        return this;
    }
    public ModifyScenarioResponseBodyScenario getScenario() {
        return this.scenario;
    }

    public static class ModifyScenarioResponseBodyScenarioStrategyWorkingTime extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("BeginTime")
        public String beginTime;

        public static ModifyScenarioResponseBodyScenarioStrategyWorkingTime build(java.util.Map<String, ?> map) throws Exception {
            ModifyScenarioResponseBodyScenarioStrategyWorkingTime self = new ModifyScenarioResponseBodyScenarioStrategyWorkingTime();
            return TeaModel.build(map, self);
        }

        public ModifyScenarioResponseBodyScenarioStrategyWorkingTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ModifyScenarioResponseBodyScenarioStrategyWorkingTime setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

    }

    public static class ModifyScenarioResponseBodyScenarioStrategy extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("MaxAttemptsPerDay")
        public Integer maxAttemptsPerDay;

        @NameInMap("WorkingTime")
        public java.util.List<ModifyScenarioResponseBodyScenarioStrategyWorkingTime> workingTime;

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

        public static ModifyScenarioResponseBodyScenarioStrategy build(java.util.Map<String, ?> map) throws Exception {
            ModifyScenarioResponseBodyScenarioStrategy self = new ModifyScenarioResponseBodyScenarioStrategy();
            return TeaModel.build(map, self);
        }

        public ModifyScenarioResponseBodyScenarioStrategy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
            this.maxAttemptsPerDay = maxAttemptsPerDay;
            return this;
        }
        public Integer getMaxAttemptsPerDay() {
            return this.maxAttemptsPerDay;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setWorkingTime(java.util.List<ModifyScenarioResponseBodyScenarioStrategyWorkingTime> workingTime) {
            this.workingTime = workingTime;
            return this;
        }
        public java.util.List<ModifyScenarioResponseBodyScenarioStrategyWorkingTime> getWorkingTime() {
            return this.workingTime;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setFollowUpStrategy(String followUpStrategy) {
            this.followUpStrategy = followUpStrategy;
            return this;
        }
        public String getFollowUpStrategy() {
            return this.followUpStrategy;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setCustomized(String customized) {
            this.customized = customized;
            return this;
        }
        public String getCustomized() {
            return this.customized;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setRepeatDays(java.util.List<String> repeatDays) {
            this.repeatDays = repeatDays;
            return this;
        }
        public java.util.List<String> getRepeatDays() {
            return this.repeatDays;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setRoutingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }
        public String getRoutingStrategy() {
            return this.routingStrategy;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setStrategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setMinAttemptInterval(Integer minAttemptInterval) {
            this.minAttemptInterval = minAttemptInterval;
            return this;
        }
        public Integer getMinAttemptInterval() {
            return this.minAttemptInterval;
        }

        public ModifyScenarioResponseBodyScenarioStrategy setRepeatBy(String repeatBy) {
            this.repeatBy = repeatBy;
            return this;
        }
        public String getRepeatBy() {
            return this.repeatBy;
        }

    }

    public static class ModifyScenarioResponseBodyScenarioSurveysIntents extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("IntentId")
        public String intentId;

        public static ModifyScenarioResponseBodyScenarioSurveysIntents build(java.util.Map<String, ?> map) throws Exception {
            ModifyScenarioResponseBodyScenarioSurveysIntents self = new ModifyScenarioResponseBodyScenarioSurveysIntents();
            return TeaModel.build(map, self);
        }

        public ModifyScenarioResponseBodyScenarioSurveysIntents setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ModifyScenarioResponseBodyScenarioSurveysIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

    }

    public static class ModifyScenarioResponseBodyScenarioSurveys extends TeaModel {
        @NameInMap("Round")
        public Integer round;

        @NameInMap("SurveyDescription")
        public String surveyDescription;

        @NameInMap("BeebotId")
        public String beebotId;

        @NameInMap("Intents")
        public java.util.List<ModifyScenarioResponseBodyScenarioSurveysIntents> intents;

        @NameInMap("SurveyName")
        public String surveyName;

        @NameInMap("Role")
        public String role;

        @NameInMap("SurveyId")
        public String surveyId;

        public static ModifyScenarioResponseBodyScenarioSurveys build(java.util.Map<String, ?> map) throws Exception {
            ModifyScenarioResponseBodyScenarioSurveys self = new ModifyScenarioResponseBodyScenarioSurveys();
            return TeaModel.build(map, self);
        }

        public ModifyScenarioResponseBodyScenarioSurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public ModifyScenarioResponseBodyScenarioSurveys setSurveyDescription(String surveyDescription) {
            this.surveyDescription = surveyDescription;
            return this;
        }
        public String getSurveyDescription() {
            return this.surveyDescription;
        }

        public ModifyScenarioResponseBodyScenarioSurveys setBeebotId(String beebotId) {
            this.beebotId = beebotId;
            return this;
        }
        public String getBeebotId() {
            return this.beebotId;
        }

        public ModifyScenarioResponseBodyScenarioSurveys setIntents(java.util.List<ModifyScenarioResponseBodyScenarioSurveysIntents> intents) {
            this.intents = intents;
            return this;
        }
        public java.util.List<ModifyScenarioResponseBodyScenarioSurveysIntents> getIntents() {
            return this.intents;
        }

        public ModifyScenarioResponseBodyScenarioSurveys setSurveyName(String surveyName) {
            this.surveyName = surveyName;
            return this;
        }
        public String getSurveyName() {
            return this.surveyName;
        }

        public ModifyScenarioResponseBodyScenarioSurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifyScenarioResponseBodyScenarioSurveys setSurveyId(String surveyId) {
            this.surveyId = surveyId;
            return this;
        }
        public String getSurveyId() {
            return this.surveyId;
        }

    }

    public static class ModifyScenarioResponseBodyScenarioVariables extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModifyScenarioResponseBodyScenarioVariables build(java.util.Map<String, ?> map) throws Exception {
            ModifyScenarioResponseBodyScenarioVariables self = new ModifyScenarioResponseBodyScenarioVariables();
            return TeaModel.build(map, self);
        }

        public ModifyScenarioResponseBodyScenarioVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyScenarioResponseBodyScenarioVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyScenarioResponseBodyScenario extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ScenarioId")
        public String scenarioId;

        @NameInMap("Strategy")
        public ModifyScenarioResponseBodyScenarioStrategy strategy;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("ScenarioDescription")
        public String scenarioDescription;

        @NameInMap("ScenarioName")
        public String scenarioName;

        @NameInMap("Surveys")
        public java.util.List<ModifyScenarioResponseBodyScenarioSurveys> surveys;

        @NameInMap("Variables")
        public java.util.List<ModifyScenarioResponseBodyScenarioVariables> variables;

        public static ModifyScenarioResponseBodyScenario build(java.util.Map<String, ?> map) throws Exception {
            ModifyScenarioResponseBodyScenario self = new ModifyScenarioResponseBodyScenario();
            return TeaModel.build(map, self);
        }

        public ModifyScenarioResponseBodyScenario setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyScenarioResponseBodyScenario setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ModifyScenarioResponseBodyScenario setStrategy(ModifyScenarioResponseBodyScenarioStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ModifyScenarioResponseBodyScenarioStrategy getStrategy() {
            return this.strategy;
        }

        public ModifyScenarioResponseBodyScenario setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ModifyScenarioResponseBodyScenario setScenarioDescription(String scenarioDescription) {
            this.scenarioDescription = scenarioDescription;
            return this;
        }
        public String getScenarioDescription() {
            return this.scenarioDescription;
        }

        public ModifyScenarioResponseBodyScenario setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

        public ModifyScenarioResponseBodyScenario setSurveys(java.util.List<ModifyScenarioResponseBodyScenarioSurveys> surveys) {
            this.surveys = surveys;
            return this;
        }
        public java.util.List<ModifyScenarioResponseBodyScenarioSurveys> getSurveys() {
            return this.surveys;
        }

        public ModifyScenarioResponseBodyScenario setVariables(java.util.List<ModifyScenarioResponseBodyScenarioVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ModifyScenarioResponseBodyScenarioVariables> getVariables() {
            return this.variables;
        }

    }

}
