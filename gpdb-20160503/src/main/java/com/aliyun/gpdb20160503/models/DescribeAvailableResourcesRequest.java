// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourcesRequest extends TeaModel {
    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~86912~~) operation to query the most recent region list.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The zone ID.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](~~86912~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourcesRequest self = new DescribeAvailableResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourcesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAvailableResourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAvailableResourcesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
