// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomDomain extends TeaModel {
    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>186851234023****</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>The version of the Function Compute API.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-30</p>
     */
    @NameInMap("apiVersion")
    public String apiVersion;

    /**
     * <p>The configuration of permission authentication.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>The configuration of the HTTPS certificate.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    @NameInMap("corsConfig")
    public CORSConfig corsConfig;

    /**
     * <p>The time when the custom domain name was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-30T08:02:19Z</p>
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
     * <p>The time when the custom domain name was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-30T08:02:19Z</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The protocol type that is supported by the custom domain name. Valid values: HTTP HTTPS HTTP,HTTPS</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The route table that maps paths to functions when the function is invoked by using the custom domain name.</p>
     */
    @NameInMap("routeConfig")
    public RouteConfig routeConfig;

    /**
     * <p>The number of added subdomains.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("subdomainCount")
    public String subdomainCount;

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

    public static CustomDomain build(java.util.Map<String, ?> map) throws Exception {
        CustomDomain self = new CustomDomain();
        return TeaModel.build(map, self);
    }

    public CustomDomain setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CustomDomain setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CustomDomain setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public CustomDomain setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CustomDomain setCorsConfig(CORSConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public CORSConfig getCorsConfig() {
        return this.corsConfig;
    }

    public CustomDomain setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CustomDomain setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CustomDomain setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CustomDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CustomDomain setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public CustomDomain setSubdomainCount(String subdomainCount) {
        this.subdomainCount = subdomainCount;
        return this;
    }
    public String getSubdomainCount() {
        return this.subdomainCount;
    }

    public CustomDomain setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CustomDomain setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
