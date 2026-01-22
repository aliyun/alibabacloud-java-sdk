// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChatWithDesensitizeResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ChatWithDesensitizeResponseBodyData data;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ChatWithDesensitizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatWithDesensitizeResponseBody self = new ChatWithDesensitizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatWithDesensitizeResponseBody setData(ChatWithDesensitizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChatWithDesensitizeResponseBodyData getData() {
        return this.data;
    }

    public ChatWithDesensitizeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChatWithDesensitizeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ChatWithDesensitizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatWithDesensitizeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChatWithDesensitizeResponseBodyDataChoicesMessage extends TeaModel {
        /**
         * <p>The content of the model\&quot;s response.</p>
         * 
         * <strong>example:</strong>
         * <p>你好呀！</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The internal reasoning content of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>嗯，用户发了个“你好”，看起来是想打招呼...</p>
         */
        @NameInMap("ReasoningContent")
        public String reasoningContent;

        /**
         * <p>Message role.</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("Role")
        public String role;

        public static ChatWithDesensitizeResponseBodyDataChoicesMessage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithDesensitizeResponseBodyDataChoicesMessage self = new ChatWithDesensitizeResponseBodyDataChoicesMessage();
            return TeaModel.build(map, self);
        }

        public ChatWithDesensitizeResponseBodyDataChoicesMessage setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ChatWithDesensitizeResponseBodyDataChoicesMessage setReasoningContent(String reasoningContent) {
            this.reasoningContent = reasoningContent;
            return this;
        }
        public String getReasoningContent() {
            return this.reasoningContent;
        }

        public ChatWithDesensitizeResponseBodyDataChoicesMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ChatWithDesensitizeResponseBodyDataChoices extends TeaModel {
        /**
         * <p>Finish reason: ● stop: The model reached a natural stop point or a specified stop sequence. ● length: Generation ended because the maximum number of tokens was reached. ● tool_calls: The model stopped because it needs to call a tool to proceed.</p>
         * 
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("FinishReason")
        public String finishReason;

        /**
         * <p>Token probability information of model output.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Logprobs")
        public java.util.Map<String, ?> logprobs;

        /**
         * <p>The message body output by the model.</p>
         */
        @NameInMap("Message")
        public ChatWithDesensitizeResponseBodyDataChoicesMessage message;

        public static ChatWithDesensitizeResponseBodyDataChoices build(java.util.Map<String, ?> map) throws Exception {
            ChatWithDesensitizeResponseBodyDataChoices self = new ChatWithDesensitizeResponseBodyDataChoices();
            return TeaModel.build(map, self);
        }

        public ChatWithDesensitizeResponseBodyDataChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public ChatWithDesensitizeResponseBodyDataChoices setLogprobs(java.util.Map<String, ?> logprobs) {
            this.logprobs = logprobs;
            return this;
        }
        public java.util.Map<String, ?> getLogprobs() {
            return this.logprobs;
        }

        public ChatWithDesensitizeResponseBodyDataChoices setMessage(ChatWithDesensitizeResponseBodyDataChoicesMessage message) {
            this.message = message;
            return this;
        }
        public ChatWithDesensitizeResponseBodyDataChoicesMessage getMessage() {
            return this.message;
        }

    }

    public static class ChatWithDesensitizeResponseBodyDataUsage extends TeaModel {
        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CompletionTokens")
        public String completionTokens;

        /**
         * <p>Fine-grained classification of output tokens when using the Qwen-VL model.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CompletionTokensDetails")
        public java.util.Map<String, String> completionTokensDetails;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("PromptTokens")
        public String promptTokens;

        /**
         * <p>Fine-grained classification of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PromptTokensDetails")
        public java.util.Map<String, String> promptTokensDetails;

        /**
         * <p>The total number of tokens consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("TotalTokens")
        public String totalTokens;

        public static ChatWithDesensitizeResponseBodyDataUsage build(java.util.Map<String, ?> map) throws Exception {
            ChatWithDesensitizeResponseBodyDataUsage self = new ChatWithDesensitizeResponseBodyDataUsage();
            return TeaModel.build(map, self);
        }

        public ChatWithDesensitizeResponseBodyDataUsage setCompletionTokens(String completionTokens) {
            this.completionTokens = completionTokens;
            return this;
        }
        public String getCompletionTokens() {
            return this.completionTokens;
        }

        public ChatWithDesensitizeResponseBodyDataUsage setCompletionTokensDetails(java.util.Map<String, String> completionTokensDetails) {
            this.completionTokensDetails = completionTokensDetails;
            return this;
        }
        public java.util.Map<String, String> getCompletionTokensDetails() {
            return this.completionTokensDetails;
        }

        public ChatWithDesensitizeResponseBodyDataUsage setPromptTokens(String promptTokens) {
            this.promptTokens = promptTokens;
            return this;
        }
        public String getPromptTokens() {
            return this.promptTokens;
        }

        public ChatWithDesensitizeResponseBodyDataUsage setPromptTokensDetails(java.util.Map<String, String> promptTokensDetails) {
            this.promptTokensDetails = promptTokensDetails;
            return this;
        }
        public java.util.Map<String, String> getPromptTokensDetails() {
            return this.promptTokensDetails;
        }

        public ChatWithDesensitizeResponseBodyDataUsage setTotalTokens(String totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public String getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class ChatWithDesensitizeResponseBodyData extends TeaModel {
        /**
         * <p>The candidate array for model-generated content.</p>
         */
        @NameInMap("Choices")
        public java.util.List<ChatWithDesensitizeResponseBodyDataChoices> choices;

        /**
         * <p>The Unix timestamp (in seconds) when the request was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1763710100</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>Error message, provided when StatusCode is not 200.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The model used for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>Error code, 200 for normal calls, others for exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>Error type.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid_request_error</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The token consumption information of this request.</p>
         */
        @NameInMap("Usage")
        public ChatWithDesensitizeResponseBodyDataUsage usage;

        public static ChatWithDesensitizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChatWithDesensitizeResponseBodyData self = new ChatWithDesensitizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChatWithDesensitizeResponseBodyData setChoices(java.util.List<ChatWithDesensitizeResponseBodyDataChoices> choices) {
            this.choices = choices;
            return this;
        }
        public java.util.List<ChatWithDesensitizeResponseBodyDataChoices> getChoices() {
            return this.choices;
        }

        public ChatWithDesensitizeResponseBodyData setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ChatWithDesensitizeResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ChatWithDesensitizeResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ChatWithDesensitizeResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ChatWithDesensitizeResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ChatWithDesensitizeResponseBodyData setUsage(ChatWithDesensitizeResponseBodyDataUsage usage) {
            this.usage = usage;
            return this;
        }
        public ChatWithDesensitizeResponseBodyDataUsage getUsage() {
            return this.usage;
        }

    }

}
