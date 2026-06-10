// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecResponseBody extends TeaModel {
    /**
     * <p>The order ID. You can find the order ID in &lt;props=&quot;china&quot;&gt;<a href="https://billing-cost.console.aliyun.com/order/list">Expenses and Costs &gt; My Orders</a>. &lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/order/list">Expenses and Costs &gt; Order Management</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>219861020660568</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F89BBB13-8B3B-5C8A-A700-EEFDC17B8227</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDiskSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecResponseBody self = new ModifyDiskSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDiskSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifyDiskSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
