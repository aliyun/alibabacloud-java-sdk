// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersShrinkRequest extends TeaModel {
    /**
     * <p>The list of backend servers to add. You can add up to 20 backend servers per invoke.</p>
     * <blockquote>
     * <p>Backend servers (ENS instances) must be in the Running state before they can be added to a load balancing instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendServers")
    public String backendServersShrink;

    /**
     * <p>The frontend port used by the load balancing instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
