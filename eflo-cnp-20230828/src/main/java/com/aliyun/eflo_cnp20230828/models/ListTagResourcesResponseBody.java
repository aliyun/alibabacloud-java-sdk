// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    /**
     * <p>Access denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Next token for the next query. An empty NextToken indicates there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>uPZbmbpgxp2/6vNWNPoase3Eqy+gL9pdDBH7KGZXMuZ9GxmBbMJcTP/dlrNqRaWF</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5514CB39-B7C0-5B89-8534-2DE1E0F2B7AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of resources</p>
     */
    @NameInMap("TagResources")
    public java.util.List<ListTagResourcesResponseBodyTagResources> tagResources;

    /**
     * <p>Total</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public ListTagResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagResourcesResponseBodyTagResources extends TeaModel {
        /**
         * <p>ResourceId</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Resource type</p>
         * 
         * <strong>example:</strong>
         * <p>ExperimentPlan</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>Tag key</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>Tag value</p>
         * 
         * <strong>example:</strong>
         * <p>syg</p>
         */
        @NameInMap("TagValue")
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
