// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PromptAgentSessionShrinkRequest extends TeaModel {
    /**
     * <p>The ID passed in by the caller. The value is returned as-is in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>1021418411</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameters.</p>
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
