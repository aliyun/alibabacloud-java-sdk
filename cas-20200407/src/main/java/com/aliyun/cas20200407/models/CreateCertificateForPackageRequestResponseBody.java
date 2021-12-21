// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestResponseBody extends TeaModel {
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCertificateForPackageRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateForPackageRequestResponseBody self = new CreateCertificateForPackageRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateForPackageRequestResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateCertificateForPackageRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
