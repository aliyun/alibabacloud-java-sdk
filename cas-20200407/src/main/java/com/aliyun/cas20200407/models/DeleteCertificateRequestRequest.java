// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestRequest extends TeaModel {
    /**
     * <p>The ID of the certificate application order that you want to delete.</p>
     * <blockquote>
     * <p> After you call the <a href="https://help.aliyun.com/document_detail/455296.html">CreateCertificateForPackageRequest</a>, <a href="https://help.aliyun.com/document_detail/455292.html">CreateCertificateRequest</a>, or <a href="https://help.aliyun.com/document_detail/455801.html">CreateCertificateWithCsrRequest</a> operation to submit a certificate application, you can obtain the ID of the certificate application order from the <strong>OrderId</strong> response parameter. You can also call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the order ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123451222</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static DeleteCertificateRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequestRequest self = new DeleteCertificateRequestRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
