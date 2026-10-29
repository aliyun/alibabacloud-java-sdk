// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMShrinkRequest extends TeaModel {
    /**
     * <p>Submits the business parameters as described in this API. The body parameters of the public API are mapped to the backend wrapper by the gateway. Do not mix them with the backend direct connection body wrapper.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateIdentityProviderSCIMShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderSCIMShrinkRequest self = new UpdateIdentityProviderSCIMShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderSCIMShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
