// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerListenerRequest extends TeaModel {
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DeleteLoadBalancerListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerListenerRequest self = new DeleteLoadBalancerListenerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DeleteLoadBalancerListenerRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public DeleteLoadBalancerListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
