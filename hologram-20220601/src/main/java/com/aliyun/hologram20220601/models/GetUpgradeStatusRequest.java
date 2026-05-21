// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetUpgradeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusRequest self = new GetUpgradeStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetUpgradeStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
