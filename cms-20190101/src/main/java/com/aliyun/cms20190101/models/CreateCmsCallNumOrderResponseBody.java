// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsCallNumOrderResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCmsCallNumOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsCallNumOrderResponseBody self = new CreateCmsCallNumOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCmsCallNumOrderResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateCmsCallNumOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
