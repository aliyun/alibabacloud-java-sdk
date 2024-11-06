// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersShrinkRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add to the Edge Load Balancer (ELB) instance. You can add up to 20 backend servers at a time.</p>
     * <blockquote>
     * <p> Only Edge Node Service (ENS) instances that are in the running state can be added to the ELB instance as backend servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendServers")
    public String backendServersShrink;

    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5qzdmxefgrpxd7oz2mefonvtx</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static AddBackendServersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersShrinkRequest self = new AddBackendServersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddBackendServersShrinkRequest setBackendServersShrink(String backendServersShrink) {
        this.backendServersShrink = backendServersShrink;
        return this;
    }
    public String getBackendServersShrink() {
        return this.backendServersShrink;
    }

    public AddBackendServersShrinkRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
