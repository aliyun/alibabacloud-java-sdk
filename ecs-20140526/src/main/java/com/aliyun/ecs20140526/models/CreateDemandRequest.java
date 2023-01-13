// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandRequest extends TeaModel {
    /**
     * <p>The required quantity of instances of the filed instance type. Valid values: 1 to 100000.</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value that is unique among different requests. The `ClientToken` value can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the requirement. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     */
    @NameInMap("DemandDescription")
    public String demandDescription;

    /**
     * <p>The name of the requirement. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter and cannot start with http:// or https://.</p>
     * <br>
     * <p>The default value is the instance type name.</p>
     */
    @NameInMap("DemandName")
    public String demandName;

    /**
     * <p>The end time of the subscription period. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
     * <br>
     * <p>If the value of seconds (ss) is not 00, the time is automatically set to the start time of the current minute (mm).</p>
     * <br>
     * <p>The value of EndTime is later than the value of Starttime.</p>
     * <br>
     * <p>Typically, the interval between the two time cannot be more than 10 days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The billing method of the filed instance. Default value: PostPaid. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <p>*   PostPaid: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type of the filed instance. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of the target instance type, or see [Select instance types](~~58291~~) to learn how to select instance types.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period of the resource. Valid values:</p>
     * <br>
     * <p>*   When the value of PeriodUnit is Day, the valid values of Period are 1, 2, 3, 4, 5, and 6.</p>
     * <p>*   When the value of PeriodUnit is Week, the valid values of Period are 1, 2, 3, and 4.</p>
     * <p>*   When the value of PeriodUnit is Month, the valid values of Period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Default value: Month. Valid values:</p>
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
     * <p>If the value of seconds (ss) is not 00, the time is automatically set to the start time of the current minute (mm).</p>
     * <br>
     * <p>The value of EndTime is later than the value of Starttime.</p>
     * <br>
     * <p>Typically, the interval between the two time cannot be more than 10 days.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the zone to which the filed instance belongs. For more information, call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     * <br>
     * <p>This parameter is empty by default. If you do not specify a zone, the system randomly selects a zone.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandRequest self = new CreateDemandRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemandRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateDemandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDemandRequest setDemandDescription(String demandDescription) {
        this.demandDescription = demandDescription;
        return this;
    }
    public String getDemandDescription() {
        return this.demandDescription;
    }

    public CreateDemandRequest setDemandName(String demandName) {
        this.demandName = demandName;
        return this;
    }
    public String getDemandName() {
        return this.demandName;
    }

    public CreateDemandRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateDemandRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateDemandRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateDemandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDemandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDemandRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDemandRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDemandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDemandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDemandRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateDemandRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
