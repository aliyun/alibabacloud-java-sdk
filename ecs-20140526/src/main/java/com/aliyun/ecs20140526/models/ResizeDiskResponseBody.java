// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20413515388****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F3CD6886-D8D0-4FEE-B93E-1B732396****</p>
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
