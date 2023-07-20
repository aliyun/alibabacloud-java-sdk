// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsSaleControlAvailableResourceRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CustomAccount")
    public String customAccount;

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

    public DescribeEnsSaleControlAvailableResourceRequest setCustomAccount(String customAccount) {
        this.customAccount = customAccount;
        return this;
    }
    public String getCustomAccount() {
        return this.customAccount;
    }

    public DescribeEnsSaleControlAvailableResourceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
