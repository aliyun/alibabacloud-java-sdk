// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class RestoreCapacityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static RestoreCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreCapacityRequest self = new RestoreCapacityRequest();
        return TeaModel.build(map, self);
    }

    public RestoreCapacityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
