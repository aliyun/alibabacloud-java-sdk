// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FB3C4A16-0933-5850-9D43-0C3EA37BCBFB</p>
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
         * 
         * <strong>example:</strong>
         * <p>239.XX.XX.2</p>
         */
        @NameInMap("GroupIpAddress")
        public String groupIpAddress;

        /**
         * <p>Indicates whether the multicast resource is a multicast member. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GroupMember")
        public Boolean groupMember;

        /**
         * <p>Indicates whether the multicast resource is a multicast source. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GroupSource")
        public Boolean groupSource;

        /**
         * <p>The type of the multicast source.</p>
         * <p>If the value is <strong>Static</strong>, the multicast source is manually specified.</p>
         * 
         * <strong>example:</strong>
         * <p>Static</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>The ID of the ENI, which is a multicast resource.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-p0weuda3lszwzjly****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The ID of the multicast domain associated with the multicast resource that is deployed across regions.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-91wpg6wbhchjeq****</p>
         */
        @NameInMap("PeerTransitRouterMulticastDomainId")
        public String peerTransitRouterMulticastDomainId;

        /**
         * <p>The ID of the resource associated with the multicast resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-p0w9alkte4w2htrqe****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the multicast resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The type of the multicast resource. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: The multicast resource is in a VPC.</li>
         * <li><strong>TR</strong>: The multicast resource is deployed across regions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The type of the multicast member.</p>
         * <p>If the value is <strong>Static</strong>, the multicast member is manually specified.</p>
         * 
         * <strong>example:</strong>
         * <p>Static</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The status of the multicast resource. Valid values:</p>
         * <ul>
         * <li><strong>Registering</strong>: being created</li>
         * <li><strong>Registered</strong>: available</li>
         * <li><strong>Deregistering</strong>: being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Registered</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-g3kz2k3u76amsk****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The ID of the multicast domain.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-kx0vk0v7fz8kx4****</p>
         */
        @NameInMap("TransitRouterMulticastDomainId")
        public String transitRouterMulticastDomainId;

        /**
         * <p>The ID of the vSwitch to which the multicast resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-p0w9s2ig1jnwgrbzl****</p>
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
