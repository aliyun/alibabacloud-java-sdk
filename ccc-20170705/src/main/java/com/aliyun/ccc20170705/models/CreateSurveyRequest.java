// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateSurveyRequest extends TeaModel {
    @NameInMap("Corpora")
    public String corpora;

    @NameInMap("Description")
    public String description;

    @NameInMap("FlowJson")
    public String flowJson;

    @NameInMap("GlobalQuestions")
    public String globalQuestions;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Role")
    public String role;

    @NameInMap("Round")
    public Integer round;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("SpeechOptimizationParam")
    public String speechOptimizationParam;

    public static CreateSurveyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyRequest self = new CreateSurveyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSurveyRequest setCorpora(String corpora) {
        this.corpora = corpora;
        return this;
    }
    public String getCorpora() {
        return this.corpora;
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

    public CreateSurveyRequest setGlobalQuestions(String globalQuestions) {
        this.globalQuestions = globalQuestions;
        return this;
    }
    public String getGlobalQuestions() {
        return this.globalQuestions;
    }

    public CreateSurveyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSurveyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public CreateSurveyRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public CreateSurveyRequest setSpeechOptimizationParam(String speechOptimizationParam) {
        this.speechOptimizationParam = speechOptimizationParam;
        return this;
    }
    public String getSpeechOptimizationParam() {
        return this.speechOptimizationParam;
    }

}
