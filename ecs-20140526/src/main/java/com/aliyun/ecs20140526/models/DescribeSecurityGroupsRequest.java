// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   true: performs only a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request passes the dry run, the DryRunOperation error code is returned. Otherwise, an error message is returned.</p>
     * <p>*   false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>> This parameter is deprecated.</p>
     */
    @NameInMap("FuzzyQuery")
    public Boolean fuzzyQuery;

    /**
     * <p>> This parameter is deprecated.</p>
     */
    @NameInMap("IsQueryEcsCount")
    public Boolean isQueryEcsCount;

    /**
     * <p>The maximum number of entries per page. If you specify this parameter, both `MaxResults` and `NextToken` are used for a paged query.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The network type of the security group. Valid values:</p>
     * <br>
     * <p>*   vpc</p>
     * <p>*   classic</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     * <br>
     * <p>> This parameter will be deprecated in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     * <br>
     * <p>> This parameter will be deprecated in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the security group belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response. You can call the [ListResourceGroups](~~158855~~) operation to query the most recent resource group list.</p>
     * <br>
     * <p>> Resources in the default resource group are displayed in the response regardless of how this parameter is configured.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The security group ID.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The security group IDs. Set this parameter to a JSON array that consists of up to 100 security group IDs. Separate the security group IDs with commas (,).</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    /**
     * <p>The name of the security group.</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The type of the security group. Valid values:</p>
     * <br>
     * <p>*   normal: basic security group</p>
     * <p>*   enterprise: advanced security group</p>
     * <br>
     * <p>> If you do not specify this parameter, both basic and advanced security groups are queried.</p>
     */
    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    /**
     * <p>The tags to add to the security groups.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSecurityGroupsRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the security group belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsRequest self = new DescribeSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeSecurityGroupsRequest setFuzzyQuery(Boolean fuzzyQuery) {
        this.fuzzyQuery = fuzzyQuery;
        return this;
    }
    public Boolean getFuzzyQuery() {
        return this.fuzzyQuery;
    }

    public DescribeSecurityGroupsRequest setIsQueryEcsCount(Boolean isQueryEcsCount) {
        this.isQueryEcsCount = isQueryEcsCount;
        return this;
    }
    public Boolean getIsQueryEcsCount() {
        return this.isQueryEcsCount;
    }

    public DescribeSecurityGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSecurityGroupsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeSecurityGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSecurityGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSecurityGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSecurityGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecurityGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecurityGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSecurityGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSecurityGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSecurityGroupsRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeSecurityGroupsRequest setSecurityGroupIds(String securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeSecurityGroupsRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public DescribeSecurityGroupsRequest setSecurityGroupType(String securityGroupType) {
        this.securityGroupType = securityGroupType;
        return this;
    }
    public String getSecurityGroupType() {
        return this.securityGroupType;
    }

    public DescribeSecurityGroupsRequest setTag(java.util.List<DescribeSecurityGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSecurityGroupsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeSecurityGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeSecurityGroupsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the security group. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>Up to 1,000 resources that match the tags specified can be returned in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the security group. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSecurityGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupsRequestTag self = new DescribeSecurityGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSecurityGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
