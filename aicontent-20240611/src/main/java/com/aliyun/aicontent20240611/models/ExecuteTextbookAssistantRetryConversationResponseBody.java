// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantRetryConversationResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantRetryConversationResponseBodyData data;

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
     * <p>2F2ABF4B-A4F6-5EC7-B287-7EF5B156F1ED</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteTextbookAssistantRetryConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantRetryConversationResponseBody self = new ExecuteTextbookAssistantRetryConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantRetryConversationResponseBody setData(ExecuteTextbookAssistantRetryConversationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantRetryConversationResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantRetryConversationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantRetryConversationResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantRetryConversationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantRetryConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantRetryConversationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantRetryConversationResponseBodyDataResult extends TeaModel {
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <strong>example:</strong>
         * <p>Good evening! From the book, how does Mike Black introduce himself?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        public static ExecuteTextbookAssistantRetryConversationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantRetryConversationResponseBodyDataResult self = new ExecuteTextbookAssistantRetryConversationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantRetryConversationResponseBodyDataResult setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public ExecuteTextbookAssistantRetryConversationResponseBodyDataResult setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

    }

    public static class ExecuteTextbookAssistantRetryConversationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6788e0b4b54c5268c1b78638</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <strong>example:</strong>
         * <p>6788e0b475a4631ffc626722</p>
         */
        @NameInMap("chatId")
        public String chatId;

        @NameInMap("result")
        public ExecuteTextbookAssistantRetryConversationResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>6788e0b45bdfc807f077a5a1</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteTextbookAssistantRetryConversationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantRetryConversationResponseBodyData self = new ExecuteTextbookAssistantRetryConversationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantRetryConversationResponseBodyData setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteTextbookAssistantRetryConversationResponseBodyData setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ExecuteTextbookAssistantRetryConversationResponseBodyData setResult(ExecuteTextbookAssistantRetryConversationResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantRetryConversationResponseBodyDataResult getResult() {
            return this.result;
        }

        public ExecuteTextbookAssistantRetryConversationResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
