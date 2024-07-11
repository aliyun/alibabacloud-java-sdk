// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterDiskSizeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123412341****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>568339C4-9F71-43D0-994E-E039CD826E56</p>
     */
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
