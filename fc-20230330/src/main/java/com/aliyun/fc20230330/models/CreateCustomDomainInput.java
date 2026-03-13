// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateCustomDomainInput extends TeaModel {
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
     * <p>The domain name. Enter a custom domain name that has obtained an Internet content provider (ICP) filing in the Alibaba Cloud ICP Filing system, or a custom domain name whose ICP filing information includes Alibaba Cloud as a service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("domainName")
    public String domainName;

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
     * <p>The Transport Layer Security (TLS) configuration.</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    /**
     * <p>The Web Application Firewall (WAF) configuration.</p>
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
