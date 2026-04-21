// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketAuthCodeConfig extends TeaModel {
    @NameInMap("authorizationEndpoint")
    public String authorizationEndpoint;

    @NameInMap("clientId")
    public String clientId;

    @NameInMap("clientSecret")
    public String clientSecret;

    @NameInMap("issuer")
    public String issuer;

    @NameInMap("jwkSetUri")
    public String jwkSetUri;

    @NameInMap("redirectUri")
    public String redirectUri;

    @NameInMap("scopes")
    public String scopes;

    @NameInMap("tokenEndpoint")
    public String tokenEndpoint;

    @NameInMap("userInfoEndpoint")
    public String userInfoEndpoint;

    public static HiMarketAuthCodeConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketAuthCodeConfig self = new HiMarketAuthCodeConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketAuthCodeConfig setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
        return this;
    }
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    public HiMarketAuthCodeConfig setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public HiMarketAuthCodeConfig setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public HiMarketAuthCodeConfig setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public HiMarketAuthCodeConfig setJwkSetUri(String jwkSetUri) {
        this.jwkSetUri = jwkSetUri;
        return this;
    }
    public String getJwkSetUri() {
        return this.jwkSetUri;
    }

    public HiMarketAuthCodeConfig setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public HiMarketAuthCodeConfig setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }
    public String getScopes() {
        return this.scopes;
    }

    public HiMarketAuthCodeConfig setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
        return this;
    }
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    public HiMarketAuthCodeConfig setUserInfoEndpoint(String userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
        return this;
    }
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

}
