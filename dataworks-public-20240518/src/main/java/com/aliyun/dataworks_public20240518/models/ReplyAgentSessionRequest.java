// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ReplyAgentSessionRequest extends TeaModel {
    /**
     * <p>The JSON-RPC correlation ID for the current reply request. It is returned as-is in the response and is different from PermissionRequestId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reply-rpc-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Fixed to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The user interaction reply parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public ReplyAgentSessionRequestParams params;

    public static ReplyAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplyAgentSessionRequest self = new ReplyAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public ReplyAgentSessionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReplyAgentSessionRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ReplyAgentSessionRequest setParams(ReplyAgentSessionRequestParams params) {
        this.params = params;
        return this;
    }
    public ReplyAgentSessionRequestParams getParams() {
        return this.params;
    }

    public static class ReplyAgentSessionRequestParamsOutcome extends TeaModel {
        /**
         * <p>Required and cannot be empty when Outcome is selected. It takes the optionId of the actual option in the options of the current event (when submitting an answer, the option with kind=allow_once is usually selected). Omit this parameter when Outcome is cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>option-from-event</p>
         */
        @NameInMap("OptionId")
        public String optionId;

        /**
         * <p>The processing type. selected indicates that an option is selected, and cancelled indicates that the user explicitly cancels the interaction.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>selected</p>
         */
        @NameInMap("Outcome")
        public String outcome;

        public static ReplyAgentSessionRequestParamsOutcome build(java.util.Map<String, ?> map) throws Exception {
            ReplyAgentSessionRequestParamsOutcome self = new ReplyAgentSessionRequestParamsOutcome();
            return TeaModel.build(map, self);
        }

        public ReplyAgentSessionRequestParamsOutcome setOptionId(String optionId) {
            this.optionId = optionId;
            return this;
        }
        public String getOptionId() {
            return this.optionId;
        }

        public ReplyAgentSessionRequestParamsOutcome setOutcome(String outcome) {
            this.outcome = outcome;
            return this;
        }
        public String getOutcome() {
            return this.outcome;
        }

    }

    public static class ReplyAgentSessionRequestParams extends TeaModel {
        /**
         * <p>The answers to ask_user_question. The key is a 0-based string index of the question, and the value is the answer text. Fill in each question one by one for multiple questions. Omit this parameter for general tool authorization or cancellation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;0&quot;:&quot;lakehouse_uat&quot;}</p>
         */
        @NameInMap("Answers")
        public java.util.Map<String, String> answers;

        /**
         * <p>The processing result of the user for the current interaction.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Outcome")
        public ReplyAgentSessionRequestParamsOutcome outcome;

        /**
         * <p>The identifier of the current permission_request. It is obtained from _qwen/notify.params.data.requestId of the original SSE, and is not ToolCallId, HTTP RequestId, or the current JSON-RPC Id. It cannot be . or ..</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>permission-001</p>
         */
        @NameInMap("PermissionRequestId")
        public String permissionRequestId;

        /**
         * <p>The LSP session ID. Use the SessionId returned when creating the session, not the internal session ID of the daemon.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsp-session-001</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static ReplyAgentSessionRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ReplyAgentSessionRequestParams self = new ReplyAgentSessionRequestParams();
            return TeaModel.build(map, self);
        }

        public ReplyAgentSessionRequestParams setAnswers(java.util.Map<String, String> answers) {
            this.answers = answers;
            return this;
        }
        public java.util.Map<String, String> getAnswers() {
            return this.answers;
        }

        public ReplyAgentSessionRequestParams setOutcome(ReplyAgentSessionRequestParamsOutcome outcome) {
            this.outcome = outcome;
            return this;
        }
        public ReplyAgentSessionRequestParamsOutcome getOutcome() {
            return this.outcome;
        }

        public ReplyAgentSessionRequestParams setPermissionRequestId(String permissionRequestId) {
            this.permissionRequestId = permissionRequestId;
            return this;
        }
        public String getPermissionRequestId() {
            return this.permissionRequestId;
        }

        public ReplyAgentSessionRequestParams setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
