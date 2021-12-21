// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RenewCertificateOrderForPackageRequestRequest extends TeaModel {
    @NameInMap("Csr")
    public String csr;

    @NameInMap("OrderId")
    public Long orderId;

    public static RenewCertificateOrderForPackageRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewCertificateOrderForPackageRequestRequest self = new RenewCertificateOrderForPackageRequestRequest();
        return TeaModel.build(map, self);
    }

    public RenewCertificateOrderForPackageRequestRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public RenewCertificateOrderForPackageRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
