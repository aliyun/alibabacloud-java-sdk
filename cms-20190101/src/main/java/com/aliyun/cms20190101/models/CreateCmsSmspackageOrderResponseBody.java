// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsSmspackageOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static CreateCmsSmspackageOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsSmspackageOrderResponseBody self = new CreateCmsSmspackageOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCmsSmspackageOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCmsSmspackageOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
