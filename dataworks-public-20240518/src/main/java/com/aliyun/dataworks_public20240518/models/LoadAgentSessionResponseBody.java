// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class LoadAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The error object of the SSE frame. This field is present when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;: 400, &quot;errorCode&quot;: &quot;0x50000000001&quot;, &quot;message&quot;: &quot;not exist session&quot;, &quot;data&quot;: null}</p>
     */
    @NameInMap("Error")
    public Object error;

    /**
     * <p>The client-generated request ID, returned from the request.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. The value is <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The method of the SSE frame.</p>
     * 
     * <strong>example:</strong>
     * <p>session/update</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The parameters of the SSE frame.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;af4f5ef8-e8f5-481c-ad1f-94886c6c0aed&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello world&quot;}}}</p>
     */
    @NameInMap("Params")
    public Object params;

    /**
     * <p>The unique request ID generated for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>0D41C608-0C60-5EB0-B986-1460909CF642</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result object of the SSE frame. This field is present when the operation is successful.</p>
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
     * <p>1769479322828</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

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

    public LoadAgentSessionResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
