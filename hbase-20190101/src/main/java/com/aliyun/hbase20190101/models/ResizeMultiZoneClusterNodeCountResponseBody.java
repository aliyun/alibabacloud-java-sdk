// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterNodeCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static ResizeMultiZoneClusterNodeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterNodeCountResponseBody self = new ResizeMultiZoneClusterNodeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterNodeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResizeMultiZoneClusterNodeCountResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
