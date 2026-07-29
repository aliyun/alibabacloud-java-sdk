// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ValidateAuthenticationTokenRequest extends TeaModel {
    /**
     * <p>The original authentication token.</p>
     * <blockquote>
     * <p>Pass either the original authentication token or a derived short token.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>A hint about the type of the authentication token.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>No value is currently required for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("token_type_hint")
    public String tokenTypeHint;

    public static ValidateAuthenticationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateAuthenticationTokenRequest self = new ValidateAuthenticationTokenRequest();
        return TeaModel.build(map, self);
    }

    public ValidateAuthenticationTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ValidateAuthenticationTokenRequest setTokenTypeHint(String tokenTypeHint) {
        this.tokenTypeHint = tokenTypeHint;
        return this;
    }
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

}
