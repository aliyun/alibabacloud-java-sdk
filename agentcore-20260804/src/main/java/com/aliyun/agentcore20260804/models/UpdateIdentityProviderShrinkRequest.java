// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderShrinkRequest extends TeaModel {
    /**
     * <p>The configuration fields to be modified. For DingTalk and Feishu, you must submit at least one of the following fields: loginEnabled, syncEnabled, metadata, and syncScope. For CustomSSO, use the protocol, saml, and loginEnabled fields. You cannot submit the vendor metadata, syncEnabled, or syncScope fields.</p>
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
