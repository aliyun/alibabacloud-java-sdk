// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterDiskSizeResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static ResizeMultiZoneClusterDiskSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterDiskSizeResponseBody self = new ResizeMultiZoneClusterDiskSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterDiskSizeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeMultiZoneClusterDiskSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
