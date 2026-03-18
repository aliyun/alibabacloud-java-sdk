// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainJwtAuthenticationTokenByDerivedShortTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-Nx2vzxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("derivedShortToken")
    public String derivedShortToken;

    public static ObtainJwtAuthenticationTokenByDerivedShortTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainJwtAuthenticationTokenByDerivedShortTokenRequest self = new ObtainJwtAuthenticationTokenByDerivedShortTokenRequest();
        return TeaModel.build(map, self);
    }

    public ObtainJwtAuthenticationTokenByDerivedShortTokenRequest setDerivedShortToken(String derivedShortToken) {
        this.derivedShortToken = derivedShortToken;
        return this;
    }
    public String getDerivedShortToken() {
        return this.derivedShortToken;
    }

}
