// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpcAttachmentsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterAttachments")
    public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments;

    public static ListTransitRouterVpcAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVpcAttachmentsResponseBody self = new ListTransitRouterVpcAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVpcAttachmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterVpcAttachmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterVpcAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterVpcAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterVpcAttachmentsResponseBody setTransitRouterAttachments(java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments) {
        this.transitRouterAttachments = transitRouterAttachments;
        return this;
    }
    public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static class ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings self = new ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        @NameInMap("ZoneMappings")
        public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings> zoneMappings;

        public static ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments self = new ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setVpcOwnerId(Long vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setVpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }
        public String getVpcRegionId() {
            return this.vpcRegionId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setZoneMappings(java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }
        public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings> getZoneMappings() {
            return this.zoneMappings;
        }

    }

}
