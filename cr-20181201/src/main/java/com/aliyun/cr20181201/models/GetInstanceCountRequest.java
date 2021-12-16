// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceCountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetInstanceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceCountRequest self = new GetInstanceCountRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
