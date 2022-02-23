// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class QueryPriceRequest extends TeaModel {
    @NameInMap("OrderInfo")
    public String orderInfo;

    public static QueryPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPriceRequest self = new QueryPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryPriceRequest setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public String getOrderInfo() {
        return this.orderInfo;
    }

}
