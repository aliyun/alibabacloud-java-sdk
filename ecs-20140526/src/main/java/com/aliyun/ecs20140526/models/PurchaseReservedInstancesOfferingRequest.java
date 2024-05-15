// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the reserved instance. Default value: false. Valid values:</p>
     * <br>
     * <p>true: enables auto-renewal for the reserved instance. false: does not enable auto-renewal for the reserved instance.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration of the reserved instance. Unit: months. This parameter takes effect only when AutoRenew is set to true.</p>
     * <br>
     * <p>Valid values: 1, 12, 36, and 60.</p>
     * <br>
     * <p>Default value when PeriodUnit is set to Month: 1.</p>
     * <br>
     * <p>Default value when PeriodUnit is set to Year: 12.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the reserved instance. The description can be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).</p>
     * <br>
     * <p>This parameter is left empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of pay-as-you-go instances of the same instance type that the reserved instance can match at the same time. Valid values: 1 to 50.</p>
     * <br>
     * <p>For example, if you set the InstanceAmount parameter to 3 and the InstanceType parameter to ecs.g5.large, the reserved instance can be matched three ecs.g5.large pay-as-you-go instances at the same time.</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>The type of the reserved instance. For more information, see [Instance family](https://help.aliyun.com/document_detail/25378.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The payment option of the reserved instance. Valid values:</p>
     * <br>
     * <p>*   No Upfront</p>
     * <p>*   Partial Upfront</p>
     * <p>*   All Upfront</p>
     * <br>
     * <p>Default value: All Upfront.</p>
     */
    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The validity period of the reserved instance.</p>
     * <br>
     * <p>Valid values: 1 and 3.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the validity period of the reserved instance.</p>
     * <br>
     * <p>Valid value: Year.</p>
     * <br>
     * <p>Default value: Year.</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The operating system of the image used by the instance. Valid values:</p>
     * <br>
     * <p>*   Windows: Windows Server operating system</p>
     * <p>*   Linux: Linux and UNIX-like operating system</p>
     * <br>
     * <p>Default value: Linux.</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the reserved instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scope of reserved instance N. Valid values:</p>
     * <br>
     * <p>*   Region: regional</p>
     * <p>*   Zone: zonal</p>
     * <br>
     * <p>Default value: Region.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<PurchaseReservedInstancesOfferingRequestTag> tag;

    /**
     * <p>The zone ID of the instance. This parameter is required when `Scope` is set to `Zone`. You can call the [DescribeZones](https://help.aliyun.com/document_detail/25610.html) operation to query the most recent zone list.</p>
     */
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
        /**
         * <p>The key of tag N of the reserved instance. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the reserved instance. Valid values of N: 1 to 20. The tag value cannot be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
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
