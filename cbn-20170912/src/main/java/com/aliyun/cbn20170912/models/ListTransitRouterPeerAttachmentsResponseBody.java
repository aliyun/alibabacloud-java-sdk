// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPeerAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If the returned value of **NextToken** is empty, it indicates that no next query is to be sent.</p>
     * <p>*   If the returned value of **NextToken** is not empty, the value indicates the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of cross-region connections.</p>
     */
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

    public static class ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags extends TeaModel {
        /**
         * <p>The key of tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags self = new ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        /**
         * <p>Indicates whether the local Enterprise Edition transit router automatically advertises routes of the cross-region connection to the peer transit router. Valid values:</p>
         * <br>
         * <p>*   **false** (default): no</p>
         * <p>*   **true**: yes</p>
         */
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        /**
         * <p>The bandwidth value of the cross-region connection. Unit: Mbit/s.</p>
         * <br>
         * <p>*   If **BandwidthType** is set to **BandwidthPackage**, this parameter indicates the bandwidth that is available for the cross-region connection.</p>
         * <p>*   If **BandwidthType** is set to **DataTransfer**, this parameter indicates the bandwidth limit of the cross-region connection.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The bandwidth allocation method. Valid values:</p>
         * <br>
         * <p>**BandwidthPackage**: allocates bandwidth from a bandwidth plan.</p>
         * <br>
         * <p>**DataTransfer**: uses pay-by-data-transfer bandwidth.</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The ID of the bandwidth plan that is used to allocate bandwidth to the cross-region connection.</p>
         */
        @NameInMap("CenBandwidthPackageId")
        public String cenBandwidthPackageId;

        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the cross-region connection was created.</p>
         * <br>
         * <p>The time follows the ISO8601 standard in the `YYYY-MM-ddTHH:mmZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The areas that are connected by the bandwidth plan.</p>
         */
        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        /**
         * <p>The ID of the peer transit router.</p>
         */
        @NameInMap("PeerTransitRouterId")
        public String peerTransitRouterId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the peer transit router belongs.</p>
         */
        @NameInMap("PeerTransitRouterOwnerId")
        public Long peerTransitRouterOwnerId;

        /**
         * <p>The ID of the region where the peer transit router is deployed.</p>
         */
        @NameInMap("PeerTransitRouterRegionId")
        public String peerTransitRouterRegionId;

        /**
         * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the resource to which the transit router is connected. Valid values:</p>
         * <br>
         * <p>*   **VPC**: virtual private cloud (VPC)</p>
         * <p>*   **CCN**: Cloud Connect Network (CCN) instance</p>
         * <p>*   **VBR**: virtual border router (VBR)</p>
         * <p>*   **TR**: transit router</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the cross-region connection. Valid values:</p>
         * <br>
         * <p>*   **Attached**: The local transit router is connected to the peer transit router.</p>
         * <p>*   **Attaching**: The local transit router is connecting to the peer transit router.</p>
         * <p>*   **Detaching**: The local transit router is disconnecting from the peer transit router.</p>
         * <p>*   **Detached**: The local transit router is disconnected from the peer transit router.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        /**
         * <p>The description of the cross-region connection.</p>
         */
        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        /**
         * <p>The ID of the cross-region connection.</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The name of the cross-region connection.</p>
         */
        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        /**
         * <p>The ID of the Enterprise Edition transit router.</p>
         */
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

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
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

        public ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachments setTags(java.util.List<ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterPeerAttachmentsResponseBodyTransitRouterAttachmentsTags> getTags() {
            return this.tags;
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
