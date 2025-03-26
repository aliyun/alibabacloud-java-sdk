// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDifficultyResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantDifficultyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
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
     * <p>0D7D382F-9475-572E-BE83-DDFBF5C5EB24</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteTextbookAssistantDifficultyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantDifficultyResponseBody self = new ExecuteTextbookAssistantDifficultyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantDifficultyResponseBody setData(ExecuteTextbookAssistantDifficultyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantDifficultyResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantDifficultyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantDifficultyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantDifficultyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantDifficultyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantDifficultyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantDifficultyResponseBodyDataResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Let\&quot;s look at the text again. Mike says, \&quot;I\&quot;m Mike Black.\&quot; Can you try saying it like Mike?</p>
         */
        @NameInMap("result")
        public String result;

        public static ExecuteTextbookAssistantDifficultyResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantDifficultyResponseBodyDataResult self = new ExecuteTextbookAssistantDifficultyResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantDifficultyResponseBodyDataResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class ExecuteTextbookAssistantDifficultyResponseBodyData extends TeaModel {
        @NameInMap("result")
        public ExecuteTextbookAssistantDifficultyResponseBodyDataResult result;

        public static ExecuteTextbookAssistantDifficultyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantDifficultyResponseBodyData self = new ExecuteTextbookAssistantDifficultyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantDifficultyResponseBodyData setResult(ExecuteTextbookAssistantDifficultyResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantDifficultyResponseBodyDataResult getResult() {
            return this.result;
        }

    }

}
