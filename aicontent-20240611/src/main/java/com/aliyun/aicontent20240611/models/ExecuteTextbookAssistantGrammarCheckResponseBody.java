// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantGrammarCheckResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantGrammarCheckResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1e96d17091734639835114e12c8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteTextbookAssistantGrammarCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantGrammarCheckResponseBody self = new ExecuteTextbookAssistantGrammarCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantGrammarCheckResponseBody setData(ExecuteTextbookAssistantGrammarCheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantGrammarCheckResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantGrammarCheckResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantGrammarCheckResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantGrammarCheckResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantGrammarCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantGrammarCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult extends TeaModel {
        @NameInMap("analysis")
        public String analysis;

        /**
         * <strong>example:</strong>
         * <p>I am you.</p>
         */
        @NameInMap("correction")
        public String correction;

        /**
         * <strong>example:</strong>
         * <p>Has_Error</p>
         */
        @NameInMap("correctionStatus")
        public String correctionStatus;

        public static ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult self = new ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult setAnalysis(String analysis) {
            this.analysis = analysis;
            return this;
        }
        public String getAnalysis() {
            return this.analysis;
        }

        public ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult setCorrection(String correction) {
            this.correction = correction;
            return this;
        }
        public String getCorrection() {
            return this.correction;
        }

        public ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult setCorrectionStatus(String correctionStatus) {
            this.correctionStatus = correctionStatus;
            return this;
        }
        public String getCorrectionStatus() {
            return this.correctionStatus;
        }

    }

    public static class ExecuteTextbookAssistantGrammarCheckResponseBodyData extends TeaModel {
        @NameInMap("result")
        public ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult result;

        public static ExecuteTextbookAssistantGrammarCheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantGrammarCheckResponseBodyData self = new ExecuteTextbookAssistantGrammarCheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantGrammarCheckResponseBodyData setResult(ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantGrammarCheckResponseBodyDataResult getResult() {
            return this.result;
        }

    }

}
