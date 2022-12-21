// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetResourcesResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resource")
    public GetResourcesResponseBodyResource resource;

    @NameInMap("resources")
    public java.util.List<GetResourcesResponseBodyResources> resources;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static GetResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourcesResponseBody self = new GetResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourcesResponseBody setResource(GetResourcesResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public GetResourcesResponseBodyResource getResource() {
        return this.resource;
    }

    public GetResourcesResponseBody setResources(java.util.List<GetResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<GetResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public GetResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetResourcesResponseBodyResource extends TeaModel {
        @NameInMap("resourceAttributes")
        public String resourceAttributes;

        @NameInMap("resourceId")
        public String resourceId;

        public static GetResourcesResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            GetResourcesResponseBodyResource self = new GetResourcesResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public GetResourcesResponseBodyResource setResourceAttributes(String resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public String getResourceAttributes() {
            return this.resourceAttributes;
        }

        public GetResourcesResponseBodyResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class GetResourcesResponseBodyResources extends TeaModel {
        @NameInMap("resourceAttributes")
        public String resourceAttributes;

        @NameInMap("resourceId")
        public String resourceId;

        public static GetResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            GetResourcesResponseBodyResources self = new GetResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public GetResourcesResponseBodyResources setResourceAttributes(String resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public String getResourceAttributes() {
            return this.resourceAttributes;
        }

        public GetResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
