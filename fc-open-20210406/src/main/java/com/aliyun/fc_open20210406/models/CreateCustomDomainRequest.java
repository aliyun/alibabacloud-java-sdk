// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateCustomDomainRequest extends TeaModel {
    @NameInMap("certConfig")
    public CertConfig certConfig;

    @NameInMap("domainName")
    public String domainName;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("routeConfig")
    public RouteConfig routeConfig;

    public static CreateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainRequest self = new CreateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainRequest setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateCustomDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCustomDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCustomDomainRequest setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

}
