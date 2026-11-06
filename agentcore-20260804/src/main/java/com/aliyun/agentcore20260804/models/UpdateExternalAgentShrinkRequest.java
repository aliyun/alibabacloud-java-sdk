// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateExternalAgentShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The reserved query parameter. The backend does not currently provide idempotence guarantees for deduplication or restoring the original acceptance result based on this identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateExternalAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExternalAgentShrinkRequest self = new UpdateExternalAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExternalAgentShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateExternalAgentShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
