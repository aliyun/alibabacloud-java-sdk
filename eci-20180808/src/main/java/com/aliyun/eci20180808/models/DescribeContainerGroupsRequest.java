// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsRequest extends TeaModel {
    /**
     * <p>The computing power type of the elastic container instance. A value of economy specifies economic elastic container instances.</p>
     * 
     * <strong>example:</strong>
     * <p>economy</p>
     */
    @NameInMap("ComputeCategory")
    public String computeCategory;

    /**
     * <p>The IDs of the elastic container instances in JSON format. You can specify up to 20 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;eci-bp17gw49eu09yiwm****&quot;, &quot;eci-bp19aq49du01abcm****&quot;, &quot;eci-2zegym1qhbmdfr1s****&quot;]</p>
     */
    @NameInMap("ContainerGroupIds")
    public String containerGroupIds;

    /**
     * <p>The name of the elastic container instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ContainerGroupName")
    public String containerGroupName;

    /**
     * <p>The maximum number of resources to return. Default value: 20. Maximum value: 20.</p>
     * <blockquote>
     * <p> The number of returned resources is less than or equal to the specified number.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The token that determines the start point of the query. If this parameter is left empty, all results have been returned.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter in the first request. Starting from the second request, you can obtain the token from the result returned by the previous request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzh43v*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The status of the elastic container instance. Valid values:</p>
     * <ul>
     * <li>Pending: The instance is being started.</li>
     * <li>Running: The instance is running.</li>
     * <li>Succeeded: The instance runs successfully.</li>
     * <li>Failed: The instance fails to run.</li>
     * <li>Scheduling: The instance is being created.</li>
     * <li>ScheduleFailed: The instance fails to be created.</li>
     * <li>Restarting: The instance is being restarted.</li>
     * <li>Updating: The instance is being updated.</li>
     * <li>Terminating: The instance is being terminated.</li>
     * <li>Expired: The instance expires.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag of the instances.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeContainerGroupsRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the elastic container instances are connected.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1jrgfqqy54kg5hc****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Specify whether to return event information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithEvent")
    public Boolean withEvent;

    /**
     * <p>The ID of the zone in which the elastic container instances are deployed. If you do not specify this parameter, the system selects a zone.</p>
     * <p>This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeContainerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsRequest self = new DescribeContainerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupsRequest setComputeCategory(String computeCategory) {
        this.computeCategory = computeCategory;
        return this;
    }
    public String getComputeCategory() {
        return this.computeCategory;
    }

    public DescribeContainerGroupsRequest setContainerGroupIds(String containerGroupIds) {
        this.containerGroupIds = containerGroupIds;
        return this;
    }
    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    public DescribeContainerGroupsRequest setContainerGroupName(String containerGroupName) {
        this.containerGroupName = containerGroupName;
        return this;
    }
    public String getContainerGroupName() {
        return this.containerGroupName;
    }

    public DescribeContainerGroupsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeContainerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeContainerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeContainerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContainerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeContainerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeContainerGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeContainerGroupsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeContainerGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeContainerGroupsRequest setTag(java.util.List<DescribeContainerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeContainerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeContainerGroupsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeContainerGroupsRequest setWithEvent(Boolean withEvent) {
        this.withEvent = withEvent;
        return this;
    }
    public Boolean getWithEvent() {
        return this.withEvent;
    }

    public DescribeContainerGroupsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeContainerGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeContainerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsRequestTag self = new DescribeContainerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeContainerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
