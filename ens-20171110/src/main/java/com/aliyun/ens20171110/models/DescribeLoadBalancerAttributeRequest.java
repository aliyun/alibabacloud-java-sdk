// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the ELB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5rcvo1n1t3hykfhhjwjgq****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DescribeLoadBalancerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerAttributeRequest self = new DescribeLoadBalancerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
