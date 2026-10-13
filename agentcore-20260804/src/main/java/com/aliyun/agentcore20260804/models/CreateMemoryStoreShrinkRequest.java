// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMemoryStoreShrinkRequest extends TeaModel {
    /**
     * <p>The request to create a memory store.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client request token.</p>
     * 
     * <strong>example:</strong>
     * <p>memory-store-create-20260909-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateMemoryStoreShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryStoreShrinkRequest self = new CreateMemoryStoreShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryStoreShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateMemoryStoreShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
