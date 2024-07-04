// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerSpecRequest extends TeaModel {
    /**
     * <p>The specifications of the ELB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>elb.s2.small</p>
     */
    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    public static DescribeLoadBalancerSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerSpecRequest self = new DescribeLoadBalancerSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerSpecRequest setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

}
