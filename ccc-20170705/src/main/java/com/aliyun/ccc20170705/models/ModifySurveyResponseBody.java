// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifySurveyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Survey")
    public ModifySurveyResponseBodySurvey survey;

    public static ModifySurveyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySurveyResponseBody self = new ModifySurveyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySurveyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySurveyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifySurveyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySurveyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySurveyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ModifySurveyResponseBody setSurvey(ModifySurveyResponseBodySurvey survey) {
        this.survey = survey;
        return this;
    }
    public ModifySurveyResponseBodySurvey getSurvey() {
        return this.survey;
    }

    public static class ModifySurveyResponseBodySurveyAsrCustomModel extends TeaModel {
        @NameInMap("Corpora")
        public String corpora;

        @NameInMap("CustomModelStatus")
        public Integer customModelStatus;

        public static ModifySurveyResponseBodySurveyAsrCustomModel build(java.util.Map<String, ?> map) throws Exception {
            ModifySurveyResponseBodySurveyAsrCustomModel self = new ModifySurveyResponseBodySurveyAsrCustomModel();
            return TeaModel.build(map, self);
        }

        public ModifySurveyResponseBodySurveyAsrCustomModel setCorpora(String corpora) {
            this.corpora = corpora;
            return this;
        }
        public String getCorpora() {
            return this.corpora;
        }

        public ModifySurveyResponseBodySurveyAsrCustomModel setCustomModelStatus(Integer customModelStatus) {
            this.customModelStatus = customModelStatus;
            return this;
        }
        public Integer getCustomModelStatus() {
            return this.customModelStatus;
        }

    }

    public static class ModifySurveyResponseBodySurveyFlow extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowJson")
        public String flowJson;

        @NameInMap("IsPublished")
        public Boolean isPublished;

        public static ModifySurveyResponseBodySurveyFlow build(java.util.Map<String, ?> map) throws Exception {
            ModifySurveyResponseBodySurveyFlow self = new ModifySurveyResponseBodySurveyFlow();
            return TeaModel.build(map, self);
        }

        public ModifySurveyResponseBodySurveyFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ModifySurveyResponseBodySurveyFlow setFlowJson(String flowJson) {
            this.flowJson = flowJson;
            return this;
        }
        public String getFlowJson() {
            return this.flowJson;
        }

        public ModifySurveyResponseBodySurveyFlow setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
            return this;
        }
        public Boolean getIsPublished() {
            return this.isPublished;
        }

    }

    public static class ModifySurveyResponseBodySurvey extends TeaModel {
        @NameInMap("AsrCustomModel")
        public ModifySurveyResponseBodySurveyAsrCustomModel asrCustomModel;

        @NameInMap("Description")
        public String description;

        @NameInMap("Flow")
        public ModifySurveyResponseBodySurveyFlow flow;

        @NameInMap("GlobalQuestions")
        public String globalQuestions;

        @NameInMap("HotWords")
        public String hotWords;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("Round")
        public Integer round;

        @NameInMap("ScenarioUuid")
        public String scenarioUuid;

        @NameInMap("SpeechOptimizationParam")
        public String speechOptimizationParam;

        public static ModifySurveyResponseBodySurvey build(java.util.Map<String, ?> map) throws Exception {
            ModifySurveyResponseBodySurvey self = new ModifySurveyResponseBodySurvey();
            return TeaModel.build(map, self);
        }

        public ModifySurveyResponseBodySurvey setAsrCustomModel(ModifySurveyResponseBodySurveyAsrCustomModel asrCustomModel) {
            this.asrCustomModel = asrCustomModel;
            return this;
        }
        public ModifySurveyResponseBodySurveyAsrCustomModel getAsrCustomModel() {
            return this.asrCustomModel;
        }

        public ModifySurveyResponseBodySurvey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifySurveyResponseBodySurvey setFlow(ModifySurveyResponseBodySurveyFlow flow) {
            this.flow = flow;
            return this;
        }
        public ModifySurveyResponseBodySurveyFlow getFlow() {
            return this.flow;
        }

        public ModifySurveyResponseBodySurvey setGlobalQuestions(String globalQuestions) {
            this.globalQuestions = globalQuestions;
            return this;
        }
        public String getGlobalQuestions() {
            return this.globalQuestions;
        }

        public ModifySurveyResponseBodySurvey setHotWords(String hotWords) {
            this.hotWords = hotWords;
            return this;
        }
        public String getHotWords() {
            return this.hotWords;
        }

        public ModifySurveyResponseBodySurvey setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifySurveyResponseBodySurvey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifySurveyResponseBodySurvey setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifySurveyResponseBodySurvey setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public ModifySurveyResponseBodySurvey setScenarioUuid(String scenarioUuid) {
            this.scenarioUuid = scenarioUuid;
            return this;
        }
        public String getScenarioUuid() {
            return this.scenarioUuid;
        }

        public ModifySurveyResponseBodySurvey setSpeechOptimizationParam(String speechOptimizationParam) {
            this.speechOptimizationParam = speechOptimizationParam;
            return this;
        }
        public String getSpeechOptimizationParam() {
            return this.speechOptimizationParam;
        }

    }

}
