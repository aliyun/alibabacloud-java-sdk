// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate application order.</p>
     * <br>
     * <p>>  You can use the ID to query the status of the certificate application. For more information, see [DescribeCertificateState](https://help.aliyun.com/document_detail/164111.html).</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCertificateWithCsrRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithCsrRequestResponseBody self = new CreateCertificateWithCsrRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithCsrRequestResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateCertificateWithCsrRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
