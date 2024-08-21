// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelCertificateForPackageRequestRequest extends TeaModel {
    /**
     * <p>The order ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123451222</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static CancelCertificateForPackageRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCertificateForPackageRequestRequest self = new CancelCertificateForPackageRequestRequest();
        return TeaModel.build(map, self);
    }

    public CancelCertificateForPackageRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
