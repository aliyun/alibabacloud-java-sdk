// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7RsPolicyRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query the domain names for which forwarding rules are configured.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The back-to-origin policy. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
     * <br>
     * <p>*   **ProxyMode**: The load balancing algorithm for back-to-origin traffic. This field is required and must be a string. Valid values:</p>
     * <br>
     * <p>    *   **ip_hash**: the IP hash algorithm. This algorithm is used to redirect the requests from the same IP address to the same origin server.</p>
     * <p>    *   **rr**: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn. If you use this algorithm, you can specify a weight for each server based on server performance.</p>
     * <p>    *   **least_time**: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from Anti-DDoS Pro or Anti-DDoS Premium instances to origin servers based on the intelligent DNS resolution feature.</p>
     * <br>
     * <p>*   **Attributes**: the parameters for back-to-origin. This field is optional and must be a JSON array. Each element in the array contains the following fields:</p>
     * <br>
     * <p>    *   **RealServer**: the address of the origin server. This field is optional and must be a string.</p>
     * <br>
     * <p>    *   **Attribute**: the parameter for back-to-origin. This field is optional and must be a JSON object. The value contains the following field:</p>
     * <br>
     * <p>        *   **Weight**: the weight of the server. This field is optional and must be an integer. This field takes effect only when **ProxyMode** is set to **rr**. Valid values: **1** to **100**. Default value: **100**. An origin server with a higher weight receives more requests.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [Create a resource group](~~94485~~).</p>
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
