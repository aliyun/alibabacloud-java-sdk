// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CancelAgentSessionShrinkRequest extends TeaModel {
    /**
     * <p>The correlation identifier for this call, which is echoed in the response. This parameter does not provide idempotence guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Set this parameter to <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameter object. For nested fields, refer to the supplementary description of request parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;_meta&quot;:{&quot;promptId&quot;:&quot;prompt-example-001&quot;}}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static CancelAgentSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAgentSessionShrinkRequest self = new CancelAgentSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelAgentSessionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelAgentSessionShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public CancelAgentSessionShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
