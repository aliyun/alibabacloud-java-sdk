// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The total number of times that the elasticity assurance can be applied. Set the value to Unlimited. This value indicates that the elasticity assurance can be applied an unlimited number of times within its effective duration.</p>
     * <br>
     * <p>Default value: Unlimited.</p>
     */
    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    /**
     * <p>The client token that you want to use to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the elasticity assurance. The description must be 2 to 256 characters in length. It cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The total number of instances for which to reserve capacity of an instance type.</p>
     * <br>
     * <p>Valid values: 1 to 1000.</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>> This parameter is no longer used.</p>
     */
    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    /**
     * <p>The instance type. An elasticity assurance can be created to reserve the capacity of a single instance type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The term of the elasticity assurance. The unit of the term is determined by the `PeriodUnit` value. Valid values:</p>
     * <br>
     * <p>*   When `PeriodUnit` is set to `Month`, the valid values are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
     * <p>*   When `PeriodUnit` is set to `Year`, the valid values are 1, 2, 3, 4, and 5.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the term of the elasticity assurance. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     * <p>*   Year</p>
     * <br>
     * <p>Default value: Year.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the region in which to create the elasticity assurance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the elasticity assurance.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when the elasticity assurance takes effect. The default value is the time when the CreateElasticityAssurance operation is called to create the elasticity assurance. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. For more information, see [ISO 8601](https://help.aliyun.com/document_detail/25696.html).</p>
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
     * <br>
     * <p>This parameter is required.</p>
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
         * <br>
         * <p>*   Open: open private pool.</p>
         * <p>*   Target: specified private pool.</p>
         * <br>
         * <p>Default value: Open.</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        /**
         * <p>The name of the elasticity assurance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
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

    public static class CreateElasticityAssuranceRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the elasticity assurance. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the elasticity assurance. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:`. The tag value cannot contain `http://` or `https://`.</p>
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
