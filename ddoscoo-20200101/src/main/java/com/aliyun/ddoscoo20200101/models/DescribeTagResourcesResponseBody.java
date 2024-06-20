// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The query token that is returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>RGuYpqDdKhzXb8C3.D1BwQgc1tMBsoxdGiEKHHUUCf****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36E698F7-48A4-48D0-9554-0BB4BAAB99B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the details of the tags that are added to the Anti-DDoS Pro instance.</p>
     */
    @NameInMap("TagResources")
    public DescribeTagResourcesResponseBodyTagResources tagResources;

    public static DescribeTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResourcesResponseBody self = new DescribeTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagResourcesResponseBody setTagResources(DescribeTagResourcesResponseBodyTagResources tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public DescribeTagResourcesResponseBodyTagResources getTagResources() {
        return this.tagResources;
    }

    public static class DescribeTagResourcesResponseBodyTagResourcesTagResource extends TeaModel {
        /**
         * <p>The ID of the Anti-DDoS Pro instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz121ogz****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. The value is fixed as <strong>INSTANCE</strong>, which indicates an Anti-DDoS Pro instance.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The key of the tag that is added to the Anti-DDoS Pro instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the Anti-DDoS Pro instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeTagResourcesResponseBodyTagResourcesTagResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesResponseBodyTagResourcesTagResource self = new DescribeTagResourcesResponseBodyTagResourcesTagResource();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesResponseBodyTagResourcesTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeTagResourcesResponseBodyTagResourcesTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeTagResourcesResponseBodyTagResourcesTagResource setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeTagResourcesResponseBodyTagResourcesTagResource setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeTagResourcesResponseBodyTagResources extends TeaModel {
        @NameInMap("TagResource")
        public java.util.List<DescribeTagResourcesResponseBodyTagResourcesTagResource> tagResource;

        public static DescribeTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagResourcesResponseBodyTagResources self = new DescribeTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeTagResourcesResponseBodyTagResources setTagResource(java.util.List<DescribeTagResourcesResponseBodyTagResourcesTagResource> tagResource) {
            this.tagResource = tagResource;
            return this;
        }
        public java.util.List<DescribeTagResourcesResponseBodyTagResourcesTagResource> getTagResource() {
            return this.tagResource;
        }

    }

}
