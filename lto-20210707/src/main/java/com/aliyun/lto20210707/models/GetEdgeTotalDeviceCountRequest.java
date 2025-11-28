// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class GetEdgeTotalDeviceCountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetEdgeTotalDeviceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTotalDeviceCountRequest self = new GetEdgeTotalDeviceCountRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeTotalDeviceCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
