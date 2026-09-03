// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to retrieve the list of regions supported by Alibaba Cloud Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether the zone supports VPC access.</p>
     */
    @NameInMap("VpcAccessZone")
    public Boolean vpcAccessZone;

    /**
     * <p>The type of zone to query. Default value: <code>AvailabilityZone</code>, which indicates a standard cloud zone.</p>
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
