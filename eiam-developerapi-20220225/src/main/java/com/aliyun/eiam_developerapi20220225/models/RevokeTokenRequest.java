// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RevokeTokenRequest extends TeaModel {
    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>The client secret.</p>
     * 
     * <strong>example:</strong>
     * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
     */
    @NameInMap("client_secret")
    public String clientSecret;

    /**
     * <p>The token to be revoked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ATxxxx</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <p>The type of the token. Valid values: access_token refresh_token</p>
     * 
     * <strong>example:</strong>
     * <p>access_token</p>
     */
    @NameInMap("token_type_hint")
    public String tokenTypeHint;

    public static RevokeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTokenRequest self = new RevokeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RevokeTokenRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public RevokeTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RevokeTokenRequest setTokenTypeHint(String tokenTypeHint) {
        this.tokenTypeHint = tokenTypeHint;
        return this;
    }
    public String getTokenTypeHint() {
        return this.tokenTypeHint;
    }

}
