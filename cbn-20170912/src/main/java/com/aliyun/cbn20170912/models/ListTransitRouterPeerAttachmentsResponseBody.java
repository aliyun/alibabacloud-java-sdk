// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPeerAttachmentsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TransitRouterAttachments")
    public java.util.List<ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments;

    public static ListTransitRouterPeerAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPeerAttachmentsResponseBody self = new ListTransitRouterPeerAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterPeerAttachmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterPeerAttachmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterPeerAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterPeerAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterPeerAttachmentsResponseBody setTransitRouterAttachments(java.util.List<ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments) {
        this.transitRouterAttachments = transitRouterAttachments;
        return this;
    }
    public java.util.List<ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static class ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("CenBandwidthPackageId")
        public String cenBandwidthPackageId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("PeerTransitRouterId")
        public String peerTransitRouterId;

        @NameInMap("PeerTransitRouterOwnerId")
        public Long peerTransitRouterOwnerId;

        @NameInMap("PeerTransitRouterRegionId")
        public String peerTransitRouterRegionId;

        @NameInMap("RegionId")
        public String regionId;

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

        public static ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments self = new ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setCenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }
        public String getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setPeerTransitRouterId(String peerTransitRouterId) {
            this.peerTransitRouterId = peerTransitRouterId;
            return this;
        }
        public String getPeerTransitRouterId() {
            return this.peerTransitRouterId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setPeerTransitRouterOwnerId(Long peerTransitRouterOwnerId) {
            this.peerTransitRouterOwnerId = peerTransitRouterOwnerId;
            return this;
        }
        public Long getPeerTransitRouterOwnerId() {
            return this.peerTransitRouterOwnerId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setPeerTransitRouterRegionId(String peerTransitRouterRegionId) {
            this.peerTransitRouterRegionId = peerTransitRouterRegionId;
            return this;
        }
        public String getPeerTransitRouterRegionId() {
            return this.peerTransitRouterRegionId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
