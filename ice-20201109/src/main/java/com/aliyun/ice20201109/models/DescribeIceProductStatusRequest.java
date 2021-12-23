// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeIceProductStatusRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeIceProductStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceProductStatusRequest self = new DescribeIceProductStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIceProductStatusRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeIceProductStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
