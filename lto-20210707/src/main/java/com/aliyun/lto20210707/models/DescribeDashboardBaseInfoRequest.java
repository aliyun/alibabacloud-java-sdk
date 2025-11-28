// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardBaseInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDashboardBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardBaseInfoRequest self = new DescribeDashboardBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardBaseInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
