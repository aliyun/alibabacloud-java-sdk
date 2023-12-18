// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the ELB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the ELB instance. The name must be **2** to **128** characters in length.</p>
     * <br>
     * <p>>  The value cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    public static ModifyLoadBalancerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerAttributeRequest self = new ModifyLoadBalancerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public ModifyLoadBalancerAttributeRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

}
