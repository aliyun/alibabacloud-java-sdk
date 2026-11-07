// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthRequest extends TeaModel {
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
    public java.util.List<AddGatewayAuthRequestAuthResourceList> authResourceList;

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
    public AddGatewayAuthRequestExternalAuthZJSON externalAuthZJSON;

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
    public java.util.List<String> scopesList;

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

    public static AddGatewayAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayAuthRequest self = new AddGatewayAuthRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayAuthRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayAuthRequest setAuthResourceConfig(String authResourceConfig) {
        this.authResourceConfig = authResourceConfig;
        return this;
    }
    public String getAuthResourceConfig() {
        return this.authResourceConfig;
    }

    public AddGatewayAuthRequest setAuthResourceList(java.util.List<AddGatewayAuthRequestAuthResourceList> authResourceList) {
        this.authResourceList = authResourceList;
        return this;
    }
    public java.util.List<AddGatewayAuthRequestAuthResourceList> getAuthResourceList() {
        return this.authResourceList;
    }

    public AddGatewayAuthRequest setAuthResourceMode(Integer authResourceMode) {
        this.authResourceMode = authResourceMode;
        return this;
    }
    public Integer getAuthResourceMode() {
        return this.authResourceMode;
    }

    public AddGatewayAuthRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AddGatewayAuthRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public AddGatewayAuthRequest setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
        return this;
    }
    public String getCookieDomain() {
        return this.cookieDomain;
    }

    public AddGatewayAuthRequest setExternalAuthZJSON(AddGatewayAuthRequestExternalAuthZJSON externalAuthZJSON) {
        this.externalAuthZJSON = externalAuthZJSON;
        return this;
    }
    public AddGatewayAuthRequestExternalAuthZJSON getExternalAuthZJSON() {
        return this.externalAuthZJSON;
    }

    public AddGatewayAuthRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayAuthRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public AddGatewayAuthRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public AddGatewayAuthRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public AddGatewayAuthRequest setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public AddGatewayAuthRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayAuthRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public AddGatewayAuthRequest setScopesList(java.util.List<String> scopesList) {
        this.scopesList = scopesList;
        return this;
    }
    public java.util.List<String> getScopesList() {
        return this.scopesList;
    }

    public AddGatewayAuthRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public AddGatewayAuthRequest setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return this.sub;
    }

    public AddGatewayAuthRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public AddGatewayAuthRequest setTokenNamePrefix(String tokenNamePrefix) {
        this.tokenNamePrefix = tokenNamePrefix;
        return this;
    }
    public String getTokenNamePrefix() {
        return this.tokenNamePrefix;
    }

    public AddGatewayAuthRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public AddGatewayAuthRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public AddGatewayAuthRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList extends TeaModel {
        /**
         * <p>The name of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>x-req</p>
         */
        @NameInMap("HeaderKey")
        public String headerKey;

        /**
         * <p>The matching condition. Valid values:</p>
         * <ul>
         * <li>EQUAL: equal to.</li>
         * <li>NOT_EQUAL: not equal to.</li>
         * <li>EXIST: exists.</li>
         * <li>NOT_EXIST: does not exist.</li>
         * <li>INCLUDE: includes.</li>
         * <li>EXCLUDE: excludes.</li>
         * <li>PREFIX: prefix.</li>
         * <li>SUFFIX: suffix.</li>
         * <li>REGREX: regular expression.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("HeaderMethod")
        public String headerMethod;

        /**
         * <p>The value of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("HeaderValue")
        public String headerValue;

        public static AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList self = new AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList();
            return TeaModel.build(map, self);
        }

        public AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList setHeaderMethod(String headerMethod) {
            this.headerMethod = headerMethod;
            return this;
        }
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        public AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class AddGatewayAuthRequestAuthResourceList extends TeaModel {
        /**
         * <p>The request headers of the rule. This parameter is currently only used for custom authentication.</p>
         */
        @NameInMap("AuthResourceHeaderList")
        public java.util.List<AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList> authResourceHeaderList;

        /**
         * <p>The ID of the domain name in the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1765</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>Specifies whether the path is case-sensitive. This parameter is used when creating custom authentication. For other authentication types, case sensitivity is enabled by default. Valid values:</p>
         * <ul>
         * <li>true: case-sensitive.</li>
         * <li>false: case-insensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <p>The matching type for the request path. Valid values:</p>
         * <ul>
         * <li>EQUAL: exact match.</li>
         * <li>PRE: prefix match.</li>
         * <li>ERGULAR: regular expression match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The matching path of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        public static AddGatewayAuthRequestAuthResourceList build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayAuthRequestAuthResourceList self = new AddGatewayAuthRequestAuthResourceList();
            return TeaModel.build(map, self);
        }

        public AddGatewayAuthRequestAuthResourceList setAuthResourceHeaderList(java.util.List<AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList> authResourceHeaderList) {
            this.authResourceHeaderList = authResourceHeaderList;
            return this;
        }
        public java.util.List<AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList> getAuthResourceHeaderList() {
            return this.authResourceHeaderList;
        }

        public AddGatewayAuthRequestAuthResourceList setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public AddGatewayAuthRequestAuthResourceList setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public AddGatewayAuthRequestAuthResourceList setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public AddGatewayAuthRequestAuthResourceList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class AddGatewayAuthRequestExternalAuthZJSON extends TeaModel {
        /**
         * <p>The headers allowed in the authentication request.</p>
         */
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        /**
         * <p>The headers to retain in the authentication response.</p>
         */
        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        /**
         * <p>The maximum number of bytes for the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        /**
         * <p>The custom authentication mode. Valid values:</p>
         * <ul>
         * <li>true: strict mode. If the authentication service is unavailable, such as when a connection fails to be established or a 5xx error is returned, the gateway rejects the client request.</li>
         * <li>false: loose mode. If the authentication service is unavailable, such as when a connection fails to be established or a 5xx error is returned, the gateway allows the client request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        /**
         * <p>The path of the authentication API provided by the authentication service. The API path must match the prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>/auth</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The ID of the authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p>1343</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The timeout period of the authentication service. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The header in the request message that contains the token. Common headers include Authorization and Cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenKey")
        public String tokenKey;

        /**
         * <p>Specifies whether to rematch the route after authentication.</p>
         */
        @NameInMap("WithRematchRoute")
        public Boolean withRematchRoute;

        /**
         * <p>Specifies whether to include the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WithRequestBody")
        public Boolean withRequestBody;

        public static AddGatewayAuthRequestExternalAuthZJSON build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayAuthRequestExternalAuthZJSON self = new AddGatewayAuthRequestExternalAuthZJSON();
            return TeaModel.build(map, self);
        }

        public AddGatewayAuthRequestExternalAuthZJSON setAllowRequestHeaders(java.util.List<String> allowRequestHeaders) {
            this.allowRequestHeaders = allowRequestHeaders;
            return this;
        }
        public java.util.List<String> getAllowRequestHeaders() {
            return this.allowRequestHeaders;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setAllowUpstreamHeaders(java.util.List<String> allowUpstreamHeaders) {
            this.allowUpstreamHeaders = allowUpstreamHeaders;
            return this;
        }
        public java.util.List<String> getAllowUpstreamHeaders() {
            return this.allowUpstreamHeaders;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setBodyMaxBytes(Integer bodyMaxBytes) {
            this.bodyMaxBytes = bodyMaxBytes;
            return this;
        }
        public Integer getBodyMaxBytes() {
            return this.bodyMaxBytes;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setIsRestrict(Boolean isRestrict) {
            this.isRestrict = isRestrict;
            return this;
        }
        public Boolean getIsRestrict() {
            return this.isRestrict;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setTokenKey(String tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }
        public String getTokenKey() {
            return this.tokenKey;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setWithRematchRoute(Boolean withRematchRoute) {
            this.withRematchRoute = withRematchRoute;
            return this;
        }
        public Boolean getWithRematchRoute() {
            return this.withRematchRoute;
        }

        public AddGatewayAuthRequestExternalAuthZJSON setWithRequestBody(Boolean withRequestBody) {
            this.withRequestBody = withRequestBody;
            return this;
        }
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

    }

}
