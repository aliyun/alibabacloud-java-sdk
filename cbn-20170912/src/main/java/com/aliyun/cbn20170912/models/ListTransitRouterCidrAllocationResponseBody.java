// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>*   If no value is specified for **MaxResults**, query results are returned in one batch. The value of **MaxResults** indicates the total number of entries.</p>
     * <p>*   If a value is specified for **MaxResults**, query results are returned in batches. The value of **MaxResults** in the response indicates the number of entries in the current batch.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** was not returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the CIDR blocks that have IP addresses allocated to network instances.</p>
     */
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
        /**
         * <p>The CIDR blocks that have IP addresses allocated to network instances.</p>
         */
        @NameInMap("AllocatedCidrBlock")
        public String allocatedCidrBlock;

        /**
         * <p>The ID of the network instance connection.</p>
         */
        @NameInMap("AttachmentId")
        public String attachmentId;

        /**
         * <p>The name of the network instance connection.</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The CIDR block of the transit router.</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The ID of the CIDR block.</p>
         */
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
