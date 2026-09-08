// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTableAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent query exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>a415****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6B1D9AB-176D-4399-801D-8BC576F4EB0D</p>
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
     * <p>The list of route association relationships.</p>
     */
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
        /**
         * <p>The ID of the next hop resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1h8vbrbcgohcju5****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the next hop resource. Valid values:</p>
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
         * <p>The status of the route association. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: active.</li>
         * <li><strong>Associating</strong>: being associated.</li>
         * <li><strong>Dissociating</strong>: being dissociated.</li>
         * <li><strong>Deleted</strong>: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Associating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-nls9fzkfat8934****</p>
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
