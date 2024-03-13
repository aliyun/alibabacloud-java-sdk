// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelOrderRequestRequest extends TeaModel {
    /**
     * <p>The ID of the certificate application order that you want to cancel.</p>
     * <br>
     * <p>>  After you call the [CreateCertificateForPackageRequest](~~CreateCertificateForPackageRequest~~), [CreateCertificateRequest](~~CreateCertificateRequest~~), or [CreateCertificateWithCsrRequest](~~CreateCertificateWithCsrRequest~~) operation to submit a certificate application, you can obtain the ID of the certificate application order from the **OrderId** response parameter.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static CancelOrderRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequestRequest self = new CancelOrderRequestRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
