// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dialogue")
    public RunCompletionRequestDialogue dialogue;

    @NameInMap("Dimensions")
    public java.util.List<RunCompletionRequestDimensions> dimensions;

    @NameInMap("Fields")
    public java.util.List<RunCompletionRequestFields> fields;

    @NameInMap("ModelCode")
    public String modelCode;

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

    public RunCompletionRequest setDimensions(java.util.List<RunCompletionRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<RunCompletionRequestDimensions> getDimensions() {
        return this.dimensions;
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

    public static class RunCompletionRequestDimensions extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        public static RunCompletionRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionRequestDimensions self = new RunCompletionRequestDimensions();
            return TeaModel.build(map, self);
        }

        public RunCompletionRequestDimensions setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RunCompletionRequestDimensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunCompletionRequestFields extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Enums")
        public java.util.List<String> enums;

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

        public RunCompletionRequestFields setEnums(java.util.List<String> enums) {
            this.enums = enums;
            return this;
        }
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        public RunCompletionRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
