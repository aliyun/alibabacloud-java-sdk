// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeRateRequest extends TeaModel {
    @NameInMap("OrderId")
    public String orderId;

    public static DescribeRateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRateRequest self = new DescribeRateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRateRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
