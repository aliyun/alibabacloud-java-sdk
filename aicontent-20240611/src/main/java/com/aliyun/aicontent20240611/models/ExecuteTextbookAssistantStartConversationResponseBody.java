// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantStartConversationResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantStartConversationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>B_USER_NOT_FOUND_EXCEPTION</p>
     */
    @NameInMap("errCode")
    public String errCode;

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
     * <p>6F73C114-A76E-51AD-99E3-BC7B941B69E0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecuteTextbookAssistantStartConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantStartConversationResponseBody self = new ExecuteTextbookAssistantStartConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantStartConversationResponseBody setData(ExecuteTextbookAssistantStartConversationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantStartConversationResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantStartConversationResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantStartConversationResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantStartConversationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantStartConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantStartConversationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantStartConversationResponseBodyDataResult extends TeaModel {
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <strong>example:</strong>
         * <p>Good evening! From the book, how does Mike Black introduce himself?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        public static ExecuteTextbookAssistantStartConversationResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantStartConversationResponseBodyDataResult self = new ExecuteTextbookAssistantStartConversationResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantStartConversationResponseBodyDataResult setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public ExecuteTextbookAssistantStartConversationResponseBodyDataResult setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

    }

    public static class ExecuteTextbookAssistantStartConversationResponseBodyData extends TeaModel {
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
        public ExecuteTextbookAssistantStartConversationResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>6788e0b45bdfc807f077a5a1</p>
         */
        @NameInMap("user")
        public String user;

        public static ExecuteTextbookAssistantStartConversationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantStartConversationResponseBodyData self = new ExecuteTextbookAssistantStartConversationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantStartConversationResponseBodyData setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteTextbookAssistantStartConversationResponseBodyData setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ExecuteTextbookAssistantStartConversationResponseBodyData setResult(ExecuteTextbookAssistantStartConversationResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantStartConversationResponseBodyDataResult getResult() {
            return this.result;
        }

        public ExecuteTextbookAssistantStartConversationResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
