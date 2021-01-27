// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAccelerateAreasRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAccelerateAreasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccelerateAreasRequest self = new ListAccelerateAreasRequest();
        return TeaModel.build(map, self);
    }

    public ListAccelerateAreasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
