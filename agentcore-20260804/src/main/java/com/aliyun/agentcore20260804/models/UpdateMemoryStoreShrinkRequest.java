// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMemoryStoreShrinkRequest extends TeaModel {
    /**
     * <p>The update MemoryStore request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client request token.</p>
     * 
     * <strong>example:</strong>
     * <p>memory-store-update-20260909-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateMemoryStoreShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryStoreShrinkRequest self = new UpdateMemoryStoreShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryStoreShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateMemoryStoreShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
