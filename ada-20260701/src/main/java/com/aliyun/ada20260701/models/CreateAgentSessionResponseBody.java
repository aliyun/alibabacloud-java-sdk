// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The response object. The business result is located in <code>result</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;jsonrpc&quot;:&quot;2.0&quot;,&quot;id&quot;:&quot;request-001&quot;,&quot;result&quot;:{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;attached&quot;:false}}</p>
     */
    @NameInMap("JsonRpcResponse")
    public Object jsonRpcResponse;

    /**
     * <p>The server-side request ID. It is used to troubleshoot this call.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Determine the final execution state based on the description of this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSessionResponseBody self = new CreateAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentSessionResponseBody setJsonRpcResponse(Object jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public Object getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public CreateAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
