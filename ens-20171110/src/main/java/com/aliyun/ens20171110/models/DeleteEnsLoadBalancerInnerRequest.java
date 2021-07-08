// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsLoadBalancerInnerRequest extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static DeleteEnsLoadBalancerInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsLoadBalancerInnerRequest self = new DeleteEnsLoadBalancerInnerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnsLoadBalancerInnerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
