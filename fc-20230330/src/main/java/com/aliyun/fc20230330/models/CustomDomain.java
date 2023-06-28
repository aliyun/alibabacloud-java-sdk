// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomDomain extends TeaModel {
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

    @NameInMap("subdomainCount")
    public String subdomainCount;

    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

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

    public CustomDomain setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
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
