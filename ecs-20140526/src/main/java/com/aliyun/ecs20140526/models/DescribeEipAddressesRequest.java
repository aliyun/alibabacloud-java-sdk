// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeEipAddressesRequestFilter> filter;

    /**
     * <p>The ID of the EIP to query. You can enter up to 50 IDs. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7ujxscd****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the associated cloud service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zebb08phyccdvf****</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of the associated cloud service instance. Valid values: EcsInstance, SlbInstance, Nat, HaVip, NetworkInterface, and IpAddress.</p>
     * 
     * <strong>example:</strong>
     * <p>EcsInstance</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>The billing method of the EIP. Valid values: PostPaid (pay-as-you-go) and PrePaid (subscription).</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The EIP address to query. You can enter up to 50 addresses. Separate multiple addresses with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>47.75.XX.XX</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The line type. Valid values include BGP and BGP_PRO.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The lock type. Valid values: financial (locked due to overdue payment) and security (locked due to security reasons).</p>
     * 
     * <strong>example:</strong>
     * <p>financial</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the EIP resides. You can call the DescribeRegions operation to query region IDs.</p>
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
     * <p>The status of the EIP. Valid values: Associating, Unassociating, InUse, Available, and Releasing.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesRequest self = new DescribeEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesRequest setFilter(java.util.List<DescribeEipAddressesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeEipAddressesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeEipAddressesRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public DescribeEipAddressesRequest setAssociatedInstanceId(String associatedInstanceId) {
        this.associatedInstanceId = associatedInstanceId;
        return this;
    }
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    public DescribeEipAddressesRequest setAssociatedInstanceType(String associatedInstanceType) {
        this.associatedInstanceType = associatedInstanceType;
        return this;
    }
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    public DescribeEipAddressesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeEipAddressesRequest setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public DescribeEipAddressesRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeEipAddressesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeEipAddressesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEipAddressesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEipAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipAddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEipAddressesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEipAddressesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEipAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeEipAddressesRequestFilter extends TeaModel {
        /**
         * <p>The first filter key. Set the value to CreationStartTime, which specifies the start time of resource creation.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The first filter value. Specify the time in UTC in the YYYY-MM-DDThh:mmZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01T01:00Z</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEipAddressesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesRequestFilter self = new DescribeEipAddressesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEipAddressesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
