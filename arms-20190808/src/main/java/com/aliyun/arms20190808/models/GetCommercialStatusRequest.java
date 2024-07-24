// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCommercialStatusRequest extends TeaModel {
    /**
     * <p>The product code.</p>
     * <ul>
     * <li>arms_app_post</li>
     * <li>arms_web_post</li>
     * <li>arms_promethues_public_cn</li>
     * <li>prometheus_pay_public_cn</li>
     * <li>xtrace</li>
     * <li>arms_serverless_public_cn</li>
     * <li>arms_rumserverless_public_cn</li>
     * <li>prometheus_serverless_public_cn</li>
     * <li>xtrace_serverless_public_cn</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_app_post</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
