// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancesRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<DescribeReservedInstancesRequestTag> tag;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ReservedInstanceId")
    public java.util.List<String> reservedInstanceId;

    @NameInMap("Status")
    public java.util.List<String> status;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("AllocationType")
    public String allocationType;

    public static DescribeReservedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancesRequest self = new DescribeReservedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancesRequest setTag(java.util.List<DescribeReservedInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeReservedInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeReservedInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public DescribeReservedInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeReservedInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public DescribeReservedInstancesRequest setReservedInstanceId(java.util.List<String> reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }
    public java.util.List<String> getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public DescribeReservedInstancesRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public DescribeReservedInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeReservedInstancesRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public DescribeReservedInstancesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
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

    public DescribeReservedInstancesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeReservedInstancesRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribeReservedInstancesRequest setAllocationType(String allocationType) {
        this.allocationType = allocationType;
        return this;
    }
    public String getAllocationType() {
        return this.allocationType;
    }

    public static class DescribeReservedInstancesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
