// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class OAuthCredential extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("createdTime")
    public Long createdTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("expiration")
    public Long expiration;

    @NameInMap("refreshToken")
    public String refreshToken;

    @NameInMap("scope")
    public String scope;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("token")
    public String token;

    @NameInMap("type")
    public String type;

    public static OAuthCredential build(java.util.Map<String, ?> map) throws Exception {
        OAuthCredential self = new OAuthCredential();
        return TeaModel.build(map, self);
    }

    public OAuthCredential setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public OAuthCredential setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public OAuthCredential setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public OAuthCredential setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OAuthCredential setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public OAuthCredential setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
