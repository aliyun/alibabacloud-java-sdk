// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>Order ID.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The order ID. This parameter is returned when \<code>InstanceChargeType\\</code> is set to \<code>PREPAY\\</code> (subscription). If \<code>AutoPay\\</code> is set to \<code>false\\</code>, go to the <a href="https://usercenter2.aliyun.com/order/list">Order Hub</a> on the Alibaba Cloud China site to complete the payment.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>If you are using the Alibaba Cloud International site and \<code>AutoPay\\</code> is set to \<code>false\\</code>, go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Order Hub</a> to complete the payment.</p>
     * 
     * <strong>example:</strong>
     * <p>208257****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAcceleratorResponseBody self = new CreateAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateAcceleratorResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
