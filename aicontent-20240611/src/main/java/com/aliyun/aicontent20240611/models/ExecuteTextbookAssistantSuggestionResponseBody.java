// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantSuggestionResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantSuggestionResponseBodyData data;

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
    @NameInMap("httpstatusCode")
    public Integer httpstatusCode;

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

    public static ExecuteTextbookAssistantSuggestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantSuggestionResponseBody self = new ExecuteTextbookAssistantSuggestionResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantSuggestionResponseBody setData(ExecuteTextbookAssistantSuggestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantSuggestionResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantSuggestionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantSuggestionResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantSuggestionResponseBody setHttpstatusCode(Integer httpstatusCode) {
        this.httpstatusCode = httpstatusCode;
        return this;
    }
    public Integer getHttpstatusCode() {
        return this.httpstatusCode;
    }

    public ExecuteTextbookAssistantSuggestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantSuggestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantSuggestionResponseBodyDataResult extends TeaModel {
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <strong>example:</strong>
         * <p>Good evening! From the book, how does Mike Black introduce himself?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        public static ExecuteTextbookAssistantSuggestionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantSuggestionResponseBodyDataResult self = new ExecuteTextbookAssistantSuggestionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantSuggestionResponseBodyDataResult setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public ExecuteTextbookAssistantSuggestionResponseBodyDataResult setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

    }

    public static class ExecuteTextbookAssistantSuggestionResponseBodyData extends TeaModel {
        @NameInMap("result")
        public ExecuteTextbookAssistantSuggestionResponseBodyDataResult result;

        public static ExecuteTextbookAssistantSuggestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantSuggestionResponseBodyData self = new ExecuteTextbookAssistantSuggestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantSuggestionResponseBodyData setResult(ExecuteTextbookAssistantSuggestionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantSuggestionResponseBodyDataResult getResult() {
            return this.result;
        }

    }

}
