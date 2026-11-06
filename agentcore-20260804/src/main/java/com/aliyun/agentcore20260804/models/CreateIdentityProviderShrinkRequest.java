// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderShrinkRequest extends TeaModel {
    /**
     * <p>The request body for binding an external identity provider.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static CreateIdentityProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderShrinkRequest self = new CreateIdentityProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
