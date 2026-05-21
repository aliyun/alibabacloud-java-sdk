// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DiscardUpgradeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DiscardUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        DiscardUpgradeRequest self = new DiscardUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public DiscardUpgradeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
