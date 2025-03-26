// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDialogueResponseBody extends TeaModel {
    @NameInMap("data")
    public ExecuteTextbookAssistantDialogueResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    public static ExecuteTextbookAssistantDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantDialogueResponseBody self = new ExecuteTextbookAssistantDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantDialogueResponseBody setData(ExecuteTextbookAssistantDialogueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantDialogueResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantDialogueResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantDialogueResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantDialogueResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteTextbookAssistantDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantDialogueResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ExecuteTextbookAssistantDialogueResponseBodyDataResult extends TeaModel {
        @NameInMap("chineseResult")
        public String chineseResult;

        @NameInMap("englishResult")
        public String englishResult;

        @NameInMap("isFinish")
        public Boolean isFinish;

        @NameInMap("isTaskCompleted")
        public Boolean isTaskCompleted;

        public static ExecuteTextbookAssistantDialogueResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantDialogueResponseBodyDataResult self = new ExecuteTextbookAssistantDialogueResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantDialogueResponseBodyDataResult setChineseResult(String chineseResult) {
            this.chineseResult = chineseResult;
            return this;
        }
        public String getChineseResult() {
            return this.chineseResult;
        }

        public ExecuteTextbookAssistantDialogueResponseBodyDataResult setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

        public ExecuteTextbookAssistantDialogueResponseBodyDataResult setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        public ExecuteTextbookAssistantDialogueResponseBodyDataResult setIsTaskCompleted(Boolean isTaskCompleted) {
            this.isTaskCompleted = isTaskCompleted;
            return this;
        }
        public Boolean getIsTaskCompleted() {
            return this.isTaskCompleted;
        }

    }

    public static class ExecuteTextbookAssistantDialogueResponseBodyData extends TeaModel {
        @NameInMap("assistant")
        public String assistant;

        @NameInMap("chatId")
        public String chatId;

        @NameInMap("result")
        public ExecuteTextbookAssistantDialogueResponseBodyDataResult result;

        @NameInMap("user")
        public String user;

        public static ExecuteTextbookAssistantDialogueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantDialogueResponseBodyData self = new ExecuteTextbookAssistantDialogueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantDialogueResponseBodyData setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }
        public String getAssistant() {
            return this.assistant;
        }

        public ExecuteTextbookAssistantDialogueResponseBodyData setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }
        public String getChatId() {
            return this.chatId;
        }

        public ExecuteTextbookAssistantDialogueResponseBodyData setResult(ExecuteTextbookAssistantDialogueResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ExecuteTextbookAssistantDialogueResponseBodyDataResult getResult() {
            return this.result;
        }

        public ExecuteTextbookAssistantDialogueResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
