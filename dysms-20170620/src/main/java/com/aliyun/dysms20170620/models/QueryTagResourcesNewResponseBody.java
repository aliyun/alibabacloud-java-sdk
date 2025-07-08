// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTagResourcesNewResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagResources")
    public java.util.List<QueryTagResourcesNewResponseBodyTagResources> tagResources;

    public static QueryTagResourcesNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagResourcesNewResponseBody self = new QueryTagResourcesNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagResourcesNewResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryTagResourcesNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagResourcesNewResponseBody setTagResources(java.util.List<QueryTagResourcesNewResponseBodyTagResources> tagResources) {
        this.tagResources = tagResources;
        return this;
    }
    public java.util.List<QueryTagResourcesNewResponseBodyTagResources> getTagResources() {
        return this.tagResources;
    }

    public static class QueryTagResourcesNewResponseBodyTagResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static QueryTagResourcesNewResponseBodyTagResources build(java.util.Map<String, ?> map) throws Exception {
            QueryTagResourcesNewResponseBodyTagResources self = new QueryTagResourcesNewResponseBodyTagResources();
            return TeaModel.build(map, self);
        }

        public QueryTagResourcesNewResponseBodyTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryTagResourcesNewResponseBodyTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryTagResourcesNewResponseBodyTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public QueryTagResourcesNewResponseBodyTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
