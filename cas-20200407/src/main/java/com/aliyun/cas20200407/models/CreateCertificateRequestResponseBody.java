// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate application order.</p>
     * <blockquote>
     * <p> You can use the ID to query the status of the certificate application. For more information, see <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>98987582437920968</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCertificateRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequestResponseBody self = new CreateCertificateRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequestResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateCertificateRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
