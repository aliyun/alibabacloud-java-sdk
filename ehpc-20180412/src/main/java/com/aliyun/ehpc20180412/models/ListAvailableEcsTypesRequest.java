// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableEcsTypesRequest extends TeaModel {
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("ShowSoldOut")
    public Boolean showSoldOut;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ListAvailableEcsTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEcsTypesRequest self = new ListAvailableEcsTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableEcsTypesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ListAvailableEcsTypesRequest setShowSoldOut(Boolean showSoldOut) {
        this.showSoldOut = showSoldOut;
        return this;
    }
    public Boolean getShowSoldOut() {
        return this.showSoldOut;
    }

    public ListAvailableEcsTypesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ListAvailableEcsTypesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
