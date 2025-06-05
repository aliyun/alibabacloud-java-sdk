// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The returned pagination token which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1340C38D-6189-54D1-86F6-7D5ECF3E0088</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried resources.</p>
     */
    @NameInMap("TagResources")
    public java.util.List<TagResources> tagResources;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setTagResources(java.util.List<TagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<TagResources> getTagResources() {
        return this.tagResources;
    }

    public static class TagResources extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-2zelg8vwnlzdhf8hv****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>ContainerGroup: elastic container instance</li>
         * <li>ImageCache: image cache</li>
         * <li>DataCache: data cache</li>
         * <li>VirtualNode: virtual node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ContainerGroup</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The key of the tag that is added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static TagResources build(java.util.Map<String, ?> map) throws Exception {
            TagResources self = new TagResources();
            return TeaModel.build(map, self);
        }

        public TagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public TagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public TagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public TagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
