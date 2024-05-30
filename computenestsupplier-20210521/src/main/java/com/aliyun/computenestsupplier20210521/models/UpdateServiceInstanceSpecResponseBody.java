// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateServiceInstanceSpecResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceInstanceSpecResponseBody self = new UpdateServiceInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceInstanceSpecResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateServiceInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
