// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateElbBuyOrderResponseBody extends TeaModel {
    @NameInMap("LoadBalancerIds")
    public java.util.List<String> loadBalancerIds;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateElbBuyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateElbBuyOrderResponseBody self = new CreateElbBuyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateElbBuyOrderResponseBody setLoadBalancerIds(java.util.List<String> loadBalancerIds) {
        this.loadBalancerIds = loadBalancerIds;
        return this;
    }
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    public CreateElbBuyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
