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
     * <p>The IDs of the dedicated hosts. You can specify up to 100 IDs. Separate multiple IDs with commas (,).</p>
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
     * <p>The type of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/134240.html">DescribeDedicatedHostTypes</a> operation to query the most recent dedicated host type list.</p>
     * 
     * <strong>example:</strong>
     * <p>ddh.g5</p>
     */
    @NameInMap("DedicatedHostType")
    public String dedicatedHostType;

    /**
     * <p>The reason why the dedicated host is locked. Valid values:</p>
     * <ul>
     * <li>financial: The dedicated host is locked due to overdue payments.</li>
     * <li>security: The dedicated host is locked due to security reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>financial</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries per page for a paged query. If you specify this parameter, the query uses the combination of MaxResults and NextToken for pagination.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether to return the details of the dedicated host.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedHostDetail")
    public String needHostDetail;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the previous call to this operation. You do not need to specify this parameter when you call this operation for the first time.</p>
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
     * <p>This parameter will be deprecated soon. We recommend that you use NextToken and MaxResults for pagination.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated soon. We recommend that you use NextToken and MaxResults for pagination.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to query the inventory information of the dedicated host.</p>
     */
    @NameInMap("QueryInventory")
    public Boolean queryInventory;

    /**
     * <p>The region ID of the dedicated host. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the dedicated host belongs. When you use this parameter to filter resources, the resource count cannot exceed 1,000.</p>
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
     * <p>Specifies whether to display socket-level capacity information. You can view the remaining resource information (vCPU and memory usage, remaining capacity, and total capacity) at the socket level to determine whether ECS instances of the corresponding type can be created. Valid values:</p>
     * <ul>
     * <li>true: Display the information. Only dedicated hosts of specific types support displaying socket-level resource information. For more information, see <a href="https://help.aliyun.com/document_detail/68989.html">View and export dedicated host information</a>.</li>
     * <li>false: Do not display the information.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Generally, each dedicated host has two CPUs, and the ID of each CPU is Socket 0 or Socket 1. On an exclusive dedicated host, to ensure that the ECS instances on the dedicated host deliver maximum performance, ECS instances are not created across sockets. This means that an ECS instance is created based on only one socket.</p>
     * <ul>
     * <li>If the remaining computing resources of one socket are greater than or equal to the resources required by the ECS instance type to be created, the ECS instance is created.</li>
     * <li>If the remaining computing resources of each socket are less than the resources required by the ECS instance type to be created, the ECS instance fails to be created. Even if the total remaining resources of the two sockets on the dedicated host are greater than the resources required by the ECS instance type, the ECS instance still cannot be created.</notice></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SocketDetails")
    public String socketDetails;

    /**
     * <p>The status of the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>Available: The dedicated host is running. This is the normal status of a dedicated host.</p>
     * </li>
     * <li><p>UnderAssessment: The physical machine has risks. The physical machine is available during the fault incubation period, but issues may occur on the ECS instances on the dedicated host.</p>
     * </li>
     * <li><p>PermanentFailure: A permanent failure occurred. The dedicated host is unavailable.</p>
     * </li>
     * <li><p>TempUnavailable: The dedicated host is temporarily unavailable.</p>
     * </li>
     * <li><p>Redeploying: The dedicated host is being recovered.</p>
     * </li>
     * </ul>
     * <p>Default value: Available.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags. You can specify 0 to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDedicatedHostsRequestTag> tag;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
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

    public DescribeDedicatedHostsRequest setNeedHostDetail(String needHostDetail) {
        this.needHostDetail = needHostDetail;
        return this;
    }
    public String getNeedHostDetail() {
        return this.needHostDetail;
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
         * <p>The tag key of the dedicated host. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the dedicated host. If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
