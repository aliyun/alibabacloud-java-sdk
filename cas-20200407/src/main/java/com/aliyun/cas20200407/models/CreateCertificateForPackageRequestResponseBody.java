// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate application order.</p>
     * <blockquote>
     * <p> You can use the ID to query the status of the certificate application order. For more information, see <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021010</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5890029B-938A-589E-98B9-3DEC7BA7C400</p>
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
