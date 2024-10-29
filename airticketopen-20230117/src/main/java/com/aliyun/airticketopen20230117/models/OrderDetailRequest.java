// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderDetailRequest extends TeaModel {
    /**
     * <p>order number created by book</p>
     * 
     * <strong>example:</strong>
     * <p>4966***617111</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <p>external order number(customized by buyer when book)</p>
     * 
     * <strong>example:</strong>
     * <p>x091-2023-0220-j-0001</p>
     */
    @NameInMap("out_order_num")
    public String outOrderNum;

    public static OrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        OrderDetailRequest self = new OrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public OrderDetailRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public OrderDetailRequest setOutOrderNum(String outOrderNum) {
        this.outOrderNum = outOrderNum;
        return this;
    }
    public String getOutOrderNum() {
        return this.outOrderNum;
    }

}
