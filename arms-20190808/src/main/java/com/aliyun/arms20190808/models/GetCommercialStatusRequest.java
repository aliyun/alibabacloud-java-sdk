// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCommercialStatusRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("RegionId")
    public String regionId;

    public static GetCommercialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialStatusRequest self = new GetCommercialStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCommercialStatusRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetCommercialStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
