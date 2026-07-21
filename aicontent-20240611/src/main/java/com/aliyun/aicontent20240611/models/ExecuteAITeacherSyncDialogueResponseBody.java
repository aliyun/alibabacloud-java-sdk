// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherSyncDialogueResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ExecuteAITeacherSyncDialogueResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteAITeacherSyncDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherSyncDialogueResponseBody self = new ExecuteAITeacherSyncDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherSyncDialogueResponseBody setData(ExecuteAITeacherSyncDialogueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAITeacherSyncDialogueResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAITeacherSyncDialogueResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteAITeacherSyncDialogueResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteAITeacherSyncDialogueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAITeacherSyncDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAITeacherSyncDialogueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAITeacherSyncDialogueResponseBodyData extends TeaModel {
        /**
         * <p>The English response from the AI teacher.</p>
         * 
         * <strong>example:</strong>
         * <p>Thanks, Lily. Do you like meat, Lily?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        /**
         * <p>Indicates whether the dialogue is finished.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        /**
         * <p>Indicates whether the user\&quot;s response is on topic.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <p>The index of the current question.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("questionIndex")
        public Integer questionIndex;

        public static ExecuteAITeacherSyncDialogueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherSyncDialogueResponseBodyData self = new ExecuteAITeacherSyncDialogueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherSyncDialogueResponseBodyData setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

        public ExecuteAITeacherSyncDialogueResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public ExecuteAITeacherSyncDialogueResponseBodyData setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherSyncDialogueResponseBodyData setQuestionIndex(Integer questionIndex) {
            this.questionIndex = questionIndex;
            return this;
        }
        public Integer getQuestionIndex() {
            return this.questionIndex;
        }

    }

}
