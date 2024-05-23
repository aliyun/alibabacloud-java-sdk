// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetBackendServersShrinkRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. You can modify at most 20 backend servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendServers")
    public String backendServersShrink;

    /**
     * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static SetBackendServersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersShrinkRequest self = new SetBackendServersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetBackendServersShrinkRequest setBackendServersShrink(String backendServersShrink) {
        this.backendServersShrink = backendServersShrink;
        return this;
    }
    public String getBackendServersShrink() {
        return this.backendServersShrink;
    }

    public SetBackendServersShrinkRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
