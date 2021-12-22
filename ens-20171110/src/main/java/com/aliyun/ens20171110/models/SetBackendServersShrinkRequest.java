// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetBackendServersShrinkRequest extends TeaModel {
    @NameInMap("BackendServers")
    public String backendServersShrink;

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
