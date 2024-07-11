// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeDiskSizeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3C22622B-8555-42BF-AD8A-1B960743****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>493A762B-E4A6-44E9-B877-CA6D0CAF8B29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeDiskSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskSizeResponseBody self = new ResizeDiskSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeDiskSizeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeDiskSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
