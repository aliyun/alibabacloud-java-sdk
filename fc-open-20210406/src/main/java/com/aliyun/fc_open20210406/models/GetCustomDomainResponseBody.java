// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetCustomDomainResponseBody extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("apiVersion")
    public String apiVersion;

    @NameInMap("certConfig")
    public CertConfig certConfig;

    @NameInMap("createdTime")
    public String createdTime;

    // Id of the request
    @NameInMap("domainName")
    public String domainName;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("routeConfig")
    public RouteConfig routeConfig;

    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    public static GetCustomDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomDomainResponseBody self = new GetCustomDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomDomainResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetCustomDomainResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public GetCustomDomainResponseBody setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public GetCustomDomainResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetCustomDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetCustomDomainResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetCustomDomainResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetCustomDomainResponseBody setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public GetCustomDomainResponseBody setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

}
