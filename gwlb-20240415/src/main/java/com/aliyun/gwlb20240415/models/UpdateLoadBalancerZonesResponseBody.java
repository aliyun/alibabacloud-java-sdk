// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerZonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ED8905C2-A4F6-5E43-87B7-6A5DC8757146</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerZonesResponseBody self = new UpdateLoadBalancerZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
