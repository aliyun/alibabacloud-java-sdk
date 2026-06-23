// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListAgentSessionArtifactsShrinkRequest extends TeaModel {
    /**
     * <p>The ID passed by the caller. The value is returned as-is in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
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

    public static ListAgentSessionArtifactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSessionArtifactsShrinkRequest self = new ListAgentSessionArtifactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentSessionArtifactsShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAgentSessionArtifactsShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ListAgentSessionArtifactsShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
