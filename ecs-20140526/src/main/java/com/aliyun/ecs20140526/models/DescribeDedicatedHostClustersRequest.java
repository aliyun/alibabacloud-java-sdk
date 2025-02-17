// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostClustersRequest extends TeaModel {
    /**
     * <p>The list of host group IDs. The value can be a JSON array consisting of multiple IDs in the <code>[&quot;dc-xxxxxxxxx&quot;, &quot;dc-yyyyyyyyy&quot;,..., &quot;dc-zzzzzzzzz&quot;]</code> format. Separate the IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;dc-bp12wlf6am0vz9v2****&quot;, &quot;dc-bp12wlf6am0vz9v3****&quot;]</p>
     */
    @NameInMap("DedicatedHostClusterIds")
    public String dedicatedHostClusterIds;

    /**
     * <p>The name of the host group.</p>
     * 
     * <strong>example:</strong>
     * <p>myDDHCluster</p>
     */
    @NameInMap("DedicatedHostClusterName")
    public String dedicatedHostClusterName;

    /**
     * <blockquote>
     * <p> This parameter is unavailable for use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the host group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID of the host group. You can use a resource group ID to filter no more than 1,000 host groups.</p>
     * <blockquote>
     * <p> A default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <blockquote>
     * <p> This parameter is unavailable for use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the host group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedHostClustersRequestTag> tag;

    /**
     * <p>The zone ID of the host group. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-f</p>
     */
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
        /**
         * <p>The tag key. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 64 characters in length, and can neither contain <code>http://</code> or <code>https://</code> nor <code>acs:</code> or <code>aliyun</code>.</p>
         * <p>You can filter no more than 1,000 host groups, regardless of how many tags are used. To query more than 1,000 host groups, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. The tag value cannot be an empty string. It can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
