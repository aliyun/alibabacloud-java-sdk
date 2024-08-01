// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RenewDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>203317xxxxxxxx</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B118EF45-9633-4EE3-8405-42ED4373721B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDBInstanceResponseBody self = new RenewDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDBInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RenewDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
