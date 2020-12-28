// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static ModifyInstanceNetworkSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecResponseBody self = new ModifyInstanceNetworkSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceNetworkSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
