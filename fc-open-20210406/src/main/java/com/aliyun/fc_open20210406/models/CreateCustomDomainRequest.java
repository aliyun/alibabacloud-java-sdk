// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateCustomDomainRequest extends TeaModel {
    // The configurations of the HTTPS certificate.
    @NameInMap("certConfig")
    public CertConfig certConfig;

    // The domain name.
    @NameInMap("domainName")
    public String domainName;

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

    public CreateCustomDomainRequest setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

}
