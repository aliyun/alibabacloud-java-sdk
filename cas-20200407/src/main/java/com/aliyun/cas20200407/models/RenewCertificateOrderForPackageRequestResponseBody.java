// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestResponseBody extends TeaModel {
    /**
     * <p>The ID of the certificate application order that is renewed.</p>
     * <blockquote>
     * <p> You can use the ID to query the status of the certificate application order. For more information, see <a href="https://help.aliyun.com/document_detail/164111.html">DescribeCertificateState</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>323451222</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
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
