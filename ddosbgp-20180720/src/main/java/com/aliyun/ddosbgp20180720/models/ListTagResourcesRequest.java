// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The operation that you want to perform. Set the value to **ListTagResources**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The value of the tag that is added to the instance.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The value of the tag to query.</p>
     * <br>
     * <p>>  The **ResourceIds.N** parameter and the key-value pair (Tag.N.Key and Tag.N.Value) cannot be left empty at the same time.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The key of the tag to query.</p>
     * <br>
     * <p>>  The **ResourceIds.N** parameter and the key-value pair (Tag.N.Key and Tag.N.Value) cannot be left empty at the same time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
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

    public ListTagResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the resource. The value is fixed as **INSTANCE**, which indicates instances.</p>
         */
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
