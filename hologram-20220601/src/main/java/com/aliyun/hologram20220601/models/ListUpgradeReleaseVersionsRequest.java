// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListUpgradeReleaseVersionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListUpgradeReleaseVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeReleaseVersionsRequest self = new ListUpgradeReleaseVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUpgradeReleaseVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
