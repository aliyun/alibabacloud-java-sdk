// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeMultiZoneAvailableResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-bef-aliyun</p>
     */
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
