// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202*********415</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    public static DescribeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderRequest self = new DescribeOrderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
