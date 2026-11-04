// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreatePermissionRulesShrinkRequest extends TeaModel {
    /**
     * <p>The request body for creating permission rules.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreatePermissionRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionRulesShrinkRequest self = new CreatePermissionRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePermissionRulesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreatePermissionRulesShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
