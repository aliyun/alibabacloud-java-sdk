// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    public static CreateCertificateWithCsrRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithCsrRequestResponseBody self = new CreateCertificateWithCsrRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithCsrRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCertificateWithCsrRequestResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
