// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersRequest extends TeaModel {
    // The IDs of dedicated host clusters. The value can be a JSON array that consists of up to 100 dedicated host cluster IDs in the format of `["dc-xxxxxxxxx", "dc-yyyyyyyyy", ... "dc-zzzzzzzzz"]`. Separate the IDs with commas (,).
    @NameInMap("DedicatedHostClusterIds")
    public String dedicatedHostClusterIds;

    // The name of the dedicated host cluster.
    @NameInMap("DedicatedHostClusterName")
    public String dedicatedHostClusterName;

    // >  This parameter is unavailable for use.
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the dedicated host cluster. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which the dedicated host cluster belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.  
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // >  This parameter is unavailable for use.
    @NameInMap("Status")
    public String status;

    // The list of the tags.
    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedHostClustersRequestTag> tag;

    // The zone ID of the dedicated host cluster. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDedicatedHostClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostClustersRequest self = new DescribeDedicatedHostClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostClustersRequest setDedicatedHostClusterIds(String dedicatedHostClusterIds) {
        this.dedicatedHostClusterIds = dedicatedHostClusterIds;
        return this;
    }
    public String getDedicatedHostClusterIds() {
        return this.dedicatedHostClusterIds;
    }

    public DescribeDedicatedHostClustersRequest setDedicatedHostClusterName(String dedicatedHostClusterName) {
        this.dedicatedHostClusterName = dedicatedHostClusterName;
        return this;
    }
    public String getDedicatedHostClusterName() {
        return this.dedicatedHostClusterName;
    }

    public DescribeDedicatedHostClustersRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeDedicatedHostClustersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDedicatedHostClustersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedHostClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedHostClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedHostClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDedicatedHostClustersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedHostClustersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDedicatedHostClustersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDedicatedHostClustersRequest setTag(java.util.List<DescribeDedicatedHostClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDedicatedHostClustersRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDedicatedHostClustersRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDedicatedHostClustersRequestTag extends TeaModel {
        // The key of tag N of the dedicated host cluster. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the dedicated host cluster. Valid values of N: 1 to 20. The tag value cannot be an empty string. It can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static DescribeDedicatedHostClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostClustersRequestTag self = new DescribeDedicatedHostClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDedicatedHostClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
