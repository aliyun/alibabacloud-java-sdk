// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransformInstanceChargeTypeResponseBody extends TeaModel {
    // The ID of the order.
    @NameInMap("OrderId")
    public String orderId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static TransformInstanceChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformInstanceChargeTypeResponseBody self = new TransformInstanceChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformInstanceChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransformInstanceChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
