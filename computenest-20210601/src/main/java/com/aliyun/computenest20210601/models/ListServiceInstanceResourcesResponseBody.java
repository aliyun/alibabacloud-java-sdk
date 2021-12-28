// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListServiceInstanceResourcesResponseBodyResources> resources;

    public static ListServiceInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceResourcesResponseBody self = new ListServiceInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceResourcesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceResourcesResponseBody setResources(java.util.List<ListServiceInstanceResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListServiceInstanceResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListServiceInstanceResourcesResponseBodyResources extends TeaModel {
        @NameInMap("ResourceARN")
        public String resourceARN;

        public static ListServiceInstanceResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceResourcesResponseBodyResources self = new ListServiceInstanceResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceResourcesResponseBodyResources setResourceARN(String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }
        public String getResourceARN() {
            return this.resourceARN;
        }

    }

}
