// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateWorkspaceShrinkRequest extends TeaModel {
    /**
     * <p>The request body for creating a workspace.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-create-20260805-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceShrinkRequest self = new CreateWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateWorkspaceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
