// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class SetAgentSessionModelResponseBody extends TeaModel {
    /**
     * <p>The defined JSON-RPC response structure. For more information about the core nested fields, see the supplementary description.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;jsonrpc&quot;:&quot;2.0&quot;,&quot;id&quot;:&quot;request-001&quot;,&quot;result&quot;:{&quot;modelId&quot;:&quot;text-model-example&quot;,&quot;thinkingLevel&quot;:&quot;off&quot;,&quot;thinkingLevels&quot;:[&quot;off&quot;,&quot;low&quot;,&quot;medium&quot;,&quot;high&quot;]}}</p>
     */
    @NameInMap("JsonRpcResponse")
    public Object jsonRpcResponse;

    /**
     * <p>The ID of the current request, which is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the setting is successful. The value is true if the setting is successful. Read the actual model and thinking level from the business result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetAgentSessionModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAgentSessionModelResponseBody self = new SetAgentSessionModelResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAgentSessionModelResponseBody setJsonRpcResponse(Object jsonRpcResponse) {
        this.jsonRpcResponse = jsonRpcResponse;
        return this;
    }
    public Object getJsonRpcResponse() {
        return this.jsonRpcResponse;
    }

    public SetAgentSessionModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAgentSessionModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
