// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelCertificateForPackageRequestRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
