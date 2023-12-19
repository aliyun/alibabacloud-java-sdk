// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class OpenHbrServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenHbrServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenHbrServiceResponseBody self = new OpenHbrServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenHbrServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenHbrServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
