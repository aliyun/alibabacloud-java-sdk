// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueRequest extends TeaModel {
    /**
     * <p>The background of the dialogue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>In a career counseling session, we are going to discuss our dream jobs and the responsibilities associated with them. Alex, who dreams of becoming a professional travel blogger, will share the tasks and skills required for this role, while Jamie, aspiring to be a wildlife photographer, will outline the responsibilities and challenges of capturing nature\&quot;s moments. Both will explore how their interests align with the practical aspects of their chosen careers, discussing the potential for travel, creativity, and the impact of their work on society and the environment.</p>
     */
    @NameInMap("background")
    public String background;

    /**
     * <p>A list of dialogue tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<ExecuteAITeacherExpansionDialogueRequestDialogueTasks> dialogueTasks;

    /**
     * <p>The language code for the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>en-gb</p>
     */
    @NameInMap("languageCode")
    public String languageCode;

    /**
     * <p>A list of dialogue records.</p>
     */
    @NameInMap("records")
    public java.util.List<ExecuteAITeacherExpansionDialogueRequestRecords> records;

    /**
     * <p>Specifies the names of the participants in the dialogue.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleInfo")
    public ExecuteAITeacherExpansionDialogueRequestRoleInfo roleInfo;

    /**
     * <p>The opening sentence of the dialogue.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello Lily, could you please come to the kitchen for a moment?</p>
     */
    @NameInMap("startSentence")
    public String startSentence;

    /**
     * <p>The topic of the conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Let\&quot;s talk about traffic rules.</p>
     */
    @NameInMap("topic")
    public String topic;

    /**
     * <p>The unique identifier for the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherExpansionDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueRequest self = new ExecuteAITeacherExpansionDialogueRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueRequest setBackground(String background) {
        this.background = background;
        return this;
    }
    public String getBackground() {
        return this.background;
    }

    public ExecuteAITeacherExpansionDialogueRequest setDialogueTasks(java.util.List<ExecuteAITeacherExpansionDialogueRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<ExecuteAITeacherExpansionDialogueRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public ExecuteAITeacherExpansionDialogueRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public ExecuteAITeacherExpansionDialogueRequest setRecords(java.util.List<ExecuteAITeacherExpansionDialogueRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExecuteAITeacherExpansionDialogueRequestRecords> getRecords() {
        return this.records;
    }

    public ExecuteAITeacherExpansionDialogueRequest setRoleInfo(ExecuteAITeacherExpansionDialogueRequestRoleInfo roleInfo) {
        this.roleInfo = roleInfo;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueRequestRoleInfo getRoleInfo() {
        return this.roleInfo;
    }

    public ExecuteAITeacherExpansionDialogueRequest setStartSentence(String startSentence) {
        this.startSentence = startSentence;
        return this;
    }
    public String getStartSentence() {
        return this.startSentence;
    }

    public ExecuteAITeacherExpansionDialogueRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExecuteAITeacherExpansionDialogueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ExecuteAITeacherExpansionDialogueRequestDialogueTasks extends TeaModel {
        /**
         * <p>The message content from the assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The translated content of the assistant\&quot;s message.</p>
         * 
         * <strong>example:</strong>
         * <p>为什么有些人认为遛狗是份好差事?</p>
         */
        @NameInMap("assistantTranslate")
        public String assistantTranslate;

        /**
         * <p>The order of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The user\&quot;s message content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherExpansionDialogueRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRequestDialogueTasks self = new ExecuteAITeacherExpansionDialogueRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherExpansionDialogueRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public ExecuteAITeacherExpansionDialogueRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherExpansionDialogueRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ExecuteAITeacherExpansionDialogueRequestRecords extends TeaModel {
        /**
         * <p>The message content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Indicates whether the user\&quot;s response is off-topic. This parameter controls the dialogue flow. For example, if the user provides two consecutive off-topic responses, set this value to <code>true</code> to advance to the next dialogue task.</p>
         * 
         * <strong>example:</strong>
         * <p>跑题：true, 不跑题：false</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <p>Indicates whether the user\&quot;s response is on topic.</p>
         * 
         * <strong>example:</strong>
         * <p>扣题：true, 不扣题：false</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <p>The order of the message in the dialogue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The role of the message author.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI：assistant；用户：user</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteAITeacherExpansionDialogueRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRequestRecords self = new ExecuteAITeacherExpansionDialogueRequestRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteAITeacherExpansionDialogueRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public ExecuteAITeacherExpansionDialogueRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherExpansionDialogueRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherExpansionDialogueRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ExecuteAITeacherExpansionDialogueRequestRoleInfo extends TeaModel {
        /**
         * <p>The name of the AI assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alex</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The name of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Jamie</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherExpansionDialogueRequestRoleInfo build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRequestRoleInfo self = new ExecuteAITeacherExpansionDialogueRequestRoleInfo();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRequestRoleInfo setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherExpansionDialogueRequestRoleInfo setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
