// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ShowQuickAnalysisRequest extends TeaModel {
    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in the Chinese mainland or in the China (Hong Kong) region.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ShowQuickAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        ShowQuickAnalysisRequest self = new ShowQuickAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public ShowQuickAnalysisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
