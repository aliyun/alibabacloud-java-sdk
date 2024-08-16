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
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> was not returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>a415****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
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
     * <p>A list of associated forwarding correlations.</p>
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
         * <p>The ID of the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1h8vbrbcgohcju5****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of next hop. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC</li>
         * <li><strong>VBR</strong>: VBR</li>
         * <li><strong>TR</strong>: transit router</li>
         * <li><strong>VPN</strong> :VPN attachment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the associated forwarding correlation. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The associated forwarding correlation is available.</li>
         * <li><strong>Associating</strong>: The associated forwarding correlation is being created.</li>
         * <li><strong>Dissociating</strong>: The associated forwarding correlation is being deleted.</li>
         * <li><strong>Deleted</strong>: The associated forwarding correlation is deleted.</li>
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
