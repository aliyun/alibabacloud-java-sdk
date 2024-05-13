// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    public static FlightOrderDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailInfoRequest self = new FlightOrderDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailInfoRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

}
