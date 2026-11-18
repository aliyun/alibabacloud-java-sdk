// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The response object. The business result is located in <code>result</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;jsonrpc&quot;:&quot;2.0&quot;,&quot;id&quot;:&quot;request-001&quot;,&quot;result&quot;:{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;title&quot;:&quot;Code review&quot;,&quot;displayName&quot;:&quot;Code review&quot;,&quot;agentName&quot;:&quot;review-agent-demo&quot;,&quot;createdAtMs&quot;:1793232000000,&quot;lastMessageAtMs&quot;:1793232060000}}</p>
     */
    @NameInMap("JsonRpcResponse")
    public Object jsonRpcResponse;

    /**
     * <p>The server-side request ID, which is used to troubleshoot this call.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionResponseBody self = new GetAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionResponseBody setJsonRpcResponse(Object jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public Object getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public GetAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
