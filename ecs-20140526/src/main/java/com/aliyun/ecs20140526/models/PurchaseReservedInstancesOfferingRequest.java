// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The description of the reserved instance. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
    // 
    // This parameter is empty by default.
    @NameInMap("Description")
    public String description;

    // The number of pay-as-you-go instances of the same instance type that the reserved instance can match. Valid values: 1 to 50.
    // 
    // For example, if InstanceAmount is set to 3 when InstanceType is set to ecs.g5.large, the reserved instance can match three ecs.g5.large pay-as-you-go instances.
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    // The instance type of the instance. For more information, see [Instance family](~~25378~~).
    @NameInMap("InstanceType")
    public String instanceType;

    // The payment option of the reserved instance. Valid values:
    // 
    // *   No Upfront
    // *   Partial Upfront
    // *   All Upfront
    // 
    // Default value: All Upfront.
    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The validity period of the reserved instance.
    // 
    // Valid values: 1 and 3.
    // 
    // Default value: 1.
    @NameInMap("Period")
    public Integer period;

    // The unit of the validity period of the reserved instance.
    // 
    // Valid value: Year.
    // 
    // Default value: Year.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The operating system of the image used by the instance. Valid values:
    // 
    // *   Windows: Windows Server operating system
    // *   Linux: Linux and UNIX-like operating system
    // 
    // Default value: Linux.
    @NameInMap("Platform")
    public String platform;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The name of the reserved instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The scope of the reserved instance. Valid values:
    // 
    // *   Region: regional
    // *   Zone: zonal
    // 
    // Default value: Region.
    @NameInMap("Scope")
    public String scope;

    @NameInMap("Tag")
    public java.util.List<PurchaseReservedInstancesOfferingRequestTag> tag;

    // The zone ID of the instance. This parameter is required when `Scope` is set to `Zone`. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static PurchaseReservedInstancesOfferingRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseReservedInstancesOfferingRequest self = new PurchaseReservedInstancesOfferingRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseReservedInstancesOfferingRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public PurchaseReservedInstancesOfferingRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public PurchaseReservedInstancesOfferingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PurchaseReservedInstancesOfferingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PurchaseReservedInstancesOfferingRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public PurchaseReservedInstancesOfferingRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public PurchaseReservedInstancesOfferingRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public PurchaseReservedInstancesOfferingRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public PurchaseReservedInstancesOfferingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PurchaseReservedInstancesOfferingRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public PurchaseReservedInstancesOfferingRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public PurchaseReservedInstancesOfferingRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public PurchaseReservedInstancesOfferingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PurchaseReservedInstancesOfferingRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public PurchaseReservedInstancesOfferingRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public PurchaseReservedInstancesOfferingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PurchaseReservedInstancesOfferingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PurchaseReservedInstancesOfferingRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public PurchaseReservedInstancesOfferingRequest setTag(java.util.List<PurchaseReservedInstancesOfferingRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<PurchaseReservedInstancesOfferingRequestTag> getTag() {
        return this.tag;
    }

    public PurchaseReservedInstancesOfferingRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class PurchaseReservedInstancesOfferingRequestTag extends TeaModel {
        // The key of tag N of the reserved instance. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the reserved instance. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.
        @NameInMap("Value")
        public String value;

        public static PurchaseReservedInstancesOfferingRequestTag build(java.util.Map<String, ?> map) throws Exception {
            PurchaseReservedInstancesOfferingRequestTag self = new PurchaseReservedInstancesOfferingRequestTag();
            return TeaModel.build(map, self);
        }

        public PurchaseReservedInstancesOfferingRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PurchaseReservedInstancesOfferingRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
