// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetYaoChiAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("FunctionCall")
    public java.util.List<GetYaoChiAgentResponseBodyFunctionCall> functionCall;

    /**
     * <strong>example:</strong>
     * <p>polardb</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ReasoningContent")
    public String reasoningContent;

    /**
     * <strong>example:</strong>
     * <p>7172BECE-588A-5961-8126-C216E16B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("UiFunctionCall")
    public java.util.List<GetYaoChiAgentResponseBodyUiFunctionCall> uiFunctionCall;

    public static GetYaoChiAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYaoChiAgentResponseBody self = new GetYaoChiAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYaoChiAgentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetYaoChiAgentResponseBody setFunctionCall(java.util.List<GetYaoChiAgentResponseBodyFunctionCall> functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    public java.util.List<GetYaoChiAgentResponseBodyFunctionCall> getFunctionCall() {
        return this.functionCall;
    }

    public GetYaoChiAgentResponseBody setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetYaoChiAgentResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public GetYaoChiAgentResponseBody setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
        return this;
    }
    public String getReasoningContent() {
        return this.reasoningContent;
    }

    public GetYaoChiAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetYaoChiAgentResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetYaoChiAgentResponseBody setUiFunctionCall(java.util.List<GetYaoChiAgentResponseBodyUiFunctionCall> uiFunctionCall) {
        this.uiFunctionCall = uiFunctionCall;
        return this;
    }
    public java.util.List<GetYaoChiAgentResponseBodyUiFunctionCall> getUiFunctionCall() {
        return this.uiFunctionCall;
    }

    public static class GetYaoChiAgentResponseBodyFunctionCall extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;arg&quot;: &quot;xxx&quot;}</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <strong>example:</strong>
         * <p>123447</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>sqlReview</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetYaoChiAgentResponseBodyFunctionCall build(java.util.Map<String, ?> map) throws Exception {
            GetYaoChiAgentResponseBodyFunctionCall self = new GetYaoChiAgentResponseBodyFunctionCall();
            return TeaModel.build(map, self);
        }

        public GetYaoChiAgentResponseBodyFunctionCall setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public GetYaoChiAgentResponseBodyFunctionCall setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetYaoChiAgentResponseBodyFunctionCall setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetYaoChiAgentResponseBodyFunctionCall setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetYaoChiAgentResponseBodyUiFunctionCall extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;arg&quot;: &quot;xxx&quot;}</p>
         */
        @NameInMap("ArgsText")
        public String argsText;

        /**
         * <strong>example:</strong>
         * <p>card</p>
         */
        @NameInMap("ToolName")
        public String toolName;

        public static GetYaoChiAgentResponseBodyUiFunctionCall build(java.util.Map<String, ?> map) throws Exception {
            GetYaoChiAgentResponseBodyUiFunctionCall self = new GetYaoChiAgentResponseBodyUiFunctionCall();
            return TeaModel.build(map, self);
        }

        public GetYaoChiAgentResponseBodyUiFunctionCall setArgsText(String argsText) {
            this.argsText = argsText;
            return this;
        }
        public String getArgsText() {
            return this.argsText;
        }

        public GetYaoChiAgentResponseBodyUiFunctionCall setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

}
