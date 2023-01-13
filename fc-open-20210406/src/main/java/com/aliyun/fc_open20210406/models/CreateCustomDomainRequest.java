// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateCustomDomainRequest extends TeaModel {
    /**
     * <p>The configurations of the HTTPS certificate.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>The domain name.</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The protocol types supported by the domain name. Valid values:</p>
     * <br>
     * <p>- **HTTP**: Only HTTP is supported. </p>
     * <p>- **HTTPS**: Only HTTPS is supported. </p>
     * <p>- **HTTP,HTTPS**: Both HTTP and HTTPS are supported.</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The route table that maps the paths to functions when the functions are invoked by using the custom domain name.</p>
     */
    @NameInMap("routeConfig")
    public RouteConfig routeConfig;

    /**
     * <p>The configurations of the TLS.</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    @NameInMap("wafConfig")
    public WAFConfig wafConfig;

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

    public CreateCustomDomainRequest setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
