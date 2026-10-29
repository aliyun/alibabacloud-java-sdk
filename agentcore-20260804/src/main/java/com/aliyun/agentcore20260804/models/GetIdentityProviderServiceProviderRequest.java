// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderServiceProviderRequest extends TeaModel {
    /**
     * <p>The query parameter is required and only supports the exact value SAML. The response returns SAML.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SAML</p>
     */
    @NameInMap("protocol")
    public String protocol;

    public static GetIdentityProviderServiceProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderServiceProviderRequest self = new GetIdentityProviderServiceProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderServiceProviderRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
