// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The reserved idempotency token. The backend does not guarantee idempotence in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateExternalAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentShrinkRequest self = new CreateExternalAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateExternalAgentShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
