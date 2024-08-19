// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetImageSceneLabelListConfRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ImageServiceCode")
    public String imageServiceCode;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetImageSceneLabelListConfRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageSceneLabelListConfRequest self = new GetImageSceneLabelListConfRequest();
        return TeaModel.build(map, self);
    }

    public GetImageSceneLabelListConfRequest setImageServiceCode(String imageServiceCode) {
        this.imageServiceCode = imageServiceCode;
        return this;
    }
    public String getImageServiceCode() {
        return this.imageServiceCode;
    }

    public GetImageSceneLabelListConfRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
