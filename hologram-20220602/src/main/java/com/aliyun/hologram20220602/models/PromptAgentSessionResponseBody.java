// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220602.models;

import com.aliyun.tea.*;

public class PromptAgentSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;code&quot;: 400, &quot;errorCode&quot;: &quot;0x50000000001&quot;, &quot;message&quot;: &quot;not exist session&quot;, &quot;data&quot;: null}</p>
     */
    @NameInMap("Error")
    public Object error;

    /**
     * <strong>example:</strong>
     * <p>2072736942627512345</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <strong>example:</strong>
     * <p>session/update</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;403e9e4a-457f-404e-9963-c5ca9b3997cf&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;I have 13 skills.&quot;}}}</p>
     */
    @NameInMap("Params")
    public Object params;

    /**
     * <strong>example:</strong>
     * <p>403e9e4a-457f-404e-9963-c5ca9b3997cf</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
     */
    @NameInMap("Result")
    public Object result;

    /**
     * <strong>example:</strong>
     * <p>1789367332</p>
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
