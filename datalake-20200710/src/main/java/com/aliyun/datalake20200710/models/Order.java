// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class Order extends TeaModel {
    // Col
    @NameInMap("Col")
    public String col;

    // Order
    @NameInMap("Order")
    public Integer order;

    public static Order build(java.util.Map<String, ?> map) throws Exception {
        Order self = new Order();
        return TeaModel.build(map, self);
    }

    public Order setCol(String col) {
        this.col = col;
        return this;
    }
    public String getCol() {
        return this.col;
    }

    public Order setOrder(Integer order) {
        this.order = order;
        return this;
    }
    public Integer getOrder() {
        return this.order;
    }

}
