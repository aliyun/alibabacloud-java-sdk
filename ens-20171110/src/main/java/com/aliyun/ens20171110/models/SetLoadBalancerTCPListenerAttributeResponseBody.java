// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerTCPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerTCPListenerAttributeResponseBody self = new SetLoadBalancerTCPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerTCPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
