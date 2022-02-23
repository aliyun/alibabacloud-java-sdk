// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ConfirmOrderRequest extends TeaModel {
    @NameInMap("OrderInfo")
    public String orderInfo;

    public static ConfirmOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmOrderRequest self = new ConfirmOrderRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmOrderRequest setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public String getOrderInfo() {
        return this.orderInfo;
    }

}
