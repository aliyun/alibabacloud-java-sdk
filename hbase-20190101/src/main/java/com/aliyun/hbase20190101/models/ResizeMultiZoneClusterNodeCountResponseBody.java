// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterNodeCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234123412****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>E2B7E9DA-1575-4B9D-A0E4-9468BAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeMultiZoneClusterNodeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterNodeCountResponseBody self = new ResizeMultiZoneClusterNodeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterNodeCountResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeMultiZoneClusterNodeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
