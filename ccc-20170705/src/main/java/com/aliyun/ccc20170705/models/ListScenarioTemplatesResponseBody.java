// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListScenarioTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScenarioTemplates")
    public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplates> scenarioTemplates;

    @NameInMap("Success")
    public Boolean success;

    public static ListScenarioTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScenarioTemplatesResponseBody self = new ListScenarioTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScenarioTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScenarioTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScenarioTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScenarioTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScenarioTemplatesResponseBody setScenarioTemplates(java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplates> scenarioTemplates) {
        this.scenarioTemplates = scenarioTemplates;
        return this;
    }
    public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplates> getScenarioTemplates() {
        return this.scenarioTemplates;
    }

    public ListScenarioTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowJson")
        public String flowJson;

        @NameInMap("IsPublished")
        public Boolean isPublished;

        public static ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow self = new ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow();
            return TeaModel.build(map, self);
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow setFlowJson(String flowJson) {
            this.flowJson = flowJson;
            return this;
        }
        public String getFlowJson() {
            return this.flowJson;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow setIsPublished(Boolean isPublished) {
            this.isPublished = isPublished;
            return this;
        }
        public Boolean getIsPublished() {
            return this.isPublished;
        }

    }

    public static class ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents extends TeaModel {
        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("NodeId")
        public String nodeId;

        public static ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents self = new ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents();
            return TeaModel.build(map, self);
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys extends TeaModel {
        @NameInMap("BeebotId")
        public String beebotId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Flow")
        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow flow;

        @NameInMap("GlobalQuestions")
        public String globalQuestions;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intents")
        public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents> intents;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("Round")
        public Integer round;

        public static ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys self = new ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys();
            return TeaModel.build(map, self);
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setBeebotId(String beebotId) {
            this.beebotId = beebotId;
            return this;
        }
        public String getBeebotId() {
            return this.beebotId;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setFlow(ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow flow) {
            this.flow = flow;
            return this;
        }
        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysFlow getFlow() {
            return this.flow;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setGlobalQuestions(String globalQuestions) {
            this.globalQuestions = globalQuestions;
            return this;
        }
        public String getGlobalQuestions() {
            return this.globalQuestions;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setIntents(java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents> intents) {
            this.intents = intents;
            return this;
        }
        public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesSurveysIntents> getIntents() {
            return this.intents;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys setRound(Integer round) {
            this.round = round;
            return this;
        }
        public Integer getRound() {
            return this.round;
        }

    }

    public static class ListScenarioTemplatesResponseBodyScenarioTemplatesVariables extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListScenarioTemplatesResponseBodyScenarioTemplatesVariables build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioTemplatesResponseBodyScenarioTemplatesVariables self = new ListScenarioTemplatesResponseBodyScenarioTemplatesVariables();
            return TeaModel.build(map, self);
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesVariables setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplatesVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListScenarioTemplatesResponseBodyScenarioTemplates extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Surveys")
        public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys> surveys;

        @NameInMap("Type")
        public String type;

        @NameInMap("Variables")
        public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesVariables> variables;

        public static ListScenarioTemplatesResponseBodyScenarioTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListScenarioTemplatesResponseBodyScenarioTemplates self = new ListScenarioTemplatesResponseBodyScenarioTemplates();
            return TeaModel.build(map, self);
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setSurveys(java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys> surveys) {
            this.surveys = surveys;
            return this;
        }
        public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesSurveys> getSurveys() {
            return this.surveys;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListScenarioTemplatesResponseBodyScenarioTemplates setVariables(java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListScenarioTemplatesResponseBodyScenarioTemplatesVariables> getVariables() {
            return this.variables;
        }

    }

}
