// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneType")
    public String zoneType;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeZonesRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

}
