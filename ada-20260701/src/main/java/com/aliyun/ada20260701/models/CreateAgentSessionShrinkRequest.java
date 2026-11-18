// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateAgentSessionShrinkRequest extends TeaModel {
    /**
     * <p>The correlation identifier for this call. It is echoed in the response and does not provide idempotency guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Set the value to <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameter object. For nested fields, see the supplementary description of request parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;clientToken&quot;:&quot;create-review-001&quot;,&quot;_meta&quot;:{&quot;agent&quot;:{&quot;agentName&quot;:&quot;review-agent-demo&quot;},&quot;initialConfigOptions&quot;:{&quot;approvalMode&quot;:&quot;default&quot;}}}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static CreateAgentSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSessionShrinkRequest self = new CreateAgentSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSessionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAgentSessionShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public CreateAgentSessionShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
