// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterCidrAllocations")
    public java.util.List<ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations> transitRouterCidrAllocations;

    public static ListTransitRouterCidrAllocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterCidrAllocationResponseBody self = new ListTransitRouterCidrAllocationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterCidrAllocationResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterCidrAllocationResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterCidrAllocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterCidrAllocationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterCidrAllocationResponseBody setTransitRouterCidrAllocations(java.util.List<ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations> transitRouterCidrAllocations) {
        this.transitRouterCidrAllocations = transitRouterCidrAllocations;
        return this;
    }
    public java.util.List<ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations> getTransitRouterCidrAllocations() {
        return this.transitRouterCidrAllocations;
    }

    public static class ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations extends TeaModel {
        @NameInMap("AllocatedCidrBlock")
        public String allocatedCidrBlock;

        @NameInMap("AttachmentId")
        public String attachmentId;

        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("TransitRouterCidrId")
        public String transitRouterCidrId;

        public static ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations self = new ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations setAllocatedCidrBlock(String allocatedCidrBlock) {
            this.allocatedCidrBlock = allocatedCidrBlock;
            return this;
        }
        public String getAllocatedCidrBlock() {
            return this.allocatedCidrBlock;
        }

        public ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListTransitRouterCidrAllocationResponseBodyTransitRouterCidrAllocations setTransitRouterCidrId(String transitRouterCidrId) {
            this.transitRouterCidrId = transitRouterCidrId;
            return this;
        }
        public String getTransitRouterCidrId() {
            return this.transitRouterCidrId;
        }

    }

}
