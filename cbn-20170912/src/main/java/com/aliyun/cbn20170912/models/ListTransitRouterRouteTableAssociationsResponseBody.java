// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTableAssociationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterAssociations")
    public java.util.List<ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations> transitRouterAssociations;

    public static ListTransitRouterRouteTableAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTableAssociationsResponseBody self = new ListTransitRouterRouteTableAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTableAssociationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTableAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTableAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteTableAssociationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteTableAssociationsResponseBody setTransitRouterAssociations(java.util.List<ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations> transitRouterAssociations) {
        this.transitRouterAssociations = transitRouterAssociations;
        return this;
    }
    public java.util.List<ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations> getTransitRouterAssociations() {
        return this.transitRouterAssociations;
    }

    public static class ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        public static ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations self = new ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterRouteTableAssociationsResponseBodyTransitRouterAssociations setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

    }

}
