// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>246584390</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("user_id")
    public String userId;

    public static FlightOrderQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderQueryRequest self = new FlightOrderQueryRequest();
        return TeaModel.build(map, self);
    }

    public FlightOrderQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightOrderQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
