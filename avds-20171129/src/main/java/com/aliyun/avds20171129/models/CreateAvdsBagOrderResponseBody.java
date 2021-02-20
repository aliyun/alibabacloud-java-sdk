// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsBagOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateAvdsBagOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsBagOrderResponseBody self = new CreateAvdsBagOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAvdsBagOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAvdsBagOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
