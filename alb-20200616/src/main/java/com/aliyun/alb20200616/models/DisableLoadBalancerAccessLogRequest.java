// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DisableLoadBalancerAccessLogRequest extends TeaModel {
    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    // 是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 实例id
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DisableLoadBalancerAccessLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableLoadBalancerAccessLogRequest self = new DisableLoadBalancerAccessLogRequest();
        return TeaModel.build(map, self);
    }

    public DisableLoadBalancerAccessLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableLoadBalancerAccessLogRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DisableLoadBalancerAccessLogRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
