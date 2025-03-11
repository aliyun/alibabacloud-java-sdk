// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsCommodityRequest extends TeaModel {
    /**
     * <p>The commodity code of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drdsPost</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds***********</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The type of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    public static DescribeRdsCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsCommodityRequest self = new DescribeRdsCommodityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsCommodityRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeRdsCommodityRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRdsCommodityRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

}
