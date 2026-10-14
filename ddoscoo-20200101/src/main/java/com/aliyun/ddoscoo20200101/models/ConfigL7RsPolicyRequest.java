// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7RsPolicyRequest extends TeaModel {
    /**
     * <p>The domain name of the website whose forwarding rules you want to manage.</p>
     * <blockquote>
     * <p>The domain name must have website forwarding rules configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names that have website forwarding rules configured.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The back-to-origin policy. The value is a character string that represents a JSON structure. The JSON structure contains the following fields:</p>
     * <ul>
     * <li><strong>ProxyMode</strong>: String | Required | The load balancing algorithm for back-to-origin. Valid values:<ul>
     * <li><strong>ip_hash</strong>: IP Hash algorithm. Requests from the same source IP address are directed to the same origin server based on hash mapping.</li>
     * <li><strong>rr</strong>: Polling algorithm. All requests are allocated to different origin servers in turn. When you use this algorithm, you can set weights for servers based on their performance.</li>
     * <li><strong>least_time</strong>: Least Time algorithm. This algorithm uses intelligent DNS resolution to ensure the lowest latency for service traffic across the entire path from the protection node to forward back to the origin server.</li>
     * </ul>
     * </li>
     * <li><strong>Attributes</strong>: JSONArray | Optional | The back-to-origin parameter information. Each element in the array contains the following fields:<ul>
     * <li><strong>RealServer</strong>: String | Optional | The address of the origin server.</li>
     * <li><strong>Attribute</strong>: JSONObject | Optional | The back-to-origin parameters. This field contains the following fields:<ul>
     * <li><strong>Weight</strong>: Integer | Optional | The weight of the server. This property takes effect only when the polling algorithm is used (<strong>ProxyMode</strong> is set to <strong>rr</strong>). Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>. A server with a higher weight receives more requests.</li>
     * <li><strong>ConnectTimeout</strong>: Integer | Optional | The timeout period for new connections. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>5</strong>.</li>
     * <li><strong>FailTimeout</strong>: Integer | Optional | The failed timeout period. Valid values: <strong>1</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>10</strong>.</li>
     * <li><strong>MaxFails</strong>: Integer | Optional | The maximum number of failures for health checks. Valid values: <strong>1</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</li>
     * <li><strong>Mode</strong>: String | Optional | The primary/secondary property flag. Valid values: <strong>active</strong> indicates primary. <strong>backup</strong> indicates secondary.</li>
     * <li><strong>ReadTimeout</strong>: Integer | Optional | The read timeout period. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</li>
     * <li><strong>SendTimeout</strong>: Integer | Optional | The write timeout period. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProxyMode&quot;:&quot;rr&quot;,&quot;Attributes&quot;:[{&quot;RealServer&quot;:&quot;1.<em><strong>.</strong></em>.1&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100,&quot;ConnectTimeout&quot;:5,&quot;FailTimeout&quot;:10,&quot;MaxFails&quot;:3,&quot;Mode&quot;:&quot;active&quot;,&quot;ReadTimeout&quot;:120,&quot;SendTimeout&quot;:120}},{&quot;RealServer&quot;:&quot;2.<em><strong>.</strong></em>.2&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100,&quot;ConnectTimeout&quot;:5,&quot;FailTimeout&quot;:10,&quot;MaxFails&quot;:3,&quot;Mode&quot;:&quot;active&quot;,&quot;ReadTimeout&quot;:120,&quot;SendTimeout&quot;:120}}]}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to enable back-to-origin retry. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UpstreamRetry")
    public Integer upstreamRetry;

    public static ConfigL7RsPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigL7RsPolicyRequest self = new ConfigL7RsPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ConfigL7RsPolicyRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigL7RsPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ConfigL7RsPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigL7RsPolicyRequest setUpstreamRetry(Integer upstreamRetry) {
        this.upstreamRetry = upstreamRetry;
        return this;
    }
    public Integer getUpstreamRetry() {
        return this.upstreamRetry;
    }

}
