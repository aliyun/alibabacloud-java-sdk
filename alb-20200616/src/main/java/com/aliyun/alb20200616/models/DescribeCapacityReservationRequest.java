// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DescribeCapacityReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationRequest self = new DescribeCapacityReservationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
