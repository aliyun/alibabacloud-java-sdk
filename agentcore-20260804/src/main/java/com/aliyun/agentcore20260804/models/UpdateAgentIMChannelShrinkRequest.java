// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAgentIMChannelShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The reserved idempotency token. The backend does not provide persistent idempotency guarantees in this phase.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateAgentIMChannelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentIMChannelShrinkRequest self = new UpdateAgentIMChannelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentIMChannelShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateAgentIMChannelShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
