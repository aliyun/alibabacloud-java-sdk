// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListPreferredEcsTypesRequest extends TeaModel {
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ListPreferredEcsTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPreferredEcsTypesRequest self = new ListPreferredEcsTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListPreferredEcsTypesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ListPreferredEcsTypesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ListPreferredEcsTypesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
