// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ReplyAgentSessionRequest extends TeaModel {
    /**
     * <p>The JSON-RPC correlation ID for this reply request. The response returns this value as-is. This is different from PermissionRequestId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reply-rpc-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Fixed value: 2.0.</p>
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
         * <p>Required and cannot be empty when Outcome is set to selected. Set this parameter to the optionId of an actual option in the event options. To submit an answer, select the option with kind=allow_once. Omit this parameter when Outcome is set to cancelled.</p>
         * 
         * <strong>example:</strong>
         * <p>option-from-event</p>
         */
        @NameInMap("OptionId")
        public String optionId;

        /**
         * <p>The outcome type. Valid values:</p>
         * <ul>
         * <li>selected: An option is selected.</li>
         * <li>cancelled: The user explicitly cancels the interaction.</li>
         * </ul>
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
         * <p>The answers to ask_user_question. The key is a zero-based question index string, and the value is the answer text. Specify each answer for multiple questions. Omit this parameter for regular tool authorization or cancellation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;0&quot;:&quot;lakehouse_uat&quot;}</p>
         */
        @NameInMap("Answers")
        public java.util.Map<String, String> answers;

        /**
         * <p>The outcome of the user interaction.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Outcome")
        public ReplyAgentSessionRequestParamsOutcome outcome;

        /**
         * <p>The ID of the current permission_request. Obtain this value from _qwen/notify.params.data.requestId in the original SSE. This is not a ToolCallId, HTTP RequestId, or the JSON-RPC Id of this request. The value cannot be . or ..</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>permission-001</p>
         */
        @NameInMap("PermissionRequestId")
        public String permissionRequestId;

        /**
         * <p>The LSP session ID. Use the SessionId returned by the create session operation, not the daemon internal session ID.</p>
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
