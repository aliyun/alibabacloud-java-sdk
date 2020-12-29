// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeleteCertificateRequestRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrderId")
    public Long orderId;

    public static DeleteCertificateRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCertificateRequestRequest self = new DeleteCertificateRequestRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCertificateRequestRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteCertificateRequestRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
