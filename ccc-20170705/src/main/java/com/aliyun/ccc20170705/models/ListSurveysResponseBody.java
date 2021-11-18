// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSurveysResponseBody extends TeaModel {
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

    @NameInMap("Surveys")
    public java.util.List<ListSurveysResponseBodySurveys> surveys;

    public static ListSurveysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSurveysResponseBody self = new ListSurveysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSurveysResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSurveysResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSurveysResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSurveysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSurveysResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSurveysResponseBody setSurveys(java.util.List<ListSurveysResponseBodySurveys> surveys) {
        this.surveys = surveys;
        return this;
    }
    public java.util.List<ListSurveysResponseBodySurveys> getSurveys() {
        return this.surveys;
    }

    public static class ListSurveysResponseBodySurveysAsrCustomModel extends TeaModel {
        @NameInMap("Corpora")
        public String corpora;

        @NameInMap("CustomModelStatus")
        public Integer customModelStatus;

        public static ListSurveysResponseBodySurveysAsrCustomModel build(java.util.Map<String, ?> map) throws Exception {
            ListSurveysResponseBodySurveysAsrCustomModel self = new ListSurveysResponseBodySurveysAsrCustomModel();
            return TeaModel.build(map, self);
        }

        public ListSurveysResponseBodySurveysAsrCustomModel setCorpora(String corpora) {
            this.corpora = corpora;
            return this;
        }
        public String getCorpora() {
            return this.corpora;
        }

        public ListSurveysResponseBodySurveysAsrCustomModel setCustomModelStatus(Integer customModelStatus) {
            this.customModelStatus = customModelStatus;
            return this;
        }
        public Integer getCustomModelStatus() {
            return this.customModelStatus;
        }

    }

    public static class ListSurveysResponseBodySurveysFlow extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowJson")
        public String flowJson;

        @NameInMap("IsPublished")
        public Boolean isPublished;

        public static ListSurveysResponseBodySurveysFlow build(java.util.Map<String, ?> map) throws Exception {
            ListSurveysResponseBodySurveysFlow self = new ListSurveysResponseBodySurveysFlow();
            return TeaModel.build(map, self);
        }

        public ListSurveysResponseBodySurveysFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListSurveysResponseBodySurveysFlow setFlowJson(String flowJson) {
            this.flowJson = flowJson;
            return this;
        }
        public String getFlowJson() {
            return this.flowJson;
        }

        public ListSurveysResponseBodySurveysFlow setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
            return this;
        }
        public Boolean getIsPublished() {
            return this.isPublished;
        }

    }

    public static class ListSurveysResponseBodySurveys extends TeaModel {
        @NameInMap("AsrCustomModel")
        public ListSurveysResponseBodySurveysAsrCustomModel asrCustomModel;

        @NameInMap("Description")
        public String description;

        @NameInMap("Flow")
        public ListSurveysResponseBodySurveysFlow flow;

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

        public static ListSurveysResponseBodySurveys build(java.util.Map<String, ?> map) throws Exception {
            ListSurveysResponseBodySurveys self = new ListSurveysResponseBodySurveys();
            return TeaModel.build(map, self);
        }

        public ListSurveysResponseBodySurveys setAsrCustomModel(ListSurveysResponseBodySurveysAsrCustomModel asrCustomModel) {
            this.asrCustomModel = asrCustomModel;
            return this;
        }
        public ListSurveysResponseBodySurveysAsrCustomModel getAsrCustomModel() {
            return this.asrCustomModel;
        }

        public ListSurveysResponseBodySurveys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSurveysResponseBodySurveys setFlow(ListSurveysResponseBodySurveysFlow flow) {
            this.flow = flow;
            return this;
        }
        public ListSurveysResponseBodySurveysFlow getFlow() {
            return this.flow;
        }

        public ListSurveysResponseBodySurveys setGlobalQuestions(String globalQuestions) {
            this.globalQuestions = globalQuestions;
            return this;
        }
        public String getGlobalQuestions() {
            return this.globalQuestions;
        }

        public ListSurveysResponseBodySurveys setHotWords(String hotWords) {
            this.hotWords = hotWords;
            return this;
        }
        public String getHotWords() {
            return this.hotWords;
        }

        public ListSurveysResponseBodySurveys setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSurveysResponseBodySurveys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSurveysResponseBodySurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListSurveysResponseBodySurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

        public ListSurveysResponseBodySurveys setScenarioUuid(String scenarioUuid) {
            this.scenarioUuid = scenarioUuid;
            return this;
        }
        public String getScenarioUuid() {
            return this.scenarioUuid;
        }

        public ListSurveysResponseBodySurveys setSpeechOptimizationParam(String speechOptimizationParam) {
            this.speechOptimizationParam = speechOptimizationParam;
            return this;
        }
        public String getSpeechOptimizationParam() {
            return this.speechOptimizationParam;
        }

    }

}
