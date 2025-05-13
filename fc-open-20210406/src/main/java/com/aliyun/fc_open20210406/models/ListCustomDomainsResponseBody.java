// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of domain names.</p>
     */
    @NameInMap("customDomains")
    public java.util.List<ListCustomDomainsResponseBodyCustomDomains> customDomains;

    /**
     * <p>The pagination token to use to request the next page of results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
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
         * 
         * <strong>example:</strong>
         * <p>1986114****4305</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>The version of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-08-15</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The HTTPS certificate configurations.</p>
         */
        @NameInMap("certConfig")
        public CertConfig certConfig;

        /**
         * <p>The time when the custom domain name was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-27T08:02:19Z</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The last time when the domain name was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-27T08:02:19Z</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The protocol type that is supported by the custom domain name. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: Only HTTP is supported.</li>
         * <li><strong>HTTPS</strong>: Only HTTPS is supported.</li>
         * <li><strong>HTTP,HTTPS</strong>: Both HTTP and HTTPS are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The route table configurations. The route table maps paths to functions when the functions are invoked by using custom domain names.</p>
         */
        @NameInMap("routeConfig")
        public RouteConfig routeConfig;

        /**
         * <p>The Transport Layer Security (TLS) configurations.</p>
         */
        @NameInMap("tlsConfig")
        public TLSConfig tlsConfig;

        /**
         * <p>The Web Application Firewall (WAF) configurations.</p>
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
