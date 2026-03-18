// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ReinstateAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("token_type_hint")
    public String tokenTypeHint;

    public static ReinstateAuthenticationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinstateAuthenticationTokenRequest self = new ReinstateAuthenticationTokenRequest();
        return TeaModel.build(map, self);
    }

    public ReinstateAuthenticationTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ReinstateAuthenticationTokenRequest setTokenTypeHint(String tokenTypeHint) {
        this.tokenTypeHint = tokenTypeHint;
        return this;
    }
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

}
