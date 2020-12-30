// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateSurveyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

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

    public static CreateSurveyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyRequest self = new CreateSurveyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSurveyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSurveyRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public CreateSurveyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSurveyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSurveyRequest setFlowJson(String flowJson) {
        this.flowJson = flowJson;
        return this;
    }
    public String getFlowJson() {
        return this.flowJson;
    }

    public CreateSurveyRequest setCorpora(String corpora) {
        this.corpora = corpora;
        return this;
    }
    public String getCorpora() {
        return this.corpora;
    }

    public CreateSurveyRequest setSpeechOptimizationParam(String speechOptimizationParam) {
        this.speechOptimizationParam = speechOptimizationParam;
        return this;
    }
    public String getSpeechOptimizationParam() {
        return this.speechOptimizationParam;
    }

    public CreateSurveyRequest setGlobalQuestions(String globalQuestions) {
        this.globalQuestions = globalQuestions;
        return this;
    }
    public String getGlobalQuestions() {
        return this.globalQuestions;
    }

    public CreateSurveyRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateSurveyRequest setRound(Integer round) {
        this.round = round;
        return this;
    }
    public Integer getRound() {
        return this.round;
    }

}
