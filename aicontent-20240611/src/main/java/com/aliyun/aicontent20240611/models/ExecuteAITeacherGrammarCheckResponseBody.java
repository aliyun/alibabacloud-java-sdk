// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherGrammarCheckResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ExecuteAITeacherGrammarCheckResponseBodyData data;

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

    public static ExecuteAITeacherGrammarCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherGrammarCheckResponseBody self = new ExecuteAITeacherGrammarCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherGrammarCheckResponseBody setData(ExecuteAITeacherGrammarCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAITeacherGrammarCheckResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAITeacherGrammarCheckResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteAITeacherGrammarCheckResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteAITeacherGrammarCheckResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAITeacherGrammarCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAITeacherGrammarCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAITeacherGrammarCheckResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>主语 &quot;I&quot; 对应的动词应该是 &quot;am&quot; 而不是 &quot;is&quot;。</p>
         */
        @NameInMap("analysis")
        public String analysis;

        /**
         * <strong>example:</strong>
         * <p>I am good.</p>
         */
        @NameInMap("correction")
        public String correction;

        /**
         * <strong>example:</strong>
         * <p>Has_Error</p>
         */
        @NameInMap("correctionStatus")
        public String correctionStatus;

        @NameInMap("errorReason")
        public String errorReason;

        public static ExecuteAITeacherGrammarCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherGrammarCheckResponseBodyData self = new ExecuteAITeacherGrammarCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherGrammarCheckResponseBodyData setAnalysis(String analysis) {
            this.analysis = analysis;
            return this;
        }
        public String getAnalysis() {
            return this.analysis;
        }

        public ExecuteAITeacherGrammarCheckResponseBodyData setCorrection(String correction) {
            this.correction = correction;
            return this;
        }
        public String getCorrection() {
            return this.correction;
        }

        public ExecuteAITeacherGrammarCheckResponseBodyData setCorrectionStatus(String correctionStatus) {
            this.correctionStatus = correctionStatus;
            return this;
        }
        public String getCorrectionStatus() {
            return this.correctionStatus;
        }

        public ExecuteAITeacherGrammarCheckResponseBodyData setErrorReason(String errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public String getErrorReason() {
            return this.errorReason;
        }

    }

}
