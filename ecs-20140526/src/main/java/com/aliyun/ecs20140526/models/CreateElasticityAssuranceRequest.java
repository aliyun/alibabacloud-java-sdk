// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The total number of times that the elasticity assurance can be applied. Valid values: Unlimited. Currently, only the unlimited mode is supported within the service validity period.</p>
     * <p>Default value: Unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: Auto-renewal is enabled.</li>
     * <li>false: Auto-renewal is disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Unit: months. Valid values: 1, 2, 3, 6, 12, 24, and 36.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit=Month</code>, the default value is 1.</p>
     * </li>
     * <li><p>If <code>PeriodUnit=Year</code>, the default value is 12.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <code>AutoRenew</code> is set to <code>True</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <code>ClientToken</code> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the elasticity assurance service. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The total number of instances to be reserved for a single instance type.</p>
     * <p>Valid values: 1 to 1000.</p>
     * <blockquote>
     * <p>Notice: This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    /**
     * <p>The instance type. Currently, you can configure an elasticity assurance service for only one instance type.</p>
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
     * <p>The purchase duration. The unit of the duration is determined by the <code>PeriodUnit</code> parameter. Valid values:</p>
     * <ul>
     * <li>If <code>PeriodUnit</code> is set to <code>Month</code>: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>If <code>PeriodUnit</code> is set to <code>Year</code>: 1, 2, 3, 4, and 5.</li>
     * <li>If <code>PeriodUnit</code> is set to <code>Day</code>: 1 to 365.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the purchase duration. Valid values:</p>
     * <ul>
     * <li>Month: month.</li>
     * <li>Year: year.</li>
     * <li>Day: day.<blockquote>
     * <p>When <code>PeriodUnit</code> is set to <code>Day</code>, you must also specify RecurrenceRules to create a time-sharing elasticity assurance.</p>
     * </blockquote>
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
     * <p>The recurrence rules for the time-sharing elasticity assurance.</p>
     */
    @NameInMap("RecurrenceRules")
    public java.util.List<CreateElasticityAssuranceRequestRecurrenceRules> recurrenceRules;

    /**
     * <p>The region ID of the elasticity assurance service. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the elasticity assurance service belongs.</p>
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
     * <p>The effective period start time of the elasticity assurance service. By default, the service takes effect when the operation is invoked. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-10-30T06:32:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tags of the elasticity assurance service.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateElasticityAssuranceRequestTag> tag;

    /**
     * <p>The zone ID within the region of the elasticity assurance service. Currently, you can create an elasticity assurance service in only one zone.</p>
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
         * <p>The match mode of the elasticity assurance service. Valid values:</p>
         * <ul>
         * <li>Open: open mode. The system automatically matches the capacity of open private pools when instances are started. If no matching private pool capacity is available, public pool resources are used to start the instances.</li>
         * <li>Target: targeted mode. Instances are started by using the capacity of the specified private pool. If the specified private pool capacity is unavailable, the instances fail to start.</li>
         * </ul>
         * <p>Default value: Open.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        /**
         * <p>The name of the elasticity assurance service. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <p>The end time of the time-sharing assurance. The value must be on the hour.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The type of the recurrence rule. Valid values:</p>
         * <ul>
         * <li>Daily: daily recurrence.</li>
         * <li>Weekly: weekly recurrence.</li>
         * <li>Monthly: monthly recurrence.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The value of the recurrence rule.</p>
         * <ul>
         * <li>If <code>RecurrenceType</code> is set to <code>Daily</code>, you can specify only one value. Valid values: 1 to 31. The value specifies the interval in days between recurrences.</li>
         * <li>If <code>RecurrenceType</code> is set to <code>Weekly</code>, you can specify multiple values separated by commas (,). The values for Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, and Saturday are 0, 1, 2, 3, 4, 5, and 6. For example, <code>1,2</code> specifies Monday and Tuesday.</li>
         * <li>If <code>RecurrenceType</code> is set to <code>Monthly</code>, the format is <code>A-B</code>. Valid values of A and B: 1 to 31. B must be greater than or equal to A. For example, <code>1-5</code> specifies the 1st to 5th day of each month.</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both <code>RecurrenceType</code> and <code>RecurrenceValue</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrenceValue")
        public String recurrenceValue;

        /**
         * <p>The effective period start hour of the time-sharing assurance. The value must be on the hour.</p>
         * <blockquote>
         * <p>You must specify both <code>StartHour</code> and <code>EndHour</code>, and the difference between them must be at least 4 hours.</p>
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
         * <p>The tag key of the elasticity assurance service. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the elasticity assurance service. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
