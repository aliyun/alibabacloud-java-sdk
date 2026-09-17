// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ReplyAgentSessionShrinkRequest extends TeaModel {
    /**
     * <p>The JSON-RPC correlation ID for this reply request. The response returns this value as-is. This is different from PermissionRequestId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reply-rpc-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. Fixed value: 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The user interaction reply parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static ReplyAgentSessionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplyAgentSessionShrinkRequest self = new ReplyAgentSessionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplyAgentSessionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReplyAgentSessionShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public ReplyAgentSessionShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
