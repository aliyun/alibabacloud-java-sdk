// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    // The number of entries to return on each page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token used to start the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The region ID of the resource.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource, which is the ID of the cloud desktop. Valid values of N: 1 to 50.
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    // The type of the resource. Set the value to ALIYUN::GWS::INSTANCE.
    @NameInMap("ResourceType")
    public String resourceType;

    // The list of the resource.
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(java.util.List<ListTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        // The key of tag N. Valid values of N: 1 to 20.
        @NameInMap("Key")
        public String key;

        // The value of tag N. Valid values of N: 1 to 20.
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
