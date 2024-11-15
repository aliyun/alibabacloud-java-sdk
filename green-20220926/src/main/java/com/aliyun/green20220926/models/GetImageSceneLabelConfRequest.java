// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetImageSceneLabelConfRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetImageSceneLabelConfRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageSceneLabelConfRequest self = new GetImageSceneLabelConfRequest();
        return TeaModel.build(map, self);
    }

    public GetImageSceneLabelConfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
