// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionTokenUsageShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1033814166</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    @NameInMap("Params")
    public String paramsShrink;

    public static GetAgentSessionTokenUsageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionTokenUsageShrinkRequest self = new GetAgentSessionTokenUsageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionTokenUsageShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAgentSessionTokenUsageShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public GetAgentSessionTokenUsageShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
