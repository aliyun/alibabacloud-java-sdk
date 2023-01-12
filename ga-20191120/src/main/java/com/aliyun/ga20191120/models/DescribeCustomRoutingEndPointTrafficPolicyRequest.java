// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCustomRoutingEndPointTrafficPolicyRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The ID of the traffic policy to be queried.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomRoutingEndPointTrafficPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomRoutingEndPointTrafficPolicyRequest self = new DescribeCustomRoutingEndPointTrafficPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomRoutingEndPointTrafficPolicyRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DescribeCustomRoutingEndPointTrafficPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
