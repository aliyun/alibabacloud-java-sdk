// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7RsPolicyRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query the domain names for which forwarding rules are configured.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The back-to-origin policy. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <ul>
     * <li><p><strong>ProxyMode</strong>: The load balancing algorithm for back-to-origin traffic. This field is required and must be a string. Valid values:</p>
     * <ul>
     * <li><strong>ip_hash</strong>: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</li>
     * <li><strong>rr</strong>: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn. If you use this algorithm, you can specify a weight for each server based on server performance.</li>
     * <li><strong>least_time</strong>: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</li>
     * </ul>
     * </li>
     * <li><p><strong>Attributes</strong>: the parameters for back-to-origin. This field is optional and must be a JSON array. Each element in the array contains the following fields:</p>
     * <ul>
     * <li><p><strong>RealServer</strong>: the address of the origin server. This field is optional and must be a string.</p>
     * </li>
     * <li><p><strong>Attribute</strong>: the parameter for back-to-origin. This field is optional and must be a JSON object. The value contains the following field:</p>
     * <ul>
     * <li><strong>Weight</strong>: the weight of the server. This field is optional and must be an integer. This field takes effect only when <strong>ProxyMode</strong> is set to <strong>rr</strong>. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>. An origin server with a higher weight receives more requests.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProxyMode&quot;:&quot;rr&quot;,&quot;Attributes&quot;:[{&quot;RealServer&quot;:&quot;1.<em><strong>.</strong></em>.1&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100}},{&quot;RealServer&quot;:&quot;2.<em><strong>.</strong></em>.2&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100}}]}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
