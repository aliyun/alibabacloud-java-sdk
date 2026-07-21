// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetAITeacherSyncDialogueSuggestionResponseBody extends TeaModel {
    /**
     * <p>The object that contains the result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public GetAITeacherSyncDialogueSuggestionResponseBodyData data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message returned when the request fails.</p>
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
     * <p>A unique identifier for the request.</p>
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

    public static GetAITeacherSyncDialogueSuggestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAITeacherSyncDialogueSuggestionResponseBody self = new GetAITeacherSyncDialogueSuggestionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAITeacherSyncDialogueSuggestionResponseBody setData(GetAITeacherSyncDialogueSuggestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAITeacherSyncDialogueSuggestionResponseBodyData getData() {
        return this.data;
    }

    public GetAITeacherSyncDialogueSuggestionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetAITeacherSyncDialogueSuggestionResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetAITeacherSyncDialogueSuggestionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAITeacherSyncDialogueSuggestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAITeacherSyncDialogueSuggestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAITeacherSyncDialogueSuggestionResponseBodyData extends TeaModel {
        /**
         * <p>The assistant\&quot;s suggestion in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>谢谢莉莉.你喜欢吃肉吗，莉莉？</p>
         */
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <p>The assistant\&quot;s suggestion in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Thanks, Lily. Do you like meat, Lily?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        public static GetAITeacherSyncDialogueSuggestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAITeacherSyncDialogueSuggestionResponseBodyData self = new GetAITeacherSyncDialogueSuggestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAITeacherSyncDialogueSuggestionResponseBodyData setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public GetAITeacherSyncDialogueSuggestionResponseBodyData setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

    }

}
