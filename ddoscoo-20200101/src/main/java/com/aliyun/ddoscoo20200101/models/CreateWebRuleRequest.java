// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleRequest extends TeaModel {
    /**
     * <p>The ID of the associated defense. This parameter applies to scenarios in which other cloud services, such as Object Storage Service (OSS), are integrated with Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * <blockquote>
     * <p>This parameter is in internal preview. Do not use this parameter.</p>
     * </blockquote>
     * <p>For example, if you integrate OSS with Anti-DDoS Pro or Anti-DDoS Premium, Anti-DDoS Pro or Anti-DDoS Premium allocates an IP address pool for the OSS production account. Each IP address corresponds to a unique defense ID. A defense ID is a CNAME, which is automatically resolved to the IP address of the required Anti-DDoS Pro or Anti-DDoS Premium instance. A defense ID can be resolved to the same IP address to facilitate scheduling.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters: <strong>InstanceIds</strong> and <strong>DefenseId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("DefenseId")
    public String defenseId;

    /**
     * <p>The domain name of the website that you want to add to the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
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
     * <li><p><strong>Http2</strong>: specifies whether to turn on Enable HTTP/2. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.</p>
     * <p>After you turn on Enable HTTP/2, the protocol type is HTTP/2.</p>
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
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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
     * <li><strong>0</strong>: IP address</li>
     * <li><strong>1</strong>: domain name The domain name of the origin server is returned if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the instance. In this case, the address of the proxy, such as the CNAME provided by WAF, is returned.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    /**
     * <p>The details of the forwarding rule. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><p><strong>ProxyRules</strong>: the information about the origin server. The information includes the port number and IP address. This field is required and must be a JSON array. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <ul>
     * <li><strong>ProxyPort</strong>: the port number. This field is required and must be an integer.</li>
     * <li><strong>RealServers</strong>: the IP address. This field is required and must be a string array.</li>
     * </ul>
     * </li>
     * <li><p><strong>ProxyType</strong>: the protocol type. This field is required and must be a string. Valid values: <strong>http</strong>, <strong>https</strong>, <strong>websocket</strong>, and <strong>websockets</strong>.</p>
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
