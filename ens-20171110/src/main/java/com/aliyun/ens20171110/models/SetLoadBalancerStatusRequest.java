// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerStatusRequest extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

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
