// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherSyncDialogueTranslateResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;result&quot;:&quot;That\&quot;s great, thank you for coming, Lily. Do you like eating meat?&quot;}</p>
     */
    @NameInMap("data")
    public ExecuteAITeacherSyncDialogueTranslateResponseBodyData data;

    /**
     * <p>The fault message encoding.</p>
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
     * <p>Unknown error</p>
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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteAITeacherSyncDialogueTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherSyncDialogueTranslateResponseBody self = new ExecuteAITeacherSyncDialogueTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherSyncDialogueTranslateResponseBody setData(ExecuteAITeacherSyncDialogueTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAITeacherSyncDialogueTranslateResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAITeacherSyncDialogueTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAITeacherSyncDialogueTranslateResponseBodyData extends TeaModel {
        /**
         * <p>The translation result.</p>
         * 
         * <strong>example:</strong>
         * <p>That\&quot;s great, thank you for coming, Lily. Do you like eating meat?</p>
         */
        @NameInMap("result")
        public String result;

        public static ExecuteAITeacherSyncDialogueTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherSyncDialogueTranslateResponseBodyData self = new ExecuteAITeacherSyncDialogueTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherSyncDialogueTranslateResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
