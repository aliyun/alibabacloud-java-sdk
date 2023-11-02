// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetCapacityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityRequest self = new GetCapacityRequest();
        return TeaModel.build(map, self);
    }

    public GetCapacityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
