// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableHiveAccessRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static EnableHiveAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHiveAccessRequest self = new EnableHiveAccessRequest();
        return TeaModel.build(map, self);
    }

    public EnableHiveAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
