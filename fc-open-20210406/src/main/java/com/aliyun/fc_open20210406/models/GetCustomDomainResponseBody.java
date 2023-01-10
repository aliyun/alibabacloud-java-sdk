// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetCustomDomainResponseBody extends TeaModel {
    // The version number of the API.
    @NameInMap("accountId")
    public String accountId;

    // The version number of the API.
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
