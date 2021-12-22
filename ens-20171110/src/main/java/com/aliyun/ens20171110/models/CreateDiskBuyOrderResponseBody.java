// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskBuyOrderResponseBody extends TeaModel {
    // 订单id
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDiskBuyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskBuyOrderResponseBody self = new CreateDiskBuyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiskBuyOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDiskBuyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
