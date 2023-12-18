// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartLoadBalancerListenerRequest extends TeaModel {
    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You cannot specify port 250, 4789, or 4790 for UDP listeners. The preceding ports are system reserved ports.</p>
     * <br>
     * <p>*   We recommend that you use port 80 for HTTP.</p>
     * <br>
     * <p>*   We recommend that you use port 443 for HTTPS.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The frontend protocol that is used by the ELB instance. Valid values:</p>
     * <br>
     * <p>*   tcp</p>
     * <p>*   udp</p>
     * <p>*   http</p>
     * <p>*   https</p>
     * <br>
     * <p>>  This parameter is required if the same port is used by listeners that use different protocols.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the ELB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static StartLoadBalancerListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLoadBalancerListenerRequest self = new StartLoadBalancerListenerRequest();
        return TeaModel.build(map, self);
    }

    public StartLoadBalancerListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public StartLoadBalancerListenerRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public StartLoadBalancerListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
