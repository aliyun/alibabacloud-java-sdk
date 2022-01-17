// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    @NameInMap("Commodity")
    public String commodity;

    @NameInMap("OrderType")
    public String orderType;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
