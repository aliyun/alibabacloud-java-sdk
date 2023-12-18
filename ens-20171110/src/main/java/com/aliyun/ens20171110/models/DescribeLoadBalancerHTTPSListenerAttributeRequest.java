// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPSListenerAttributeRequest extends TeaModel {
    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: **1** to **65535**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the ELB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DescribeLoadBalancerHTTPSListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPSListenerAttributeRequest self = new DescribeLoadBalancerHTTPSListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
