// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainAssociationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, it indicates that no subsequent query is to be sent.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CD0969B-A605-5D2D-BFF0-699FD182FB7F</p>
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
     * <p>The information about the resource associated with the multicast domain.</p>
     */
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
        /**
         * <p>The ID of the resource associated with the multicast domain.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0w9b7g9l90yofr0n****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource associated with the multicast domain belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The type of resource associated with the multicast domain.</p>
         * <p>Valid value: <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The association status. Valid values:</p>
         * <ul>
         * <li><strong>Associated</strong>: The resource is associated with the multicast domain.</li>
         * <li><strong>Associating</strong>: The resource is being associated with the multicast domain.</li>
         * <li><strong>Dissociating</strong>: The resource is being disassociated from the multicast domain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dissociating</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-p90y3ymbbwuvy5****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the multicast domain.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-91wpg6wbhchjeq****</p>
         */
        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0wxk12u6okfkr8xy****</p>
         */
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
