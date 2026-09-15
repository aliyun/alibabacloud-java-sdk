// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetGuardLogStatsRequest extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>lvwang_guardrail_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    public static GetGuardLogStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGuardLogStatsRequest self = new GetGuardLogStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetGuardLogStatsRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
