// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>The pagination token. An empty value indicates that no additional pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEyMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EB27D183-8F6C-5C5A-A6A3-E0508AF54F78</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of tag information.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;resourceType&quot;: &quot;agentspace&quot;,
     *     &quot;resourceId&quot;: &quot;space-a&quot;,
     *     &quot;tagKey&quot;: &quot;key1&quot;,
     *     &quot;tagValue&quot;: &quot;value1&quot;
     * }]</p>
     */
    @NameInMap("tagResources")
    public java.util.List<ListTagResourcesResponseBodyTagResources> tagResources;

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

    public ListTagResourcesResponseBody setTagResources(java.util.List<ListTagResourcesResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<ListTagResourcesResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>space-a</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type. Set the value to agentspace.</p>
         * 
         * <strong>example:</strong>
         * <p>agentspace</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyTagResources self = new ListTagResourcesResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
