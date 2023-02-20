// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * <br>
     * <p>>  This parameter is returned only when subscription disks are resized.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeDiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskResponseBody self = new ResizeDiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeDiskResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ResizeDiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
