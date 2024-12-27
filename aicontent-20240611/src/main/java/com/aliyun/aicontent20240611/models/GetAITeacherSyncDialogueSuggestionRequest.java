// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherSyncDialogueSuggestionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<GetAITeacherSyncDialogueSuggestionRequestDialogueTasks> dialogueTasks;

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
    public java.util.List<GetAITeacherSyncDialogueSuggestionRequestRecords> records;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetAITeacherSyncDialogueSuggestionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAITeacherSyncDialogueSuggestionRequest self = new GetAITeacherSyncDialogueSuggestionRequest();
        return TeaModel.build(map, self);
    }

    public GetAITeacherSyncDialogueSuggestionRequest setDialogueTasks(java.util.List<GetAITeacherSyncDialogueSuggestionRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<GetAITeacherSyncDialogueSuggestionRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public GetAITeacherSyncDialogueSuggestionRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public GetAITeacherSyncDialogueSuggestionRequest setRecords(java.util.List<GetAITeacherSyncDialogueSuggestionRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<GetAITeacherSyncDialogueSuggestionRequestRecords> getRecords() {
        return this.records;
    }

    public GetAITeacherSyncDialogueSuggestionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GetAITeacherSyncDialogueSuggestionRequestDialogueTasks extends TeaModel {
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

        public static GetAITeacherSyncDialogueSuggestionRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherSyncDialogueSuggestionRequestDialogueTasks self = new GetAITeacherSyncDialogueSuggestionRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public GetAITeacherSyncDialogueSuggestionRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public GetAITeacherSyncDialogueSuggestionRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public GetAITeacherSyncDialogueSuggestionRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetAITeacherSyncDialogueSuggestionRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetAITeacherSyncDialogueSuggestionRequestRecords extends TeaModel {
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

        public static GetAITeacherSyncDialogueSuggestionRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherSyncDialogueSuggestionRequestRecords self = new GetAITeacherSyncDialogueSuggestionRequestRecords();
            return TeaModel.build(map, self);
        }

        public GetAITeacherSyncDialogueSuggestionRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAITeacherSyncDialogueSuggestionRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public GetAITeacherSyncDialogueSuggestionRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public GetAITeacherSyncDialogueSuggestionRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public GetAITeacherSyncDialogueSuggestionRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
