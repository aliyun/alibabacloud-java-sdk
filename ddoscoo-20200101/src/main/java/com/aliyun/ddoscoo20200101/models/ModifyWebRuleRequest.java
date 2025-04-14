// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query the domain names for which forwarding rules are configured.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The advanced HTTPS settings. This parameter takes effect only when the value of <strong>ProxyType</strong> includes <strong>https</strong>. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><p><strong>Http2https</strong>: specifies whether to turn on Enforce HTTPS Routing. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enforce HTTPS Routing is turned off. The value 1 indicates that Enforce HTTPS Routing is turned on. The default value is 0.</p>
     * <p>If your website supports both HTTP and HTTPS, this feature suits your needs. If you turn on the switch, all HTTP requests are redirected to HTTPS requests on port 443 by default.</p>
     * </li>
     * <li><p><strong>Https2http</strong>: specifies whether to turn on Enable HTTP. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP is turned off. The value 1 indicates that Enable HTTP is turned on. The default value is 0.</p>
     * <p>If your website does not support HTTPS, this feature suits your needs. If you turn on the switch, all HTTPS requests are redirected to HTTP requests and forwarded to origin servers. The feature can also redirect WebSockets requests to WebSocket requests. All requests are redirected over port 80.</p>
     * </li>
     * <li><p><strong>Http2</strong>: specifies whether to turn on Enable HTTP/2. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.</p>
     * <p>After you turn on the switch, the protocol type is HTTP/2.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Http2&quot;:1,&quot;Http2https&quot;:1,&quot;Https2http&quot;:1}</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The protocol of the forwarding rule. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><strong>ProxyType</strong>: the protocol type. This field is required and must be a string. Valid values: <strong>http</strong>, <strong>https</strong>, <strong>websocket</strong>, and <strong>websockets</strong>.</li>
     * <li><strong>ProxyPort</strong>: the port number. This field is required and must be an array.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProxyType&quot;:&quot;https&quot;,&quot;ProxyPorts&quot;:[443]}]</p>
     */
    @NameInMap("ProxyTypes")
    public String proxyTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.xxx.xxx.1</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The address type of the origin server. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: IP address.</li>
     * <li><strong>1</strong>: domain name. Use the domain name of the origin server if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the Anti-DDoS Pro or Anti-DDoS Premium instance. If you use the domain name, you must enter the address of the proxy, such as the CNAME of WAF.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    public static ModifyWebRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebRuleRequest self = new ModifyWebRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebRuleRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public ModifyWebRuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyWebRuleRequest setProxyTypes(String proxyTypes) {
        this.proxyTypes = proxyTypes;
        return this;
    }
    public String getProxyTypes() {
        return this.proxyTypes;
    }

    public ModifyWebRuleRequest setRealServers(java.util.List<String> realServers) {
        this.realServers = realServers;
        return this;
    }
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    public ModifyWebRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyWebRuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

}
