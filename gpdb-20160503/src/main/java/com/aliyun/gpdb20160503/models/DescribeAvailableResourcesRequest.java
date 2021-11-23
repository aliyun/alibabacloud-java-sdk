// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourcesRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Region")
    public String region;

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
