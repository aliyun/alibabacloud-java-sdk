// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDemandRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DemandId")
    @Validation(required = true)
    public String demandId;

    @NameInMap("DemandName")
    public String demandName;

    @NameInMap("DemandDescription")
    public String demandDescription;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static ModifyDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDemandRequest self = new ModifyDemandRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDemandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDemandRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ModifyDemandRequest setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

    public ModifyDemandRequest setDemandName(String demandName) {
        this.demandName = demandName;
        return this;
    }
    public String getDemandName() {
        return this.demandName;
    }

    public ModifyDemandRequest setDemandDescription(String demandDescription) {
        this.demandDescription = demandDescription;
        return this;
    }
    public String getDemandDescription() {
        return this.demandDescription;
    }

    public ModifyDemandRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyDemandRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public ModifyDemandRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ModifyDemandRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public ModifyDemandRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyDemandRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyDemandRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
