// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpnAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</p>
     * </li>
     * <li><p>If a value is returned for <strong>NextToken</strong>, the value is the token that is used for the next query.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D5530D2-3BBB-524E-8E98-59AB06A250E4</p>
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
     * <p>A list of VPN connections.</p>
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
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value_A1</p>
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
         * <p>The zone ID.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
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
         * <p>Indicates whether the transit router automatically advertises routes to the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPublishRouteEnabled")
        public Boolean autoPublishRouteEnabled;

        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-j3jzhw1zpau2km****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The billing method of the VPN connection.</p>
         * <p>The value is set to POSTPAY, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the VPN connection was created.</p>
         * <p>The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-08T08:45Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The party that pays for the network instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PayByCenOwner</strong>: The fees for the network instance are paid by the account that owns the CEN instance.</p>
         * </li>
         * <li><p><strong>PayByResourceOwner</strong>: The fees for the network instance are paid by the account that owns the network instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The resource type of the VPN connection.</p>
         * <p>The value is set to <strong>VPN</strong>, which indicates that the transit router is connected to an IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>VPN</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the VPN connection.</p>
         * <ul>
         * <li><p><strong>Attached</strong>: The VPN connection is attached.</p>
         * </li>
         * <li><p><strong>Attaching</strong>: The VPN connection is being attached.</p>
         * </li>
         * <li><p><strong>Detaching</strong>: The VPN connection is being detached.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        /**
         * <p>The description of the VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        /**
         * <p>The ID of the VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-a6p8voaodog5c0****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The name of the VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-p0wm740vjnbaprv0m****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0wtu1xgd0l7fjo7k****</p>
         */
        @NameInMap("VpnId")
        public String vpnId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the IPsec-VPN connection belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        @NameInMap("VpnOwnerId")
        public Long vpnOwnerId;

        /**
         * <p>The ID of the region where the IPsec-VPN connection is deployed.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VpnRegionId")
        public String vpnRegionId;

        /**
         * <p>A list of zones where the VPN connection is deployed.</p>
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

        public ListTransitRouterVpnAttachmentsResponseBodyTransitRouterAttachments setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
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
