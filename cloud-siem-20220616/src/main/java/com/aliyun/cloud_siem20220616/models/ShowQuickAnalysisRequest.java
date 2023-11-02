// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ShowQuickAnalysisRequest extends TeaModel {
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
