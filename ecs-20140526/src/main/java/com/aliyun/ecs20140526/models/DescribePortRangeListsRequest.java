// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListsRequest extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Valid values: 1 to 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>727d41872117f2816343eeb432fbc5bfd21dc824589d2a4be0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the port list. Valid values of N: 0 to 100.</p>
     */
    @NameInMap("PortRangeListId")
    public java.util.List<String> portRangeListId;

    /**
     * <p>The name of the port list. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http://, https://, com.aliyun, or com.alibabacloud. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>PortRangeListNameSample</p>
     */
    @NameInMap("PortRangeListName")
    public String portRangeListName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/2679950.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you specify this parameter to query resources, up to 1,000 resources that belong to the specified resource group can be returned in the response. You can call the <a href="https://help.aliyun.com/document_detail/2716558.html">ListResourceGroups</a> operation to query the most recent resource group list.</p>
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
     * <p>The tags that are added to the port list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribePortRangeListsRequestTag> tag;

    public static DescribePortRangeListsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListsRequest self = new DescribePortRangeListsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePortRangeListsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePortRangeListsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePortRangeListsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePortRangeListsRequest setPortRangeListId(java.util.List<String> portRangeListId) {
        this.portRangeListId = portRangeListId;
        return this;
    }
    public java.util.List<String> getPortRangeListId() {
        return this.portRangeListId;
    }

    public DescribePortRangeListsRequest setPortRangeListName(String portRangeListName) {
        this.portRangeListName = portRangeListName;
        return this;
    }
    public String getPortRangeListName() {
        return this.portRangeListName;
    }

    public DescribePortRangeListsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePortRangeListsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePortRangeListsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePortRangeListsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePortRangeListsRequest setTag(java.util.List<DescribePortRangeListsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribePortRangeListsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribePortRangeListsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values: 1 to 20.</p>
         * <p>If you specify a single tag to query resources, up to 1,000 resources to which the tag is added are returned. If you specify multiple tags to query resources, up to 1,000 resources to which all specified tags are added are returned. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>key for PortRangeList</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>value for PortRangeList</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePortRangeListsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribePortRangeListsRequestTag self = new DescribePortRangeListsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribePortRangeListsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePortRangeListsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
