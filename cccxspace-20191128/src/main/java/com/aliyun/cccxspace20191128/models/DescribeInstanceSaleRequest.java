// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeInstanceSaleRequest extends TeaModel {
    @NameInMap("CommodityInstanceId")
    public String commodityInstanceId;

    public static DescribeInstanceSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSaleRequest self = new DescribeInstanceSaleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSaleRequest setCommodityInstanceId(String commodityInstanceId) {
        this.commodityInstanceId = commodityInstanceId;
        return this;
    }
    public String getCommodityInstanceId() {
        return this.commodityInstanceId;
    }

}
