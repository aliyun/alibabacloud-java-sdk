// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class GetLoadBalancerAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gwlb-9njtjmqt7zfcqm****</p>
     */
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
