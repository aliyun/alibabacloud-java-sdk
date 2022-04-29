// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryStatusRequest extends TeaModel {
    @NameInMap("Jwt")
    public String jwt;

    @NameInMap("OrderId")
    public Long orderId;

    public static OrderQueryStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryStatusRequest self = new OrderQueryStatusRequest();
        return TeaModel.build(map, self);
    }

    public OrderQueryStatusRequest setJwt(String jwt) {
        this.jwt = jwt;
        return this;
    }
    public String getJwt() {
        return this.jwt;
    }

    public OrderQueryStatusRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
