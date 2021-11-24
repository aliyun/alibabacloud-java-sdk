// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAcceleratorResponseBody extends TeaModel {
    // 全球加速实例ID
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    // 订单Id
    @NameInMap("OrderId")
    public String orderId;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBasicAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAcceleratorResponseBody self = new CreateBasicAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBasicAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicAcceleratorResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateBasicAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
