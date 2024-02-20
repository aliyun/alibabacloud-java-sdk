// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The information about the resource to be authorized.</p>
     */
    @NameInMap("AuthResourceList")
    public java.util.List<AddGatewayAuthRequestAuthResourceList> authResourceList;

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
    public AddGatewayAuthRequestExternalAuthZJSON externalAuthZJSON;

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
     * <p>The URL that is used to log on to the IDaaS instance. For more information, see [OAuth2.0 Application User Manual](https://help.aliyun.com/document_detail/193871.html).</p>
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
    public java.util.List<String> scopesList;

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

    public AddGatewayAuthRequest setAuthResourceList(java.util.List<AddGatewayAuthRequestAuthResourceList> authResourceList) {
        this.authResourceList = authResourceList;
        return this;
    }
    public java.util.List<AddGatewayAuthRequestAuthResourceList> getAuthResourceList() {
        return this.authResourceList;
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
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("HeaderMethod")
        public String headerMethod;

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
         */
        @NameInMap("DomainId")
        public Long domainId;

        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The request path.</p>
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

        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        /**
         * <p>Specifies whether the gateway allows a client request when the authentication server is unavailable. If a connection to the authentication server fails to be established or a 5xx error code is returned, the authentication server is unavailable.</p>
         */
        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        /**
         * <p>The path of the authentication API provided by the authentication service. The path supports the prefix match method.</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The ID of the service.</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The timeout period. Unit: seconds.</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The header that stores a token in an authentication request. In most cases, a token is stored in the Authorization or Cookie header.</p>
         */
        @NameInMap("TokenKey")
        public String tokenKey;

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

        public AddGatewayAuthRequestExternalAuthZJSON setWithRequestBody(Boolean withRequestBody) {
            this.withRequestBody = withRequestBody;
            return this;
        }
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

    }

}
