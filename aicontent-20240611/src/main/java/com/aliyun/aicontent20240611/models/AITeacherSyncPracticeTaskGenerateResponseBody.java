// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AITeacherSyncPracticeTaskGenerateResponseBody extends TeaModel {
    @NameInMap("data")
    public AITeacherSyncPracticeTaskGenerateResponseBodyData data;

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

    public static AITeacherSyncPracticeTaskGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AITeacherSyncPracticeTaskGenerateResponseBody self = new AITeacherSyncPracticeTaskGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public AITeacherSyncPracticeTaskGenerateResponseBody setData(AITeacherSyncPracticeTaskGenerateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AITeacherSyncPracticeTaskGenerateResponseBodyData getData() {
        return this.data;
    }

    public AITeacherSyncPracticeTaskGenerateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AITeacherSyncPracticeTaskGenerateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AITeacherSyncPracticeTaskGenerateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AITeacherSyncPracticeTaskGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AITeacherSyncPracticeTaskGenerateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent extends TeaModel {
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

        public static AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent build(java.util.Map<String, ?> map) throws Exception {
            AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent self = new AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent();
            return TeaModel.build(map, self);
        }

        public AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class AITeacherSyncPracticeTaskGenerateResponseBodyData extends TeaModel {
        @NameInMap("taskContent")
        public java.util.List<AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent> taskContent;

        /**
         * <strong>example:</strong>
         * <p>textbook_question_answering</p>
         */
        @NameInMap("taskType")
        public String taskType;

        public static AITeacherSyncPracticeTaskGenerateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AITeacherSyncPracticeTaskGenerateResponseBodyData self = new AITeacherSyncPracticeTaskGenerateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AITeacherSyncPracticeTaskGenerateResponseBodyData setTaskContent(java.util.List<AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent> taskContent) {
            this.taskContent = taskContent;
            return this;
        }
        public java.util.List<AITeacherSyncPracticeTaskGenerateResponseBodyDataTaskContent> getTaskContent() {
            return this.taskContent;
        }

        public AITeacherSyncPracticeTaskGenerateResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
