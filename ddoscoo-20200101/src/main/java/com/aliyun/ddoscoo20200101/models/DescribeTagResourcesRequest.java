// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesRequest extends TeaModel {
    /**
     * <p>The query token. Set the value to the value of **NextToken** that is returned in the last call.</p>
     * <br>
     * <p>> You do not need to configure this parameter if you call this operation for the first time.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the instance. Set the value to **cn-hangzhou**, which indicates an Anti-DDoS Pro instance in the Chinese mainland.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>An array consisting of IDs of the Anti-DDoS Pro instances that you want to query.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <p>The type of the resource to which the tag belongs. Set the value to **INSTANCE**, which indicates an Anti-DDoS Pro instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>An array consisting of tags that you want to query. Each tag consists of a tag **key** and a tag **value**.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeTagResourcesRequestTags> tags;

    public static DescribeTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResourcesRequest self = new DescribeTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeTagResourcesRequest setTags(java.util.List<DescribeTagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeTagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeTagResourcesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag that you want to query.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   You must specify at least one of the **ResourceIds.N** and **Tags.N.Key** parameters.</p>
         * <br>
         * <p>*   You can call the [DescribeTagKeys](https://help.aliyun.com/document_detail/159785.html) operation to query all tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to query.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesRequestTags self = new DescribeTagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
