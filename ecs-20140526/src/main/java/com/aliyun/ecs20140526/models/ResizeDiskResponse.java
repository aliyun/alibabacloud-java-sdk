// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static ResizeDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskResponse self = new ResizeDiskResponse();
        return TeaModel.build(map, self);
    }

    public ResizeDiskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResizeDiskResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
