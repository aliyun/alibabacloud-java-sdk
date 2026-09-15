// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelShrinkRequest extends TeaModel {
    /**
     * <p>The model update request body. At least one non-null parameter must be provided among description, contextSize, maxTokens, and capabilities.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client token for idempotency. Not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelShrinkRequest self = new UpdateModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateModelShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
