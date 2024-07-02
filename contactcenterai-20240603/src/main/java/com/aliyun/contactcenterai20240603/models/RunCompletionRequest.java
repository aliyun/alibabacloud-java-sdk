// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dialogue")
    public RunCompletionRequestDialogue dialogue;

    @NameInMap("Fields")
    public java.util.List<RunCompletionRequestFields> fields;

    /**
     * <strong>example:</strong>
     * <p>ccai-14b</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("ServiceInspection")
    public RunCompletionRequestServiceInspection serviceInspection;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateIds")
    public java.util.List<Long> templateIds;

    public static RunCompletionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionRequest self = new RunCompletionRequest();
        return TeaModel.build(map, self);
    }

    public RunCompletionRequest setDialogue(RunCompletionRequestDialogue dialogue) {
        this.dialogue = dialogue;
        return this;
    }
    public RunCompletionRequestDialogue getDialogue() {
        return this.dialogue;
    }

    public RunCompletionRequest setFields(java.util.List<RunCompletionRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<RunCompletionRequestFields> getFields() {
        return this.fields;
    }

    public RunCompletionRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public RunCompletionRequest setServiceInspection(RunCompletionRequestServiceInspection serviceInspection) {
        this.serviceInspection = serviceInspection;
        return this;
    }
    public RunCompletionRequestServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    public RunCompletionRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RunCompletionRequest setTemplateIds(java.util.List<Long> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<Long> getTemplateIds() {
        return this.templateIds;
    }

    public static class RunCompletionRequestDialogueSentences extends TeaModel {
        @NameInMap("ChatId")
        public String chatId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Text")
        public String text;

        public static RunCompletionRequestDialogueSentences build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestDialogueSentences self = new RunCompletionRequestDialogueSentences();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestDialogueSentences setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public RunCompletionRequestDialogueSentences setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public RunCompletionRequestDialogueSentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class RunCompletionRequestDialogue extends TeaModel {
        @NameInMap("Sentences")
        public java.util.List<RunCompletionRequestDialogueSentences> sentences;

        /**
         * <strong>example:</strong>
         * <p>d25zc9c7004f8dad2b454d</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static RunCompletionRequestDialogue build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestDialogue self = new RunCompletionRequestDialogue();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestDialogue setSentences(java.util.List<RunCompletionRequestDialogueSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<RunCompletionRequestDialogueSentences> getSentences() {
            return this.sentences;
        }

        public RunCompletionRequestDialogue setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class RunCompletionRequestFieldsEnumValues extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        public static RunCompletionRequestFieldsEnumValues build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestFieldsEnumValues self = new RunCompletionRequestFieldsEnumValues();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestFieldsEnumValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RunCompletionRequestFieldsEnumValues setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class RunCompletionRequestFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>phoneNumber</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("EnumValues")
        public java.util.List<RunCompletionRequestFieldsEnumValues> enumValues;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        public static RunCompletionRequestFields build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestFields self = new RunCompletionRequestFields();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestFields setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunCompletionRequestFields setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RunCompletionRequestFields setEnumValues(java.util.List<RunCompletionRequestFieldsEnumValues> enumValues) {
            this.enumValues = enumValues;
            return this;
        }
        public java.util.List<RunCompletionRequestFieldsEnumValues> getEnumValues() {
            return this.enumValues;
        }

        public RunCompletionRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunCompletionRequestServiceInspectionInspectionContents extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Title")
        public String title;

        public static RunCompletionRequestServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestServiceInspectionInspectionContents self = new RunCompletionRequestServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunCompletionRequestServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class RunCompletionRequestServiceInspection extends TeaModel {
        @NameInMap("InspectionContents")
        public java.util.List<RunCompletionRequestServiceInspectionInspectionContents> inspectionContents;

        @NameInMap("InspectionIntroduction")
        public String inspectionIntroduction;

        @NameInMap("SceneIntroduction")
        public String sceneIntroduction;

        public static RunCompletionRequestServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestServiceInspection self = new RunCompletionRequestServiceInspection();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestServiceInspection setInspectionContents(java.util.List<RunCompletionRequestServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<RunCompletionRequestServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public RunCompletionRequestServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public RunCompletionRequestServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

}
