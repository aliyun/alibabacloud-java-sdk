// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantRefineByContextResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("data")
    public ExecuteTextbookAssistantRefineByContextResponseBodyData data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("errMessage")
    public Integer errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6F73C114-A76E-51AD-99E3-BC7B941B69E0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>A value of <code>true</code> indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteTextbookAssistantRefineByContextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantRefineByContextResponseBody self = new ExecuteTextbookAssistantRefineByContextResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantRefineByContextResponseBody setData(ExecuteTextbookAssistantRefineByContextResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantRefineByContextResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantRefineByContextResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantRefineByContextResponseBody setErrMessage(Integer errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public Integer getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantRefineByContextResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantRefineByContextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantRefineByContextResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantRefineByContextResponseBodyDataResult extends TeaModel {
        /**
         * <p>The refined sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>Good evening! From the book, how does Mike Black introduce himself?</p>
         */
        @NameInMap("result")
        public String result;

        public static ExecuteTextbookAssistantRefineByContextResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantRefineByContextResponseBodyDataResult self = new ExecuteTextbookAssistantRefineByContextResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantRefineByContextResponseBodyDataResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class ExecuteTextbookAssistantRefineByContextResponseBodyData extends TeaModel {
        /**
         * <p>The result data.</p>
         */
        @NameInMap("result")
        public ExecuteTextbookAssistantRefineByContextResponseBodyDataResult result;

        public static ExecuteTextbookAssistantRefineByContextResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantRefineByContextResponseBodyData self = new ExecuteTextbookAssistantRefineByContextResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantRefineByContextResponseBodyData setResult(ExecuteTextbookAssistantRefineByContextResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantRefineByContextResponseBodyDataResult getResult() {
            return this.result;
        }

    }

}
