// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceShrinkRequest extends TeaModel {
    /**
     * <p>The request body for updating a workspace.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-update-20260805-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceShrinkRequest self = new UpdateWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateWorkspaceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
