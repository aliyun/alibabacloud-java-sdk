// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate application order that is renewed.</p>
     * <br>
     * <p>> You can use the ID to query the status of the certificate application. For more information, see [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html).</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     */
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
