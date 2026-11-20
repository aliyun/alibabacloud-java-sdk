// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherSyncDialogueRequest extends TeaModel {
    /**
     * <p>The collection of conversation task content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<ExecuteAITeacherSyncDialogueRequestDialogueTasks> dialogueTasks;

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
     */
    @NameInMap("records")
    public java.util.List<ExecuteAITeacherSyncDialogueRequestRecords> records;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherSyncDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherSyncDialogueRequest self = new ExecuteAITeacherSyncDialogueRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherSyncDialogueRequest setDialogueTasks(java.util.List<ExecuteAITeacherSyncDialogueRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<ExecuteAITeacherSyncDialogueRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public ExecuteAITeacherSyncDialogueRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public ExecuteAITeacherSyncDialogueRequest setRecords(java.util.List<ExecuteAITeacherSyncDialogueRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExecuteAITeacherSyncDialogueRequestRecords> getRecords() {
        return this.records;
    }

    public ExecuteAITeacherSyncDialogueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ExecuteAITeacherSyncDialogueRequestDialogueTasks extends TeaModel {
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

        public static ExecuteAITeacherSyncDialogueRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherSyncDialogueRequestDialogueTasks self = new ExecuteAITeacherSyncDialogueRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherSyncDialogueRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherSyncDialogueRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public ExecuteAITeacherSyncDialogueRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherSyncDialogueRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ExecuteAITeacherSyncDialogueRequestRecords extends TeaModel {
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
         * <p>Specifies whether the response is off topic, which also serves as a flow control mechanism. This parameter reflects whether the student\&quot;s response meets the settings of the conversation task. The value of this parameter is derived from the return results of previous conversation turns. In addition, this parameter serves as a flow control mechanism. If the response is off topic more than twice, the value is forcibly set to true to force a task switch. Valid values:</p>
         * <ul>
         * <li>true: Off topic.</li>
         * <li>false: On topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <p>Specifies whether the response is on topic. Valid values:</p>
         * <ul>
         * <li>true: On topic.</li>
         * <li>false: Off topic.</li>
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
         * <p>The role identity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI: assistant; User: user</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteAITeacherSyncDialogueRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherSyncDialogueRequestRecords self = new ExecuteAITeacherSyncDialogueRequestRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherSyncDialogueRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteAITeacherSyncDialogueRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public ExecuteAITeacherSyncDialogueRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherSyncDialogueRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherSyncDialogueRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
