// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate application order that you want to query.</p>
     * <br>
     * <p>> After you call the [CreateCertificateForPackageRequest](https://help.aliyun.com/document_detail/455296.html), [CreateCertificateRequest](https://help.aliyun.com/document_detail/455292.html), or [CreateCertificateWithCsrRequest](https://help.aliyun.com/document_detail/455801.html) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static DescribeCertificateStateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateRequest self = new DescribeCertificateStateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateStateRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
