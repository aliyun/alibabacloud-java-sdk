// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardDeviceInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDashboardDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardDeviceInfoRequest self = new DescribeDashboardDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardDeviceInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
