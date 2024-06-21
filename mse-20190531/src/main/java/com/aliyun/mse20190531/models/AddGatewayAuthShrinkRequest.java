// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AuthResourceConfig")
    public String authResourceConfig;

    /**
     * <p>The information about the resource to be authorized.</p>
     */
    @NameInMap("AuthResourceList")
    public String authResourceListShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthResourceMode")
    public Integer authResourceMode;

    /**
     * <p>The application ID registered with the OIDC authentication service.</p>
     * 
     * <strong>example:</strong>
     * <p>23460e2fdd9bf9ad106****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The application secret registered with the OIDC authentication service.</p>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The domain name of the cookie. After the authentication is passed, the cookie is sent to the specified domain name to maintain the logon status. For example, if you set <code>Cookie-domain</code> to a.example.com, the cookie is sent to the domain name <code>a.example.com</code>. If you set <code>Cookie-domain</code> to .example.com, the cookie is sent to all subdomains of <code>example.com</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
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
     * 
     * <strong>example:</strong>
     * <p>gw-492af9b04bb4474cae9d645be850e3d7</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies whether to enable the whitelist feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsWhite")
    public Boolean isWhite;

    /**
     * <p>The iss value of JWT claims, which indicates the issuer. You must make sure that the value of this parameter is the same as the iss value in the payload of JWT claims.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:testing@secure.istio.io">testing@secure.istio.io</a></p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The JWT public key. The JSON format is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keys&quot;:[{&quot;e&quot;:&quot;AQAB&quot;,&quot;kid&quot;:&quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,&quot;kty&quot;:&quot;RSA&quot;,&quot;n&quot;:&quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;}]}</p>
     */
    @NameInMap("Jwks")
    public String jwks;

    /**
     * <p>The URL that is used to log on to the IDaaS instance.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>jwt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The redirect URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test-.com/oauth2/callback">https://test-.com/oauth2/callback</a></p>
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
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>The sub value of JWT claims, which indicates the subject. You must make sure that the value of this parameter is the same as the sub value in the payload of JWT claims. If you do not set this parameter or leave it empty, the default value, which is the value of the Issuer parameter, is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:testing@secure.istio.io">testing@secure.istio.io</a></p>
     */
    @NameInMap("Sub")
    public String sub;

    /**
     * <p>The name of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: <code>Authorization: Bearer token</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <p>The name prefix of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: <code>Authorization: Bearer token</code></p>
     * 
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("TokenNamePrefix")
    public String tokenNamePrefix;

    /**
     * <p>Specifies whether to enable pass-through.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TokenPass")
    public Boolean tokenPass;

    /**
     * <p>The position of the parameter that is required to verify a token. By default, a token is prefixed with Bearer and stored in the authorization header. Example: <code>Authorization: Bearer token</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>HEADER</p>
     */
    @NameInMap("TokenPosition")
    public String tokenPosition;

    /**
     * <p>The authentication type. JSON Web Token (JWT) authentication, OpenID Connect (OIDC) authentication, Identity as a Service (IDaaS) authentication, or custom authentication are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>JWT</p>
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

    public AddGatewayAuthShrinkRequest setAuthResourceConfig(String authResourceConfig) {
        this.authResourceConfig = authResourceConfig;
        return this;
    }
    public String getAuthResourceConfig() {
        return this.authResourceConfig;
    }

    public AddGatewayAuthShrinkRequest setAuthResourceListShrink(String authResourceListShrink) {
        this.authResourceListShrink = authResourceListShrink;
        return this;
    }
    public String getAuthResourceListShrink() {
        return this.authResourceListShrink;
    }

    public AddGatewayAuthShrinkRequest setAuthResourceMode(Integer authResourceMode) {
        this.authResourceMode = authResourceMode;
        return this;
    }
    public Integer getAuthResourceMode() {
        return this.authResourceMode;
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
