// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06F00FBB-3D9E-4CCE-9D43-1A6946A75456</p>
     */
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
