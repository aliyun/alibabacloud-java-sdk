// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainInput extends TeaModel {
    /**
     * <p>HTTPS 证书的信息。</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>域名支持的协议类型：● HTTP：仅支持 HTTP 协议。● HTTPS：仅支持 HTTPS 协议。● HTTP,HTTPS：支持 HTTP 及 HTTPS 协议。</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>路由表：自定义域名访问时的 PATH 到 资源 的映射。</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("routeConfig")
    public RouteConfig routeConfig;

    /**
     * <p>TLS 配置信息。</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("tlsConfig")
    public TLSConfig tlsConfig;

    public static UpdateCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainInput self = new UpdateCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainInput setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public UpdateCustomDomainInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCustomDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateCustomDomainInput setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public UpdateCustomDomainInput setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

}
