// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The order ID.</p>
     * <br>
     * <p>This parameter is returned only if ChargeType is set to PREPAY.</p>
     * <br>
     * <p>If **AutoPay** is set to **false**, go to [Order Center](https://usercenter2-intl.aliyun.com/order/list) to complete the payment after an order is generated.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
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
