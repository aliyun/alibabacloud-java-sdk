// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateCustomDomainInput extends TeaModel {
    /**
     * <p>Permission authentication configuration.</p>
     */
    @NameInMap("authConfig")
    public AuthConfig authConfig;

    /**
     * <p>HTTPS certificate information.</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    @NameInMap("corsConfig")
    public CORSConfig corsConfig;

    /**
     * <p>Domain name. Enter a custom domain name that has an ICP filing with Alibaba Cloud or has added Alibaba Cloud to the ICP filing information as a service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("domainName")
    public String domainName;

    @NameInMap("isE2B")
    public Boolean isE2B;

    /**
     * <p>Protocol type supported by the domain. HTTP: supports HTTP only. HTTPS: supports HTTPS only. HTTP,HTTPS: supports both HTTP and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>Route table: maps PATHs to functions when accessing the custom domain.</p>
     */
    @NameInMap("routeConfig")
    public RouteConfig routeConfig;

    /**
     * <p>TLS configuration information.</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    /**
     * <p>Web Application Firewall configuration information.</p>
     */
    @NameInMap("wafConfig")
    public WAFConfig wafConfig;

    public static CreateCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainInput self = new CreateCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainInput setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    public CreateCustomDomainInput setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CreateCustomDomainInput setCorsConfig(CORSConfig corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public CORSConfig getCorsConfig() {
        return this.corsConfig;
    }

    public CreateCustomDomainInput setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCustomDomainInput setIsE2B(Boolean isE2B) {
        this.isE2B = isE2B;
        return this;
    }
    public Boolean getIsE2B() {
        return this.isE2B;
    }

    public CreateCustomDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateCustomDomainInput setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public CreateCustomDomainInput setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CreateCustomDomainInput setWafConfig(WAFConfig wafConfig) {
        this.wafConfig = wafConfig;
        return this;
    }
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

}
