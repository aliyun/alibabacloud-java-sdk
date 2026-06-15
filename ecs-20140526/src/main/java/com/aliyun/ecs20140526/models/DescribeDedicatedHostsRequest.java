// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsRequest extends TeaModel {
    /**
     * <p>The ID of the dedicated host cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-bp12wlf6am0vz9v2****</p>
     */
    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    /**
     * <p>The IDs of dedicated hosts. You can specify up to 100 dedicated host IDs in a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;dh-bp165p6xk2tlw61e****&quot;, &quot;dh-bp1f9vxmno7emy96****&quot;]</p>
     */
    @NameInMap("DedicatedHostIds")
    public String dedicatedHostIds;

    /**
     * <p>The name of the dedicated host.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDDHTestName</p>
     */
    @NameInMap("DedicatedHostName")
    public String dedicatedHostName;

    /**
     * <p>The dedicated host type. Call the <a href="https://help.aliyun.com/document_detail/134240.html"><code>DescribeDedicatedHostTypes</code></a> operation to get the latest list of dedicated host types.</p>
     * 
     * <strong>example:</strong>
     * <p>ddh.g5</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>The reason that the dedicated host is locked. Valid values:</p>
     * <ul>
     * <li><p><code>financial</code>: The dedicated host is locked due to an overdue payment.</p>
     * </li>
     * <li><p><code>security</code>: The dedicated host is locked for security reasons.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>financial</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of results to return per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. Do not set this parameter for the first request. For subsequent requests, set this parameter to the <code>NextToken</code> value returned from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>e71d8a535bd9cc11</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. Use <code>NextToken</code> and <code>MaxResults</code> for pagination.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. Use <code>NextToken</code> and <code>MaxResults</code> for pagination.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryInventory")
    public Boolean queryInventory;

    /**
     * <p>The ID of the region where the dedicated host resides. Call the <a href="https://help.aliyun.com/document_detail/25609.html"><code>DescribeRegions</code></a> operation to get the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the dedicated host belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3b6jzp66****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to return socket-level capacity information. You can use the information to check the remaining vCPU and memory resources and determine whether an ECS instance of a specific instance type can be created on the dedicated host. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: returns the information. Only specific dedicated host types support this feature. For more information, see <a href="https://help.aliyun.com/document_detail/68989.html">View and export information about dedicated hosts</a>.</p>
     * </li>
     * <li><p><code>false</code>: does not return the information.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>A dedicated host typically has two CPUs, which correspond to Socket 0 and Socket 1. To maximize performance, an ECS instance created on a dedicated host is allocated to a single socket and does not span sockets.</p>
     * <ul>
     * <li><p>If the remaining resources on a socket are sufficient for the specified ECS instance type, the instance can be created.</p>
     * </li>
     * <li><p>If the remaining resources on each socket are insufficient for the specified ECS instance type, the instance cannot be created, even if the total remaining resources on both sockets are sufficient.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SocketDetails")
    public String socketDetails;

    /**
     * <p>The state of the dedicated host. Valid values:</p>
     * <ul>
     * <li><p><code>Available</code>: The dedicated host is running as expected.</p>
     * </li>
     * <li><p><code>UnderAssessment</code>: The dedicated host is being assessed for physical hardware risks. The host is available but may have hardware issues that could affect its ECS instances.</p>
     * </li>
     * <li><p><code>PermanentFailure</code>: The dedicated host has a permanent failure and is unavailable.</p>
     * </li>
     * <li><p><code>TempUnavailable</code>: The dedicated host is temporarily unavailable.</p>
     * </li>
     * <li><p><code>Redeploying</code>: The dedicated host is being redeployed.</p>
     * </li>
     * </ul>
     * <p>The default value is <code>Available</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags used to filter dedicated hosts. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedHostsRequestTag> tag;

    /**
     * <p>The zone ID. Call the <a href="https://help.aliyun.com/document_detail/25610.html"><code>DescribeZones</code></a> operation to get the latest list of Alibaba Cloud zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
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

    public DescribeDedicatedHostsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDedicatedHostsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public DescribeDedicatedHostsRequest setQueryInventory(Boolean queryInventory) {
        this.queryInventory = queryInventory;
        return this;
    }
    public Boolean getQueryInventory() {
        return this.queryInventory;
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
         * <p>The tag key. The key can be up to 128 characters long. It cannot be an empty string, start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters long and cannot contain <code>http://</code> or <code>https://</code>. You can leave the value empty.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
