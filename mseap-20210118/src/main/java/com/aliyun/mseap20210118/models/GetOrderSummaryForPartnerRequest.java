// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetOrderSummaryForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1672369049358</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    public static GetOrderSummaryForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderSummaryForPartnerRequest self = new GetOrderSummaryForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderSummaryForPartnerRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
