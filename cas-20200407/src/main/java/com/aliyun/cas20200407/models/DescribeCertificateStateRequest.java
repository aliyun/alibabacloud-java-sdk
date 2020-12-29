// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrderId")
    public Long orderId;

    public static DescribeCertificateStateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateRequest self = new DescribeCertificateStateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateStateRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCertificateStateRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
