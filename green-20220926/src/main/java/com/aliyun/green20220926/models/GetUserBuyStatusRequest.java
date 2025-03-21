// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUserBuyStatusRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetUserBuyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserBuyStatusRequest self = new GetUserBuyStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUserBuyStatusRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetUserBuyStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
