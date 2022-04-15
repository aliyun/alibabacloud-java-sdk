// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainAssociationsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterMulticastAssociations")
    public java.util.List<ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations> transitRouterMulticastAssociations;

    public static ListTransitRouterMulticastDomainAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastDomainAssociationsResponseBody self = new ListTransitRouterMulticastDomainAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastDomainAssociationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterMulticastDomainAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterMulticastDomainAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterMulticastDomainAssociationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterMulticastDomainAssociationsResponseBody setTransitRouterMulticastAssociations(java.util.List<ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations> transitRouterMulticastAssociations) {
        this.transitRouterMulticastAssociations = transitRouterMulticastAssociations;
        return this;
    }
    public java.util.List<ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations> getTransitRouterMulticastAssociations() {
        return this.transitRouterMulticastAssociations;
    }

    public static class ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations self = new ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }
        public String getTransitRouterMulticastDomainId() {
            return this.transitRouterMulticastDomainId;
        }

        public ListTransitRouterMulticastDomainAssociationsResponseBodyTransitRouterMulticastAssociations setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
