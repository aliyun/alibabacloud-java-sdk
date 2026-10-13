// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class InitiateOidcAuthRequest extends TeaModel {
    /**
     * <p>The OIDC provider identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>provider-xxxxxxxx</p>
     */
    @NameInMap("provider")
    public String provider;

    public static InitiateOidcAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        InitiateOidcAuthRequest self = new InitiateOidcAuthRequest();
        return TeaModel.build(map, self);
    }

    public InitiateOidcAuthRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
