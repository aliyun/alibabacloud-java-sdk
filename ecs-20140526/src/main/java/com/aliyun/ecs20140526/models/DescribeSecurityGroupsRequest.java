// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request passes the dry run, the DryRunOperation error code is returned. Otherwise, an error message is returned.</li>
     * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("FuzzyQuery")
    public Boolean fuzzyQuery;

    /**
     * <p>Specifies whether to query the capacity of the security group. If you set this parameter to True, the <code>EcsCount</code> and <code>AvailableInstanceAmount</code> values in the response are valid.</p>
     * <blockquote>
     * <p> This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("IsQueryEcsCount")
    public Boolean isQueryEcsCount;

    /**
     * <p>The maximum number of entries per page. If you specify this parameter, both <code>MaxResults</code> and <code>NextToken</code> are used for a paged query.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The network type of the security group. Valid values:</p>
     * <ul>
     * <li>vpc</li>
     * <li>classic</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the security group belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the most recent resource group list.</p>
     * <blockquote>
     * <p>Resources in the default resource group are displayed in the response regardless of how this parameter is configured.</p>
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
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The security group IDs. Set this parameter to a JSON array that consists of up to 100 security group IDs. Separate the security group IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sg-bp67acfmxazb4p****&quot;, &quot;sg-bp67acfmxazb4p****&quot;, &quot;sg-bp67acfmxazb4p****&quot;,....]</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIds;

    /**
     * <p>The name of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>SGTestName</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The type of the security group. Valid values:</p>
     * <ul>
     * <li>normal: basic security group</li>
     * <li>enterprise: advanced security group</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, both basic and advanced security groups are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    /**
     * <p>Specifies whether to query managed security groups. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The tags to add to the security groups.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSecurityGroupsRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the security group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp67acfmxazb4p****</p>
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

    public DescribeSecurityGroupsRequest setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
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
         * <p>Up to 1,000 resources that match the tags specified can be returned in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the security group. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
