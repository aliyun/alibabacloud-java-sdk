// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherExpansionDialogueSuggestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>In a career counseling session, we are going to discuss our dream jobs and the responsibilities associated with them. Alex, who dreams of becoming a professional travel blogger, will share the tasks and skills required for this role, while Jamie, aspiring to be a wildlife photographer, will outline the responsibilities and challenges of capturing nature\&quot;s moments. Both will explore how their interests align with the practical aspects of their chosen careers, discussing the potential for travel, creativity, and the impact of their work on society and the environment.</p>
     */
    @NameInMap("background")
    public String background;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<GetAITeacherExpansionDialogueSuggestionRequestDialogueTasks> dialogueTasks;

    /**
     * <strong>example:</strong>
     * <p>en-gb</p>
     */
    @NameInMap("languageCode")
    public String languageCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("records")
    public java.util.List<GetAITeacherExpansionDialogueSuggestionRequestRecords> records;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleInfo")
    public GetAITeacherExpansionDialogueSuggestionRequestRoleInfo roleInfo;

    /**
     * <strong>example:</strong>
     * <p>Hello Lily, could you please come to the kitchen for a moment?</p>
     */
    @NameInMap("startSentence")
    public String startSentence;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Let\&quot;s talk about traffic rules.</p>
     */
    @NameInMap("topic")
    public String topic;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <strong>example:</strong>
         * <p>为什么有些人认为遛狗是份好差事?</p>
         */
        @NameInMap("assistantTranslate")
        public String assistantTranslate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>跑题：true, 不跑题：false</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <strong>example:</strong>
         * <p>扣题：true, 不扣题：false</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>老师：assistant；学生：user</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alex</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
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
