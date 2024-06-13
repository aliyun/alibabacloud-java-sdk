// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate application order.</p>
     * <br>
     * <p>> You can use the ID to query the status of the certificate application order. For more information, see [DescribeCertificateState](https://help.aliyun.com/document_detail/455800.html).</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
