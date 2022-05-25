// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RevokeTokenRequest extends TeaModel {
    @NameInMap("client_id")
    public String clientId;

    @NameInMap("client_secret")
    public String clientSecret;

    // 撤销的token
    @NameInMap("token")
    public String token;

    // token类型
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
