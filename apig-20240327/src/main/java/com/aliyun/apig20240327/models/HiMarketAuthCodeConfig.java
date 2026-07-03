// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketAuthCodeConfig extends TeaModel {
    /**
     * <p>The OAuth2 authorization endpoint URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/oauth2/authorize">https://idp.example.com/oauth2/authorize</a></p>
     */
    @NameInMap("authorizationEndpoint")
    public String authorizationEndpoint;

    /**
     * <p>The OAuth2 client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>my-client-id</p>
     */
    @NameInMap("clientId")
    public String clientId;

    /**
     * <p>The OAuth2 client secret. The secret is AES-encrypted when stored.</p>
     * 
     * <strong>example:</strong>
     * <p>my-client-secret</p>
     */
    @NameInMap("clientSecret")
    public String clientSecret;

    /**
     * <p>The OIDC issuer URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com">https://idp.example.com</a></p>
     */
    @NameInMap("issuer")
    public String issuer;

    /**
     * <p>The JWKS public key set URI, used for token signature verification.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/.well-known/jwks.json">https://idp.example.com/.well-known/jwks.json</a></p>
     */
    @NameInMap("jwkSetUri")
    public String jwkSetUri;

    /**
     * <p>The OAuth2 callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://gateway.example.com/callback">https://gateway.example.com/callback</a></p>
     */
    @NameInMap("redirectUri")
    public String redirectUri;

    /**
     * <p>The OAuth2 authorization scopes, separated by spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>openid profile email</p>
     */
    @NameInMap("scopes")
    public String scopes;

    /**
     * <p>The OAuth2 token endpoint URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/oauth2/token">https://idp.example.com/oauth2/token</a></p>
     */
    @NameInMap("tokenEndpoint")
    public String tokenEndpoint;

    /**
     * <p>The OIDC UserInfo endpoint URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://idp.example.com/userinfo">https://idp.example.com/userinfo</a></p>
     */
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
