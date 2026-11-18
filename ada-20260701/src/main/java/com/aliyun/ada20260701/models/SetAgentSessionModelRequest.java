// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class SetAgentSessionModelRequest extends TeaModel {
    /**
     * <p>The client request identifier, which is echoed in the response. It is used to associate this call and does not have idempotent semantics.</p>
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
     * <p>The defined business parameter structure. For more information about the core nested fields, see the supplementary description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;0123456789abcdef0123456789abcdef&quot;,&quot;modelId&quot;:&quot;text-model-example&quot;}</p>
     */
    @NameInMap("Params")
    public Object params;

    public static SetAgentSessionModelRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAgentSessionModelRequest self = new SetAgentSessionModelRequest();
        return TeaModel.build(map, self);
    }

    public SetAgentSessionModelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetAgentSessionModelRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public SetAgentSessionModelRequest setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

}
