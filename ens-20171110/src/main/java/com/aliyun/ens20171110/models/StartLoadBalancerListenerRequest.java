// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class StartLoadBalancerListenerRequest extends TeaModel {
    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You cannot specify port 250, 4789, or 4790 for UDP listeners. The preceding ports are system reserved ports.</p>
     * </li>
     * <li><p>We recommend that you use port 80 for HTTP.</p>
     * </li>
     * <li><p>We recommend that you use port 443 for HTTPS.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The frontend protocol that is used by the ELB instance. Valid values:</p>
     * <ul>
     * <li>tcp</li>
     * <li>udp</li>
     * <li>http</li>
     * <li>https</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required if the same port is used by listeners that use different protocols.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the ELB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5saivuir6b1mupxjfbhmk****</p>
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
