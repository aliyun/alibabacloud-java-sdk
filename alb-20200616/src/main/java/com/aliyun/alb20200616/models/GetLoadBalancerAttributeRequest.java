// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeRequest extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static GetLoadBalancerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerAttributeRequest self = new GetLoadBalancerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
