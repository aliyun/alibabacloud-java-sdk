// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueTranslateRequest extends TeaModel {
    /**
     * <p>The background context for the dialogue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>In this dialogue, you will be playing the role of Lily, a young girl. I will be Jane, Lily\&quot;s mother. We are in the kitchen, where I am preparing dinner. I am asking you about your food preferences, specifically if you like meat, fish, and milk. You like meat and milk, but you don\&quot;t like fish because of its smell. I explain to you the nutritional benefits of these foods and suggest alternatives for the ones you don\&quot;t like. Finally, I invite you to start eating.</p>
     */
    @NameInMap("background")
    public String background;

    /**
     * <p>An array of dialogue tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks> dialogueTasks;

    /**
     * <p>An array of dialogue records.</p>
     */
    @NameInMap("records")
    public java.util.List<ExecuteAITeacherExpansionDialogueTranslateRequestRecords> records;

    /**
     * <p>Role information for the participants.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleInfo")
    public ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo roleInfo;

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
     * <p>talk about food.</p>
     */
    @NameInMap("topic")
    public String topic;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherExpansionDialogueTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueTranslateRequest self = new ExecuteAITeacherExpansionDialogueTranslateRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setBackground(String background) {
        this.background = background;
        return this;
    }
    public String getBackground() {
        return this.background;
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setDialogueTasks(java.util.List<ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setRecords(java.util.List<ExecuteAITeacherExpansionDialogueTranslateRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExecuteAITeacherExpansionDialogueTranslateRequestRecords> getRecords() {
        return this.records;
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setRoleInfo(ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo roleInfo) {
        this.roleInfo = roleInfo;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo getRoleInfo() {
        return this.roleInfo;
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setStartSentence(String startSentence) {
        this.startSentence = startSentence;
        return this;
    }
    public String getStartSentence() {
        return this.startSentence;
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExecuteAITeacherExpansionDialogueTranslateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks extends TeaModel {
        /**
         * <p>The dialogue content from the assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The translation of the assistant content.</p>
         * 
         * <strong>example:</strong>
         * <p>为什么有些人认为遛狗是份好差事?</p>
         */
        @NameInMap("assistantTranslate")
        public String assistantTranslate;

        /**
         * <p>The sequence number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The dialogue content from the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks self = new ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ExecuteAITeacherExpansionDialogueTranslateRequestRecords extends TeaModel {
        /**
         * <p>The dialogue content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Controls the conversation flow based on whether the user\&quot;s response is off-topic. This value is determined by previous turns. If a user provides more than two consecutive off-topic responses, the system sets this parameter to <code>true</code> to switch tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>跑题：true, 不跑题：false</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <p>Indicates whether the message is on-topic.</p>
         * 
         * <strong>example:</strong>
         * <p>扣题：true, 不扣题：false</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <p>The sequence number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The role of the message author. Valid values are <code>assistant</code> for the AI and <code>user</code> for the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI：assistant；用户：user</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteAITeacherExpansionDialogueTranslateRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueTranslateRequestRecords self = new ExecuteAITeacherExpansionDialogueTranslateRequestRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo extends TeaModel {
        /**
         * <p>The assistant name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane, a caring mother</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The user name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Lily, a friendly student</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo self = new ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherExpansionDialogueTranslateRequestRoleInfo setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
