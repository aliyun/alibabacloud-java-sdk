// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpcAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is returned, it indicates that no additional results exist.</li>
     * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>C97FF53F-3EF8-4883-B459-60E171924B23</p>
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
     * <p>The information about the VPC connection.</p>
     */
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

    public static class ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags self = new ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings extends TeaModel {
        /**
         * <p>The ID of the ENI created by the Enterprise Edition transit router in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp149hmyaqegerml****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1a214sbus8z3b54****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
        /**
         * <p>Indicates whether the Enterprise Edition transit router can automatically advertise routes to the VPC. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <p>The billing method of the VPC connection.</p>
         * <p>Only <strong>POSTPAY</strong> may be returned, which indicates the default pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the VPC connection was created.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T02:14Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The entity that pays the fees of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>PayByCenOwner</strong>: the Alibaba Cloud account that owns the CEN instance.</li>
         * <li><strong>PayByResourceOwner</strong>: the Alibaba Cloud account that owns the network instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The type of resource to which the transit router is connected.</p>
         * <p>Only <strong>VPC</strong> may be returned, which indicates VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the VPC connection. Valid values:</p>
         * <ul>
         * <li><strong>Attached</strong></li>
         * <li><strong>Attaching</strong></li>
         * <li><strong>Detaching</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags> tags;

        /**
         * <p>The description of the VPC connection.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        @NameInMap("TransitRouterAttachmentDescription")
        public String transitRouterAttachmentDescription;

        /**
         * <p>The VPC connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-nls9fzkfat8934****</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <p>The name of the VPC connection.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("TransitRouterAttachmentName")
        public String transitRouterAttachmentName;

        /**
         * <p>The description of the Enterprise Edition transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The features of the VPC connection.</p>
         */
        @NameInMap("TransitRouterVPCAttachmentOptions")
        public java.util.Map<String, String> transitRouterVPCAttachmentOptions;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1h8vbrbcgohcju5****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        /**
         * <p>The region ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        /**
         * <p>The primary and secondary zones, vSwitches, and ENIs of the VPC.</p>
         */
        @NameInMap("ZoneMappings")
        public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsZoneMappings> zoneMappings;

        public static ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments self = new ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }
        public Boolean getAutoPublishRouteEnabled() {
            return this.autoPublishRouteEnabled;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
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

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setTags(java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsTags> getTags() {
            return this.tags;
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

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setTransitRouterVPCAttachmentOptions(java.util.Map<String, String> transitRouterVPCAttachmentOptions) {
            this.transitRouterVPCAttachmentOptions = transitRouterVPCAttachmentOptions;
            return this;
        }
        public java.util.Map<String, String> getTransitRouterVPCAttachmentOptions() {
            return this.transitRouterVPCAttachmentOptions;
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
