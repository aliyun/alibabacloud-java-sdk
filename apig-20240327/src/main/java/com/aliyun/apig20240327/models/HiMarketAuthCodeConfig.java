// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketAuthCodeConfig extends TeaModel {
    /**
     * <p>The URL of the identity provider\&quot;s authorization endpoint. Your application redirects users to this URL to sign in and grant consent.</p>
     */
    @NameInMap("authorizationEndpoint")
    public String authorizationEndpoint;

    /**
     * <p>The unique identifier for your application. The identity provider assigns this ID when you register your application.</p>
     */
    @NameInMap("clientId")
    public String clientId;

    /**
     * <p>The secret key for your application. This secret authenticates your application with the identity provider.</p>
     */
    @NameInMap("clientSecret")
    public String clientSecret;

    /**
     * <p>The URL of the identity provider that issues the tokens. This URL uniquely identifies the provider.</p>
     */
    @NameInMap("issuer")
    public String issuer;

    /**
     * <p>The URL of the identity provider\&quot;s JSON Web Key Set (JWKS) document. This document contains the public signing keys for token validation.</p>
     */
    @NameInMap("jwkSetUri")
    public String jwkSetUri;

    /**
     * <p>The URL where the identity provider redirects the user after authorizing your application. This URL must be registered in your application settings with the identity provider.</p>
     */
    @NameInMap("redirectUri")
    public String redirectUri;

    /**
     * <p>A space-separated list of requested permissions. For example: <code>openid profile</code>.</p>
     */
    @NameInMap("scopes")
    public String scopes;

    /**
     * <p>The URL of the identity provider\&quot;s token endpoint. Your application uses this endpoint to exchange an authorization code for an access token.</p>
     */
    @NameInMap("tokenEndpoint")
    public String tokenEndpoint;

    /**
     * <p>The URL of the identity provider\&quot;s user info endpoint. Your application can use this endpoint to retrieve the authenticated user\&quot;s profile information.</p>
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
