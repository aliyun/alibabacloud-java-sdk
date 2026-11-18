// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class PromptAgentSessionShrinkRequest extends TeaModel {
    /**
     * <p>The client call identifier used to associate the current response. This parameter does not provide idempotency guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Set this parameter to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The structure of the business parameters. For core nested fields, refer to the supplementary instructions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;prompt&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Explain the issue of accessing the first item when a Python list is empty, and provide modification suggestions.&quot;}]}</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static PromptAgentSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PromptAgentSessionShrinkRequest self = new PromptAgentSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PromptAgentSessionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PromptAgentSessionShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public PromptAgentSessionShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
