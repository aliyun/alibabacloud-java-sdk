// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class LoadAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The <code>Error</code> field in the frame. It is an in-stream error and is actually an object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:-32603,&quot;errorCode&quot;:&quot;CLI_STREAM_FAILED&quot;,&quot;message&quot;:&quot;The response stream was interrupted.&quot;}</p>
     */
    @NameInMap("Error")
    public Object error;

    /**
     * <p>The <code>Id</code> field in the frame, used to associate the request. Notification frames may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The <code>Jsonrpc</code> field in the frame. The value is <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The <code>Method</code> field in the frame, used to distinguish notification categories.</p>
     * 
     * <strong>example:</strong>
     * <p>session/update</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The <code>Params</code> field in the frame. It is the notification payload and is actually an object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Hello&quot;}}}</p>
     */
    @NameInMap("Params")
    public Object params;

    /**
     * <p>The request diagnostic identifier. It is not guaranteed to be included in every frame. You should also retain the diagnostic information in the response headers.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The <code>Result</code> field in the frame. It is the normal result and is actually an object.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
     */
    @NameInMap("Result")
    public Object result;

    public static LoadAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadAgentSessionResponseBody self = new LoadAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadAgentSessionResponseBody setError(Object error) {
        this.error = error;
        return this;
    }
    public Object getError() {
        return this.error;
    }

    public LoadAgentSessionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LoadAgentSessionResponseBody setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public LoadAgentSessionResponseBody setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public LoadAgentSessionResponseBody setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public LoadAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoadAgentSessionResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

}
