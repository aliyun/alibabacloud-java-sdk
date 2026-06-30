// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * <ul>
     * <li><p>If you did not set the <strong>MaxResults</strong> parameter in the request, this parameter indicates the total number of entries.</p>
     * </li>
     * <li><p>If you set the <strong>MaxResults</strong> parameter in the request, this parameter indicates the number of entries on the current page.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no next page exists.</p>
     * </li>
     * <li><p>If <strong>NextToken</strong> is not empty, the value of this parameter indicates the token that is used for the next query.</p>
     * </li>
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
     * <p>A list of CIDR block allocations.</p>
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
         * <p>The allocated CIDR block.</p>
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
         * <p>The CIDR block of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The ID of the CIDR block of the transit router.</p>
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
