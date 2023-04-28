// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddAuthResourceRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AuthId")
    public Long authId;

    @NameInMap("AuthResourceHeaderList")
    public java.util.List<AddAuthResourceRequestAuthResourceHeaderList> authResourceHeaderList;

    @NameInMap("DomainId")
    public Long domainId;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("IgnoreCase")
    public Boolean ignoreCase;

    @NameInMap("MatchType")
    public String matchType;

    @NameInMap("Path")
    public String path;

    public static AddAuthResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthResourceRequest self = new AddAuthResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddAuthResourceRequest setAuthId(Long authId) {
        this.authId = authId;
        return this;
    }
    public Long getAuthId() {
        return this.authId;
    }

    public AddAuthResourceRequest setAuthResourceHeaderList(java.util.List<AddAuthResourceRequestAuthResourceHeaderList> authResourceHeaderList) {
        this.authResourceHeaderList = authResourceHeaderList;
        return this;
    }
    public java.util.List<AddAuthResourceRequestAuthResourceHeaderList> getAuthResourceHeaderList() {
        return this.authResourceHeaderList;
    }

    public AddAuthResourceRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public AddAuthResourceRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddAuthResourceRequest setIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }
    public Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public AddAuthResourceRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public AddAuthResourceRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public static class AddAuthResourceRequestAuthResourceHeaderList extends TeaModel {
        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("HeaderMethod")
        public String headerMethod;

        @NameInMap("HeaderValue")
        public String headerValue;

        public static AddAuthResourceRequestAuthResourceHeaderList build(java.util.Map<String, ?> map) throws Exception {
            AddAuthResourceRequestAuthResourceHeaderList self = new AddAuthResourceRequestAuthResourceHeaderList();
            return TeaModel.build(map, self);
        }

        public AddAuthResourceRequestAuthResourceHeaderList setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public AddAuthResourceRequestAuthResourceHeaderList setHeaderMethod(String headerMethod) {
            this.headerMethod = headerMethod;
            return this;
        }
        public String getHeaderMethod() {
            return this.headerMethod;
        }

        public AddAuthResourceRequestAuthResourceHeaderList setHeaderValue(String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public String getHeaderValue() {
            return this.headerValue;
        }

    }

}
