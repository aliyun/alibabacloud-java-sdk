// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponseBody extends TeaModel {
    /**
     * <p>The information about custom domain names.</p>
     */
    @NameInMap("customDomains")
    public java.util.List<ListCustomDomainsResponseBodyCustomDomains> customDomains;

    /**
     * <p>The pagination token to use to request the next page of results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     */
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
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The version of the API.</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The configurations of the HTTPS certificate.</p>
         */
        @NameInMap("certConfig")
        public CertConfig certConfig;

        /**
         * <p>The time when the custom domain name was created.</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The time when the domain name was last modified.</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The protocol type that is supported by the custom domain name.</p>
         * <br>
         * <p>*   **HTTP**: Only HTTP is supported.</p>
         * <p>*   **HTTPS**: Only HTTPS is supported.</p>
         * <p>*   **HTTP,HTTPS**: HTTP and HTTPS are supported.</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The route table that maps the paths to functions when the functions are invoked by using the custom domain name.</p>
         */
        @NameInMap("routeConfig")
        public RouteConfig routeConfig;

        /**
         * <p>The Transport Layer Security (TLS) configuration.</p>
         */
        @NameInMap("tlsConfig")
        public TLSConfig tlsConfig;

        /**
         * <p>The Web Application Firewall (WAF) configuration.</p>
         */
        @NameInMap("wafConfig")
        public WAFConfig wafConfig;

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

        public ListCustomDomainsResponseBodyCustomDomains setWafConfig(WAFConfig wafConfig) {
            this.wafConfig = wafConfig;
            return this;
        }
        public WAFConfig getWafConfig() {
            return this.wafConfig;
        }

    }

}
