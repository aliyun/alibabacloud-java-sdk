// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopConsultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1003038202430742196</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>JP2024072600000006</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    public static IntlFlightReShopConsultRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopConsultRequest self = new IntlFlightReShopConsultRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopConsultRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopConsultRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

}
