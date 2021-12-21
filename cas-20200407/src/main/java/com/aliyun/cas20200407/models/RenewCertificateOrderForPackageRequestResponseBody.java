// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static RenewCertificateOrderForPackageRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewCertificateOrderForPackageRequestResponseBody self = new RenewCertificateOrderForPackageRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewCertificateOrderForPackageRequestResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public RenewCertificateOrderForPackageRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
