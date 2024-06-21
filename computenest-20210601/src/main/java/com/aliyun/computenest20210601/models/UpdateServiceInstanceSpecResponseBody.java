// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23396265896****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceSpecResponseBody self = new UpdateServiceInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateServiceInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
