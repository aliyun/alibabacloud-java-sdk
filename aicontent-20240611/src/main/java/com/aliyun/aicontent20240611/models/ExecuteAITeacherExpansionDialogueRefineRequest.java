// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueRefineRequest extends TeaModel {
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
     * <p>A collection of dialogue tasks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dialogueTasks")
    public java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks> dialogueTasks;

    /**
     * <p>The language code for the dialogue.</p>
     * 
     * <strong>example:</strong>
     * <p>en-gb</p>
     */
    @NameInMap("languageCode")
    public String languageCode;

    /**
     * <p>A list of dialogue records.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("records")
    public java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestRecords> records;

    /**
     * <p>The role settings for the conversation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleInfo")
    public ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo roleInfo;

    /**
     * <p>The opening sentence of the dialogue.</p>
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
     * <p>talk about your dream job.</p>
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

    public static ExecuteAITeacherExpansionDialogueRefineRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueRefineRequest self = new ExecuteAITeacherExpansionDialogueRefineRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setBackground(String background) {
        this.background = background;
        return this;
    }
    public String getBackground() {
        return this.background;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setDialogueTasks(java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks> dialogueTasks) {
        this.dialogueTasks = dialogueTasks;
        return this;
    }
    public java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks> getDialogueTasks() {
        return this.dialogueTasks;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setRecords(java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestRecords> getRecords() {
        return this.records;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setRoleInfo(ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo roleInfo) {
        this.roleInfo = roleInfo;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo getRoleInfo() {
        return this.roleInfo;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setStartSentence(String startSentence) {
        this.startSentence = startSentence;
        return this;
    }
    public String getStartSentence() {
        return this.startSentence;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExecuteAITeacherExpansionDialogueRefineRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks extends TeaModel {
        /**
         * <p>The AI\&quot;s dialogue content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The translated content of the AI\&quot;s dialogue.</p>
         * 
         * <strong>example:</strong>
         * <p>为什么有些人认为遛狗是份好差事?</p>
         */
        @NameInMap("assistantTranslate")
        public String assistantTranslate;

        /**
         * <p>The sequence number of the dialogue task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The user\&quot;s dialogue content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks self = new ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks setAssistantTranslate(String assistantTranslate) {
            this.assistantTranslate = assistantTranslate;
            return this;
        }
        public String getAssistantTranslate() {
            return this.assistantTranslate;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ExecuteAITeacherExpansionDialogueRefineRequestRecords extends TeaModel {
        /**
         * <p>The content of the dialogue turn.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ask Mark if he has thought about what his dream job might be.</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Manages the off-topic conversation flow. This flag is forcibly set to <code>true</code> to switch the dialogue task if the conversation has gone off-topic more than twice.</p>
         * 
         * <strong>example:</strong>
         * <p>跑题：true, 不跑题：false</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <p>Indicates whether the user\&quot;s response is on-topic.</p>
         * 
         * <strong>example:</strong>
         * <p>扣题：true, 不扣题：false</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <p>The sequence number of the dialogue turn.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order")
        public Integer order;

        /**
         * <p>The role of the speaker in the dialogue turn.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AI：assistant；用户：user</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteAITeacherExpansionDialogueRefineRequestRecords build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRefineRequestRecords self = new ExecuteAITeacherExpansionDialogueRefineRequestRecords();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRecords setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRecords setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRecords setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRecords setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo extends TeaModel {
        /**
         * <p>The name or persona of the AI assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane, a caring mother</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The name or persona of the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Lily, a friendly student</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo self = new ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
