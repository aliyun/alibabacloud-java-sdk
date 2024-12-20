// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeConversationRequest extends TeaModel {
    @NameInMap("categoryTags")
    public java.util.List<AnalyzeConversationRequestCategoryTags> categoryTags;

    @NameInMap("customPrompt")
    public String customPrompt;

    @NameInMap("dialogue")
    public AnalyzeConversationRequestDialogue dialogue;

    @NameInMap("examples")
    public java.util.List<AnalyzeConversationRequestExamples> examples;

    @NameInMap("fields")
    public java.util.List<AnalyzeConversationRequestFields> fields;

    /**
     * <strong>example:</strong>
     * <p>tyxmTurbo</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("resultTypes")
    public java.util.List<String> resultTypes;

    @NameInMap("sceneName")
    public String sceneName;

    @NameInMap("serviceInspection")
    public AnalyzeConversationRequestServiceInspection serviceInspection;

    @NameInMap("sourceCallerUid")
    public String sourceCallerUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("timeConstraintList")
    public java.util.List<String> timeConstraintList;

    @NameInMap("userProfiles")
    public java.util.List<AnalyzeConversationRequestUserProfiles> userProfiles;

    public static AnalyzeConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeConversationRequest self = new AnalyzeConversationRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeConversationRequest setCategoryTags(java.util.List<AnalyzeConversationRequestCategoryTags> categoryTags) {
        this.categoryTags = categoryTags;
        return this;
    }
    public java.util.List<AnalyzeConversationRequestCategoryTags> getCategoryTags() {
        return this.categoryTags;
    }

    public AnalyzeConversationRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public AnalyzeConversationRequest setDialogue(AnalyzeConversationRequestDialogue dialogue) {
        this.dialogue = dialogue;
        return this;
    }
    public AnalyzeConversationRequestDialogue getDialogue() {
        return this.dialogue;
    }

    public AnalyzeConversationRequest setExamples(java.util.List<AnalyzeConversationRequestExamples> examples) {
        this.examples = examples;
        return this;
    }
    public java.util.List<AnalyzeConversationRequestExamples> getExamples() {
        return this.examples;
    }

    public AnalyzeConversationRequest setFields(java.util.List<AnalyzeConversationRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<AnalyzeConversationRequestFields> getFields() {
        return this.fields;
    }

    public AnalyzeConversationRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AnalyzeConversationRequest setResultTypes(java.util.List<String> resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    public AnalyzeConversationRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public AnalyzeConversationRequest setServiceInspection(AnalyzeConversationRequestServiceInspection serviceInspection) {
        this.serviceInspection = serviceInspection;
        return this;
    }
    public AnalyzeConversationRequestServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    public AnalyzeConversationRequest setSourceCallerUid(String sourceCallerUid) {
        this.sourceCallerUid = sourceCallerUid;
        return this;
    }
    public String getSourceCallerUid() {
        return this.sourceCallerUid;
    }

    public AnalyzeConversationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public AnalyzeConversationRequest setTimeConstraintList(java.util.List<String> timeConstraintList) {
        this.timeConstraintList = timeConstraintList;
        return this;
    }
    public java.util.List<String> getTimeConstraintList() {
        return this.timeConstraintList;
    }

    public AnalyzeConversationRequest setUserProfiles(java.util.List<AnalyzeConversationRequestUserProfiles> userProfiles) {
        this.userProfiles = userProfiles;
        return this;
    }
    public java.util.List<AnalyzeConversationRequestUserProfiles> getUserProfiles() {
        return this.userProfiles;
    }

    public static class AnalyzeConversationRequestCategoryTags extends TeaModel {
        @NameInMap("tagDesc")
        public String tagDesc;

        @NameInMap("tagName")
        public String tagName;

        public static AnalyzeConversationRequestCategoryTags build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestCategoryTags self = new AnalyzeConversationRequestCategoryTags();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestCategoryTags setTagDesc(String tagDesc) {
            this.tagDesc = tagDesc;
            return this;
        }
        public String getTagDesc() {
            return this.tagDesc;
        }

        public AnalyzeConversationRequestCategoryTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class AnalyzeConversationRequestDialogueSentences extends TeaModel {
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

        public static AnalyzeConversationRequestDialogueSentences build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestDialogueSentences self = new AnalyzeConversationRequestDialogueSentences();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestDialogueSentences setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AnalyzeConversationRequestDialogueSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AnalyzeConversationRequestDialogue extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sentences")
        public java.util.List<AnalyzeConversationRequestDialogueSentences> sentences;

        /**
         * <strong>example:</strong>
         * <p>session-01</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static AnalyzeConversationRequestDialogue build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestDialogue self = new AnalyzeConversationRequestDialogue();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestDialogue setSentences(java.util.List<AnalyzeConversationRequestDialogueSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<AnalyzeConversationRequestDialogueSentences> getSentences() {
            return this.sentences;
        }

        public AnalyzeConversationRequestDialogue setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class AnalyzeConversationRequestExamplesSentences extends TeaModel {
        @NameInMap("chatId")
        public String chatId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("text")
        public String text;

        public static AnalyzeConversationRequestExamplesSentences build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestExamplesSentences self = new AnalyzeConversationRequestExamplesSentences();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestExamplesSentences setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public AnalyzeConversationRequestExamplesSentences setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AnalyzeConversationRequestExamplesSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AnalyzeConversationRequestExamples extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("output")
        public String output;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("sentences")
        public java.util.List<AnalyzeConversationRequestExamplesSentences> sentences;

        public static AnalyzeConversationRequestExamples build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestExamples self = new AnalyzeConversationRequestExamples();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestExamples setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public AnalyzeConversationRequestExamples setSentences(java.util.List<AnalyzeConversationRequestExamplesSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<AnalyzeConversationRequestExamplesSentences> getSentences() {
            return this.sentences;
        }

    }

    public static class AnalyzeConversationRequestFieldsEnumValues extends TeaModel {
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

        public static AnalyzeConversationRequestFieldsEnumValues build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestFieldsEnumValues self = new AnalyzeConversationRequestFieldsEnumValues();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestFieldsEnumValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AnalyzeConversationRequestFieldsEnumValues setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class AnalyzeConversationRequestFields extends TeaModel {
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
        public java.util.List<AnalyzeConversationRequestFieldsEnumValues> enumValues;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        public static AnalyzeConversationRequestFields build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestFields self = new AnalyzeConversationRequestFields();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestFields setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AnalyzeConversationRequestFields setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AnalyzeConversationRequestFields setEnumValues(java.util.List<AnalyzeConversationRequestFieldsEnumValues> enumValues) {
            this.enumValues = enumValues;
            return this;
        }
        public java.util.List<AnalyzeConversationRequestFieldsEnumValues> getEnumValues() {
            return this.enumValues;
        }

        public AnalyzeConversationRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AnalyzeConversationRequestServiceInspectionInspectionContents extends TeaModel {
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

        public static AnalyzeConversationRequestServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestServiceInspectionInspectionContents self = new AnalyzeConversationRequestServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AnalyzeConversationRequestServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class AnalyzeConversationRequestServiceInspection extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("inspectionContents")
        public java.util.List<AnalyzeConversationRequestServiceInspectionInspectionContents> inspectionContents;

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

        public static AnalyzeConversationRequestServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestServiceInspection self = new AnalyzeConversationRequestServiceInspection();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestServiceInspection setInspectionContents(java.util.List<AnalyzeConversationRequestServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<AnalyzeConversationRequestServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public AnalyzeConversationRequestServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public AnalyzeConversationRequestServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

    public static class AnalyzeConversationRequestUserProfiles extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static AnalyzeConversationRequestUserProfiles build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeConversationRequestUserProfiles self = new AnalyzeConversationRequestUserProfiles();
            return TeaModel.build(map, self);
        }

        public AnalyzeConversationRequestUserProfiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AnalyzeConversationRequestUserProfiles setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
