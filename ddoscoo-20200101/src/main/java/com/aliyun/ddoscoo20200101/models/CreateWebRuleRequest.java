// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleRequest extends TeaModel {
    /**
     * <p>The ID of the protection rule to associate. This parameter is used when an Alibaba Cloud service, such as Object Storage Service (OSS), is integrated with an Anti-DDoS instance.</p>
     * <blockquote>
     * <p>This parameter is for internal use. Do not use this parameter.</p>
     * </blockquote>
     * <p>For example, if your OSS is integrated with an Anti-DDoS Proxy instance, the instance allocates a resource pool of IP addresses to the OSS tenant account. Each IP address has a unique protection ID. The protection ID is a CNAME that resolves to the IP address of the Anti-DDoS instance by default. You can resolve the CNAME to an IP address. This lets you reuse the IP address for flexible scheduling.</p>
     * <blockquote>
     * <p>You cannot specify both <strong>InstanceIds</strong> and <strong>DefenseId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("DefenseId")
    public String defenseId;

    /**
     * <p>The domain name of the website to add to the Anti-DDoS Proxy instance for protection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The advanced HTTPS settings. This parameter takes effect only when the value of <strong>ProxyType</strong> includes <strong>https</strong>. This parameter is a JSON string. The value is a JSON object that contains the following fields:</p>
     * <ul>
     * <li><p><strong>Http2https</strong>: This field is an integer. Optional. Specifies whether to forcibly redirect HTTP requests to HTTPS requests. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled). The default value is 0.</p>
     * <p>This setting is available when your website supports both HTTP and HTTPS. If you enable this setting, all HTTP requests are redirected to HTTPS requests over port 443.</p>
     * </li>
     * <li><p><strong>Https2http</strong>: This field is an integer. Optional. Specifies whether to enable HTTP back-to-origin. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled). The default value is 0.</p>
     * <p>This setting applies to websites that do not support HTTPS back-to-origin. If you enable this setting, all HTTPS requests are sent to the origin server over HTTP on port 80 by default. All WebSockets requests are sent to the origin server over WebSocket.</p>
     * </li>
     * <li><p><strong>Http2</strong>: This field is an integer. Optional. Specifies whether to enable HTTP/2. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled). The default value is 0.</p>
     * <p>If you enable this setting, HTTP/2 is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Http2&quot;:1,&quot;Http2https&quot;:1,&quot;Https2http&quot;:1}</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <p>The IDs of the Anti-DDoS Proxy instances to associate.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Proxy instance belongs in Resource Management. If you leave this parameter empty, the instance belongs to the default resource group.</p>
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
     * <li><p><strong>0</strong>: IP address.</p>
     * </li>
     * <li><p><strong>1</strong>: domain name. This value is typically used when a proxy service, such as Web Application Firewall (WAF), is deployed between the origin server and the Anti-DDoS Proxy instance. The domain name is the back-to-origin address of the proxy service, such as the canonical name (CNAME) of WAF.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    /**
     * <p>The details of the forwarding rule, in a JSON string format. The value is an array of objects. Each object contains the following fields:</p>
     * <ul>
     * <li><p><strong>ProxyRules</strong>: This field is a JSON array. Required. The information about the origin server, including the port number and server address. Each object in the array contains the following fields:</p>
     * <ul>
     * <li><p><strong>ProxyPort</strong>: This field is an integer. Required. The port number that is used by the protocol.</p>
     * </li>
     * <li><p><strong>RealServers</strong>: This field is a string array. Required. The addresses of the origin servers.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>ProxyType</strong>: This field is a string. Required. The protocol of the website. Valid values: <strong>http</strong>, <strong>https</strong>, <strong>websocket</strong>, and <strong>websockets</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProxyRules&quot;:[{&quot;ProxyPort&quot;:443,&quot;RealServers&quot;:[&quot;192.1.XX.XX&quot;]}],&quot;ProxyType&quot;:&quot;https&quot;}]</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static CreateWebRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebRuleRequest self = new CreateWebRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebRuleRequest setDefenseId(String defenseId) {
        this.defenseId = defenseId;
        return this;
    }
    public String getDefenseId() {
        return this.defenseId;
    }

    public CreateWebRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateWebRuleRequest setHttpsExt(String httpsExt) {
        this.httpsExt = httpsExt;
        return this;
    }
    public String getHttpsExt() {
        return this.httpsExt;
    }

    public CreateWebRuleRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateWebRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateWebRuleRequest setRsType(Integer rsType) {
        this.rsType = rsType;
        return this;
    }
    public Integer getRsType() {
        return this.rsType;
    }

    public CreateWebRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
