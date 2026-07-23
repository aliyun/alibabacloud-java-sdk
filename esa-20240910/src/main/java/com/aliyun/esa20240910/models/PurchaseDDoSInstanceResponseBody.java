// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseDDoSInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>esa-ddos-9tuv*********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>2223332122***</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PurchaseDDoSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PurchaseDDoSInstanceResponseBody self = new PurchaseDDoSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public PurchaseDDoSInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PurchaseDDoSInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PurchaseDDoSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
