// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerAttributeResponseBody self = new ModifyLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
