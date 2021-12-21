// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestRequest extends TeaModel {
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
