// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerStatusRequest extends TeaModel {
    /**
     * <p>The ID of the ELB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The status of the ELB instance. Valid values:</p>
     * <br>
     * <p>*   **Active** (default): The listener for the instance can forward the received traffic based on the rule.</p>
     * <p>*   **InActive**: The listener for the instance does not forward the received traffic.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    public static SetLoadBalancerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerStatusRequest self = new SetLoadBalancerStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerStatusRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetLoadBalancerStatusRequest setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

}
