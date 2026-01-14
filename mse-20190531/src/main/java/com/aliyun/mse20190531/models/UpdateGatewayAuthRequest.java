// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>\&quot;\&quot;</p>
     */
    @NameInMap("AuthResourceConfig")
    public String authResourceConfig;

    @NameInMap("AuthResourceList")
    public java.util.List<UpdateGatewayAuthRequestAuthResourceList> authResourceList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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

    @NameInMap("DeleteResourceIdList")
    public java.util.List<Long> deleteResourceIdList;

    @NameInMap("ExternalAuthZJSON")
    public UpdateGatewayAuthRequestExternalAuthZJSON externalAuthZJSON;

    /**
     * <strong>example:</strong>
     * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <strong>example:</strong>
     * <p>719</p>
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
     * <p>test</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <strong>example:</strong>
     * <p>{&quot;keys&quot;:[{&quot;e&quot;:&quot;AQAB&quot;,&quot;kid&quot;:&quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,&quot;kty&quot;:&quot;RSA&quot;,&quot;n&quot;:&quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;}]}</p>
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
     * <p><a href="https://test-.com/oauth2/callback">https://test-.com/oauth2/callback</a></p>
     */
    @NameInMap("RedirectUrl")
    public String redirectUrl;

    @NameInMap("ScopesList")
    public java.util.List<String> scopesList;

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
        @NameInMap("AuthResourceHeaderList")
        public java.util.List<UpdateGatewayAuthRequestAuthResourceListAuthResourceHeaderList> authResourceHeaderList;

        /**
         * <strong>example:</strong>
         * <p>1765</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IgnoreCase")
        public Boolean ignoreCase;

        /**
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
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
        @NameInMap("AllowRequestHeaders")
        public java.util.List<String> allowRequestHeaders;

        @NameInMap("AllowUpstreamHeaders")
        public java.util.List<String> allowUpstreamHeaders;

        /**
         * <strong>example:</strong>
         * <p>4000000</p>
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

        /**
         * <strong>example:</strong>
         * <p>37396</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
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
