// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderShrinkRequest extends TeaModel {
    /**
     * <p>The request body for updating the external identity provider.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateIdentityProviderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderShrinkRequest self = new UpdateIdentityProviderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
