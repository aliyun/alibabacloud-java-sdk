// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigL7RsPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Policy")
    public String policy;

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
