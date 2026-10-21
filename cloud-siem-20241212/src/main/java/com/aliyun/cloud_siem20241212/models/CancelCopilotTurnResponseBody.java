// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CancelCopilotTurnResponseBody extends TeaModel {
    /**
     * <p>The API version number. The value is 1.0.0.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.2</p>
     */
    @NameInMap("ApiVersion")
    public String apiVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security operations Agent conversation turn.</p>
     */
    @NameInMap("Turn")
    public CancelCopilotTurnResponseBodyTurn turn;

    public static CancelCopilotTurnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCopilotTurnResponseBody self = new CancelCopilotTurnResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCopilotTurnResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CancelCopilotTurnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelCopilotTurnResponseBody setTurn(CancelCopilotTurnResponseBodyTurn turn) {
        this.turn = turn;
        return this;
    }
    public CancelCopilotTurnResponseBodyTurn getTurn() {
        return this.turn;
    }

    public static class CancelCopilotTurnResponseBodyTurn extends TeaModel {
        /**
         * <p>The client message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>366932fb-9a83-4a2d-94dd-c925b35f****</p>
         */
        @NameInMap("ClientMessageId")
        public String clientMessageId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-23T02:13:49Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The conversation feedback information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Feedback")
        public Long feedback;

        /**
         * <p>The number of tokens used for input.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("InputTokens")
        public Long inputTokens;

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model-****</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The number of tokens used for output.</p>
         * 
         * <strong>example:</strong>
         * <p>856</p>
         */
        @NameInMap("OutputTokens")
        public Long outputTokens;

        /**
         * <p>The number of reasoning tokens used on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>420</p>
         */
        @NameInMap("ReasoningTokens")
        public Long reasoningTokens;

        /**
         * <p>Indicates whether a retry is allowed.</p>
         */
        @NameInMap("RetryAllowed")
        public Boolean retryAllowed;

        /**
         * <p>The status of the conversation turn.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
         */
        @NameInMap("TurnId")
        public String turnId;

        public static CancelCopilotTurnResponseBodyTurn build(java.util.Map<String, ?> map) throws Exception {
            CancelCopilotTurnResponseBodyTurn self = new CancelCopilotTurnResponseBodyTurn();
            return TeaModel.build(map, self);
        }

        public CancelCopilotTurnResponseBodyTurn setClientMessageId(String clientMessageId) {
            this.clientMessageId = clientMessageId;
            return this;
        }
        public String getClientMessageId() {
            return this.clientMessageId;
        }

        public CancelCopilotTurnResponseBodyTurn setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public CancelCopilotTurnResponseBodyTurn setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CancelCopilotTurnResponseBodyTurn setFeedback(Long feedback) {
            this.feedback = feedback;
            return this;
        }
        public Long getFeedback() {
            return this.feedback;
        }

        public CancelCopilotTurnResponseBodyTurn setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public CancelCopilotTurnResponseBodyTurn setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public CancelCopilotTurnResponseBodyTurn setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public CancelCopilotTurnResponseBodyTurn setReasoningTokens(Long reasoningTokens) {
            this.reasoningTokens = reasoningTokens;
            return this;
        }
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        public CancelCopilotTurnResponseBodyTurn setRetryAllowed(Boolean retryAllowed) {
            this.retryAllowed = retryAllowed;
            return this;
        }
        public Boolean getRetryAllowed() {
            return this.retryAllowed;
        }

        public CancelCopilotTurnResponseBodyTurn setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CancelCopilotTurnResponseBodyTurn setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

    }

}
