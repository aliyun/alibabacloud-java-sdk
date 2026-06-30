// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterRouteTableAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * <ul>
     * <li><p>If this parameter is not returned, it indicates that no more results are to be returned.</p>
     * </li>
     * <li><p>If a value is returned for this parameter, the value is the token that is used for the next query.</p>
     * </li>
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
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>A list of forwarding associations.</p>
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
         * <p>The type of the next hop resource.</p>
         * <ul>
         * <li><p><strong>VPC</strong>: virtual private cloud (VPC).</p>
         * </li>
         * <li><p><strong>VBR</strong>: virtual border router (VBR).</p>
         * </li>
         * <li><p><strong>TR</strong>: transit router.</p>
         * </li>
         * <li><p><strong>VPN</strong>: VPN connection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the association.</p>
         * <ul>
         * <li><p><strong>Active</strong>: The association is active.</p>
         * </li>
         * <li><p><strong>Associating</strong>: The association is being created.</p>
         * </li>
         * <li><p><strong>Dissociating</strong>: The association is being deleted.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The association is deleted.</p>
         * </li>
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
         * <p>The ID of the route table of the Enterprise Edition transit router.</p>
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
