// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableEcsTypesRequest extends TeaModel {
    /**
     * <p>The billing method of the ECS instances. Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go</li>
     * <li>PrePaid: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>Specifies whether the ECS instances are sold out. Valid values:</p>
     * <ul>
     * <li>false: available</li>
     * <li>true: sold out</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowSoldOut")
    public Boolean showSoldOut;

    /**
     * <p>The preemption policy of the ECS instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The ECS instances are pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The ECS instances are preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
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
