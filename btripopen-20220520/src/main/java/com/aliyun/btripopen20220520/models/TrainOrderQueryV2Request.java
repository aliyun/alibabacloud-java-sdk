// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderQueryV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("user_id")
    public String userId;

    public static TrainOrderQueryV2Request build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderQueryV2Request self = new TrainOrderQueryV2Request();
        return TeaModel.build(map, self);
    }

    public TrainOrderQueryV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public TrainOrderQueryV2Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
