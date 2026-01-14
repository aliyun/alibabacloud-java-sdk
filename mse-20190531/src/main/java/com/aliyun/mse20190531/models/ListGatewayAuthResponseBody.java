// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListGatewayAuthResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
         * <strong>example:</strong>
         * <p>com.mse.console.test.3YXO</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>updatetime</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
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
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        /**
         * <strong>example:</strong>
         * <p>/auth</p>
         */
        @NameInMap("PrefixPath")
        public String prefixPath;

        @NameInMap("Service")
        public ListGatewayAuthResponseBodyDataResultExternalAuthZService service;

        /**
         * <strong>example:</strong>
         * <p>45186</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenKey")
        public String tokenKey;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WithRematchRoute")
        public Boolean withRematchRoute;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AuthResourceMode")
        public Integer authResourceMode;

        /**
         * <strong>example:</strong>
         * <p>app_mnvxaavggw7hcdcnr6usi6***</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>CS6EYfx3k9yTRR9EtQ2MXWP97P6UAUwFg4teoWJ19Z****</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("CookieDomain")
        public String cookieDomain;

        @NameInMap("ExternalAuthZ")
        public ListGatewayAuthResponseBodyDataResultExternalAuthZ externalAuthZ;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>549</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/auth">https://example.com/auth</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;keys\&quot;:[{\&quot;kty\&quot;:\&quot;oct\&quot;,\&quot;k\&quot;:\&quot;9V9lpiuAQsME1efQChI0kEQz6fdVlJbDRFFa1lvEB_A\&quot;,\&quot;alg\&quot;:\&quot;HS256\&quot;}]}</p>
         */
        @NameInMap("Jwks")
        public String jwks;

        /**
         * <strong>example:</strong>
         * <p><a href="https://daxxxxcn.aliyunidaas.com/">https://daxxxxcn.aliyunidaas.com/</a></p>
         */
        @NameInMap("LoginUrl")
        public String loginUrl;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p><a href="http://test.com/oauth2/callback">http://test.com/oauth2/callback</a></p>
         */
        @NameInMap("RedirectUrl")
        public String redirectUrl;

        /**
         * <strong>example:</strong>
         * <p>[&quot;openid&quot;]</p>
         */
        @NameInMap("ScopesList")
        public String scopesList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <strong>example:</strong>
         * <p>example-app</p>
         */
        @NameInMap("Sub")
        public String sub;

        /**
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("TokenName")
        public String tokenName;

        /**
         * <strong>example:</strong>
         * <p>Bearer</p>
         */
        @NameInMap("TokenNamePrefix")
        public String tokenNamePrefix;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TokenPass")
        public Boolean tokenPass;

        /**
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("TokenPosition")
        public String tokenPosition;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListGatewayAuthResponseBodyDataResult> result;

        /**
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
