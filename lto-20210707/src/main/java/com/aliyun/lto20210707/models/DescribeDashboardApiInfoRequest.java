// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardApiInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDashboardApiInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardApiInfoRequest self = new DescribeDashboardApiInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardApiInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
