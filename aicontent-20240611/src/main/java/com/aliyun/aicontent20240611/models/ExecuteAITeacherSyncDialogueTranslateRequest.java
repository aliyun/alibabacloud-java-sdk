// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherSyncDialogueTranslateRequest extends TeaModel {
    /**
     * <p>An array of dialogue task objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks> dialogueTasks;

    /**
     * <p>An array of dialogue record objects.</p>
     */
    @NameInMap("records")
    public java.util.List<ExecuteAITeacherSyncDialogueTranslateRequestRecords> records;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>886eba3702xxxxxxxxx4ba52a87a525</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ExecuteAITeacherSyncDialogueTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherSyncDialogueTranslateRequest self = new ExecuteAITeacherSyncDialogueTranslateRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherSyncDialogueTranslateRequest setDialogueTasks(java.util.List<ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public ExecuteAITeacherSyncDialogueTranslateRequest setRecords(java.util.List<ExecuteAITeacherSyncDialogueTranslateRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExecuteAITeacherSyncDialogueTranslateRequestRecords> getRecords() {
        return this.records;
    }

    public ExecuteAITeacherSyncDialogueTranslateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks extends TeaModel {
        /**
         * <p>The content of the assistant\&quot;s message.</p>
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
         * <p>The sequence number of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The content of the user\&quot;s message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks self = new ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ExecuteAITeacherSyncDialogueTranslateRequestRecords extends TeaModel {
        /**
         * <p>The content of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Indicates whether the message is off-topic. This parameter is used for flow control.</p>
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
         * <p>The sequence number of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The message author\&quot;s role.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI：assistant；用户：user</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteAITeacherSyncDialogueTranslateRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherSyncDialogueTranslateRequestRecords self = new ExecuteAITeacherSyncDialogueTranslateRequestRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherSyncDialogueTranslateRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
