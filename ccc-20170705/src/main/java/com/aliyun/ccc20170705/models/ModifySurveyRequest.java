// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySurveyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SurveyId")
    public String surveyId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowJson")
    public String flowJson;

    @NameInMap("Corpora")
    public String corpora;

    @NameInMap("SpeechOptimizationParam")
    public String speechOptimizationParam;

    @NameInMap("GlobalQuestions")
    public String globalQuestions;

    @NameInMap("Role")
    public String role;

    @NameInMap("Round")
    public Integer round;

    public static ModifySurveyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySurveyRequest self = new ModifySurveyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySurveyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySurveyRequest setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

    public ModifySurveyRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public ModifySurveyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySurveyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySurveyRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ModifySurveyRequest setFlowJson(String flowJson) {
        this.flowJson = flowJson;
        return this;
    }
    public String getFlowJson() {
        return this.flowJson;
    }

    public ModifySurveyRequest setCorpora(String corpora) {
        this.corpora = corpora;
        return this;
    }
    public String getCorpora() {
        return this.corpora;
    }

    public ModifySurveyRequest setSpeechOptimizationParam(String speechOptimizationParam) {
        this.speechOptimizationParam = speechOptimizationParam;
        return this;
    }
    public String getSpeechOptimizationParam() {
        return this.speechOptimizationParam;
    }

    public ModifySurveyRequest setGlobalQuestions(String globalQuestions) {
        this.globalQuestions = globalQuestions;
        return this;
    }
    public String getGlobalQuestions() {
        return this.globalQuestions;
    }

    public ModifySurveyRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ModifySurveyRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

}
