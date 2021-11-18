// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateSurveyResponseBody extends TeaModel {
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
    public CreateSurveyResponseBodySurvey survey;

    public static CreateSurveyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSurveyResponseBody self = new CreateSurveyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSurveyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSurveyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateSurveyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSurveyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSurveyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateSurveyResponseBody setSurvey(CreateSurveyResponseBodySurvey survey) {
        this.survey = survey;
        return this;
    }
    public CreateSurveyResponseBodySurvey getSurvey() {
        return this.survey;
    }

    public static class CreateSurveyResponseBodySurveyAsrCustomModel extends TeaModel {
        @NameInMap("Corpora")
        public String corpora;

        @NameInMap("CustomModelStatus")
        public Integer customModelStatus;

        public static CreateSurveyResponseBodySurveyAsrCustomModel build(java.util.Map<String, ?> map) throws Exception {
            CreateSurveyResponseBodySurveyAsrCustomModel self = new CreateSurveyResponseBodySurveyAsrCustomModel();
            return TeaModel.build(map, self);
        }

        public CreateSurveyResponseBodySurveyAsrCustomModel setCorpora(String corpora) {
            this.corpora = corpora;
            return this;
        }
        public String getCorpora() {
            return this.corpora;
        }

        public CreateSurveyResponseBodySurveyAsrCustomModel setCustomModelStatus(Integer customModelStatus) {
            this.customModelStatus = customModelStatus;
            return this;
        }
        public Integer getCustomModelStatus() {
            return this.customModelStatus;
        }

    }

    public static class CreateSurveyResponseBodySurveyFlow extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowJson")
        public String flowJson;

        @NameInMap("IsPublished")
        public Boolean isPublished;

        public static CreateSurveyResponseBodySurveyFlow build(java.util.Map<String, ?> map) throws Exception {
            CreateSurveyResponseBodySurveyFlow self = new CreateSurveyResponseBodySurveyFlow();
            return TeaModel.build(map, self);
        }

        public CreateSurveyResponseBodySurveyFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public CreateSurveyResponseBodySurveyFlow setFlowJson(String flowJson) {
            this.flowJson = flowJson;
            return this;
        }
        public String getFlowJson() {
            return this.flowJson;
        }

        public CreateSurveyResponseBodySurveyFlow setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
            return this;
        }
        public Boolean getIsPublished() {
            return this.isPublished;
        }

    }

    public static class CreateSurveyResponseBodySurvey extends TeaModel {
        @NameInMap("AsrCustomModel")
        public CreateSurveyResponseBodySurveyAsrCustomModel asrCustomModel;

        @NameInMap("Description")
        public String description;

        @NameInMap("Flow")
        public CreateSurveyResponseBodySurveyFlow flow;

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

        public static CreateSurveyResponseBodySurvey build(java.util.Map<String, ?> map) throws Exception {
            CreateSurveyResponseBodySurvey self = new CreateSurveyResponseBodySurvey();
            return TeaModel.build(map, self);
        }

        public CreateSurveyResponseBodySurvey setAsrCustomModel(CreateSurveyResponseBodySurveyAsrCustomModel asrCustomModel) {
            this.asrCustomModel = asrCustomModel;
            return this;
        }
        public CreateSurveyResponseBodySurveyAsrCustomModel getAsrCustomModel() {
            return this.asrCustomModel;
        }

        public CreateSurveyResponseBodySurvey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSurveyResponseBodySurvey setFlow(CreateSurveyResponseBodySurveyFlow flow) {
            this.flow = flow;
            return this;
        }
        public CreateSurveyResponseBodySurveyFlow getFlow() {
            return this.flow;
        }

        public CreateSurveyResponseBodySurvey setGlobalQuestions(String globalQuestions) {
            this.globalQuestions = globalQuestions;
            return this;
        }
        public String getGlobalQuestions() {
            return this.globalQuestions;
        }

        public CreateSurveyResponseBodySurvey setHotWords(String hotWords) {
            this.hotWords = hotWords;
            return this;
        }
        public String getHotWords() {
            return this.hotWords;
        }

        public CreateSurveyResponseBodySurvey setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateSurveyResponseBodySurvey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSurveyResponseBodySurvey setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateSurveyResponseBodySurvey setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public CreateSurveyResponseBodySurvey setScenarioUuid(String scenarioUuid) {
            this.scenarioUuid = scenarioUuid;
            return this;
        }
        public String getScenarioUuid() {
            return this.scenarioUuid;
        }

        public CreateSurveyResponseBodySurvey setSpeechOptimizationParam(String speechOptimizationParam) {
            this.speechOptimizationParam = speechOptimizationParam;
            return this;
        }
        public String getSpeechOptimizationParam() {
            return this.speechOptimizationParam;
        }

    }

}
