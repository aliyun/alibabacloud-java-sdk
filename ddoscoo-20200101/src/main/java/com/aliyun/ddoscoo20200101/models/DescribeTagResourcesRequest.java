// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesRequest extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceType")
    public String resourceType;

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
        @NameInMap("Key")
        public String key;

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
