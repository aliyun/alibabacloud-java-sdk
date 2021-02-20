// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsPublicOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateAvdsPublicOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsPublicOrderResponseBody self = new CreateAvdsPublicOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAvdsPublicOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAvdsPublicOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
