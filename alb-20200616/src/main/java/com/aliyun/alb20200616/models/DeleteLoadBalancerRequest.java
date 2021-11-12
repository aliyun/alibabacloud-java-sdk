// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerRequest extends TeaModel {
    // 幂等标识
    @NameInMap("ClientToken")
    public String clientToken;

    //  是否只预检此次请求
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 实例id
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DeleteLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerRequest self = new DeleteLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteLoadBalancerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
