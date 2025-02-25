// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("customPrompt")
    public String customPrompt;

    @NameInMap("dialogue")
    public CreateTaskRequestDialogue dialogue;

    @NameInMap("examples")
    public CreateTaskRequestExamples examples;

    @NameInMap("fields")
    public java.util.List<CreateTaskRequestFields> fields;

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

    @NameInMap("serviceInspection")
    public CreateTaskRequestServiceInspection serviceInspection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("taskType")
    public String taskType;

    @NameInMap("templateIds")
    public java.util.List<String> templateIds;

    @NameInMap("transcription")
    public CreateTaskRequestTranscription transcription;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public CreateTaskRequest setDialogue(CreateTaskRequestDialogue dialogue) {
        this.dialogue = dialogue;
        return this;
    }
    public CreateTaskRequestDialogue getDialogue() {
        return this.dialogue;
    }

    public CreateTaskRequest setExamples(CreateTaskRequestExamples examples) {
        this.examples = examples;
        return this;
    }
    public CreateTaskRequestExamples getExamples() {
        return this.examples;
    }

    public CreateTaskRequest setFields(java.util.List<CreateTaskRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<CreateTaskRequestFields> getFields() {
        return this.fields;
    }

    public CreateTaskRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public CreateTaskRequest setResultTypes(java.util.List<String> resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    public CreateTaskRequest setServiceInspection(CreateTaskRequestServiceInspection serviceInspection) {
        this.serviceInspection = serviceInspection;
        return this;
    }
    public CreateTaskRequestServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    public CreateTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateTaskRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public CreateTaskRequest setTranscription(CreateTaskRequestTranscription transcription) {
        this.transcription = transcription;
        return this;
    }
    public CreateTaskRequestTranscription getTranscription() {
        return this.transcription;
    }

    public static class CreateTaskRequestDialogueSentences extends TeaModel {
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

        public static CreateTaskRequestDialogueSentences build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestDialogueSentences self = new CreateTaskRequestDialogueSentences();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestDialogueSentences setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateTaskRequestDialogueSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateTaskRequestDialogue extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sentences")
        public java.util.List<CreateTaskRequestDialogueSentences> sentences;

        /**
         * <strong>example:</strong>
         * <p>session-01</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static CreateTaskRequestDialogue build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestDialogue self = new CreateTaskRequestDialogue();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestDialogue setSentences(java.util.List<CreateTaskRequestDialogueSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<CreateTaskRequestDialogueSentences> getSentences() {
            return this.sentences;
        }

        public CreateTaskRequestDialogue setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class CreateTaskRequestExamplesSentences extends TeaModel {
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

        public static CreateTaskRequestExamplesSentences build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestExamplesSentences self = new CreateTaskRequestExamplesSentences();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestExamplesSentences setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateTaskRequestExamplesSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class CreateTaskRequestExamples extends TeaModel {
        @NameInMap("output")
        public String output;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sentences")
        public java.util.List<CreateTaskRequestExamplesSentences> sentences;

        public static CreateTaskRequestExamples build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestExamples self = new CreateTaskRequestExamples();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestExamples setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public CreateTaskRequestExamples setSentences(java.util.List<CreateTaskRequestExamplesSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<CreateTaskRequestExamplesSentences> getSentences() {
            return this.sentences;
        }

    }

    public static class CreateTaskRequestFieldsEnumValues extends TeaModel {
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

        public static CreateTaskRequestFieldsEnumValues build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestFieldsEnumValues self = new CreateTaskRequestFieldsEnumValues();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestFieldsEnumValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateTaskRequestFieldsEnumValues setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class CreateTaskRequestFields extends TeaModel {
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

        @NameInMap("enumValues")
        public java.util.List<CreateTaskRequestFieldsEnumValues> enumValues;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateTaskRequestFields build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestFields self = new CreateTaskRequestFields();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestFields setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateTaskRequestFields setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateTaskRequestFields setEnumValues(java.util.List<CreateTaskRequestFieldsEnumValues> enumValues) {
            this.enumValues = enumValues;
            return this;
        }
        public java.util.List<CreateTaskRequestFieldsEnumValues> getEnumValues() {
            return this.enumValues;
        }

        public CreateTaskRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateTaskRequestServiceInspectionInspectionContents extends TeaModel {
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

        public static CreateTaskRequestServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestServiceInspectionInspectionContents self = new CreateTaskRequestServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTaskRequestServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateTaskRequestServiceInspection extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("inspectionContents")
        public java.util.List<CreateTaskRequestServiceInspectionInspectionContents> inspectionContents;

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

        public static CreateTaskRequestServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestServiceInspection self = new CreateTaskRequestServiceInspection();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestServiceInspection setInspectionContents(java.util.List<CreateTaskRequestServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<CreateTaskRequestServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public CreateTaskRequestServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public CreateTaskRequestServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

    public static class CreateTaskRequestTranscription extends TeaModel {
        @NameInMap("asrModelCode")
        public String asrModelCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoSplit")
        public Integer autoSplit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("clientChannel")
        public Integer clientChannel;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sss.mp3</p>
         */
        @NameInMap("fileName")
        public String fileName;

        @NameInMap("level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("serviceChannel")
        public Integer serviceChannel;

        @NameInMap("serviceChannelKeywords")
        public java.util.List<String> serviceChannelKeywords;

        @NameInMap("vocabularyId")
        public String vocabularyId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1111.com/sss.mp3">http://1111.com/sss.mp3</a></p>
         */
        @NameInMap("voiceFileUrl")
        public String voiceFileUrl;

        public static CreateTaskRequestTranscription build(java.util.Map<String, ?> map) throws Exception {
            CreateTaskRequestTranscription self = new CreateTaskRequestTranscription();
            return TeaModel.build(map, self);
        }

        public CreateTaskRequestTranscription setAsrModelCode(String asrModelCode) {
            this.asrModelCode = asrModelCode;
            return this;
        }
        public String getAsrModelCode() {
            return this.asrModelCode;
        }

        public CreateTaskRequestTranscription setAutoSplit(Integer autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }
        public Integer getAutoSplit() {
            return this.autoSplit;
        }

        public CreateTaskRequestTranscription setClientChannel(Integer clientChannel) {
            this.clientChannel = clientChannel;
            return this;
        }
        public Integer getClientChannel() {
            return this.clientChannel;
        }

        public CreateTaskRequestTranscription setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateTaskRequestTranscription setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateTaskRequestTranscription setServiceChannel(Integer serviceChannel) {
            this.serviceChannel = serviceChannel;
            return this;
        }
        public Integer getServiceChannel() {
            return this.serviceChannel;
        }

        public CreateTaskRequestTranscription setServiceChannelKeywords(java.util.List<String> serviceChannelKeywords) {
            this.serviceChannelKeywords = serviceChannelKeywords;
            return this;
        }
        public java.util.List<String> getServiceChannelKeywords() {
            return this.serviceChannelKeywords;
        }

        public CreateTaskRequestTranscription setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public CreateTaskRequestTranscription setVoiceFileUrl(String voiceFileUrl) {
            this.voiceFileUrl = voiceFileUrl;
            return this;
        }
        public String getVoiceFileUrl() {
            return this.voiceFileUrl;
        }

    }

}
