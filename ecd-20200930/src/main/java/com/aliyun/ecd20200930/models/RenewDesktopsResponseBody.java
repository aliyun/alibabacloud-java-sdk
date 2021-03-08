// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static RenewDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopsResponseBody self = new RenewDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewDesktopsResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
