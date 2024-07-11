// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeNodeCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20470860005****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>B288B41F-6681-42A6-8905-47C3C42B19B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeNodeCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeNodeCountResponseBody self = new ResizeNodeCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeNodeCountResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeNodeCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
