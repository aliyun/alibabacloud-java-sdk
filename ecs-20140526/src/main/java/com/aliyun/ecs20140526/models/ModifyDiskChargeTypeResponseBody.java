// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskChargeTypeResponseBody extends TeaModel {
    // The ID of the generated order.
    @NameInMap("OrderId")
    public String orderId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiskChargeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskChargeTypeResponseBody self = new ModifyDiskChargeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskChargeTypeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDiskChargeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
