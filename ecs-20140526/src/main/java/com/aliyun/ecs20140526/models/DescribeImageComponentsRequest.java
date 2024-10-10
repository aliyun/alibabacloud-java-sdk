// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsRequest extends TeaModel {
    @NameInMap("ComponentType")
    public String componentType;

    @NameInMap("ComponentVersion")
    public String componentVersion;

    /**
     * <p>The IDs of image components. Valid values of N: 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>ic-bp67acfmxazb4p****</p>
     */
    @NameInMap("ImageComponentId")
    public java.util.List<String> imageComponentId;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 500.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the image component. You must specify an exact name to search for the image component.</p>
     * 
     * <strong>example:</strong>
     * <p>testComponent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the image component. Valid values:</p>
     * <ul>
     * <li>SELF: the custom component that you created.</li>
     * <li>ALIYUN: the system component provided by Alibaba Cloud.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SELF</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image component. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <blockquote>
     * <p> Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
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

    @NameInMap("SystemType")
    public String systemType;

    /**
     * <p>The tags of the image component.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImageComponentsRequestTag> tag;

    public static DescribeImageComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsRequest self = new DescribeImageComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public DescribeImageComponentsRequest setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
        return this;
    }
    public String getComponentVersion() {
        return this.componentVersion;
    }

    public DescribeImageComponentsRequest setImageComponentId(java.util.List<String> imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public java.util.List<String> getImageComponentId() {
        return this.imageComponentId;
    }

    public DescribeImageComponentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImageComponentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageComponentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageComponentsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DescribeImageComponentsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImageComponentsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageComponentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageComponentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeImageComponentsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImageComponentsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImageComponentsRequest setSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }
    public String getSystemType() {
        return this.systemType;
    }

    public DescribeImageComponentsRequest setTag(java.util.List<DescribeImageComponentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImageComponentsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImageComponentsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImageComponentsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsRequestTag self = new DescribeImageComponentsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageComponentsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
