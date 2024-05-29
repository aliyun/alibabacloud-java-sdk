// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateWebRuleRequest extends TeaModel {
    /**
     * <p>The ID of the associated defense. This parameter applies to scenarios in which other cloud services, such as Object Storage Service (OSS), are integrated with Anti-DDoS Pro or Anti-DDoS Premium.</p>
     * <br>
     * <p>> This parameter is in internal preview. Do not use this parameter.</p>
     * <br>
     * <p>For example, if you integrate OSS with Anti-DDoS Pro or Anti-DDoS Premium, Anti-DDoS Pro or Anti-DDoS Premium allocates an IP address pool for the OSS production account. Each IP address corresponds to a unique defense ID. A defense ID is a CNAME, which is automatically resolved to the IP address of the required Anti-DDoS Pro or Anti-DDoS Premium instance. A defense ID can be resolved to the same IP address to facilitate scheduling.</p>
     * <br>
     * <p>> You can specify only one of the following parameters: **InstanceIds** and **DefenseId**.</p>
     */
    @NameInMap("DefenseId")
    public String defenseId;

    /**
     * <p>The domain name of the website that you want to add to the instance.</p>
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
     * <p>*   **Http2**: specifies whether to turn on Enable HTTP/2. This field is optional and must be an integer. Valid values: **0** and **1**. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.</p>
     * <br>
     * <p>    After you turn on Enable HTTP/2, the protocol type is HTTP/2.</p>
     */
    @NameInMap("HttpsExt")
    public String httpsExt;

    /**
     * <p>An array consisting of the IDs of instances that you want to associate.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](https://help.aliyun.com/document_detail/94485.html).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The address type of the origin server. Valid values:</p>
     * <br>
     * <p>*   **0**: IP address</p>
     * <p>*   **1**: domain name The domain name of the origin server is returned if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the instance. In this case, the address of the proxy, such as the CNAME provided by WAF, is returned.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RsType")
    public Integer rsType;

    /**
     * <p>The details of the forwarding rule. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>*   **ProxyRules**: the information about the origin server. The information includes the port number and IP address. This field is required and must be a JSON array. Each element in a JSON array is a JSON struct that contains the following fields:</p>
     * <br>
     * <p>    *   **ProxyPort**: the port number. This field is required and must be an integer.</p>
     * <p>    *   **RealServers**: the IP address. This field is required and must be a string array.</p>
     * <br>
     * <p>*   **ProxyType**: the protocol type. This field is required and must be a string. Valid values: **http**, **https**, **websocket**, and **websockets**.</p>
     * <br>
     * <p>This parameter is required.</p>
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
