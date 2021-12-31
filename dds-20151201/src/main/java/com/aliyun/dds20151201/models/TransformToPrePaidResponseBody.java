// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransformToPrePaidResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static TransformToPrePaidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformToPrePaidResponseBody self = new TransformToPrePaidResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformToPrePaidResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransformToPrePaidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
