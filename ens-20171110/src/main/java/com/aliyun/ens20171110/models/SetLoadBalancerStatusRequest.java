// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerStatusRequest extends TeaModel {
    /**
     * <p>The ID of the ELB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5t18quoohsrc3xkf86spmnu77</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The status of the listener after the modification. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: The listener for the instance can forward the received traffic based on forwarding rules.</li>
     * <li><strong>InActive</strong>: The listener for the instance does not forward the received traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
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
