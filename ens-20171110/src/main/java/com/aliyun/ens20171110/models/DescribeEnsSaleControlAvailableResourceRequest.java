// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlAvailableResourceRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("OrderType")
    public String orderType;

    public static DescribeEnsSaleControlAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsSaleControlAvailableResourceRequest self = new DescribeEnsSaleControlAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsSaleControlAvailableResourceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeEnsSaleControlAvailableResourceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
