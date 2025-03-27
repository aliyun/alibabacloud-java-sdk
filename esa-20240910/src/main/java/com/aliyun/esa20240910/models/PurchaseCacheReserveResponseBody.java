// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseCacheReserveResponseBody extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xcdn-ad*****s11w</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31223****11</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30423A7F-A83D-1E24-B80E-86DD25790758</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PurchaseCacheReserveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseCacheReserveResponseBody self = new PurchaseCacheReserveResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseCacheReserveResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PurchaseCacheReserveResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PurchaseCacheReserveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
