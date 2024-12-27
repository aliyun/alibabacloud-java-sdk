// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherExpansionDialogueTranslateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public ExecuteAITeacherExpansionDialogueTranslateResponseBodyData data;

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

    public static ExecuteAITeacherExpansionDialogueTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherExpansionDialogueTranslateResponseBody self = new ExecuteAITeacherExpansionDialogueTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponseBody setData(ExecuteAITeacherExpansionDialogueTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteAITeacherExpansionDialogueTranslateResponseBodyData getData() {
        return this.data;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAITeacherExpansionDialogueTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAITeacherExpansionDialogueTranslateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>太好了，谢谢你过来，莉莉。你喜欢吃肉吗？</p>
         */
        @NameInMap("result")
        public String result;

        public static ExecuteAITeacherExpansionDialogueTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAITeacherExpansionDialogueTranslateResponseBodyData self = new ExecuteAITeacherExpansionDialogueTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteAITeacherExpansionDialogueTranslateResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
