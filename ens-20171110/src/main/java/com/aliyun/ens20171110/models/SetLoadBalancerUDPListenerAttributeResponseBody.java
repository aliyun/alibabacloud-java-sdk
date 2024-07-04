// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetLoadBalancerUDPListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06F00FBB-3D9E-4CCE-9D43-1A6946A75456</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLoadBalancerUDPListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLoadBalancerUDPListenerAttributeResponseBody self = new SetLoadBalancerUDPListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLoadBalancerUDPListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
