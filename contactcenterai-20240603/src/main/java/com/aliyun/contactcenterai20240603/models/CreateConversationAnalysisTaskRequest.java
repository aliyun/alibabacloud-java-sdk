// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateConversationAnalysisTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("autoSplit")
    public Integer autoSplit;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("clientChannel")
    public Integer clientChannel;

    @NameInMap("examples")
    public CreateConversationAnalysisTaskRequestExamples examples;

    @NameInMap("fields")
    public java.util.List<CreateConversationAnalysisTaskRequestFields> fields;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>audio.mp3</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tyxmTurbo</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    @NameInMap("resultTypes")
    public java.util.List<String> resultTypes;

    @NameInMap("sceneName")
    public String sceneName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("serviceChannel")
    public Integer serviceChannel;

    @NameInMap("serviceChannelKeywords")
    public java.util.List<String> serviceChannelKeywords;

    @NameInMap("serviceInspection")
    public CreateConversationAnalysisTaskRequestServiceInspection serviceInspection;

    @NameInMap("templateIds")
    public java.util.List<String> templateIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://a.b.com/inner.mp3">http://a.b.com/inner.mp3</a></p>
     */
    @NameInMap("voiceFileUrl")
    public String voiceFileUrl;

    public static CreateConversationAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationAnalysisTaskRequest self = new CreateConversationAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateConversationAnalysisTaskRequest setAutoSplit(Integer autoSplit) {
        this.autoSplit = autoSplit;
        return this;
    }
    public Integer getAutoSplit() {
        return this.autoSplit;
    }

    public CreateConversationAnalysisTaskRequest setClientChannel(Integer clientChannel) {
        this.clientChannel = clientChannel;
        return this;
    }
    public Integer getClientChannel() {
        return this.clientChannel;
    }

    public CreateConversationAnalysisTaskRequest setExamples(CreateConversationAnalysisTaskRequestExamples examples) {
        this.examples = examples;
        return this;
    }
    public CreateConversationAnalysisTaskRequestExamples getExamples() {
        return this.examples;
    }

    public CreateConversationAnalysisTaskRequest setFields(java.util.List<CreateConversationAnalysisTaskRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateConversationAnalysisTaskRequestFields> getFields() {
        return this.fields;
    }

    public CreateConversationAnalysisTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateConversationAnalysisTaskRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public CreateConversationAnalysisTaskRequest setResultTypes(java.util.List<String> resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    public CreateConversationAnalysisTaskRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public CreateConversationAnalysisTaskRequest setServiceChannel(Integer serviceChannel) {
        this.serviceChannel = serviceChannel;
        return this;
    }
    public Integer getServiceChannel() {
        return this.serviceChannel;
    }

    public CreateConversationAnalysisTaskRequest setServiceChannelKeywords(java.util.List<String> serviceChannelKeywords) {
        this.serviceChannelKeywords = serviceChannelKeywords;
        return this;
    }
    public java.util.List<String> getServiceChannelKeywords() {
        return this.serviceChannelKeywords;
    }

    public CreateConversationAnalysisTaskRequest setServiceInspection(CreateConversationAnalysisTaskRequestServiceInspection serviceInspection) {
        this.serviceInspection = serviceInspection;
        return this;
    }
    public CreateConversationAnalysisTaskRequestServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    public CreateConversationAnalysisTaskRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public CreateConversationAnalysisTaskRequest setVoiceFileUrl(String voiceFileUrl) {
        this.voiceFileUrl = voiceFileUrl;
        return this;
    }
    public String getVoiceFileUrl() {
        return this.voiceFileUrl;
    }

    public static class CreateConversationAnalysisTaskRequestExamplesSentences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>chat-01</p>
         */
        @NameInMap("chatId")
        public String chatId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("text")
        public String text;

        public static CreateConversationAnalysisTaskRequestExamplesSentences build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskRequestExamplesSentences self = new CreateConversationAnalysisTaskRequestExamplesSentences();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskRequestExamplesSentences setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public CreateConversationAnalysisTaskRequestExamplesSentences setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateConversationAnalysisTaskRequestExamplesSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateConversationAnalysisTaskRequestExamples extends TeaModel {
        @NameInMap("output")
        public String output;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sentences")
        public java.util.List<CreateConversationAnalysisTaskRequestExamplesSentences> sentences;

        public static CreateConversationAnalysisTaskRequestExamples build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskRequestExamples self = new CreateConversationAnalysisTaskRequestExamples();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskRequestExamples setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public CreateConversationAnalysisTaskRequestExamples setSentences(java.util.List<CreateConversationAnalysisTaskRequestExamplesSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<CreateConversationAnalysisTaskRequestExamplesSentences> getSentences() {
            return this.sentences;
        }

    }

    public static class CreateConversationAnalysisTaskRequestFieldsEnumValues extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("enumValue")
        public String enumValue;

        public static CreateConversationAnalysisTaskRequestFieldsEnumValues build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskRequestFieldsEnumValues self = new CreateConversationAnalysisTaskRequestFieldsEnumValues();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskRequestFieldsEnumValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateConversationAnalysisTaskRequestFieldsEnumValues setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class CreateConversationAnalysisTaskRequestFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>phoneNumber</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("desc")
        public String desc;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("enumValues")
        public java.util.List<CreateConversationAnalysisTaskRequestFieldsEnumValues> enumValues;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateConversationAnalysisTaskRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskRequestFields self = new CreateConversationAnalysisTaskRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskRequestFields setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateConversationAnalysisTaskRequestFields setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateConversationAnalysisTaskRequestFields setEnumValues(java.util.List<CreateConversationAnalysisTaskRequestFieldsEnumValues> enumValues) {
            this.enumValues = enumValues;
            return this;
        }
        public java.util.List<CreateConversationAnalysisTaskRequestFieldsEnumValues> getEnumValues() {
            return this.enumValues;
        }

        public CreateConversationAnalysisTaskRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("title")
        public String title;

        public static CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents self = new CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateConversationAnalysisTaskRequestServiceInspection extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("inspectionContents")
        public java.util.List<CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents> inspectionContents;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("inspectionIntroduction")
        public String inspectionIntroduction;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sceneIntroduction")
        public String sceneIntroduction;

        public static CreateConversationAnalysisTaskRequestServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            CreateConversationAnalysisTaskRequestServiceInspection self = new CreateConversationAnalysisTaskRequestServiceInspection();
            return TeaModel.build(map, self);
        }

        public CreateConversationAnalysisTaskRequestServiceInspection setInspectionContents(java.util.List<CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<CreateConversationAnalysisTaskRequestServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public CreateConversationAnalysisTaskRequestServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public CreateConversationAnalysisTaskRequestServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

}
