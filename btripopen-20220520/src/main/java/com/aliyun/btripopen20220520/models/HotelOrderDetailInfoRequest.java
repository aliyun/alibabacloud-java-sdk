// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderDetailInfoRequest extends TeaModel {
    @NameInMap("dis_order_id")
    public String disOrderId;

    public static HotelOrderDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderDetailInfoRequest self = new HotelOrderDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderDetailInfoRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

}
