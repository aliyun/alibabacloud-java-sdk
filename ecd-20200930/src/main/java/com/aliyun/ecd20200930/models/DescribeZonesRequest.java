// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The region ID. Call <a href="t2167755.xdita#"></a>to get the list of regions supported by EDS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcAccessZone")
    public Boolean vpcAccessZone;

    /**
     * <p>The zone type to query. Default value: <code>AvailabilityZone</code>. This queries standard cloud zones.</p>
     * 
     * <strong>example:</strong>
     * <p>AvailabilityZone</p>
     */
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

    public DescribeZonesRequest setVpcAccessZone(Boolean vpcAccessZone) {
        this.vpcAccessZone = vpcAccessZone;
        return this;
    }
    public Boolean getVpcAccessZone() {
        return this.vpcAccessZone;
    }

    public DescribeZonesRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

}
