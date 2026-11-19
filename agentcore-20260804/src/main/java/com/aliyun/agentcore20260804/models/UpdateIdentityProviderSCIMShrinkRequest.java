// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderSCIMShrinkRequest extends TeaModel {
    /**
     * <p>Submit business parameters as described in this operation. For public API operations, body parameters are mapped to backend wrappers by the gateway. Do not mix them with direct backend body wrappers.</p>
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
