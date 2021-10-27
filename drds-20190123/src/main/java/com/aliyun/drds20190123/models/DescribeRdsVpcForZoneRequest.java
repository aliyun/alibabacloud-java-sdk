// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsVpcForZoneRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeRdsVpcForZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVpcForZoneRequest self = new DescribeRdsVpcForZoneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVpcForZoneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRdsVpcForZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
