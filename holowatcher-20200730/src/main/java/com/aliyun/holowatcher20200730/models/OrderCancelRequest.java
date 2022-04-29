// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderCancelRequest extends TeaModel {
    @NameInMap("Jwt")
    public String jwt;

    @NameInMap("OrderId")
    public Long orderId;

    public static OrderCancelRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderCancelRequest self = new OrderCancelRequest();
        return TeaModel.build(map, self);
    }

    public OrderCancelRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

    public OrderCancelRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
