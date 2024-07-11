// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateDomainResourceRequest extends TeaModel {
    /**
     * <p>The domain name of the website that you want to add to the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The advanced HTTPS settings. This parameter takes effect only when the value of the <strong>ProxyType</strong> parameter includes <strong>https</strong>. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><p><strong>Http2https</strong>: specifies whether to turn on Enforce HTTPS Routing. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enforce HTTPS Routing is turned off. The value 1 indicates that Enforce HTTPS Routing is turned on. The default value is 0.</p>
     * <p>If your website supports both HTTP and HTTPS, this feature meets your business requirements. If you enable this feature, all HTTP requests to access the website are redirected to HTTPS requests on the standard port 443.</p>
     * </li>
     * <li><p><strong>Https2http</strong>: specifies whether to turn on Enable HTTP. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP is turned off. The value 1 indicates that Enable HTTP is turned on. The default value is 0.</p>
     * <p>If your website does not support HTTPS, this feature meets your business requirements If this feature is enabled, all HTTPS requests are redirected to HTTP requests and forwarded to origin servers. This feature can redirect WebSockets requests to WebSocket requests. Requests are redirected over the standard port 80.</p>
     * </li>
     * <li><p><strong>Http2</strong>: specifies whether to turn on Enable HTTP/2. This field is optional. Data type: integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.</p>
     * <p>After you turn on the switch, HTTP/2 is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Http2&quot;:1,&quot;Http2https&quot;:1,&quot;Https2http&quot;:1}</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <p>An array consisting of the IDs of instances that you want to associate.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The details about the protocol type and port number.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyTypes")
    public java.util.List<CreateDomainResourceRequestProxyTypes> proxyTypes;

    /**
     * <p>An array that consists of the addresses of origin servers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <p>The address type of the origin server. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: IP address</p>
     * </li>
     * <li><p><strong>1</strong>: domain name</p>
     * <p>This parameter is suitable for scenarios where another proxy service, such as Web Application Firewall (WAF), is deployed between the origin server and Anti-DDoS Pro or Anti-DDoS Premium. The address is the jump address of the proxy service, such as the CNAME address of WAF.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    public static CreateDomainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResourceRequest self = new CreateDomainResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainResourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainResourceRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public CreateDomainResourceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateDomainResourceRequest setProxyTypes(java.util.List<CreateDomainResourceRequestProxyTypes> proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public java.util.List<CreateDomainResourceRequestProxyTypes> getProxyTypes() {
        return this.proxyTypes;
    }

    public CreateDomainResourceRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public CreateDomainResourceRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public static class CreateDomainResourceRequestProxyTypes extends TeaModel {
        /**
         * <p>The port numbers.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<Integer> proxyPorts;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * <li><strong>websocket</strong></li>
         * <li><strong>websockets</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        public static CreateDomainResourceRequestProxyTypes build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainResourceRequestProxyTypes self = new CreateDomainResourceRequestProxyTypes();
            return TeaModel.build(map, self);
        }

        public CreateDomainResourceRequestProxyTypes setProxyPorts(java.util.List<Integer> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<Integer> getProxyPorts() {
            return this.proxyPorts;
        }

        public CreateDomainResourceRequestProxyTypes setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

}
