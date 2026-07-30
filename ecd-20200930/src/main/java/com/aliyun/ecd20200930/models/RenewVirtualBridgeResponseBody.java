// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewVirtualBridgeResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>214552063030752</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewVirtualBridgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewVirtualBridgeResponseBody self = new RenewVirtualBridgeResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewVirtualBridgeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RenewVirtualBridgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
