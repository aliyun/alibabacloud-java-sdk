// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ExecuteAITeacherExpansionDialogueResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
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

    public static ExecuteAITeacherExpansionDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueResponseBody self = new ExecuteAITeacherExpansionDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueResponseBody setData(ExecuteAITeacherExpansionDialogueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAITeacherExpansionDialogueResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteAITeacherExpansionDialogueResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteAITeacherExpansionDialogueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAITeacherExpansionDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAITeacherExpansionDialogueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAITeacherExpansionDialogueResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOffTopicControl")
        public Boolean isOffTopicControl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isOnTopic")
        public Boolean isOnTopic;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("questionIndex")
        public Integer questionIndex;

        public static ExecuteAITeacherExpansionDialogueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueResponseBodyData self = new ExecuteAITeacherExpansionDialogueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueResponseBodyData setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public ExecuteAITeacherExpansionDialogueResponseBodyData setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

        public ExecuteAITeacherExpansionDialogueResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public ExecuteAITeacherExpansionDialogueResponseBodyData setIsOffTopicControl(Boolean isOffTopicControl) {
            this.isOffTopicControl = isOffTopicControl;
            return this;
        }
        public Boolean getIsOffTopicControl() {
            return this.isOffTopicControl;
        }

        public ExecuteAITeacherExpansionDialogueResponseBodyData setIsOnTopic(Boolean isOnTopic) {
            this.isOnTopic = isOnTopic;
            return this;
        }
        public Boolean getIsOnTopic() {
            return this.isOnTopic;
        }

        public ExecuteAITeacherExpansionDialogueResponseBodyData setQuestionIndex(Integer questionIndex) {
            this.questionIndex = questionIndex;
            return this;
        }
        public Integer getQuestionIndex() {
            return this.questionIndex;
        }

    }

}
