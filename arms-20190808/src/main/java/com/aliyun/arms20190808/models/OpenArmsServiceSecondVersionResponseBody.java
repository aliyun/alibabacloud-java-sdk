// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsServiceSecondVersionResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenArmsServiceSecondVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceSecondVersionResponseBody self = new OpenArmsServiceSecondVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceSecondVersionResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenArmsServiceSecondVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
