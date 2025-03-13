// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewDedicatedHostsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23841229****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A4EA075-CB5B-41B7-B0EB-70D339F6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDedicatedHostsResponseBody self = new RenewDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDedicatedHostsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
