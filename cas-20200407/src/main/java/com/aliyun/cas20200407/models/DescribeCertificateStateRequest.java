// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateRequest extends TeaModel {
    /**
     * <p>The ID of the certificate application order that you want to query.</p>
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
