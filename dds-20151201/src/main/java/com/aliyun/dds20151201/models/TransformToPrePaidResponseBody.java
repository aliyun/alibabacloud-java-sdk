// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class TransformToPrePaidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public String orderId;

    public static TransformToPrePaidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransformToPrePaidResponseBody self = new TransformToPrePaidResponseBody();
        return TeaModel.build(map, self);
    }

    public TransformToPrePaidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransformToPrePaidResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
