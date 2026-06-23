// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PromptAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The error information returned in the SSE frame. The response content conforms to the open-source Agent Client Protocol (ACP) specification. For more information, see https\://agentclientprotocol.com/protocol/prompt-turn</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;: 400, &quot;errorCode&quot;: &quot;0x50000000001&quot;, &quot;message&quot;: &quot;not exist session&quot;, &quot;data&quot;: null}</p>
     */
    @NameInMap("Error")
    public Object error;

    /**
     * <p>The ID passed in by the caller. The value is returned as-is in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>631478864897630XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The SSE method. The response content conforms to the open-source Agent Client Protocol (ACP) specification. For more information, see https\://agentclientprotocol.com/protocol/prompt-turn</p>
     * 
     * <strong>example:</strong>
     * <p>session/update</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The SSE params. The response content conforms to the open-source Agent Client Protocol (ACP) specification. For more information, see https\://agentclientprotocol.com/protocol/prompt-turn</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;af4f5ef8-e8f5-481c-ad1f-94886c6c0aed&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello world&quot;}}}</p>
     */
    @NameInMap("Params")
    public Object params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D5D70885-7CC7-594A-80C7-2EF1B00FFB4B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SSE frame result set. The response content conforms to the open-source Agent Client Protocol (ACP) specification. For more information, see https\://agentclientprotocol.com/protocol/prompt-turn</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
     */
    @NameInMap("Result")
    public Object result;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1747447032</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static PromptAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PromptAgentSessionResponseBody self = new PromptAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public PromptAgentSessionResponseBody setError(Object error) {
        this.error = error;
        return this;
    }
    public Object getError() {
        return this.error;
    }

    public PromptAgentSessionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PromptAgentSessionResponseBody setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public PromptAgentSessionResponseBody setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public PromptAgentSessionResponseBody setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public PromptAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PromptAgentSessionResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

    public PromptAgentSessionResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
