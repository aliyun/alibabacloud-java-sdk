// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RevokeAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>Original authentication token.</p>
     * <blockquote>
     * <p>You can pass either the original authentication token or a derived short token.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>Authentication token type hint.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Currently, no value is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("token_type_hint")
    public String tokenTypeHint;

    public static RevokeAuthenticationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeAuthenticationTokenRequest self = new RevokeAuthenticationTokenRequest();
        return TeaModel.build(map, self);
    }

    public RevokeAuthenticationTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RevokeAuthenticationTokenRequest setTokenTypeHint(String tokenTypeHint) {
        this.tokenTypeHint = tokenTypeHint;
        return this;
    }
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

}
