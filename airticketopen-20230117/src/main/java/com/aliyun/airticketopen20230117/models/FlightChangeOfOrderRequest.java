// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FlightChangeOfOrderRequest extends TeaModel {
    @NameInMap("order_num")
    public Long orderNum;

    public static FlightChangeOfOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightChangeOfOrderRequest self = new FlightChangeOfOrderRequest();
        return TeaModel.build(map, self);
    }

    public FlightChangeOfOrderRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

}
