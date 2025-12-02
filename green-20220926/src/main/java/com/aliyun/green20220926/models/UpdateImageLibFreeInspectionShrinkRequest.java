// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateImageLibFreeInspectionShrinkRequest extends TeaModel {
    /**
     * <p>Configuration.</p>
     */
    @NameInMap("Config")
    public String configShrink;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateImageLibFreeInspectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageLibFreeInspectionShrinkRequest self = new UpdateImageLibFreeInspectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageLibFreeInspectionShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public UpdateImageLibFreeInspectionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
