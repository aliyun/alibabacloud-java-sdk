// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResourcesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<GetAccessKeyLastUsedResourcesResponseBodyResources> resources;

    public static GetAccessKeyLastUsedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResourcesResponseBody self = new GetAccessKeyLastUsedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessKeyLastUsedResourcesResponseBody setResources(java.util.List<GetAccessKeyLastUsedResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<GetAccessKeyLastUsedResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class GetAccessKeyLastUsedResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Source")
        public String source;

        @NameInMap("UsedTimestamp")
        public Long usedTimestamp;

        public static GetAccessKeyLastUsedResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedResourcesResponseBodyResources self = new GetAccessKeyLastUsedResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAccessKeyLastUsedResourcesResponseBodyResources setUsedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

    }

}
