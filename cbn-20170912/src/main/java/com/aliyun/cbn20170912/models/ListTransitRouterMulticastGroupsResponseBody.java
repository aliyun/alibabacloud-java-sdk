// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("GroupIpAddress")
        public String groupIpAddress;

        @NameInMap("GroupMember")
        public Boolean groupMember;

        @NameInMap("GroupSource")
        public Boolean groupSource;

        @NameInMap("MemberType")
        public String memberType;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("PeerTransitRouterMulticastDomainId")
        public String peerTransitRouterMulticastDomainId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

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

        public ListTransitRouterMulticastGroupsResponseBodyTransitRouterMulticastGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
