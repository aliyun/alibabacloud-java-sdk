// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetOIDCProviderRequest extends TeaModel {
    /**
     * <p>The name of the OIDC IdP.</p>
     */
    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static GetOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOIDCProviderRequest self = new GetOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
