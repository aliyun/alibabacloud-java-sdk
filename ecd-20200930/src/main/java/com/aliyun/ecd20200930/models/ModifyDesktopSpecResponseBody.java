// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OrderIds")
    public java.util.List<Long> orderIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDesktopSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopSpecResponseBody self = new ModifyDesktopSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDesktopSpecResponseBody setOrderIds(java.util.List<Long> orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public java.util.List<Long> getOrderIds() {
        return this.orderIds;
    }

    public ModifyDesktopSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
