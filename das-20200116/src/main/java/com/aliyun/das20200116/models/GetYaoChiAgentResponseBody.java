// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetYaoChiAgentResponseBody extends TeaModel {
    /**
     * <p>The response content.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The tool calling invoke list.</p>
     */
    @NameInMap("FunctionCall")
    public java.util.List<GetYaoChiAgentResponseBodyFunctionCall> functionCall;

    /**
     * <p>The ParentId field. This field exists only when the message is output by a sub-agent, and the value is the sub-agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The cloud service type.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>The query ID. This value is the same as the QueryId request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The reasoning content of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ReasoningContent")
    public String reasoningContent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7172BECE-588A-5961-8126-C216E16B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The session ID. This value is the same as the SessionId request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The list of sub-agent call information.</p>
     */
    @NameInMap("SubAgentCall")
    public java.util.List<GetYaoChiAgentResponseBodySubAgentCall> subAgentCall;

    /**
     * <p>The card tool calling invoke list.</p>
     */
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

    public GetYaoChiAgentResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
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

    public GetYaoChiAgentResponseBody setSubAgentCall(java.util.List<GetYaoChiAgentResponseBodySubAgentCall> subAgentCall) {
        this.subAgentCall = subAgentCall;
        return this;
    }
    public java.util.List<GetYaoChiAgentResponseBodySubAgentCall> getSubAgentCall() {
        return this.subAgentCall;
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
         * <p>The parameters of the called tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;arg&quot;: &quot;xxx&quot;}</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <p>The tool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the called tool.</p>
         * 
         * <strong>example:</strong>
         * <p>sqlReview</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tool calling invoke status.</p>
         * 
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

    public static class GetYaoChiAgentResponseBodySubAgentCall extends TeaModel {
        /**
         * <p>The sub-agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("SubAgentId")
        public String subAgentId;

        /**
         * <p>The sub-agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>XX Agent</p>
         */
        @NameInMap("SubAgentName")
        public String subAgentName;

        public static GetYaoChiAgentResponseBodySubAgentCall build(java.util.Map<String, ?> map) throws Exception {
            GetYaoChiAgentResponseBodySubAgentCall self = new GetYaoChiAgentResponseBodySubAgentCall();
            return TeaModel.build(map, self);
        }

        public GetYaoChiAgentResponseBodySubAgentCall setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetYaoChiAgentResponseBodySubAgentCall setSubAgentId(String subAgentId) {
            this.subAgentId = subAgentId;
            return this;
        }
        public String getSubAgentId() {
            return this.subAgentId;
        }

        public GetYaoChiAgentResponseBodySubAgentCall setSubAgentName(String subAgentName) {
            this.subAgentName = subAgentName;
            return this;
        }
        public String getSubAgentName() {
            return this.subAgentName;
        }

    }

    public static class GetYaoChiAgentResponseBodyUiFunctionCall extends TeaModel {
        /**
         * <p>The parameters of the card tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;arg&quot;: &quot;xxx&quot;}</p>
         */
        @NameInMap("ArgsText")
        public String argsText;

        /**
         * <p>The name of the card tool.</p>
         * 
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
