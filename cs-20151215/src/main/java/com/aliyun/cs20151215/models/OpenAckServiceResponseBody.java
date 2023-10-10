// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class OpenAckServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static OpenAckServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenAckServiceResponseBody self = new OpenAckServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenAckServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenAckServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
