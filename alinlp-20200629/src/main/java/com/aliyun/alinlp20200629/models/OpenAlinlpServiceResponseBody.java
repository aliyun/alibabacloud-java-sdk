// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class OpenAlinlpServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenAlinlpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenAlinlpServiceResponseBody self = new OpenAlinlpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenAlinlpServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenAlinlpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
