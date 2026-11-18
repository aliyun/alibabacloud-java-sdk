// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class PromptAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The Error field in the frame. This is an in-stream error, which is an object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:-32603,&quot;errorCode&quot;:&quot;CLI_STREAM_FAILED&quot;,&quot;message&quot;:&quot;The response stream was interrupted.&quot;}</p>
     */
    @NameInMap("Error")
    public Object error;

    /**
     * <p>The Id field in the frame, used to associate the request. Notification frames may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The Jsonrpc field in the frame. The value is 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The Method field in the frame, used to distinguish notification categories.</p>
     * 
     * <strong>example:</strong>
     * <p>session/update</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The Params field in the frame. This is the notification payload, which is an object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;You should first check whether the list is empty.&quot;}},&quot;_meta&quot;:{&quot;offset&quot;:12,&quot;eventEpoch&quot;:&quot;epoch-example&quot;,&quot;promptId&quot;:&quot;prompt-example&quot;}}</p>
     */
    @NameInMap("Params")
    public Object params;

    /**
     * <p>The request diagnostic identifier. This identifier is not guaranteed to be included in every frame. You should also retain the diagnostic information in the response headers.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Result field in the frame. This is the normal result, which is an object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
     */
    @NameInMap("Result")
    public Object result;

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

}
