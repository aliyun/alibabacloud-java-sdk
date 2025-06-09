// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetCatalogTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1749160909000</p>
     */
    @NameInMap("expiresAtMillis")
    public Long expiresAtMillis;

    @NameInMap("token")
    public java.util.Map<String, String> token;

    public static GetCatalogTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogTokenResponseBody self = new GetCatalogTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogTokenResponseBody setExpiresAtMillis(Long expiresAtMillis) {
        this.expiresAtMillis = expiresAtMillis;
        return this;
    }
    public Long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    public GetCatalogTokenResponseBody setToken(java.util.Map<String, String> token) {
        this.token = token;
        return this;
    }
    public java.util.Map<String, String> getToken() {
        return this.token;
    }

}
