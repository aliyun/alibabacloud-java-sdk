// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class OpenCdtInternetServiceResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static OpenCdtInternetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenCdtInternetServiceResponseBody self = new OpenCdtInternetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenCdtInternetServiceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public OpenCdtInternetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
