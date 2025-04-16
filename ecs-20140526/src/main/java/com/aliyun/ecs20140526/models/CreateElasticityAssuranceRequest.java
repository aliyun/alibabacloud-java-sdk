// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The total number of times that the elasticity assurance can be used. Set the value to Unlimited. This value specifies that the elasticity assurance can be used for an unlimited number of times within its validity period.</p>
     * <p>Default value: Unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>Specifies whether to enable auto-renewal for the elasticity assurance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Unit: month. Valid values: 1, 2, 3, 6, 12, 24, and 36.</p>
     * <ul>
     * <li>Default value when <code>PeriodUnit</code> is set to Month: 1.</li>
     * <li>Default value when <code>PeriodUnit</code> is set to Year: 12.</li>
     * </ul>
     * <blockquote>
     * <p> If you set <code>AutoRenew</code> to <code>true</code>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that you want to use to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the elasticity assurance. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The total number of instances of an instance type for which you want to reserve capacity.</p>
     * <p>Valid values: 1 to 1000.</p>
     * <blockquote>
     * <p> You must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <blockquote>
     * <p>This parameter is no longer used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    /**
     * <p>The instance type. An elasticity assurance can be created to reserve the capacity of a single instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.xlarge</p>
     */
    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The validity period of the elasticity assurance. The unit of the validity period is determined by the value of <code>PeriodUnit</code>. Valid values:</p>
     * <ul>
     * <li>When the value of <code>PeriodUnit</code> is <code>Month</code>, the valid values are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>When the value of <code>PeriodUnit</code> is <code>Year</code>, the valid values are 1, 2, 3, 4, and 5.</li>
     * <li>When the value of <code>PeriodUnit</code> is <code>Day</code>, the valid values are 1 to 365.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the validity period of the elasticity assurance. Valid values:</p>
     * <ul>
     * <li><p>Month</p>
     * </li>
     * <li><p>Year</p>
     * </li>
     * <li><p>Day</p>
     * <p>**</p>
     * <p><strong>Note</strong> If you set <code>PeriodUnit</code> to <code>Day</code>, you must specify RecurrenceRules to create a time-segmented elasticity assurance.</p>
     * </li>
     * </ul>
     * <p>Default value: Year.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The assurance schedules of the time-segmented elasticity assurance.</p>
     * <blockquote>
     * <p> Time-segmented elasticity assurances are available only in specific regions and to specific users. To use time-segmented elasticity assurances, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     */
    @NameInMap("RecurrenceRules")
    public java.util.List<CreateElasticityAssuranceRequestRecurrenceRules> recurrenceRules;

    /**
     * <p>The ID of the region in which to create the elasticity assurance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the elasticity assurance.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when the elasticity assurance takes effect. The default value is the time when the CreateElasticityAssurance operation is called to create the elasticity assurance. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-30T06:32:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tags to add to the elasticity assurance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateElasticityAssuranceRequestTag> tag;

    /**
     * <p>The ID of the zone in which to create the elasticity assurance. An elasticity assurance can be used to reserve resources within a single zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    public static CreateElasticityAssuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticityAssuranceRequest self = new CreateElasticityAssuranceRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticityAssuranceRequest setPrivatePoolOptions(CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateElasticityAssuranceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateElasticityAssuranceRequest setAssuranceTimes(String assuranceTimes) {
        this.assuranceTimes = assuranceTimes;
        return this;
    }
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    public CreateElasticityAssuranceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateElasticityAssuranceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateElasticityAssuranceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateElasticityAssuranceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateElasticityAssuranceRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public CreateElasticityAssuranceRequest setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
        this.instanceCpuCoreCount = instanceCpuCoreCount;
        return this;
    }
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    public CreateElasticityAssuranceRequest setInstanceType(java.util.List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public java.util.List<String> getInstanceType() {
        return this.instanceType;
    }

    public CreateElasticityAssuranceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateElasticityAssuranceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateElasticityAssuranceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateElasticityAssuranceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateElasticityAssuranceRequest setRecurrenceRules(java.util.List<CreateElasticityAssuranceRequestRecurrenceRules> recurrenceRules) {
        this.recurrenceRules = recurrenceRules;
        return this;
    }
    public java.util.List<CreateElasticityAssuranceRequestRecurrenceRules> getRecurrenceRules() {
        return this.recurrenceRules;
    }

    public CreateElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateElasticityAssuranceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateElasticityAssuranceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateElasticityAssuranceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateElasticityAssuranceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateElasticityAssuranceRequest setTag(java.util.List<CreateElasticityAssuranceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateElasticityAssuranceRequestTag> getTag() {
        return this.tag;
    }

    public CreateElasticityAssuranceRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public static class CreateElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The type of the private pool with which you want to associate the elasticity assurance. Valid values:</p>
         * <ul>
         * <li>Open: open private pool. If you use the elasticity assurance to create ECS instances, the open private pool that is associated with the elasticity assurance is automatically matched. If no capacity is available in the open private pool, resources in the public pool are automatically used to create the ECS instances.</li>
         * <li>Target: targeted private pool. If you use the elasticity assurance to create ECS instances, the specified private pool that is associated with the elasticity assurance is automatically matched. If no capacity is available in the private pool, the ECS instances fail to be created.</li>
         * </ul>
         * <p>Default value: Open.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        /**
         * <p>The name of the elasticity assurance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>eapTestName</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateElasticityAssuranceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticityAssuranceRequestPrivatePoolOptions self = new CreateElasticityAssuranceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateElasticityAssuranceRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public CreateElasticityAssuranceRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateElasticityAssuranceRequestRecurrenceRules extends TeaModel {
        /**
         * <p>The end time of the assurance period for the capacity reservation of the time-segmented elasticity assurance. Specify an on-the-hour point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The type of the assurance schedule. Valid values:</p>
         * <ul>
         * <li>Daily</li>
         * <li>Weekly</li>
         * <li>Monthly</li>
         * </ul>
         * <blockquote>
         * <p> If you specify this parameter, you must specify <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The days of the week or month on which the capacity reservation of the time-segmented elasticity assurance takes effect or the interval, in number of days, at which the capacity reservation takes effect.</p>
         * <ul>
         * <li>If you set <code>RecurrenceType</code> to <code>Daily</code>, you can specify only one value for this parameter. Valid values: 1 to 31. The value specifies that the capacity reservation takes effect every few days.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Weekly</code>, you can specify multiple values for this parameter. Separate the values with commas (,). Valid values: 0, 1, 2, 3, 4, 5, and 6, which specify Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday, respectively. Example: <code>1,2</code>, which specifies that the capacity reservation takes effect on Monday and Tuesday.</li>
         * <li>If you set <code>RecurrenceType</code> to <code>Monthly</code>, you can specify two values in the <code>A-B</code> format for this parameter. Valid values of A and B: 1 to 31. B must be greater than or equal to A. Example: <code>1-5</code>, which specifies that the capacity reservation takes effect every day from the first day up to the fifth day of each month.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify this parameter, you must specify <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The start time of the assurance period for the capacity reservation of the time-segmented elasticity assurance. Specify an on-the-hour point in time.</p>
         * <blockquote>
         * <p> You must specify both <code>StartHour</code> and <code>EndHour</code>. The EndHour value must be at least 4 hours later than the StartHour value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("StartHour")
        public Integer startHour;

        public static CreateElasticityAssuranceRequestRecurrenceRules build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticityAssuranceRequestRecurrenceRules self = new CreateElasticityAssuranceRequestRecurrenceRules();
            return TeaModel.build(map, self);
        }

        public CreateElasticityAssuranceRequestRecurrenceRules setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public CreateElasticityAssuranceRequestRecurrenceRules setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public CreateElasticityAssuranceRequestRecurrenceRules setRecurrenceValue(String recurrenceValue) {
            this.recurrenceValue = recurrenceValue;
            return this;
        }
        public String getRecurrenceValue() {
            return this.recurrenceValue;
        }

        public CreateElasticityAssuranceRequestRecurrenceRules setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

    }

    public static class CreateElasticityAssuranceRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the elasticity assurance. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the elasticity assurance. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateElasticityAssuranceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticityAssuranceRequestTag self = new CreateElasticityAssuranceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateElasticityAssuranceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateElasticityAssuranceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
