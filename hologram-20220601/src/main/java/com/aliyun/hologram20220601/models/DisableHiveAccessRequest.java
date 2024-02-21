// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableHiveAccessRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DisableHiveAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableHiveAccessRequest self = new DisableHiveAccessRequest();
        return TeaModel.build(map, self);
    }

    public DisableHiveAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
