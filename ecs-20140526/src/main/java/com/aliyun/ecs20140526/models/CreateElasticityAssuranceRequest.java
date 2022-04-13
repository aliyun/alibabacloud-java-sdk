// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Tag")
    public java.util.List<CreateElasticityAssuranceRequestTag> tag;

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
        @NameInMap("MatchCriteria")
        public String matchCriteria;

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
        @NameInMap("Key")
        public String key;

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
