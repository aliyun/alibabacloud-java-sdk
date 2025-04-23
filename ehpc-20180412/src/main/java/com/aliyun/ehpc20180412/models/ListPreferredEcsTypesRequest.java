// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListPreferredEcsTypesRequest extends TeaModel {
    /**
     * <p>The billing method of the ECS instances. Valid values:</p>
     * <ul>
     * <li>PostPaid</li>
     * <li>PrePaid</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The bidding policy of the ECS instance. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
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
