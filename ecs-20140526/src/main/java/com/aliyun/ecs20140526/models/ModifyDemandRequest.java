// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDemandRequest extends TeaModel {
    // The required quantity of instances of the filed instance type. Valid values: 1 to 100000.
    @NameInMap("Amount")
    public Integer amount;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The description of the requirement. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
    @NameInMap("DemandDescription")
    public String demandDescription;

    // The ID of the requirement to be modified.
    @NameInMap("DemandId")
    public String demandId;

    // The name of the requirement. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter and cannot start with http:// or https://.
    // 
    // The default value is the instance type name.
    @NameInMap("DemandName")
    public String demandName;

    // The end time of the subscription period. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.
    // 
    // If the value of seconds (ss) is not 00, the time is automatically set to the start time of the current minute (mm).
    // 
    // The value of EndTime is later than the value of Starttime.
    // 
    // Typically, the interval between the two time cannot be more than 10 days.
    @NameInMap("EndTime")
    public String endTime;

    // The billing method of the filed instance. Default value: PostPaid. Valid values:
    // 
    // *   PrePaid: subscription
    // *   PostPaid: pay-as-you-go
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The instance type of the filed instance. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of the filed instance type, or see [Select instance types](~~58291~~) to learn how to select instance types.
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The subscription period of the resource. Unit: month. This parameter takes effect only when the `InstanceChargeType` parameter is set to PrePaid. Valid values:
    // 
    // *   When the value of PeriodUnit is Week, the valid values of Period are 1, 2, 3, and 4.
    // *   When the value of PeriodUnit is Month, the valid values of Period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription period. Default value: Month. Valid values:
    // 
    // *   Day
    // *   Week
    // *   Month
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The region ID of the filed instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The start time of the subscription period. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.
    // 
    // If the value of seconds (ss) is not 00, the time is automatically set to the start time of the current minute (mm).
    // 
    // The value of EndTime is later than the value of Starttime.
    // 
    // Typically, the interval between the two time cannot be more than 10 days.
    @NameInMap("StartTime")
    public String startTime;

    // The zone ID of the filed instance. For more information, call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    // 
    // This parameter is empty by default. If you do not specify a zone, the system randomly selects a zone.
    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDemandRequest self = new ModifyDemandRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDemandRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public ModifyDemandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDemandRequest setDemandDescription(String demandDescription) {
        this.demandDescription = demandDescription;
        return this;
    }
    public String getDemandDescription() {
        return this.demandDescription;
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

    public ModifyDemandRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ModifyDemandRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ModifyDemandRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyDemandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDemandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDemandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDemandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDemandRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ModifyDemandRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
