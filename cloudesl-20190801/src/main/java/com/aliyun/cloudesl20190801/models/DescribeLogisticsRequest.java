// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DescribeLogisticsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    public static DescribeLogisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogisticsRequest self = new DescribeLogisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogisticsRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
