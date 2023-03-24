// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteOIDCProviderRequest extends TeaModel {
    /**
     * <p>The name of the OIDC IdP.</p>
     */
    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static DeleteOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOIDCProviderRequest self = new DeleteOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
