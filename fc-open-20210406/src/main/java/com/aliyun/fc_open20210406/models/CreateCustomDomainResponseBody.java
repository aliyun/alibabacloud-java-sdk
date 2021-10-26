// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateCustomDomainResponseBody extends TeaModel {
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

    public static CreateCustomDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainResponseBody self = new CreateCustomDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateCustomDomainResponseBody setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public CreateCustomDomainResponseBody setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateCustomDomainResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateCustomDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCustomDomainResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateCustomDomainResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCustomDomainResponseBody setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

}
