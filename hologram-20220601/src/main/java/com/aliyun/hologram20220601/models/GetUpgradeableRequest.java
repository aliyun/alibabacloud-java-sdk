// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetUpgradeableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetUpgradeableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeableRequest self = new GetUpgradeableRequest();
        return TeaModel.build(map, self);
    }

    public GetUpgradeableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
