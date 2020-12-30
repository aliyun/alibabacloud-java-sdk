// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetSurveyResponseBody extends TeaModel {
    @NameInMap("Survey")
    public GetSurveyResponseBodySurvey survey;

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

    public static GetSurveyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSurveyResponseBody self = new GetSurveyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSurveyResponseBody setSurvey(GetSurveyResponseBodySurvey survey) {
        this.survey = survey;
        return this;
    }
    public GetSurveyResponseBodySurvey getSurvey() {
        return this.survey;
    }

    public GetSurveyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSurveyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSurveyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSurveyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSurveyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSurveyResponseBodySurveyAsrCustomModel extends TeaModel {
        @NameInMap("CustomModelStatus")
        public Integer customModelStatus;

        @NameInMap("Corpora")
        public String corpora;

        public static GetSurveyResponseBodySurveyAsrCustomModel build(java.util.Map<String, ?> map) throws Exception {
            GetSurveyResponseBodySurveyAsrCustomModel self = new GetSurveyResponseBodySurveyAsrCustomModel();
            return TeaModel.build(map, self);
        }

        public GetSurveyResponseBodySurveyAsrCustomModel setCustomModelStatus(Integer customModelStatus) {
            this.customModelStatus = customModelStatus;
            return this;
        }
        public Integer getCustomModelStatus() {
            return this.customModelStatus;
        }

        public GetSurveyResponseBodySurveyAsrCustomModel setCorpora(String corpora) {
            this.corpora = corpora;
            return this;
        }
        public String getCorpora() {
            return this.corpora;
        }

    }

    public static class GetSurveyResponseBodySurveyFlow extends TeaModel {
        @NameInMap("IsPublished")
        public Boolean isPublished;

        @NameInMap("FlowJson")
        public String flowJson;

        @NameInMap("FlowId")
        public String flowId;

        public static GetSurveyResponseBodySurveyFlow build(java.util.Map<String, ?> map) throws Exception {
            GetSurveyResponseBodySurveyFlow self = new GetSurveyResponseBodySurveyFlow();
            return TeaModel.build(map, self);
        }

        public GetSurveyResponseBodySurveyFlow setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
            return this;
        }
        public Boolean getIsPublished() {
            return this.isPublished;
        }

        public GetSurveyResponseBodySurveyFlow setFlowJson(String flowJson) {
            this.flowJson = flowJson;
            return this;
        }
        public String getFlowJson() {
            return this.flowJson;
        }

        public GetSurveyResponseBodySurveyFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

    public static class GetSurveyResponseBodySurvey extends TeaModel {
        @NameInMap("GlobalQuestions")
        public String globalQuestions;

        @NameInMap("Round")
        public Integer round;

        @NameInMap("SpeechOptimizationParam")
        public String speechOptimizationParam;

        @NameInMap("Description")
        public String description;

        @NameInMap("HotWords")
        public String hotWords;

        @NameInMap("AsrCustomModel")
        public GetSurveyResponseBodySurveyAsrCustomModel asrCustomModel;

        @NameInMap("Flow")
        public GetSurveyResponseBodySurveyFlow flow;

        @NameInMap("Role")
        public String role;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScenarioUuid")
        public String scenarioUuid;

        @NameInMap("Id")
        public String id;

        public static GetSurveyResponseBodySurvey build(java.util.Map<String, ?> map) throws Exception {
            GetSurveyResponseBodySurvey self = new GetSurveyResponseBodySurvey();
            return TeaModel.build(map, self);
        }

        public GetSurveyResponseBodySurvey setGlobalQuestions(String globalQuestions) {
            this.globalQuestions = globalQuestions;
            return this;
        }
        public String getGlobalQuestions() {
            return this.globalQuestions;
        }

        public GetSurveyResponseBodySurvey setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public GetSurveyResponseBodySurvey setSpeechOptimizationParam(String speechOptimizationParam) {
            this.speechOptimizationParam = speechOptimizationParam;
            return this;
        }
        public String getSpeechOptimizationParam() {
            return this.speechOptimizationParam;
        }

        public GetSurveyResponseBodySurvey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSurveyResponseBodySurvey setHotWords(String hotWords) {
            this.hotWords = hotWords;
            return this;
        }
        public String getHotWords() {
            return this.hotWords;
        }

        public GetSurveyResponseBodySurvey setAsrCustomModel(GetSurveyResponseBodySurveyAsrCustomModel asrCustomModel) {
            this.asrCustomModel = asrCustomModel;
            return this;
        }
        public GetSurveyResponseBodySurveyAsrCustomModel getAsrCustomModel() {
            return this.asrCustomModel;
        }

        public GetSurveyResponseBodySurvey setFlow(GetSurveyResponseBodySurveyFlow flow) {
            this.flow = flow;
            return this;
        }
        public GetSurveyResponseBodySurveyFlow getFlow() {
            return this.flow;
        }

        public GetSurveyResponseBodySurvey setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetSurveyResponseBodySurvey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSurveyResponseBodySurvey setScenarioUuid(String scenarioUuid) {
            this.scenarioUuid = scenarioUuid;
            return this;
        }
        public String getScenarioUuid() {
            return this.scenarioUuid;
        }

        public GetSurveyResponseBodySurvey setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
