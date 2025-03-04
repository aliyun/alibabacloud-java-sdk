// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopGroupResponseBody extends TeaModel {
    /**
     * <p>The order IDs.</p>
     */
    @NameInMap("OrderId")
    public java.util.List<String> orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E6732-2028-52FA-AB06-EA29C36B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewDesktopGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopGroupResponseBody self = new RenewDesktopGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDesktopGroupResponseBody setOrderId(java.util.List<String> orderId) {
        this.orderId = orderId;
        return this;
    }
    public java.util.List<String> getOrderId() {
        return this.orderId;
    }

    public RenewDesktopGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
