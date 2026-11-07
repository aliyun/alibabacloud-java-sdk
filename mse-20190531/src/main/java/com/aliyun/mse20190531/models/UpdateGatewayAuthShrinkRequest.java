// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The YAML configuration for complex mode.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;\&quot;</p>
     */
    @NameInMap("AuthResourceConfig")
    public String authResourceConfig;

    /**
     * <p>The list of authorization rules for authentication. Multiple rule conditions have an OR relationship. Multiple matching items within a rule condition have an AND relationship.</p>
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
     * <p>The application ID registered with the service. This parameter is used for OIDC/IDaaS.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mnvxaavggw7hcdcnr6usi6***</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The application secret registered with the OIDC authentication service.</p>
     * 
     * <strong>example:</strong>
     * <p>CS6EYfx3k9yTRR9EtQ2MXWP97P6UAUwFg4teoWJ19Z****</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The cookie domain name. After authentication succeeds, the cookie is sent to the specified domain name to maintain the logon state.</p>
     * <p>Example: If you set <code>Cookie-domain=a.example.com</code>, the cookie is sent to the domain name <code>a.example.com</code>. If you set <code>Cookie-domain=.example.com</code>, the cookie is sent to all subdomains of <code>example.com</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("CookieDomain")
    public String cookieDomain;

    /**
     * <p>The list of resource record IDs to delete.</p>
     */
    @NameInMap("DeleteResourceIdList")
    public String deleteResourceIdListShrink;

    /**
     * <p>The custom authentication information.</p>
     */
    @NameInMap("ExternalAuthZJSON")
    public String externalAuthZJSONShrink;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The authentication rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>719</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The authorization blacklist/whitelist mode. Valid values:</p>
     * <ul>
     * <li>true: whitelist mode. Hosts and paths in the list can be accessed without verification. All others require verification.</li>
     * <li>false: blacklist mode. Hosts and paths in the list require verification. All others can be accessed directly.</li>
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
     * <li>JWT: the iss (issuer) in JWT claims, which specifies the token issuer.</li>
     * <li>OIDC: the iss (issuer) in OIDC claims, which specifies the token issuer.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
     * <p>The user logon page URL of the IDaaS instance. This parameter is used for IDaaS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
     */
    @NameInMap("LoginUrl")
    public String loginUrl;

    /**
     * <p>The authentication name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The redirect URL after successful authorization. This parameter is used for OIDC/IDaaS and must be consistent with the redirect URL configured in OIDC/IDaaS.</p>
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
     * <p>The enabled status. Valid values:</p>
     * <ul>
     * <li>false: disabled.</li>
     * <li>true: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>Used when the authentication type is JWT. The sub (subject) in JWT claims, which specifies the principal. Make sure that the value of the sub field in the JWT payload is consistent with the value configured here. If this parameter is not set or is empty, the value defaults to the value of the Issuer parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("Sub")
    public String sub;

    /**
     * <p>The location where the JWT token is stored.</p>
     * <p>The token parameter information to be verified. By default, the token is placed in the Authorization header with the Bearer prefix. Example: <code>Authorization: Bearer token</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <p>The prefix of the JWT token.</p>
     * <p>The token parameter information to be verified. By default, the token is placed in the Authorization header with the Bearer prefix. Example: <code>Authorization: Bearer token</code>.</p>
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
     * <p>The JWT token type. Valid values:</p>
     * <ul>
     * <li>HEADER: transmitted through a header.</li>
     * </ul>
     * <p>The token parameter information to be verified. By default, the token is placed in the Authorization header with the Bearer prefix. Example: Authorization: Bearer token.</p>
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
     * <li>ExternalAuthZ: a self-managed authentication service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExternalAuthZ</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateGatewayAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthShrinkRequest self = new UpdateGatewayAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthShrinkRequest setAuthResourceConfig(String authResourceConfig) {
        this.authResourceConfig = authResourceConfig;
        return this;
    }
    public String getAuthResourceConfig() {
        return this.authResourceConfig;
    }

    public UpdateGatewayAuthShrinkRequest setAuthResourceListShrink(String authResourceListShrink) {
        this.authResourceListShrink = authResourceListShrink;
        return this;
    }
    public String getAuthResourceListShrink() {
        return this.authResourceListShrink;
    }

    public UpdateGatewayAuthShrinkRequest setAuthResourceMode(Integer authResourceMode) {
        this.authResourceMode = authResourceMode;
        return this;
    }
    public Integer getAuthResourceMode() {
        return this.authResourceMode;
    }

    public UpdateGatewayAuthShrinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateGatewayAuthShrinkRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public UpdateGatewayAuthShrinkRequest setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
        return this;
    }
    public String getCookieDomain() {
        return this.cookieDomain;
    }

    public UpdateGatewayAuthShrinkRequest setDeleteResourceIdListShrink(String deleteResourceIdListShrink) {
        this.deleteResourceIdListShrink = deleteResourceIdListShrink;
        return this;
    }
    public String getDeleteResourceIdListShrink() {
        return this.deleteResourceIdListShrink;
    }

    public UpdateGatewayAuthShrinkRequest setExternalAuthZJSONShrink(String externalAuthZJSONShrink) {
        this.externalAuthZJSONShrink = externalAuthZJSONShrink;
        return this;
    }
    public String getExternalAuthZJSONShrink() {
        return this.externalAuthZJSONShrink;
    }

    public UpdateGatewayAuthShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayAuthShrinkRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public UpdateGatewayAuthShrinkRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public UpdateGatewayAuthShrinkRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public UpdateGatewayAuthShrinkRequest setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public UpdateGatewayAuthShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayAuthShrinkRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public UpdateGatewayAuthShrinkRequest setScopesListShrink(String scopesListShrink) {
        this.scopesListShrink = scopesListShrink;
        return this;
    }
    public String getScopesListShrink() {
        return this.scopesListShrink;
    }

    public UpdateGatewayAuthShrinkRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public UpdateGatewayAuthShrinkRequest setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return this.sub;
    }

    public UpdateGatewayAuthShrinkRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public UpdateGatewayAuthShrinkRequest setTokenNamePrefix(String tokenNamePrefix) {
        this.tokenNamePrefix = tokenNamePrefix;
        return this;
    }
    public String getTokenNamePrefix() {
        return this.tokenNamePrefix;
    }

    public UpdateGatewayAuthShrinkRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public UpdateGatewayAuthShrinkRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public UpdateGatewayAuthShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
