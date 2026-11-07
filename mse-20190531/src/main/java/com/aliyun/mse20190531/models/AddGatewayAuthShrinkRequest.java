// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthShrinkRequest extends TeaModel {
    /**
     * <p>The language of the returned result. Valid values:</p>
     * <ul>
     * <li>zh: Chinese. This is the default value.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The YAML configuration for the complex mode.</p>
     * 
     * <strong>example:</strong>
     * <p>permissions:</p>
     * <ul>
     * <li>not_rule:
     *   or_rules:
     * rules:
     * - and_rules:
     *     rules:
     *     - url_path:
     *         path:
     *           ignore_case: false
     *           prefix: /version
     * - and_rules:
     *     rules:
     *     - url_path:
     *         path:
     *           ignore_case: false
     *           prefix: /header</li>
     * </ul>
     */
    @NameInMap("AuthResourceConfig")
    public String authResourceConfig;

    /**
     * <p>The list of authorization rules for authentication. Multiple rule conditions use the OR operator, and multiple matching items within a rule condition use the AND operator.</p>
     */
    @NameInMap("AuthResourceList")
    public String authResourceListShrink;

    /**
     * <p>The authorization resource mode. Valid values:</p>
     * <ul>
     * <li>0: simple mode.</li>
     * <li>1: complex mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthResourceMode")
    public Integer authResourceMode;

    /**
     * <p>The application ID registered in the service. This parameter is used for OIDC and IDaaS.</p>
     * 
     * <strong>example:</strong>
     * <p>23460e2fdd9bf9ad106****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The application secret registered in the service. This parameter is used for OIDC and IDaaS.</p>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The domain name of the cookie. After authentication, the cookie is sent to the specified domain name to maintain the logon state.</p>
     * <p>For example, if you set the value to <code>Cookie-domain=a.example.com</code>, the cookie is sent to the <code>a.example.com</code> domain name. If you set the value to <code>Cookie-domain=.example.com</code>, the cookie is sent to all subdomains of <code>example.com</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("CookieDomain")
    public String cookieDomain;

    /**
     * <p>The custom authentication information.</p>
     */
    @NameInMap("ExternalAuthZJSON")
    public String externalAuthZJSONShrink;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-*****9b04bb4474cae9d645be850e3d7</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The authorization blacklist and whitelist mode. Valid values:</p>
     * <ul>
     * <li>true: whitelist mode. Hosts and paths in the list can be accessed without verification, while all others require verification.</li>
     * <li>false: blacklist mode. Hosts and paths in the list require verification, while all others can be accessed directly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsWhite")
    public Boolean isWhite;

    /**
     * <p>Used when the authentication type is JWT or OIDC:</p>
     * <ul>
     * <li>JWT: specifies the <code>iss</code> (issuer) claim of the JWT.</li>
     * <li>OIDC: specifies the <code>iss</code> (issuer) claim of the OIDC token.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The JWT public key. JSON format is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keys&quot;:[{&quot;e&quot;:&quot;AQAB&quot;,&quot;kid&quot;:&quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,&quot;kty&quot;:&quot;RSA&quot;,&quot;n&quot;:&quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;}]}</p>
     */
    @NameInMap("Jwks")
    public String jwks;

    /**
     * <p>The URL of the user logon page for the IDaaS instance. This parameter is used for IDaaS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The name of the authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The redirect URL after successful authorization. This parameter is used for OIDC and IDaaS. The value must be the same as the redirect URL configured in OIDC or IDaaS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test-.com/oauth2/callback">https://test-.com/oauth2/callback</a></p>
     */
    @NameInMap("RedirectUrl")
    public String redirectUrl;

    /**
     * <p>The OIDC authorization scopes. This parameter is used for OIDC.</p>
     */
    @NameInMap("ScopesList")
    public String scopesListShrink;

    /**
     * <p>An unavailable parameter. You do not need to specify this parameter. By default, authentication is disabled after it is created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>Used when the authentication type is JWT. Specifies the <code>sub</code> (subject) claim of the JWT. Make sure that the value of the <code>sub</code> field in the JWT payload is the same as the value configured here. If this parameter is not specified or is empty, the default value is the same as the value of the Issuer parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:testing@secure.istio.io">testing@secure.istio.io</a></p>
     */
    @NameInMap("Sub")
    public String sub;

    /**
     * <p>The location where the JWT token is stored.</p>
     * <p>By default, the token to be verified is placed in the Authorization header with the Bearer prefix, such as <code>Authorization: Bearer token</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <p>The prefix of the JWT token.</p>
     * <p>By default, the token to be verified is placed in the Authorization header with the Bearer prefix, such as <code>Authorization: Bearer token</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
    @NameInMap("TokenNamePrefix")
    public String tokenNamePrefix;

    /**
     * <p>Specifies whether to pass through the token.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TokenPass")
    public Boolean tokenPass;

    /**
     * <p>The position of the JWT token. Valid values:</p>
     * <ul>
     * <li>HEADER: transmitted in the HTTP header.</li>
     * </ul>
     * <p>By default, the token to be verified is placed in the Authorization header with the Bearer prefix, such as Authorization: Bearer token.</p>
     * 
     * <strong>example:</strong>
     * <p>HEADER</p>
     */
    @NameInMap("TokenPosition")
    public String tokenPosition;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li>JWT</li>
     * <li>OIDC</li>
     * <li>IDaaS</li>
     * <li>ExternalAuthZ (custom authentication service)</li>
     * </ul>
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
