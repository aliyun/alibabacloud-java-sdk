// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderDetailInfoRequest extends TeaModel {
    @NameInMap("btrip_order_id")
    public String btripOrderId;

    @NameInMap("dis_order_id")
    public String disOrderId;

    public static HotelOrderDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderDetailInfoRequest self = new HotelOrderDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderDetailInfoRequest setBtripOrderId(String btripOrderId) {
        this.btripOrderId = btripOrderId;
        return this;
    }
    public String getBtripOrderId() {
        return this.btripOrderId;
    }

    public HotelOrderDetailInfoRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

}
