// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerListenerRequest extends TeaModel {
    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The frontend protocol that is used by the ELB instance.</p>
     * <br>
     * <p>>  This parameter is required if the same port is used by listeners that use different protocols.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   tcp</p>
     * <p>*   udp</p>
     * <p>*   http</p>
     * <p>*   https</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the ELB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
