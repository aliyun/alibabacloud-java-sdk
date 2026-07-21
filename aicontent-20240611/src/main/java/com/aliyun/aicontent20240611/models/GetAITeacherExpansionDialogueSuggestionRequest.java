// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherExpansionDialogueSuggestionRequest extends TeaModel {
    /**
     * <p>The background of the conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>In a career counseling session, we are going to discuss our dream jobs and the responsibilities associated with them. Alex, who dreams of becoming a professional travel blogger, will share the tasks and skills required for this role, while Jamie, aspiring to be a wildlife photographer, will outline the responsibilities and challenges of capturing nature\&quot;s moments. Both will explore how their interests align with the practical aspects of their chosen careers, discussing the potential for travel, creativity, and the impact of their work on society and the environment.</p>
     */
    @NameInMap("background")
    public String background;

    /**
     * <p>An array of objects that define the dialogue tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks> dialogueTasks;

    /**
     * <p>The language code, specified as a BCP 47 language tag. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>en-gb</p>
     */
    @NameInMap("languageCode")
    public String languageCode;

    /**
     * <p>An array of dialogue records.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("records")
    public java.util.List<GetAITeacherExpansionDialogueSuggestionRequestRecords> records;

    /**
     * <p>Contains information about the roles in the conversation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleInfo")
    public GetAITeacherExpansionDialogueSuggestionRequestRoleInfo roleInfo;

    /**
     * <p>The opening sentence of the conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello Lily, could you please come to the kitchen for a moment?</p>
     */
    @NameInMap("startSentence")
    public String startSentence;

    /**
     * <p>The main topic of the conversation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Let\&quot;s talk about traffic rules.</p>
     */
    @NameInMap("topic")
    public String topic;

    /**
     * <p>A unique identifier for the end user, used for monitoring and abuse detection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetAITeacherExpansionDialogueSuggestionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAITeacherExpansionDialogueSuggestionRequest self = new GetAITeacherExpansionDialogueSuggestionRequest();
        return TeaModel.build(map, self);
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setBackground(String background) {
        this.background = background;
        return this;
    }
    public String getBackground() {
        return this.background;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setDialogueTasks(java.util.List<GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setRecords(java.util.List<GetAITeacherExpansionDialogueSuggestionRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GetAITeacherExpansionDialogueSuggestionRequestRecords> getRecords() {
        return this.records;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setRoleInfo(GetAITeacherExpansionDialogueSuggestionRequestRoleInfo roleInfo) {
        this.roleInfo = roleInfo;
        return this;
    }
    public GetAITeacherExpansionDialogueSuggestionRequestRoleInfo getRoleInfo() {
        return this.roleInfo;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setStartSentence(String startSentence) {
        this.startSentence = startSentence;
        return this;
    }
    public String getStartSentence() {
        return this.startSentence;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public GetAITeacherExpansionDialogueSuggestionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks extends TeaModel {
        /**
         * <p>The content of the assistant\&quot;s dialogue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The translated content of the assistant\&quot;s dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>为什么有些人认为遛狗是份好差事?</p>
         */
        @NameInMap("assistantTranslate")
        public String assistantTranslate;

        /**
         * <p>The sequence number of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The content of the user\&quot;s dialogue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
         */
        @NameInMap("user")
        public String user;

        public static GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks self = new GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetAITeacherExpansionDialogueSuggestionRequestRecords extends TeaModel {
        /**
         * <p>The content of the dialogue message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Indicates if the user\&quot;s response has gone off-topic. This parameter controls the conversation flow based on dialogue history. The system sets this parameter to <code>true</code> to switch tasks if the user goes off-topic more than twice.</p>
         * 
         * <strong>example:</strong>
         * <p>跑题：true, 不跑题：false</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <p>Indicates if the response is on topic.</p>
         * 
         * <strong>example:</strong>
         * <p>扣题：true, 不扣题：false</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <p>The sequence number of the message in the conversation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The role of the message author. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI：assistant；用户：user</p>
         */
        @NameInMap("role")
        public String role;

        public static GetAITeacherExpansionDialogueSuggestionRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherExpansionDialogueSuggestionRequestRecords self = new GetAITeacherExpansionDialogueSuggestionRequestRecords();
            return TeaModel.build(map, self);
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetAITeacherExpansionDialogueSuggestionRequestRoleInfo extends TeaModel {
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

        public static GetAITeacherExpansionDialogueSuggestionRequestRoleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherExpansionDialogueSuggestionRequestRoleInfo self = new GetAITeacherExpansionDialogueSuggestionRequestRoleInfo();
            return TeaModel.build(map, self);
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRoleInfo setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public GetAITeacherExpansionDialogueSuggestionRequestRoleInfo setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
