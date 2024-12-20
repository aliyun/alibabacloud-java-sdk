// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AITeacherExpansionPracticeTaskGenerateResponseBody extends TeaModel {
    @NameInMap("data")
    public AITeacherExpansionPracticeTaskGenerateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static AITeacherExpansionPracticeTaskGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AITeacherExpansionPracticeTaskGenerateResponseBody self = new AITeacherExpansionPracticeTaskGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public AITeacherExpansionPracticeTaskGenerateResponseBody setData(AITeacherExpansionPracticeTaskGenerateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AITeacherExpansionPracticeTaskGenerateResponseBodyData getData() {
        return this.data;
    }

    public AITeacherExpansionPracticeTaskGenerateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AITeacherExpansionPracticeTaskGenerateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AITeacherExpansionPracticeTaskGenerateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AITeacherExpansionPracticeTaskGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AITeacherExpansionPracticeTaskGenerateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Alex</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <strong>example:</strong>
         * <p>Jamie</p>
         */
        @NameInMap("user")
        public String user;

        public static AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet build(java.util.Map<String, ?> map) throws Exception {
            AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet self = new AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet();
            return TeaModel.build(map, self);
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Why might some people think dog walking is a great job?</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <strong>example:</strong>
         * <p>They think it\&quot;s great because they won\&quot;t be stuck in an office.</p>
         */
        @NameInMap("user")
        public String user;

        public static AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent build(java.util.Map<String, ?> map) throws Exception {
            AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent self = new AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent();
            return TeaModel.build(map, self);
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class AITeacherExpansionPracticeTaskGenerateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>In a career counseling session, we are going to discuss our dream jobs and the responsibilities associated with them. Alex, who dreams of becoming a professional travel blogger, will share the tasks and skills required for this role, while Jamie, aspiring to be a wildlife photographer, will outline the responsibilities and challenges of capturing nature\&quot;s moments. Both will explore how their interests align with the practical aspects of their chosen careers, discussing the potential for travel, creativity, and the impact of their work on society and the environment.</p>
         */
        @NameInMap("backgroundDescription")
        public String backgroundDescription;

        @NameInMap("roleSet")
        public AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet roleSet;

        /**
         * <strong>example:</strong>
         * <p>Hey Jamie, do you know what a travel blogger does?</p>
         */
        @NameInMap("startSentence")
        public String startSentence;

        @NameInMap("taskContent")
        public java.util.List<AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent> taskContent;

        /**
         * <strong>example:</strong>
         * <p>textbook_dialogue</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static AITeacherExpansionPracticeTaskGenerateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AITeacherExpansionPracticeTaskGenerateResponseBodyData self = new AITeacherExpansionPracticeTaskGenerateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyData setBackgroundDescription(String backgroundDescription) {
            this.backgroundDescription = backgroundDescription;
            return this;
        }
        public String getBackgroundDescription() {
            return this.backgroundDescription;
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyData setRoleSet(AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet roleSet) {
            this.roleSet = roleSet;
            return this;
        }
        public AITeacherExpansionPracticeTaskGenerateResponseBodyDataRoleSet getRoleSet() {
            return this.roleSet;
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyData setStartSentence(String startSentence) {
            this.startSentence = startSentence;
            return this;
        }
        public String getStartSentence() {
            return this.startSentence;
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyData setTaskContent(java.util.List<AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent> taskContent) {
            this.taskContent = taskContent;
            return this;
        }
        public java.util.List<AITeacherExpansionPracticeTaskGenerateResponseBodyDataTaskContent> getTaskContent() {
            return this.taskContent;
        }

        public AITeacherExpansionPracticeTaskGenerateResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
