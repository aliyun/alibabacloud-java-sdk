// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelOrderRequestRequest extends TeaModel {
    /**
     * <p>The ID of the certificate order to cancel.</p>
     * <blockquote>
     * <p>Obtain this ID by calling <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123451222</p>
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
