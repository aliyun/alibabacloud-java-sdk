// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableResourceRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneCombination")
    public String zoneCombination;

    public static DescribeMultiZoneAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiZoneAvailableResourceRequest self = new DescribeMultiZoneAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMultiZoneAvailableResourceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeMultiZoneAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMultiZoneAvailableResourceRequest setZoneCombination(String zoneCombination) {
        this.zoneCombination = zoneCombination;
        return this;
    }
    public String getZoneCombination() {
        return this.zoneCombination;
    }

}
