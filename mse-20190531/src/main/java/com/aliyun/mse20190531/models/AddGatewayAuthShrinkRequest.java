// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The information about the resource to be authorized.</p>
     */
    @NameInMap("AuthResourceList")
    public String authResourceListShrink;

    /**
     * <p>The application ID registered with the OIDC authentication service.</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The application secret registered with the OIDC authentication service.</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The domain name of the cookie. After the authentication is passed, the cookie is sent to the specified domain name to maintain the logon status. For example, if you set `Cookie-domain` to a.example.com, the cookie is sent to the domain name `a.example.com`. If you set `Cookie-domain` to .example.com, the cookie is sent to all subdomains of `example.com`.</p>
     */
    @NameInMap("CookieDomain")
    public String cookieDomain;

    /**
     * <p>The information about the custom authentication service.</p>
     */
    @NameInMap("ExternalAuthZJSON")
    public String externalAuthZJSONShrink;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies whether to enable the whitelist feature.</p>
     */
    @NameInMap("IsWhite")
    public Boolean isWhite;

    /**
     * <p>The iss value of JWT claims, which indicates the issuer. You must make sure that the value of this parameter is the same as the iss value in the payload of JWT claims.</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The JWT public key. The JSON format is supported.</p>
     */
    @NameInMap("Jwks")
    public String jwks;

    /**
     * <p>The URL that is used to log on to the IDaaS instance.</p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The redirect URL.</p>
     */
    @NameInMap("RedirectUrl")
    public String redirectUrl;

    /**
     * <p>The OIDC scope.</p>
     */
    @NameInMap("ScopesList")
    public String scopesListShrink;

    /**
     * <p>The status.</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>The sub value of JWT claims, which indicates the subject. You must make sure that the value of this parameter is the same as the sub value in the payload of JWT claims. If you do not set this parameter or leave it empty, the default value, which is the value of the Issuer parameter, is used.</p>
     */
    @NameInMap("Sub")
    public String sub;

    /**
     * <p>The name of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: `Authorization: Bearer token`.</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <p>The name prefix of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: `Authorization: Bearer token`</p>
     */
    @NameInMap("TokenNamePrefix")
    public String tokenNamePrefix;

    /**
     * <p>Specifies whether to enable pass-through.</p>
     */
    @NameInMap("TokenPass")
    public Boolean tokenPass;

    /**
     * <p>The position of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: `Authorization: Bearer token`.</p>
     */
    @NameInMap("TokenPosition")
    public String tokenPosition;

    /**
     * <p>The authentication type. JSON Web Token (JWT) authentication, OpenID Connect (OIDC) authentication, Identity as a Service (IDaaS) authentication, or custom authentication are supported.</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddGatewayAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayAuthShrinkRequest self = new AddGatewayAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayAuthShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayAuthShrinkRequest setAuthResourceListShrink(String authResourceListShrink) {
        this.authResourceListShrink = authResourceListShrink;
        return this;
    }
    public String getAuthResourceListShrink() {
        return this.authResourceListShrink;
    }

    public AddGatewayAuthShrinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AddGatewayAuthShrinkRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public AddGatewayAuthShrinkRequest setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
        return this;
    }
    public String getCookieDomain() {
        return this.cookieDomain;
    }

    public AddGatewayAuthShrinkRequest setExternalAuthZJSONShrink(String externalAuthZJSONShrink) {
        this.externalAuthZJSONShrink = externalAuthZJSONShrink;
        return this;
    }
    public String getExternalAuthZJSONShrink() {
        return this.externalAuthZJSONShrink;
    }

    public AddGatewayAuthShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayAuthShrinkRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public AddGatewayAuthShrinkRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public AddGatewayAuthShrinkRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public AddGatewayAuthShrinkRequest setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public AddGatewayAuthShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayAuthShrinkRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public AddGatewayAuthShrinkRequest setScopesListShrink(String scopesListShrink) {
        this.scopesListShrink = scopesListShrink;
        return this;
    }
    public String getScopesListShrink() {
        return this.scopesListShrink;
    }

    public AddGatewayAuthShrinkRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public AddGatewayAuthShrinkRequest setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return this.sub;
    }

    public AddGatewayAuthShrinkRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public AddGatewayAuthShrinkRequest setTokenNamePrefix(String tokenNamePrefix) {
        this.tokenNamePrefix = tokenNamePrefix;
        return this;
    }
    public String getTokenNamePrefix() {
        return this.tokenNamePrefix;
    }

    public AddGatewayAuthShrinkRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public AddGatewayAuthShrinkRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public AddGatewayAuthShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
