// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDemandRequest extends TeaModel {
    /**
     * <p>The number of instances. Valid values: 1 to 100000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The value of <code>ClientToken</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the demand. The description must be 2 to 256 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-demand-desc</p>
     */
    @NameInMap("DemandDescription")
    public String demandDescription;

    /**
     * <p>The name of the demand. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with <a href="http://https://">http:// or https://</a>. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>The default value is the instance type name.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-demand</p>
     */
    @NameInMap("DemandName")
    public String demandName;

    /**
     * <p>The end time of the subscription period. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
     * <p>If the value of seconds (ss) is not 00, the time is automatically set to the beginning of the specified minute (mm). The value of EndTime is later than the value of Starttime. In most cases, the interval between the two times cannot be more than 10 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-10 12:05:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type. See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the performance data of an instance type, or see <a href="https://help.aliyun.com/document_detail/58291.html">Select instance types</a> to learn how to select instance types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period of the resource. Valid values:</p>
     * <ul>
     * <li>Valid values when the value of PeriodUnit is Day: 1, 2, 3, 4, 5, and 6.</li>
     * <li>Valid values when the value of PeriodUnit is Week: 1, 2, 3, and 4.</li>
     * <li>Valid values when the value of PeriodUnit is Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li>Day</li>
     * <li>Week</li>
     * <li>Month. This is the default value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the subscription period. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-dd HH:mm:ss format. The time must be in UTC.</p>
     * <p>If the value of seconds (ss) is not 00, the time is automatically set to the beginning of the specified minute (mm). The value of EndTime must be later than the value of Starttime. In most cases, the interval between the two times cannot be more than 10 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-01 12:05:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * <p>This parameter is empty by default. If you leave this parameter empty, the system randomly selects a zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
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
