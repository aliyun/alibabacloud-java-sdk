// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDialogueResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ExecuteTextbookAssistantDialogueResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
    public String httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DBFA232A-1176-50E6-95AE-50F7A62A28AD</p>
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
        /**
         * <p>The Textbook Assistant\&quot;s reply in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>让我们再看一遍课文。迈克说: “我是迈克·布莱克。”你能试着像迈克那样说吗？</p>
         */
        @NameInMap("chineseResult")
        public String chineseResult;

        /**
         * <p>The Textbook Assistant\&quot;s reply in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Let\&quot;s look at the text again. Mike says, \&quot;I\&quot;m Mike Black.\&quot; Can you try saying it like Mike?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        /**
         * <p>Indicates whether the dialogue is finished.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        /**
         * <p>Indicates whether the task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The ID of the Textbook Assistant\&quot;s message.</p>
         * 
         * <strong>example:</strong>
         * <p>6788f4935bdfc807f077a984</p>
         */
        @NameInMap("assistant")
        public String assistant;

        /**
         * <p>The chat ID for this turn.</p>
         * 
         * <strong>example:</strong>
         * <p>6788e0b475a4631ffc626722</p>
         */
        @NameInMap("chatId")
        public String chatId;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("result")
        public ExecuteTextbookAssistantDialogueResponseBodyDataResult result;

        /**
         * <p>The ID of the user\&quot;s reply.</p>
         * 
         * <strong>example:</strong>
         * <p>6788f4905bdfc807f077a982</p>
         */
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
