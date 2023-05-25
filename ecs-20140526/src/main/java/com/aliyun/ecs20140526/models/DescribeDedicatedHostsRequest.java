// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsRequest extends TeaModel {
    /**
     * <p>The ID of the dedicated host cluster.</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The IDs of dedicated hosts. You can specify up to 100 dedicated host IDs in a single request. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    /**
     * <p>The name of the dedicated host.</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to query the most recent list of dedicated host types.</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>The reason why the dedicated host is locked. Valid values:</p>
     * <br>
     * <p>*   financial: The dedicated host is locked due to overdue payments.</p>
     * <p>*   security: The dedicated host is locked due to security reasons.</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the dedicated host resides. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the dedicated host belongs. If you specify this parameter, the details of up to 1,000 resources that belong to the specified resource group are returned.</p>
     * <br>
     * <p>>  Resources in the default resource group are displayed in the response regardless of the value that you specified for this parameter.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SocketDetails")
    public String socketDetails;

    /**
     * <p>The service status of the dedicated host. Valid values:</p>
     * <br>
     * <p>*   Available: The dedicated host is running as expected.</p>
     * <p>*   UnderAssessment: The dedicated host is available. However, the dedicated host has potential risks that may cause the ECS instances on the dedicated host to fail.</p>
     * <p>*   PermanentFailure: The dedicated host has permanent failures and cannot be used.</p>
     * <p>*   TempUnavailable: The dedicated host is temporarily unavailable.</p>
     * <p>*   Redeploying: The dedicated host is being restored.</p>
     * <br>
     * <p>Default value: Available.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the dedicated hosts.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedHostsRequestTag> tag;

    /**
     * <p>The ID of the zone where the dedicated host resides. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsRequest self = new DescribeDedicatedHostsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public DescribeDedicatedHostsRequest setDedicatedHostIds(String dedicatedHostIds) {
        this.dedicatedHostIds = dedicatedHostIds;
        return this;
    }
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    public DescribeDedicatedHostsRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public DescribeDedicatedHostsRequest setDedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
        return this;
    }
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    public DescribeDedicatedHostsRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeDedicatedHostsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedHostsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedHostsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedHostsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedHostsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDedicatedHostsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedHostsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedHostsRequest setSocketDetails(String socketDetails) {
        this.socketDetails = socketDetails;
        return this;
    }
    public String getSocketDetails() {
        return this.socketDetails;
    }

    public DescribeDedicatedHostsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDedicatedHostsRequest setTag(java.util.List<DescribeDedicatedHostsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDedicatedHostsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDedicatedHostsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDedicatedHostsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the dedicated host. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the dedicated host. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDedicatedHostsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsRequestTag self = new DescribeDedicatedHostsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDedicatedHostsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
