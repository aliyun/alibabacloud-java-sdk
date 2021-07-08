// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerRequest extends TeaModel {
    // 负载均衡实例的ID。
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DeleteLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerRequest self = new DeleteLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
