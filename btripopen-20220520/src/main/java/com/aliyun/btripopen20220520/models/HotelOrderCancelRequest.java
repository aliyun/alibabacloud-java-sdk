// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCancelRequest extends TeaModel {
    @NameInMap("dis_order_id")
    public String disOrderId;

    public static HotelOrderCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCancelRequest self = new HotelOrderCancelRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderCancelRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

}
