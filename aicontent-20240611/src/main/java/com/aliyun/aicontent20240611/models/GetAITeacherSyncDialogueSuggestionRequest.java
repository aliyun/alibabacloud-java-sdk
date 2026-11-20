// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherSyncDialogueSuggestionRequest extends TeaModel {
    /**
     * <p>The collection of conversation task content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<GetAITeacherSyncDialogueSuggestionRequestDialogueTasks> dialogueTasks;

    /**
     * <p>The language code.</p>
     * 
     * <strong>example:</strong>
     * <p>en-gb</p>
     */
    @NameInMap("languageCode")
    public String languageCode;

    /**
     * <p>The collection of conversation records.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("records")
    public java.util.List<GetAITeacherSyncDialogueSuggestionRequestRecords> records;

    /**
     * <p>The user ID.</p>
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
         * <p>The AI conversation content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The translation of the AI conversation content.</p>
         * 
         * <strong>example:</strong>
         * <p>Why do some people think walking dogs is a good job?</p>
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
         * <p>The user conversation content.</p>
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
         * <p>The conversation content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Specifies whether the response is off-topic and applies flow control. This parameter indicates whether the student\&quot;s response aligns with the conversation task settings. The value is derived from the return results of previous conversation turns. Additionally, this parameter controls the conversation flow. If the response is off-topic more than twice, the value is forcibly set to true to switch the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Off-topic.</li>
         * <li>false: On-topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <p>Specifies whether the response is on-topic.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: On-topic.</li>
         * <li>false: Off-topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI: assistant; User: user</p>
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
