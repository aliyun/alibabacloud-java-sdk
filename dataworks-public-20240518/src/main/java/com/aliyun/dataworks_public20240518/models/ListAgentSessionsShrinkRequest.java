// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionsShrinkRequest extends TeaModel {
    /**
     * <p>The ID provided by the caller. The value is returned as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>676303114031776</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. The value must be <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>Business parameters.</p>
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
