// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeOrderForIsvRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202*********415</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    public static DescribeOrderForIsvRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderForIsvRequest self = new DescribeOrderForIsvRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrderForIsvRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
