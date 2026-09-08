// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>If you did not specify the <strong>MaxResults</strong> request parameter, it indicates that you did not need to query results by page. The value of <strong>MaxResults</strong> in the response indicates the total number of entries.</li>
     * <li>If you specified the <strong>MaxResults</strong> request parameter, it indicates that you needed to query results by page. The value of <strong>MaxResults</strong> in the response indicates the number of entries on the current page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent request exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The allocation details of the transit router CIDR block.</p>
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
         * <p>The allocated CIDR block under the transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/28</p>
         */
        @NameInMap("AllocatedCidrBlock")
        public String allocatedCidrBlock;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-2nalp6yksc805w****</p>
         */
        @NameInMap("AttachmentId")
        public String attachmentId;

        /**
         * <p>The name of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>The transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The ID of the transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>cidr-0zv0q9crqpntzz****</p>
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
