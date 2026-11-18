// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class ReplyAgentSessionShrinkRequest extends TeaModel {
    /**
     * <p>The client call identifier used to associate the current response. This parameter does not provide idempotence guarantees.</p>
     * 
     * <strong>example:</strong>
     * <p>request-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Set this parameter to <code>2.0</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameter structure. For core nested fields, see the supplementary description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;permissionRequestId&quot;:&quot;permission-example&quot;,&quot;outcome&quot;:{&quot;outcome&quot;:&quot;selected&quot;,&quot;optionId&quot;:&quot;allow_once&quot;}}</p>
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
