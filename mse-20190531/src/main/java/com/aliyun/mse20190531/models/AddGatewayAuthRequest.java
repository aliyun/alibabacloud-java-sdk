// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthRequest extends TeaModel {
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
    public java.util.List<AddGatewayAuthRequestAuthResourceList> authResourceList;

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
    public AddGatewayAuthRequestExternalAuthZJSON externalAuthZJSON;

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
    public java.util.List<String> scopesList;

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
         * <strong>example:</strong>
         * <p>x-req</p>
         */
        @NameInMap("HeaderKey")
        public String headerKey;

        /**
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("HeaderMethod")
        public String headerMethod;

        /**
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
        @NameInMap("AuthResourceHeaderList")
        public java.util.List<AddGatewayAuthRequestAuthResourceListAuthResourceHeaderList> authResourceHeaderList;

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The request path.</p>
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
         * <p>The header that can be carried in an authentication request.</p>
         */
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        /**
         * <p>The header that can be retained in an authentication response.</p>
         */
        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        /**
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        /**
         * <p>Specifies whether the gateway allows a client request when the authentication server is unavailable. If a connection to the authentication server fails to be established or a 5xx error code is returned, the authentication server is unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        /**
         * <p>The path of the authentication API provided by the authentication service. The path supports the prefix match method.</p>
         * 
         * <strong>example:</strong>
         * <p>/auth</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The header that stores a token in an authentication request. In most cases, a token is stored in the Authorization or Cookie header.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenKey")
        public String tokenKey;

        @NameInMap("WithRematchRoute")
        public Boolean withRematchRoute;

        /**
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
