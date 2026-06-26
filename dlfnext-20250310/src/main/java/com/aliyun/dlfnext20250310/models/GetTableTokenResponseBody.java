// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetTableTokenResponseBody extends TeaModel {
    /**
     * <p>The expiration time of the temporary access credential.</p>
     * 
     * <strong>example:</strong>
     * <p>1749160909000</p>
     */
    @NameInMap("expiresAtMillis")
    public Long expiresAtMillis;

    /**
     * <p>The temporary access credential for the catalog hosting the table.</p>
     */
    @NameInMap("token")
    public java.util.Map<String, String> token;

    public static GetTableTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableTokenResponseBody self = new GetTableTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableTokenResponseBody setExpiresAtMillis(Long expiresAtMillis) {
        this.expiresAtMillis = expiresAtMillis;
        return this;
    }
    public Long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    public GetTableTokenResponseBody setToken(java.util.Map<String, String> token) {
        this.token = token;
        return this;
    }
    public java.util.Map<String, String> getToken() {
        return this.token;
    }

}
