// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantSseDialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>67e4c9d95bdfc83cd742ae7c</p>
     */
    @NameInMap("assistant")
    public String assistant;

    /**
     * <strong>example:</strong>
     * <p>67e374acb54c526c95c4fbd4</p>
     */
    @NameInMap("chatId")
    public String chatId;

    @NameInMap("data")
    public ExecuteTextbookAssistantSseDialogueResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>BIZ_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Id of the request</p>
     * 
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

    /**
     * <strong>example:</strong>
     * <p>67e4c9d6b54c526c95c53925</p>
     */
    @NameInMap("user")
    public String user;

    public static ExecuteTextbookAssistantSseDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantSseDialogueResponseBody self = new ExecuteTextbookAssistantSseDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setAssistant(String assistant) {
        this.assistant = assistant;
        return this;
    }
    public String getAssistant() {
        return this.assistant;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }
    public String getChatId() {
        return this.chatId;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setData(ExecuteTextbookAssistantSseDialogueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteTextbookAssistantSseDialogueResponseBodyData getData() {
        return this.data;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecuteTextbookAssistantSseDialogueResponseBody setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public static class ExecuteTextbookAssistantSseDialogueResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Thanks, Lily. Do you like meat, Lily?</p>
         */
        @NameInMap("englishResult")
        public String englishResult;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isFinish")
        public Boolean isFinish;

        public static ExecuteTextbookAssistantSseDialogueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteTextbookAssistantSseDialogueResponseBodyData self = new ExecuteTextbookAssistantSseDialogueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteTextbookAssistantSseDialogueResponseBodyData setEnglishResult(String englishResult) {
            this.englishResult = englishResult;
            return this;
        }
        public String getEnglishResult() {
            return this.englishResult;
        }

        public ExecuteTextbookAssistantSseDialogueResponseBodyData setIsFinish(Boolean isFinish) {
            this.isFinish = isFinish;
            return this;
        }
        public Boolean getIsFinish() {
            return this.isFinish;
        }

    }

}
