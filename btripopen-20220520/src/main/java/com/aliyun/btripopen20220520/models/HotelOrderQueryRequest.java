// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002145190081005400</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    public static HotelOrderQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderQueryRequest self = new HotelOrderQueryRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
