// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CustomDomain extends TeaModel {
    /**
     * <p>HTTPS 证书的信息。</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("certConfig")
    public CertConfig certConfig;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>域名。填写已在阿里云备案或接入备案的自定义域名名称。</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("domainName")
    public String domainName;

    @NameInMap("domainType")
    public String domainType;

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

    /**
     * <p>更新时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static CustomDomain build(java.util.Map<String, ?> map) throws Exception {
        CustomDomain self = new CustomDomain();
        return TeaModel.build(map, self);
    }

    public CustomDomain setCertConfig(CertConfig certConfig) {
        this.certConfig = certConfig;
        return this;
    }
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    public CustomDomain setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CustomDomain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CustomDomain setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CustomDomain setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public CustomDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CustomDomain setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public CustomDomain setTlsConfig(TLSConfig tlsConfig) {
        this.tlsConfig = tlsConfig;
        return this;
    }
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    public CustomDomain setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
