// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StopLoadBalancerListenerRequest extends TeaModel {
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static StopLoadBalancerListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopLoadBalancerListenerRequest self = new StopLoadBalancerListenerRequest();
        return TeaModel.build(map, self);
    }

    public StopLoadBalancerListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public StopLoadBalancerListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
