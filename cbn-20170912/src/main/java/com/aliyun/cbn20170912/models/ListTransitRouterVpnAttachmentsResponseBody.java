// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpnAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is not returned, it indicates that no additional results exist.</p>
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
     * <p>The information about the VPN attachment.</p>
     */
    @NameInMap("TransitRouterAttachments")
    public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments;

    public static ListTransitRouterVpnAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVpnAttachmentsResponseBody self = new ListTransitRouterVpnAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVpnAttachmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterVpnAttachmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterVpnAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTransitRouterVpnAttachmentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTransitRouterVpnAttachmentsResponseBody setTransitRouterAttachments(java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments> transitRouterAttachments) {
        this.transitRouterAttachments = transitRouterAttachments;
        return this;
    }
    public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments> getTransitRouterAttachments() {
        return this.transitRouterAttachments;
    }

    public static class ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags self = new ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones extends TeaModel {
        /**
         * <p>The ID of the zone.</p>
         * <br>
         * <p>You can call the [DescribeZones](~~36064~~) operation to query the most recent zone list.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones self = new ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments extends TeaModel {
        /**
         * <p>Specifies whether to allow the transit router to automatically advertise routes to the IPsec-VPN connection. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The billing method of the VPN attachment.</p>
         * <br>
         * <p>The value is POSTPAY, which is the default value and specifies the pay-as-you-go billing method.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the VPN attachment was created.</p>
         * <br>
         * <p>The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of resource to which the transit router is connected.</p>
         * <br>
         * <p>Valid value: **VPN**, which indicates that an IPsec-VPN connection is attached to the transit router.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the VPN attachment. Valid values:</p>
         * <br>
         * <p>*   **Attached**: The VPC attachment has been created on the transit router.</p>
         * <p>*   **Attaching**: The VPN attachment is being created on the transit router.</p>
         * <p>*   **Detaching**: The VPN attachment is being deleted from the transit router.</p>
         * <p>*   **Detached**: The VPN attachment is deleted from the transit router.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        /**
         * <p>The description of the VPN attachment.</p>
         */
        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        /**
         * <p>The ID of the VPN attachment.</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The name of the VPN attachment.</p>
         */
        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        /**
         * <p>The ID of the transit router.</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         */
        @NameInMap("VpnId")
        public String vpnId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.</p>
         */
        @NameInMap("VpnOwnerId")
        public Long vpnOwnerId;

        /**
         * <p>The ID of the region to which the IPsec-VPN connection belongs.</p>
         * <br>
         * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
         */
        @NameInMap("VpnRegionId")
        public String vpnRegionId;

        /**
         * <p>The zones where the VPN attachment is deployed.</p>
         */
        @NameInMap("Zones")
        public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones> zones;

        public static ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments self = new ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setTags(java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags> getTags() {
            return this.tags;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }
        public String getTransitRouterAttachmentDescription() {
            return this.transitRouterAttachmentDescription;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setTransitRouterAttachmentName(String transitRouterAttachmentName) {
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }
        public String getTransitRouterAttachmentName() {
            return this.transitRouterAttachmentName;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setVpnId(String vpnId) {
            this.vpnId = vpnId;
            return this;
        }
        public String getVpnId() {
            return this.vpnId;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setVpnOwnerId(Long vpnOwnerId) {
            this.vpnOwnerId = vpnOwnerId;
            return this;
        }
        public Long getVpnOwnerId() {
            return this.vpnOwnerId;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setVpnRegionId(String vpnRegionId) {
            this.vpnRegionId = vpnRegionId;
            return this;
        }
        public String getVpnRegionId() {
            return this.vpnRegionId;
        }

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setZones(java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsZones> getZones() {
            return this.zones;
        }

    }

}
