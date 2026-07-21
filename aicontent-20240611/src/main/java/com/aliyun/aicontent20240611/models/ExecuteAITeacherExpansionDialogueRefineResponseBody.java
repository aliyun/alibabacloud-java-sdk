// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueRefineResponseBody extends TeaModel {
    /**
     * <p>The object that contains the refinement result.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ExecuteAITeacherExpansionDialogueRefineResponseBodyData data;

    /**
     * <p>The error code. Returned only when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. Returned only when the request fails.</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteAITeacherExpansionDialogueRefineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueRefineResponseBody self = new ExecuteAITeacherExpansionDialogueRefineResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueRefineResponseBody setData(ExecuteAITeacherExpansionDialogueRefineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueRefineResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAITeacherExpansionDialogueRefineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAITeacherExpansionDialogueRefineResponseBodyData extends TeaModel {
        /**
         * <p>The refinement result.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes, I\&quot;ll be right there.</p>
         */
        @NameInMap("result")
        public String result;

        public static ExecuteAITeacherExpansionDialogueRefineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueRefineResponseBodyData self = new ExecuteAITeacherExpansionDialogueRefineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueRefineResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
