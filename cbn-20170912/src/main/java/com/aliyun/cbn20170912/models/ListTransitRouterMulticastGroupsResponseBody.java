// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
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
     * <p>A list of multicast groups.</p>
     */
    @NameInMap("TransitRouterMulticastGroups")
    public java.util.List<ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups> transitRouterMulticastGroups;

    public static ListTransitRouterMulticastGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastGroupsResponseBody self = new ListTransitRouterMulticastGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterMulticastGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterMulticastGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterMulticastGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterMulticastGroupsResponseBody setTransitRouterMulticastGroups(java.util.List<ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups> transitRouterMulticastGroups) {
        this.transitRouterMulticastGroups = transitRouterMulticastGroups;
        return this;
    }
    public java.util.List<ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups> getTransitRouterMulticastGroups() {
        return this.transitRouterMulticastGroups;
    }

    public static class ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups extends TeaModel {
        /**
         * <p>The IP address of the multicast group to which the multicast resource belongs.</p>
         */
        @NameInMap("GroupIpAddress")
        public String groupIpAddress;

        /**
         * <p>Indicates whether the multicast resource is a multicast member. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("GroupMember")
        public Boolean groupMember;

        /**
         * <p>Indicates whether the multicast resource is a multicast source. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("GroupSource")
        public Boolean groupSource;

        /**
         * <p>The type of the multicast source.</p>
         * <br>
         * <p>If the value is **Static**, the multicast source is manually specified.</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>The ID of the ENI, which is a multicast resource.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The ID of the multicast domain associated with the multicast resource that is deployed across regions.</p>
         */
        @NameInMap("PeerTransitRouterMulticastDomainId")
        public String peerTransitRouterMulticastDomainId;

        /**
         * <p>The ID of the resource associated with the multicast resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the multicast resource belongs.</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The type of the multicast resource. Valid values:</p>
         * <br>
         * <p>*   **VPC**: The multicast resource is in a VPC.</p>
         * <p>*   **TR**: The multicast resource is deployed across regions.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type of the multicast member.</p>
         * <br>
         * <p>If the value is **Static**, the multicast member is manually specified.</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The status of the multicast resource. Valid values:</p>
         * <br>
         * <p>*   **Registering**: being created</p>
         * <p>*   **Registered**: available</p>
         * <p>*   **Deregistering**: being deleted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the multicast domain.</p>
         */
        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        /**
         * <p>The ID of the vSwitch to which the multicast resource belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups self = new ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setGroupIpAddress(String groupIpAddress) {
            this.groupIpAddress = groupIpAddress;
            return this;
        }
        public String getGroupIpAddress() {
            return this.groupIpAddress;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setGroupMember(Boolean groupMember) {
            this.groupMember = groupMember;
            return this;
        }
        public Boolean getGroupMember() {
            return this.groupMember;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setGroupSource(Boolean groupSource) {
            this.groupSource = groupSource;
            return this;
        }
        public Boolean getGroupSource() {
            return this.groupSource;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setPeerTransitRouterMulticastDomainId(String peerTransitRouterMulticastDomainId) {
            this.peerTransitRouterMulticastDomainId = peerTransitRouterMulticastDomainId;
            return this;
        }
        public String getPeerTransitRouterMulticastDomainId() {
            return this.peerTransitRouterMulticastDomainId;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }
        public String getTransitRouterMulticastDomainId() {
            return this.transitRouterMulticastDomainId;
        }

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
