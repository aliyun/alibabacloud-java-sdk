// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebRuleRequest extends TeaModel {
    /**
     * <p>The domain name of the website business to operate.</p>
     * <blockquote>
     * <p>The domain name must have a website forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names that have website forwarding rules configured.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The HTTPS advanced settings, which take effect only when the website protocol type supports HTTPS (<strong>ProxyType</strong> includes <strong>https</strong>). This parameter is a string converted from a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><p><strong>Http2https</strong>: Integer type | Optional | Specifies whether to enable the HTTPS force redirect feature. Valid values: <strong>0</strong> (disabled) | <strong>1</strong> (enabled). Default value: 0 (disabled).</p>
     * <p>This is applicable when your website supports both HTTP and HTTPS protocols. After this setting is enabled, all HTTP requests will be forcibly converted to HTTPS requests and redirected to port 443 by default.</p>
     * </li>
     * <li><p><strong>Https2http</strong>: Integer type | Optional | Specifies whether to enable the HTTP back-to-origin feature. Valid values: <strong>0</strong> (disabled) | <strong>1</strong> (enabled). Default value: 0 (disabled).</p>
     * <p>This is applicable when your website does not support HTTPS back-to-origin. After this setting is enabled, all HTTPS protocol requests will be forwarded to the origin through HTTP (Websockets protocol requests will be forwarded through Websocket), and the default back-to-origin port is 80.</p>
     * </li>
     * <li><p><strong>Http2</strong>: Integer type | Optional | Specifies whether to enable the HTTP2.0 protocol type. Valid values: <strong>0</strong> (disabled) | <strong>1</strong> (enabled). Default value: 0 (disabled).</p>
     * <p>After this setting is enabled, the protocol version is HTTP2.0.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Http2&quot;:1,&quot;Http2https&quot;:1,&quot;Https2http&quot;:1}</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <p>The list of Anti-DDoS Proxy instance IDs to associate. You can associate up to 100 instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The protocol information of the website forwarding rule. This parameter is a string converted from a JSON array. Each element in the JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><p><strong>ProxyType</strong>: String type | Required | The website protocol type. Valid values: <strong>http</strong> | <strong>https</strong> | <strong>websocket</strong> | <strong>websockets</strong>.</p>
     * </li>
     * <li><p><strong>ProxyPorts</strong>: array type | Required | The port numbers corresponding to the protocol.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProxyType&quot;:&quot;https&quot;,&quot;ProxyPorts&quot;:[443]}]</p>
     */
    @NameInMap("ProxyTypes")
    public String proxyTypes;

    /**
     * <p>The list of origin server addresses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.xxx.xxx.1</p>
     */
    @NameInMap("RealServers")
    public java.util.List<String> realServers;

    /**
     * <p>The resource group ID of the Anti-DDoS Proxy instance in Resource Management. Default value: empty, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The address type of the origin server. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: indicates the IP address of the origin server.</p>
     * </li>
     * <li><p><strong>1</strong>: indicates the domain name of the origin server. This is typically applicable to scenarios where other proxy services (such as WAF) are deployed between the origin server and Anti-DDoS Proxy, specifically referring to the redirect address of the proxy service (such as the WAF CNAME address).</p>
     * </li>
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
