// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
     */
    @NameInMap("FuzzyQuery")
    public Boolean fuzzyQuery;

    /**
     * <p>The ID of the resource group to which the security groups belong. When you use this parameter to filter resources, the number of resources in the specified resource group cannot exceed 1,000. You can call the [ListResourceGroups](~~158855~~) operation to query the most recent resource group list.</p>
     * <br>
     * <p>> Resources in the default resource group are displayed in the response regardless of how you specify this parameter.</p>
     */
    @NameInMap("IsQueryEcsCount")
    public Boolean isQueryEcsCount;

    /**
     * <p>The network type of the security group. Valid values:</p>
     * <br>
     * <p>*   vpc: virtual private cloud (VPC)</p>
     * <p>*   classic: classic network</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the security group.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The maximum number of entries to return on each page. If you specify the MaxResults parameter, the `MaxResults` and `NextToken` parameters are used for a paged query.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     * <br>
     * <p>> This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of security groups. The value is a JSON array that consists of up to 100 security group IDs. Separate the IDs with commas (,).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags of the security group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>> This parameter is no longer used.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the security groups belong.</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    /**
     * <p>> This parameter is no longer used.</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Set this parameter to the NextToken value that is returned when you called the DescribeInstanceTypes operation last time. You do not need to specify this parameter for the first request.</p>
     */
    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    /**
     * <p>The tags of the security group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSecurityGroupsRequestTag> tag;

    /**
     * <p>The type of the security group. Valid values:</p>
     * <br>
     * <p>*   normal: basic security group</p>
     * <p>*   enterprise: advanced security group</p>
     * <br>
     * <p>> If you do not specify this parameter, basic and advanced security groups are queried.</p>
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
         * <p>The tag values of the security group. You can specify up to 20 tag values for the security group.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the security group.</p>
         * <br>
         * <p>> This parameter will be removed in the future. We recommend that you use the Tag.N.Value parameter to ensure future compatibility.</p>
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
