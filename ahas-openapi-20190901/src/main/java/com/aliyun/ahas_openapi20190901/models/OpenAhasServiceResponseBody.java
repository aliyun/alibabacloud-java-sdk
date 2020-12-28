// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class OpenAhasServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static OpenAhasServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenAhasServiceResponseBody self = new OpenAhasServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenAhasServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenAhasServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
