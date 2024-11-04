// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class AttachGatewayDomainShrinkRequest extends TeaModel {
    /**
     * <p>The custom domain name information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomDomain")
    public String customDomainShrink;

    public static AttachGatewayDomainShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachGatewayDomainShrinkRequest self = new AttachGatewayDomainShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachGatewayDomainShrinkRequest setCustomDomainShrink(String customDomainShrink) {
        this.customDomainShrink = customDomainShrink;
        return this;
    }
    public String getCustomDomainShrink() {
        return this.customDomainShrink;
    }

}
