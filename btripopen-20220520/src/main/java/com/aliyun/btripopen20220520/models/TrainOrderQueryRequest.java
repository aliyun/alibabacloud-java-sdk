// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("user_id")
    public String userId;

    public static TrainOrderQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderQueryRequest self = new TrainOrderQueryRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public TrainOrderQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
