// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ConfirmAiAppScanRequest extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The ID of the region where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConfirmAiAppScanRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAiAppScanRequest self = new ConfirmAiAppScanRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAiAppScanRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ConfirmAiAppScanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
