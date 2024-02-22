// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayAuthDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetGatewayAuthDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayAuthDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayAuthDetailResponseBody self = new GetGatewayAuthDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayAuthDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayAuthDetailResponseBody setData(GetGatewayAuthDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayAuthDetailResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayAuthDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayAuthDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayAuthDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayAuthDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayAuthDetailResponseBodyDataExternalAuthZService extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("SourceType")
        public String sourceType;

        public static GetGatewayAuthDetailResponseBodyDataExternalAuthZService build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthDetailResponseBodyDataExternalAuthZService self = new GetGatewayAuthDetailResponseBodyDataExternalAuthZService();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZService setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZService setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZService setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class GetGatewayAuthDetailResponseBodyDataExternalAuthZ extends TeaModel {
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        @NameInMap("BodyMaxBytes")
        public Integer bodyMaxBytes;

        @NameInMap("IsRestrict")
        public Boolean isRestrict;

        @NameInMap("PrefixPath")
        public String prefixPath;

        @NameInMap("Service")
        public GetGatewayAuthDetailResponseBodyDataExternalAuthZService service;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("TokenKey")
        public String tokenKey;

        @NameInMap("WithRequestBody")
        public Boolean withRequestBody;

        public static GetGatewayAuthDetailResponseBodyDataExternalAuthZ build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthDetailResponseBodyDataExternalAuthZ self = new GetGatewayAuthDetailResponseBodyDataExternalAuthZ();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setAllowRequestHeaders(java.util.List<String> allowRequestHeaders) {
            this.allowRequestHeaders = allowRequestHeaders;
            return this;
        }
        public java.util.List<String> getAllowRequestHeaders() {
            return this.allowRequestHeaders;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setAllowUpstreamHeaders(java.util.List<String> allowUpstreamHeaders) {
            this.allowUpstreamHeaders = allowUpstreamHeaders;
            return this;
        }
        public java.util.List<String> getAllowUpstreamHeaders() {
            return this.allowUpstreamHeaders;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setBodyMaxBytes(Integer bodyMaxBytes) {
            this.bodyMaxBytes = bodyMaxBytes;
            return this;
        }
        public Integer getBodyMaxBytes() {
            return this.bodyMaxBytes;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setIsRestrict(Boolean isRestrict) {
            this.isRestrict = isRestrict;
            return this;
        }
        public Boolean getIsRestrict() {
            return this.isRestrict;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setPrefixPath(String prefixPath) {
            this.prefixPath = prefixPath;
            return this;
        }
        public String getPrefixPath() {
            return this.prefixPath;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setService(GetGatewayAuthDetailResponseBodyDataExternalAuthZService service) {
            this.service = service;
            return this;
        }
        public GetGatewayAuthDetailResponseBodyDataExternalAuthZService getService() {
            return this.service;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setTokenKey(String tokenKey) {
            this.tokenKey = tokenKey;
            return this;
        }
        public String getTokenKey() {
            return this.tokenKey;
        }

        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ setWithRequestBody(Boolean withRequestBody) {
            this.withRequestBody = withRequestBody;
            return this;
        }
        public Boolean getWithRequestBody() {
            return this.withRequestBody;
        }

    }

    public static class GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("HeaderMethod")
        public String headerMethod;

        @NameInMap("HeaderValue")
        public String headerValue;

        public static GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList self = new GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList setHeaderMethod(String headerMethod) {
            this.headerMethod = headerMethod;
            return this;
        }
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

    public static class GetGatewayAuthDetailResponseBodyDataResourceList extends TeaModel {
        @NameInMap("AuthId")
        public Long authId;

        @NameInMap("AuthResourceHeaderList")
        public java.util.List<GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList> authResourceHeaderList;

        @NameInMap("DomainId")
        public Long domainId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        @NameInMap("IsWhite")
        public Boolean isWhite;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Path")
        public String path;

        public static GetGatewayAuthDetailResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthDetailResponseBodyDataResourceList self = new GetGatewayAuthDetailResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setAuthId(Long authId) {
            this.authId = authId;
            return this;
        }
        public Long getAuthId() {
            return this.authId;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setAuthResourceHeaderList(java.util.List<GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList> authResourceHeaderList) {
            this.authResourceHeaderList = authResourceHeaderList;
            return this;
        }
        public java.util.List<GetGatewayAuthDetailResponseBodyDataResourceListAuthResourceHeaderList> getAuthResourceHeaderList() {
            return this.authResourceHeaderList;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetGatewayAuthDetailResponseBodyDataResourceList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetGatewayAuthDetailResponseBodyData extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientSecret")
        public String clientSecret;

        @NameInMap("CookieDomain")
        public String cookieDomain;

        @NameInMap("ExternalAuthZ")
        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ externalAuthZ;

        @NameInMap("GatewayId")
        public Long gatewayId;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsWhite")
        public Boolean isWhite;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("Jwks")
        public String jwks;

        @NameInMap("LoginUrl")
        public String loginUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("RedirectUrl")
        public String redirectUrl;

        @NameInMap("ResourceList")
        public java.util.List<GetGatewayAuthDetailResponseBodyDataResourceList> resourceList;

        @NameInMap("ScopesList")
        public String scopesList;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Sub")
        public String sub;

        @NameInMap("TokenName")
        public String tokenName;

        @NameInMap("TokenNamePrefix")
        public String tokenNamePrefix;

        @NameInMap("TokenPass")
        public Boolean tokenPass;

        @NameInMap("TokenPosition")
        public String tokenPosition;

        @NameInMap("Type")
        public String type;

        public static GetGatewayAuthDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayAuthDetailResponseBodyData self = new GetGatewayAuthDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayAuthDetailResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetGatewayAuthDetailResponseBodyData setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public GetGatewayAuthDetailResponseBodyData setCookieDomain(String cookieDomain) {
            this.cookieDomain = cookieDomain;
            return this;
        }
        public String getCookieDomain() {
            return this.cookieDomain;
        }

        public GetGatewayAuthDetailResponseBodyData setExternalAuthZ(GetGatewayAuthDetailResponseBodyDataExternalAuthZ externalAuthZ) {
            this.externalAuthZ = externalAuthZ;
            return this;
        }
        public GetGatewayAuthDetailResponseBodyDataExternalAuthZ getExternalAuthZ() {
            return this.externalAuthZ;
        }

        public GetGatewayAuthDetailResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayAuthDetailResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayAuthDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayAuthDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayAuthDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayAuthDetailResponseBodyData setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public GetGatewayAuthDetailResponseBodyData setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetGatewayAuthDetailResponseBodyData setJwks(String jwks) {
            this.jwks = jwks;
            return this;
        }
        public String getJwks() {
            return this.jwks;
        }

        public GetGatewayAuthDetailResponseBodyData setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }
        public String getLoginUrl() {
            return this.loginUrl;
        }

        public GetGatewayAuthDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayAuthDetailResponseBodyData setRedirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public GetGatewayAuthDetailResponseBodyData setResourceList(java.util.List<GetGatewayAuthDetailResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetGatewayAuthDetailResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

        public GetGatewayAuthDetailResponseBodyData setScopesList(String scopesList) {
            this.scopesList = scopesList;
            return this;
        }
        public String getScopesList() {
            return this.scopesList;
        }

        public GetGatewayAuthDetailResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetGatewayAuthDetailResponseBodyData setSub(String sub) {
            this.sub = sub;
            return this;
        }
        public String getSub() {
            return this.sub;
        }

        public GetGatewayAuthDetailResponseBodyData setTokenName(String tokenName) {
            this.tokenName = tokenName;
            return this;
        }
        public String getTokenName() {
            return this.tokenName;
        }

        public GetGatewayAuthDetailResponseBodyData setTokenNamePrefix(String tokenNamePrefix) {
            this.tokenNamePrefix = tokenNamePrefix;
            return this;
        }
        public String getTokenNamePrefix() {
            return this.tokenNamePrefix;
        }

        public GetGatewayAuthDetailResponseBodyData setTokenPass(Boolean tokenPass) {
            this.tokenPass = tokenPass;
            return this;
        }
        public Boolean getTokenPass() {
            return this.tokenPass;
        }

        public GetGatewayAuthDetailResponseBodyData setTokenPosition(String tokenPosition) {
            this.tokenPosition = tokenPosition;
            return this;
        }
        public String getTokenPosition() {
            return this.tokenPosition;
        }

        public GetGatewayAuthDetailResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
