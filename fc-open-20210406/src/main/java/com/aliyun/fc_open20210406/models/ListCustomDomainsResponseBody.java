// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponseBody extends TeaModel {
    // The information about custom domain names.
    @NameInMap("customDomains")
    public java.util.List<ListCustomDomainsResponseBodyCustomDomains> customDomains;

    // The token used to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
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
        // The ID of the account.
        @NameInMap("accountId")
        public String accountId;

        // The version of the API.
        @NameInMap("apiVersion")
        public String apiVersion;

        // The configurations of the HTTPS certificate.
        @NameInMap("certConfig")
        public CertConfig certConfig;

        // The time when the domain name was added.
        @NameInMap("createdTime")
        public String createdTime;

        // The domain name.
        @NameInMap("domainName")
        public String domainName;

        // The time when the domain name was last modified.
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        // The protocol types supported by the domain name. Valid values: 
        // 
        // - **HTTP**: Only HTTP is supported. 
        // - **HTTPS**: Only HTTPS is supported. 
        // - **HTTP,HTTPS**: Both HTTP and HTTPS are supported.
        @NameInMap("protocol")
        public String protocol;

        // The route table that maps the paths to functions when the functions are invoked by using the custom domain name.
        @NameInMap("routeConfig")
        public RouteConfig routeConfig;

        // The configurations of the TLS.
        @NameInMap("tlsConfig")
        public TLSConfig tlsConfig;

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

        public ListCustomDomainsResponseBodyCustomDomains setTlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }
        public TLSConfig getTlsConfig() {
            return this.tlsConfig;
        }

    }

}
