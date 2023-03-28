// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDemandRequest extends TeaModel {
    /**
     * <p>The number of instances. Valid values: 1 to 100000.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the demand. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.</p>
     */
    @NameInMap("DemandDescription")
    public String demandDescription;

    /**
     * <p>The ID of the demand that you want to modify.</p>
     */
    @NameInMap("DemandId")
    public String demandId;

    /**
     * <p>The name of the demand. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     * <br>
     * <p>The default value is the instance type name.</p>
     */
    @NameInMap("DemandName")
    public String demandName;

    /**
     * <p>The end time of the subscription period. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
     * <br>
     * <p>If the value of seconds (ss) is not 00, the time is automatically set to the beginning of the specified minute (mm).</p>
     * <br>
     * <p>The value of EndTime must be later than the value of Starttime.</p>
     * <br>
     * <p>Typically, the interval between the two times cannot be more than 10 days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The billing method of the instance. Default value: PostPaid. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <p>*   PostPaid: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type. For more information, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of the filed instance type, or see [Select instance types](~~58291~~) to learn how to select instance types.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period of the resource. Unit: month. You must specify the parameter. This parameter is valid only when `InstanceChargeType` is set to PrePaid. Valid values:</p>
     * <br>
     * <p>*   Valid values when PeriodUnit is set to Week: 1, 2, 3, and 4.</p>
     * <p>*   Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period of the resource. Default value: Month. Valid values:</p>
     * <br>
     * <p>*   Day</p>
     * <p>*   Week</p>
     * <p>*   Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the subscription period. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
     * <br>
     * <p>If the value of seconds (ss) is not 00, the time is automatically set to the beginning of the specified minute (mm).</p>
     * <br>
     * <p>The value of EndTime must be later than the value of Starttime.</p>
     * <br>
     * <p>Typically, the interval between the two times cannot be more than 10 days.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     * <br>
     * <p>This parameter is empty by default. If you do not specify a zone, the system randomly selects one.</p>
     */
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
