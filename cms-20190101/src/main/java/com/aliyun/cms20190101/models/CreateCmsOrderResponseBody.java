// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateCmsOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsOrderResponseBody self = new CreateCmsOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCmsOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCmsOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
