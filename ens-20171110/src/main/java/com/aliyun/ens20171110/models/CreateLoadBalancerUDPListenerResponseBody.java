// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerUDPListenerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoadBalancerUDPListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerUDPListenerResponseBody self = new CreateLoadBalancerUDPListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerUDPListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
