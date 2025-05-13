// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainRequest extends TeaModel {
    /**
     * <p>The HTTPS certificate configurations.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>The protocol types supported by the domain name. Valid values:</p>
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
     * <p>The TLS configurations.</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    /**
     * <p>The Web Application Firewall (WAF) configurations.</p>
     */
    @NameInMap("wafConfig")
    public WAFConfig wafConfig;

    public static UpdateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainRequest self = new UpdateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainRequest setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public UpdateCustomDomainRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateCustomDomainRequest setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public UpdateCustomDomainRequest setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public UpdateCustomDomainRequest setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
