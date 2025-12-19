// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class AuthorizationServerMetadata extends TeaModel {
    @NameInMap("AuthorizationRequest")
    public AuthorizationRequest authorizationRequest;

    @NameInMap("Issuer")
    public String issuer;

    @NameInMap("PKCE")
    public PKCE PKCE;

    @NameInMap("TokenRequest")
    public TokenReqeust tokenRequest;

    public static AuthorizationServerMetadata build(java.util.Map<String, ?> map) throws Exception {
        AuthorizationServerMetadata self = new AuthorizationServerMetadata();
        return TeaModel.build(map, self);
    }

    public AuthorizationServerMetadata setAuthorizationRequest(AuthorizationRequest authorizationRequest) {
        this.authorizationRequest = authorizationRequest;
        return this;
    }
    public AuthorizationRequest getAuthorizationRequest() {
        return this.authorizationRequest;
    }

    public AuthorizationServerMetadata setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public AuthorizationServerMetadata setPKCE(PKCE PKCE) {
        this.PKCE = PKCE;
        return this;
    }
    public PKCE getPKCE() {
        return this.PKCE;
    }

    public AuthorizationServerMetadata setTokenRequest(TokenReqeust tokenRequest) {
        this.tokenRequest = tokenRequest;
        return this;
    }
    public TokenReqeust getTokenRequest() {
        return this.tokenRequest;
    }

}
