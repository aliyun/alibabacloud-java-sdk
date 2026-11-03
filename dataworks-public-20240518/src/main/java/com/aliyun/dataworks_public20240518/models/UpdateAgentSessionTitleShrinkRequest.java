// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateAgentSessionTitleShrinkRequest extends TeaModel {
    /**
     * <p>The JSON-RPC correlation ID for the current request. It is specified by the caller and used to correlate the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>updateagentsessiontitle-rpc-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Set the value to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The request parameters for modifying the session title, including the target session ID and the new title.</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static UpdateAgentSessionTitleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentSessionTitleShrinkRequest self = new UpdateAgentSessionTitleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentSessionTitleShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAgentSessionTitleShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public UpdateAgentSessionTitleShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
