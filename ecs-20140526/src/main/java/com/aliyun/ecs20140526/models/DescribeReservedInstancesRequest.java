// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesRequest extends TeaModel {
    /**
     * <p>The allocation type. Valid values:</p>
     * <br>
     * <p>*   Normal: queries all reserved instances that belong to the current account.</p>
     * <p>*   Shared: queries reserved instances that are shared between the main account and linked accounts.</p>
     * <br>
     * <p>Default value: Normal.</p>
     */
    @NameInMap("AllocationType")
    public String allocationType;

    /**
     * <p>The instance type. For more information, see [Instance families](https://help.aliyun.com/document_detail/25378.html).</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance family. For more information, see [Instance families](https://help.aliyun.com/document_detail/25378.html).</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The reason why the instance is locked. Valid values:</p>
     * <br>
     * <p>*   financial: You have an overdue payment in your account, or the reserved instance has expired.</p>
     * <p>*   security: The reserved instance is locked for security reasons.</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The payment option of the reserved instances. Valid values:</p>
     * <br>
     * <p>*   No Upfront</p>
     * <p>*   Partial Upfront</p>
     * <p>*   All Upfront</p>
     */
    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instances. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of reserved instance N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("ReservedInstanceId")
    public java.util.List<String> reservedInstanceId;

    /**
     * <p>The name of the reserved instance.</p>
     */
    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The scope of the reserved instances. Valid values:</p>
     * <br>
     * <p>*   Region</p>
     * <p>*   Zone</p>
     * <br>
     * <p>Default value: Region.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The status of reserved instance N. Valid values of N: 1 to 100. Valid values:</p>
     * <br>
     * <p>*   Creating</p>
     * <p>*   Active</p>
     * <p>*   Expired</p>
     * <p>*   Updating</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The tags to add to the instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeReservedInstancesRequestTag> tag;

    /**
     * <p>The zone ID of the reserved instances. This parameter is required when Scope is set to Zone. You can call the [DescribeZones](https://help.aliyun.com/document_detail/25610.html) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesRequest self = new DescribeReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancesRequest setAllocationType(String allocationType) {
        this.allocationType = allocationType;
        return this;
    }
    public String getAllocationType() {
        return this.allocationType;
    }

    public DescribeReservedInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeReservedInstancesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeReservedInstancesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeReservedInstancesRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribeReservedInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeReservedInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeReservedInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReservedInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeReservedInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeReservedInstancesRequest setReservedInstanceId(java.util.List<String> reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }
    public java.util.List<String> getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public DescribeReservedInstancesRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public DescribeReservedInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeReservedInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeReservedInstancesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeReservedInstancesRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeReservedInstancesRequest setTag(java.util.List<DescribeReservedInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeReservedInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeReservedInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeReservedInstancesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the reserved instance. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain [http:// or https://](http://https://。). The tag key cannot start with acs: or aliyun.</p>
         * <br>
         * <p>Up to 1,000 resources with the specified tags can be returned in the response. To query more than 1,000 resources with the specified tags, call the [ListTagResources](https://help.aliyun.com/document_detail/110425.html) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the reserved instance. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain [http:// or https://](http://https://。). The tag value cannot start with acs:.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeReservedInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeReservedInstancesRequestTag self = new DescribeReservedInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeReservedInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeReservedInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
