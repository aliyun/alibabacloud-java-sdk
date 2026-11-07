// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListGatewayAuthResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Request processed successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EC1EED4A-B147-597B-B949-FD3131AB4298</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthResponseBody self = new ListGatewayAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayAuthResponseBody setData(ListGatewayAuthResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayAuthResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayAuthResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayAuthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayAuthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayAuthResponseBodyDataResultExternalAuthZService extends TeaModel {
        /**
         * <p>The name of the service group.</p>
         * 
         * <strong>example:</strong>
         * <p>com.mse.console.test.3YXO</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The authentication service name.</p>
         * 
         * <strong>example:</strong>
         * <p>updatetime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The source type of the authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static ListGatewayAuthResponseBodyDataResultExternalAuthZService build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthResponseBodyDataResultExternalAuthZService self = new ListGatewayAuthResponseBodyDataResultExternalAuthZService();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZService setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZService setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZService setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class ListGatewayAuthResponseBodyDataResultExternalAuthZ extends TeaModel {
        /**
         * <p>The names of the allowed request headers.</p>
         */
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        /**
         * <p>The names of the allowed response headers.</p>
         */
        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        /**
         * <p>The maximum number of bytes for the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        /**
         * <p>The custom authentication mode. Valid values:</p>
         * <ul>
         * <li>true: strict mode. When the authentication service is unavailable (connection establishment fails or a 5xx status code is returned), the gateway rejects the client request.</li>
         * <li>false: loose mode. When the authentication service is unavailable (connection establishment fails or a 5xx status code is returned), the gateway allows the client request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        /**
         * <p>The path of the authentication API provided by the authentication service. The API path must be prefix-matched.</p>
         * 
         * <strong>example:</strong>
         * <p>/auth</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        /**
         * <p>The authentication service information.</p>
         */
        @NameInMap("Service")
        public ListGatewayAuthResponseBodyDataResultExternalAuthZService service;

        /**
         * <p>The ID of the authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p>45186</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The timeout period of the authentication service. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The token location, which indicates the header in the request message where the token is located. Common values include Authorization and Cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenKey")
        public String tokenKey;

        /**
         * <p>Specifies whether to rematch the route after authentication is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public static ListGatewayAuthResponseBodyDataResultExternalAuthZ build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthResponseBodyDataResultExternalAuthZ self = new ListGatewayAuthResponseBodyDataResultExternalAuthZ();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setAllowRequestHeaders(java.util.List<String> allowRequestHeaders) {
            this.allowRequestHeaders = allowRequestHeaders;
            return this;
        }
        public java.util.List<String> getAllowRequestHeaders() {
            return this.allowRequestHeaders;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setAllowUpstreamHeaders(java.util.List<String> allowUpstreamHeaders) {
            this.allowUpstreamHeaders = allowUpstreamHeaders;
            return this;
        }
        public java.util.List<String> getAllowUpstreamHeaders() {
            return this.allowUpstreamHeaders;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setBodyMaxBytes(Integer bodyMaxBytes) {
            this.bodyMaxBytes = bodyMaxBytes;
            return this;
        }
        public Integer getBodyMaxBytes() {
            return this.bodyMaxBytes;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setIsRestrict(Boolean isRestrict) {
            this.isRestrict = isRestrict;
            return this;
        }
        public Boolean getIsRestrict() {
            return this.isRestrict;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setService(ListGatewayAuthResponseBodyDataResultExternalAuthZService service) {
            this.service = service;
            return this;
        }
        public ListGatewayAuthResponseBodyDataResultExternalAuthZService getService() {
            return this.service;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setTokenKey(String tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }
        public String getTokenKey() {
            return this.tokenKey;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setWithRematchRoute(Boolean withRematchRoute) {
            this.withRematchRoute = withRematchRoute;
            return this;
        }
        public Boolean getWithRematchRoute() {
            return this.withRematchRoute;
        }

        public ListGatewayAuthResponseBodyDataResultExternalAuthZ setWithRequestBody(Boolean withRequestBody) {
            this.withRequestBody = withRequestBody;
            return this;
        }
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

    }

    public static class ListGatewayAuthResponseBodyDataResult extends TeaModel {
        /**
         * <p>The authorization resource mode. Valid values:</p>
         * <ul>
         * <li>0: simple mode.</li>
         * <li>1: complex mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuthResourceMode")
        public Integer authResourceMode;

        /**
         * <p>The application ID registered in the service. This parameter is used for OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mnvxaavggw7hcdcnr6usi6***</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The application secret registered in the service. This parameter is used for OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p>CS6EYfx3k9yTRR9EtQ2MXWP97P6UAUwFg4teoWJ19Z****</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The domain name of the cookie. After authentication, the cookie is sent to the specified domain name to maintain the logon status. This parameter is used for OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("CookieDomain")
        public String cookieDomain;

        /**
         * <p>The custom authentication information.</p>
         */
        @NameInMap("ExternalAuthZ")
        public ListGatewayAuthResponseBodyDataResultExternalAuthZ externalAuthZ;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The authentication ID.</p>
         * 
         * <strong>example:</strong>
         * <p>549</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The authorization blacklists and whitelists mode. Valid values:</p>
         * <ul>
         * <li>true: whitelist mode. Hosts and paths in the whitelist can be accessed without verification, while all other hosts and paths require verification.</li>
         * <li>false: blacklist mode. Hosts and paths in the blacklist require verification, while all other hosts and paths can be accessed directly.</li>
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
         * <li>JWT: the iss (issuer) claim in the JWT, which represents the issuer.</li>
         * <li>OIDC: the iss (issuer) claim in the OIDC token, which represents the issuer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The JWT public key in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;keys\&quot;:[{\&quot;kty\&quot;:\&quot;oct\&quot;,\&quot;k\&quot;:\&quot;9V9lpiuAQsME1efQChI0kEQz6fdVlJbDRFFa1lvEB_A\&quot;,\&quot;alg\&quot;:\&quot;HS256\&quot;}]}</p>
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
         * <p>The name of the authentication rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The redirect URL after successful authorization. This parameter is used for OIDC or IDaaS and must be consistent with the redirect URL configured in OIDC or IDaaS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test.com/oauth2/callback">http://test.com/oauth2/callback</a></p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        /**
         * <p>The OIDC authorization scopes. This parameter is used for OIDC.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;]</p>
         */
        @NameInMap("ScopesList")
        public String scopesList;

        /**
         * <p>The enabling status. Valid values:</p>
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
         * <p>Used when the authentication type is JWT. The sub (subject) claim in the JWT, which represents the subject.</p>
         * 
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <p>The location where the JWT token is stored.</p>
         * <p>By default, the token to be verified is prefixed with Bearer and placed in the Authorization header, for example, <code>Authorization: Bearer token</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenName")
        public String tokenName;

        /**
         * <p>The prefix of the JWT token.</p>
         * <p>By default, the token to be verified is prefixed with Bearer and placed in the Authorization header, for example, <code>Authorization: Bearer token</code>.</p>
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
         * <p>The JWT token position. Valid values:</p>
         * <ul>
         * <li>HEADER: transmitted through the header.</li>
         * </ul>
         * <p>By default, the token to be verified is prefixed with Bearer and placed in the Authorization header, for example, Authorization: Bearer token.</p>
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
         * <li>ExternalAuthZ: self-managed authentication service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JWT</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayAuthResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthResponseBodyDataResult self = new ListGatewayAuthResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthResponseBodyDataResult setAuthResourceMode(Integer authResourceMode) {
            this.authResourceMode = authResourceMode;
            return this;
        }
        public Integer getAuthResourceMode() {
            return this.authResourceMode;
        }

        public ListGatewayAuthResponseBodyDataResult setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListGatewayAuthResponseBodyDataResult setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public ListGatewayAuthResponseBodyDataResult setCookieDomain(String cookieDomain) {
            this.cookieDomain = cookieDomain;
            return this;
        }
        public String getCookieDomain() {
            return this.cookieDomain;
        }

        public ListGatewayAuthResponseBodyDataResult setExternalAuthZ(ListGatewayAuthResponseBodyDataResultExternalAuthZ externalAuthZ) {
            this.externalAuthZ = externalAuthZ;
            return this;
        }
        public ListGatewayAuthResponseBodyDataResultExternalAuthZ getExternalAuthZ() {
            return this.externalAuthZ;
        }

        public ListGatewayAuthResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayAuthResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayAuthResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayAuthResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayAuthResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayAuthResponseBodyDataResult setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public ListGatewayAuthResponseBodyDataResult setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListGatewayAuthResponseBodyDataResult setJwks(String jwks) {
            this.jwks = jwks;
            return this;
        }
        public String getJwks() {
            return this.jwks;
        }

        public ListGatewayAuthResponseBodyDataResult setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public ListGatewayAuthResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayAuthResponseBodyDataResult setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public ListGatewayAuthResponseBodyDataResult setScopesList(String scopesList) {
            this.scopesList = scopesList;
            return this;
        }
        public String getScopesList() {
            return this.scopesList;
        }

        public ListGatewayAuthResponseBodyDataResult setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListGatewayAuthResponseBodyDataResult setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public ListGatewayAuthResponseBodyDataResult setTokenName(String tokenName) {
            this.tokenName = tokenName;
            return this;
        }
        public String getTokenName() {
            return this.tokenName;
        }

        public ListGatewayAuthResponseBodyDataResult setTokenNamePrefix(String tokenNamePrefix) {
            this.tokenNamePrefix = tokenNamePrefix;
            return this;
        }
        public String getTokenNamePrefix() {
            return this.tokenNamePrefix;
        }

        public ListGatewayAuthResponseBodyDataResult setTokenPass(Boolean tokenPass) {
            this.tokenPass = tokenPass;
            return this;
        }
        public Boolean getTokenPass() {
            return this.tokenPass;
        }

        public ListGatewayAuthResponseBodyDataResult setTokenPosition(String tokenPosition) {
            this.tokenPosition = tokenPosition;
            return this;
        }
        public String getTokenPosition() {
            return this.tokenPosition;
        }

        public ListGatewayAuthResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayAuthResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned results.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayAuthResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayAuthResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthResponseBodyData self = new ListGatewayAuthResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayAuthResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayAuthResponseBodyData setResult(java.util.List<ListGatewayAuthResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayAuthResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayAuthResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
