// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetAgentSessionArtifactMetaShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>900335678024</p>
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

    public static GetAgentSessionArtifactMetaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSessionArtifactMetaShrinkRequest self = new GetAgentSessionArtifactMetaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentSessionArtifactMetaShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAgentSessionArtifactMetaShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public GetAgentSessionArtifactMetaShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
