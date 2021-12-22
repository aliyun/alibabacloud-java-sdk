// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersShrinkRequest extends TeaModel {
    @NameInMap("BackendServers")
    public String backendServersShrink;

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
