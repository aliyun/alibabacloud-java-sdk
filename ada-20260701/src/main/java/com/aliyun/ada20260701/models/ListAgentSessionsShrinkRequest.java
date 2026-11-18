// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ListAgentSessionsShrinkRequest extends TeaModel {
    /**
     * <p>The correlation identifier for this call. This identifier is echoed in the response and does not provide idempotency guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Set this parameter to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameter object. The public fields are only AgentName, MaxResults, and NextToken.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AgentName&quot;:&quot;review-agent-demo&quot;,&quot;MaxResults&quot;:20}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static ListAgentSessionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionsShrinkRequest self = new ListAgentSessionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionsShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAgentSessionsShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ListAgentSessionsShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
