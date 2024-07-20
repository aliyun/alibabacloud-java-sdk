// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The order ID.</p>
     * <p>This parameter is returned only if ChargeType is set to PREPAY.</p>
     * <p>If <strong>AutoPay</strong> is set to <strong>false</strong>, go to <a href="https://usercenter2-intl.aliyun.com/order/list">Order Center</a> to complete the payment after an order is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>2082574365</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
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
