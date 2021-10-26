// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponseBody extends TeaModel {
    @NameInMap("customDomains")
    public java.util.List<ListCustomDomainsResponseBodyCustomDomains> customDomains;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListCustomDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsResponseBody self = new ListCustomDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsResponseBody setCustomDomains(java.util.List<ListCustomDomainsResponseBodyCustomDomains> customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public java.util.List<ListCustomDomainsResponseBodyCustomDomains> getCustomDomains() {
        return this.customDomains;
    }

    public ListCustomDomainsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListCustomDomainsResponseBodyCustomDomains extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("apiVersion")
        public String apiVersion;

        @NameInMap("certConfig")
        public CertConfig certConfig;

        @NameInMap("createdTime")
        public String createdTime;

        @NameInMap("domainName")
        public String domainName;

        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("routeConfig")
        public RouteConfig routeConfig;

        public static ListCustomDomainsResponseBodyCustomDomains build(java.util.Map<String, ?> map) throws Exception {
            ListCustomDomainsResponseBodyCustomDomains self = new ListCustomDomainsResponseBodyCustomDomains();
            return TeaModel.build(map, self);
        }

        public ListCustomDomainsResponseBodyCustomDomains setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListCustomDomainsResponseBodyCustomDomains setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListCustomDomainsResponseBodyCustomDomains setCertConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }
        public CertConfig getCertConfig() {
            return this.certConfig;
        }

        public ListCustomDomainsResponseBodyCustomDomains setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListCustomDomainsResponseBodyCustomDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListCustomDomainsResponseBodyCustomDomains setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListCustomDomainsResponseBodyCustomDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListCustomDomainsResponseBodyCustomDomains setRouteConfig(RouteConfig routeConfig) {
            this.routeConfig = routeConfig;
            return this;
        }
        public RouteConfig getRouteConfig() {
            return this.routeConfig;
        }

    }

}
