// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCancelOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    public static FlightCancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightCancelOrderRequest self = new FlightCancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public FlightCancelOrderRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

}
