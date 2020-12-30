// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsCommodityRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("OrderType")
    public String orderType;

    public static DescribeRdsCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsCommodityRequest self = new DescribeRdsCommodityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsCommodityRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRdsCommodityRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeRdsCommodityRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
