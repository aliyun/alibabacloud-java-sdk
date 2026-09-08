// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTablePropagationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04C81E0D-945E-4D61-A561-3DEA322F243B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of route learning relationships.</p>
     */
    @NameInMap("TransitRouterPropagations")
    public java.util.List<ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations> transitRouterPropagations;

    public static ListTransitRouterRouteTablePropagationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterRouteTablePropagationsResponseBody self = new ListTransitRouterRouteTablePropagationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterRouteTablePropagationsResponseBody setTransitRouterPropagations(java.util.List<ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations> transitRouterPropagations) {
        this.transitRouterPropagations = transitRouterPropagations;
        return this;
    }
    public java.util.List<ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations> getTransitRouterPropagations() {
        return this.transitRouterPropagations;
    }

    public static class ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations extends TeaModel {
        /**
         * <p>The network instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1h8vbrbcgohcju5****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The network instance type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: virtual private cloud (VPC) instance.</li>
         * <li><strong>VBR</strong>: virtual border router (VBR) instance.</li>
         * <li><strong>TR</strong>: transit router instance.</li>
         * <li><strong>VPN</strong>: VPN connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the route learning relationship. Valid values:</p>
         * <ul>
         * <li><strong>Enabling</strong>: being enabled.</li>
         * <li><strong>Disabling</strong>: being disabled.</li>
         * <li><strong>Active</strong>: active.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The network instance connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-vx6iwhjr1x1j78****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the Enterprise Edition transit router route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1dudbh2d5na6b50****</p>
         */
        @NameInMap("TransitRouterRouteTableId")
        public String transitRouterRouteTableId;

        public static ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations self = new ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterRouteTablePropagationsResponseBodyTransitRouterPropagations setTransitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

    }

}
