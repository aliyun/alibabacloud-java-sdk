// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopsResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopsResponseBody self = new RenewDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDesktopsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
