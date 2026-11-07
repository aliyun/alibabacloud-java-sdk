// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthRequest extends TeaModel {
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
    public java.util.List<UpdateGatewayAuthRequestAuthResourceList> authResourceList;

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
    public java.util.List<Long> deleteResourceIdList;

    /**
     * <p>The custom authentication information.</p>
     */
    @NameInMap("ExternalAuthZJSON")
    public UpdateGatewayAuthRequestExternalAuthZJSON externalAuthZJSON;

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
    public java.util.List<String> scopesList;

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

    public static UpdateGatewayAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthRequest self = new UpdateGatewayAuthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthRequest setAuthResourceConfig(String authResourceConfig) {
        this.authResourceConfig = authResourceConfig;
        return this;
    }
    public String getAuthResourceConfig() {
        return this.authResourceConfig;
    }

    public UpdateGatewayAuthRequest setAuthResourceList(java.util.List<UpdateGatewayAuthRequestAuthResourceList> authResourceList) {
        this.authResourceList = authResourceList;
        return this;
    }
    public java.util.List<UpdateGatewayAuthRequestAuthResourceList> getAuthResourceList() {
        return this.authResourceList;
    }

    public UpdateGatewayAuthRequest setAuthResourceMode(Integer authResourceMode) {
        this.authResourceMode = authResourceMode;
        return this;
    }
    public Integer getAuthResourceMode() {
        return this.authResourceMode;
    }

    public UpdateGatewayAuthRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateGatewayAuthRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public UpdateGatewayAuthRequest setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
        return this;
    }
    public String getCookieDomain() {
        return this.cookieDomain;
    }

    public UpdateGatewayAuthRequest setDeleteResourceIdList(java.util.List<Long> deleteResourceIdList) {
        this.deleteResourceIdList = deleteResourceIdList;
        return this;
    }
    public java.util.List<Long> getDeleteResourceIdList() {
        return this.deleteResourceIdList;
    }

    public UpdateGatewayAuthRequest setExternalAuthZJSON(UpdateGatewayAuthRequestExternalAuthZJSON externalAuthZJSON) {
        this.externalAuthZJSON = externalAuthZJSON;
        return this;
    }
    public UpdateGatewayAuthRequestExternalAuthZJSON getExternalAuthZJSON() {
        return this.externalAuthZJSON;
    }

    public UpdateGatewayAuthRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayAuthRequest setIsWhite(Boolean isWhite) {
        this.isWhite = isWhite;
        return this;
    }
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    public UpdateGatewayAuthRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public UpdateGatewayAuthRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public UpdateGatewayAuthRequest setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }
    public String getLoginUrl() {
        return this.loginUrl;
    }

    public UpdateGatewayAuthRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateGatewayAuthRequest setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public UpdateGatewayAuthRequest setScopesList(java.util.List<String> scopesList) {
        this.scopesList = scopesList;
        return this;
    }
    public java.util.List<String> getScopesList() {
        return this.scopesList;
    }

    public UpdateGatewayAuthRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public UpdateGatewayAuthRequest setSub(String sub) {
        this.sub = sub;
        return this;
    }
    public String getSub() {
        return this.sub;
    }

    public UpdateGatewayAuthRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public UpdateGatewayAuthRequest setTokenNamePrefix(String tokenNamePrefix) {
        this.tokenNamePrefix = tokenNamePrefix;
        return this;
    }
    public String getTokenNamePrefix() {
        return this.tokenNamePrefix;
    }

    public UpdateGatewayAuthRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public UpdateGatewayAuthRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public UpdateGatewayAuthRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList extends TeaModel {
        /**
         * <p>The request header name.</p>
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
         * <li>INCLUDE: contains.</li>
         * <li>EXCLUDE: does not contain.</li>
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

        public static UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList self = new UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList setHeaderMethod(String headerMethod) {
            this.headerMethod = headerMethod;
            return this;
        }
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        public UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class UpdateGatewayAuthRequestAuthResourceList extends TeaModel {
        /**
         * <p>The request headers of the rule. Currently only used for custom authentication.</p>
         */
        @NameInMap("AuthResourceHeaderList")
        public java.util.List<UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList> authResourceHeaderList;

        /**
         * <p>The ID of the domain name in the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1765</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>The resource record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Specifies whether case sensitivity is enabled for the path. This parameter is used when creating custom authentication. Other authentication types enable case sensitivity by default. Valid values:</p>
         * <ul>
         * <li>true: case sensitivity is enabled.</li>
         * <li>false: case sensitivity is disabled.</li>
         * </ul>
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

        public static UpdateGatewayAuthRequestAuthResourceList build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayAuthRequestAuthResourceList self = new UpdateGatewayAuthRequestAuthResourceList();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayAuthRequestAuthResourceList setAuthResourceHeaderList(java.util.List<UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList> authResourceHeaderList) {
            this.authResourceHeaderList = authResourceHeaderList;
            return this;
        }
        public java.util.List<UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList> getAuthResourceHeaderList() {
            return this.authResourceHeaderList;
        }

        public UpdateGatewayAuthRequestAuthResourceList setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public UpdateGatewayAuthRequestAuthResourceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateGatewayAuthRequestAuthResourceList setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public UpdateGatewayAuthRequestAuthResourceList setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateGatewayAuthRequestAuthResourceList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class UpdateGatewayAuthRequestExternalAuthZJSON extends TeaModel {
        /**
         * <p>The allowed request header names.</p>
         */
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        /**
         * <p>The allowed response header names.</p>
         */
        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        /**
         * <p>The maximum number of bytes for the body.</p>
         * 
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        /**
         * <p>The custom authentication mode. Valid values:</p>
         * <ul>
         * <li>true: strict mode. When the authentication service is unavailable (connection establishment fails or a 5xx response is returned), the gateway rejects client requests.</li>
         * <li>false: loose mode. When the authentication service is unavailable (connection establishment fails or a 5xx response is returned), the gateway allows client requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        /**
         * <p>The path of the authentication API provided by the authentication service. The API path must use prefix matching.</p>
         * 
         * <strong>example:</strong>
         * <p>/auth</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The authentication service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37396</p>
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
         * <p>The header in which the token is located in the request message. Common values include Authorization and Cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenKey")
        public String tokenKey;

        /**
         * <p>Specifies whether to re-match routes after authentication is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WithRematchRoute")
        public Boolean withRematchRoute;

        /**
         * <p>Specifies whether to allow carrying the body.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WithRequestBody")
        public Boolean withRequestBody;

        public static UpdateGatewayAuthRequestExternalAuthZJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayAuthRequestExternalAuthZJSON self = new UpdateGatewayAuthRequestExternalAuthZJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setAllowRequestHeaders(java.util.List<String> allowRequestHeaders) {
            this.allowRequestHeaders = allowRequestHeaders;
            return this;
        }
        public java.util.List<String> getAllowRequestHeaders() {
            return this.allowRequestHeaders;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setAllowUpstreamHeaders(java.util.List<String> allowUpstreamHeaders) {
            this.allowUpstreamHeaders = allowUpstreamHeaders;
            return this;
        }
        public java.util.List<String> getAllowUpstreamHeaders() {
            return this.allowUpstreamHeaders;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setBodyMaxBytes(Integer bodyMaxBytes) {
            this.bodyMaxBytes = bodyMaxBytes;
            return this;
        }
        public Integer getBodyMaxBytes() {
            return this.bodyMaxBytes;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setIsRestrict(Boolean isRestrict) {
            this.isRestrict = isRestrict;
            return this;
        }
        public Boolean getIsRestrict() {
            return this.isRestrict;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setTokenKey(String tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }
        public String getTokenKey() {
            return this.tokenKey;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setWithRematchRoute(Boolean withRematchRoute) {
            this.withRematchRoute = withRematchRoute;
            return this;
        }
        public Boolean getWithRematchRoute() {
            return this.withRematchRoute;
        }

        public UpdateGatewayAuthRequestExternalAuthZJSON setWithRequestBody(Boolean withRequestBody) {
            this.withRequestBody = withRequestBody;
            return this;
        }
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

    }

}
