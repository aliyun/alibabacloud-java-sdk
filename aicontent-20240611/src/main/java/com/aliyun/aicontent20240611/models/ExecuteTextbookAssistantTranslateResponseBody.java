// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantTranslateResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantTranslateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
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
     * <p>9EB79C1E-36C2-5777-BED6-C23A98DF0637</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteTextbookAssistantTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantTranslateResponseBody self = new ExecuteTextbookAssistantTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantTranslateResponseBody setData(ExecuteTextbookAssistantTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantTranslateResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantTranslateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantTranslateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantTranslateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantTranslateResponseBodyDataResult extends TeaModel {
        @NameInMap("result")
        public String result;

        public static ExecuteTextbookAssistantTranslateResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantTranslateResponseBodyDataResult self = new ExecuteTextbookAssistantTranslateResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantTranslateResponseBodyDataResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class ExecuteTextbookAssistantTranslateResponseBodyData extends TeaModel {
        @NameInMap("result")
        public ExecuteTextbookAssistantTranslateResponseBodyDataResult result;

        public static ExecuteTextbookAssistantTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantTranslateResponseBodyData self = new ExecuteTextbookAssistantTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantTranslateResponseBodyData setResult(ExecuteTextbookAssistantTranslateResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantTranslateResponseBodyDataResult getResult() {
            return this.result;
        }

    }

}
