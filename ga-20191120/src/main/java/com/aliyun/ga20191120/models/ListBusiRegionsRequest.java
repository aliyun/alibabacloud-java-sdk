// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBusiRegionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListBusiRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusiRegionsRequest self = new ListBusiRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListBusiRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
