// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyDomainResourceRequest extends TeaModel {
    /**
     * <p>The domain name that is added to the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The advanced HTTPS settings. This parameter takes effect only when the value of the **ProxyType** parameter includes **https**. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <br>
     * <p>*   **Http2https**: specifies whether to turn on Enforce HTTPS Routing. This field is optional and must be an integer. Valid values: **0** and **1**. The value 0 indicates that Enforce HTTPS Routing is turned off. The value 1 indicates that Enforce HTTPS Routing is turned on. The default value is 0.</p>
     * <br>
     * <p>    If your website supports both HTTP and HTTPS, this feature meets your business requirements. If you enable this feature, all HTTP requests to access the website are redirected to HTTPS requests on the standard port 443.</p>
     * <br>
     * <p>*   **Https2http**: specifies whether to turn on Enable HTTP. This field is optional and must be an integer. Valid values: **0** and **1**. The value 0 indicates that Enable HTTP is turned off. The value 1 indicates that Enable HTTP is turned on. The default value is 0.</p>
     * <br>
     * <p>    If your website does not support HTTPS, this feature meets your business requirements If this feature is enabled, all HTTPS requests are redirected to HTTP requests and forwarded to origin servers. This feature can redirect WebSockets requests to WebSocket requests. Requests are redirected over the standard port 80.</p>
     * <br>
     * <p>*   **Http2**: specifies whether to turn on Enable HTTP/2. This field is optional. Data type: integer. Valid values: **0** and **1**. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.</p>
     * <br>
     * <p>    After you turn on the switch, HTTP/2 is used.</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <p>An array consisting of the IDs of instances that you want to associate.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>An array that consists of the details of the protocol type and port number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProxyTypes")
    public java.util.List<ModifyDomainResourceRequestProxyTypes> proxyTypes;

    /**
     * <p>An array that consists of the addresses of origin servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <p>The address type of the origin server. Valid values:</p>
     * <br>
     * <p>*   **0**: IP address</p>
     * <br>
     * <p>*   **1**: domain name</p>
     * <br>
     * <p>    If you deploy proxies, such as a Web Application Firewall (WAF) instance, between the origin server and the Anti-DDoS Pro or Anti-DDoS Premium instance, set the value to 1. If you use the domain name, you must enter the address of the proxy, such as the CNAME of WAF.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    public static ModifyDomainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainResourceRequest self = new ModifyDomainResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainResourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainResourceRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public ModifyDomainResourceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyDomainResourceRequest setProxyTypes(java.util.List<ModifyDomainResourceRequestProxyTypes> proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public java.util.List<ModifyDomainResourceRequestProxyTypes> getProxyTypes() {
        return this.proxyTypes;
    }

    public ModifyDomainResourceRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public ModifyDomainResourceRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public static class ModifyDomainResourceRequestProxyTypes extends TeaModel {
        /**
         * <p>An array that consists of port numbers.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ProxyPorts")
        public java.util.List<Integer> proxyPorts;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   **http**</p>
         * <p>*   **https**</p>
         * <p>*   **websocket**</p>
         * <p>*   **websockets**</p>
         */
        @NameInMap("ProxyType")
        public String proxyType;

        public static ModifyDomainResourceRequestProxyTypes build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainResourceRequestProxyTypes self = new ModifyDomainResourceRequestProxyTypes();
            return TeaModel.build(map, self);
        }

        public ModifyDomainResourceRequestProxyTypes setProxyPorts(java.util.List<Integer> proxyPorts) {
            this.proxyPorts = proxyPorts;
            return this;
        }
        public java.util.List<Integer> getProxyPorts() {
            return this.proxyPorts;
        }

        public ModifyDomainResourceRequestProxyTypes setProxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public String getProxyType() {
            return this.proxyType;
        }

    }

}
