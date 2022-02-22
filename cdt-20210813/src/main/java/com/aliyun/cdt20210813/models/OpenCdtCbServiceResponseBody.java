// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtCbServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenCdtCbServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtCbServiceResponseBody self = new OpenCdtCbServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCdtCbServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OpenCdtCbServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
