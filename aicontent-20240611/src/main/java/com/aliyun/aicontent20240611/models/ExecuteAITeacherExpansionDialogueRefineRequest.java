// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueRefineRequest extends TeaModel {
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
    public java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestDialogueTasks> dialogueTasks;

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
    public java.util.List<ExecuteAITeacherExpansionDialogueRefineRequestRecords> records;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleInfo")
    public ExecuteAITeacherExpansionDialogueRefineRequestRoleInfo roleInfo;

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
     * <p>talk about your dream job.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane, a caring mother</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
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
