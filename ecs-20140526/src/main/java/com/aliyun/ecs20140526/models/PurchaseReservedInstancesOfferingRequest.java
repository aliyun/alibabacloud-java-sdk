// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class PurchaseReservedInstancesOfferingRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal for the reserved instance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal term of the reserved instance. Unit: months. This parameter takes effect only when AutoRenew is set to true.</p>
     * <p>Valid values: 12 and 36.</p>
     * <p>Default value when PeriodUnit is set to Year: 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the reserved instance. The description can be 2 to 256 characters in length and cannot start with <a href="http://https://%E3%80%82">http:// or https://</a>.</p>
     * <p>This parameter is left empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The number of pay-as-you-go instances of the same instance type that the reserved instance can match. Valid values: 1 to 50.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    /**
     * <p>The instance type that the reserved instance can match.</p>
     * <blockquote>
     * <p> The instance types that support reserved instances are subject to updates. For more information, see <a href="~~100370#3c1b682051vt4~~">Reserved instance overview</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The payment option of the reserved instance. Valid values:</p>
     * <ul>
     * <li>No Upfront</li>
     * <li>Partial Upfront</li>
     * <li>All Upfront</li>
     * </ul>
     * <p>Default value: All Upfront.</p>
     * 
     * <strong>example:</strong>
     * <p>All Upfront</p>
     */
    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The validity period of the reserved instance.</p>
     * <p>Valid values: 1 and 3.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the validity period of the reserved instance.</p>
     * <p>Valid value: Year.</p>
     * <p>Default value: Year.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The operating system of the image used by the instance. Valid values:</p>
     * <ul>
     * <li>Windows: Windows Server operating system</li>
     * <li>Linux: Linux and UNIX-like operating system</li>
     * </ul>
     * <p>Default value: Linux.</p>
     * 
     * <strong>example:</strong>
     * <p>Linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the reserved instance. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testReservedInstanceName</p>
     */
    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp199lyny9b3****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scope of reserved instance N. Valid values:</p>
     * <ul>
     * <li>Region: regional</li>
     * <li>Zone: zonal</li>
     * </ul>
     * <p>Default value: Region.</p>
     * 
     * <strong>example:</strong>
     * <p>Zone</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The time when the reserved instance takes effect. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601 standard</a> in the <code>yyyy-MM-ddTHHZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the reserved instance takes effect starting on the hour when the reserved instance is purchased. For example, if you purchased a reserved instance at 13:45:35 on November 1, 2024, the instance took effect starting 13:00:00 on November 1, 2024.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-07-04T15Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tags to add to the reserved instance. You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<PurchaseReservedInstancesOfferingRequestTag> tag;

    /**
     * <p>The ID of the zone in which to purchase the reserved instance. This parameter is required when <code>Scope</code> is set to <code>Zone</code>. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
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

    public PurchaseReservedInstancesOfferingRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
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
         * <p>The tag key to add to the reserved instance. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value to add to the reserved instance. The tag value cannot be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
