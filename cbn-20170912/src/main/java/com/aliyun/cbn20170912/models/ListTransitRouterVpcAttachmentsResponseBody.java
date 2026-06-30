// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpcAttachmentsResponseBody extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
     * <ul>
     * <li><p>If this parameter is empty, all results have been returned.</p>
     * </li>
     * <li><p>If a value is returned for <strong>NextToken</strong>, it is the token to start the next query.</p>
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
     * <p>C97FF53F-3EF8-4883-B459-60E171924B23</p>
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
     * <p>A list of VPC connections.</p>
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

    public static class ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions extends TeaModel {
        /**
         * <p>Specifies whether appliance mode is enabled.</p>
         * <ul>
         * <li><p><strong>disable</strong> (default): Appliance mode is disabled.</p>
         * </li>
         * <li><p><strong>enable</strong>: Appliance mode is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("ApplianceModeSupport")
        public String applianceModeSupport;

        /**
         * <p>Specifies whether IPv6 is enabled.</p>
         * <ul>
         * <li><p><strong>disable</strong> (default): IPv6 is disabled.</p>
         * </li>
         * <li><p><strong>enable</strong>: IPv6 is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Ipv6Support")
        public String ipv6Support;

        public static ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions self = new ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions setApplianceModeSupport(String applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }
        public String getApplianceModeSupport() {
            return this.applianceModeSupport;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions setIpv6Support(String ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }
        public String getIpv6Support() {
            return this.ipv6Support;
        }

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
         * <p>The ID of the ENI that the Enterprise Edition transit router creates in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp149hmyaqegerml****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1a214sbus8z3b54****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone.</p>
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
         * <p>Specifies whether the Enterprise Edition transit router automatically advertises routes to the VPC.</p>
         * <ul>
         * <li><p><strong>false</strong>: Routes are not automatically advertised.</p>
         * </li>
         * <li><p><strong>true</strong>: Routes are automatically advertised.</p>
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
         * <p>The billing method of the VPC connection.</p>
         * <p>The value is always <strong>POSTPAY</strong>, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the VPC connection was created.</p>
         * <p>The time is in the <code>YYYY-MM-DDThh:mmZ</code> format and in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T02:14Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The cloud service to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>SAS</p>
         */
        @NameInMap("ManagedService")
        public String managedService;

        /**
         * <p>A collection of feature attributes.</p>
         */
        @NameInMap("Options")
        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions options;

        /**
         * <p>Specifies who pays for the network instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PayByCenOwner</strong>: The account that owns the CEN instance pays the fees.</p>
         * </li>
         * <li><p><strong>PayByResourceOwner</strong>: The account that owns the network instance pays the fees.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByCenOwner</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The type of resource to which the connection is attached.</p>
         * <p>The value is always <strong>VPC</strong>, which indicates a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the VPC connection.</p>
         * <ul>
         * <li><p><strong>Attached</strong>: The connection is established.</p>
         * </li>
         * <li><p><strong>Attaching</strong>: The connection is being created.</p>
         * </li>
         * <li><p><strong>Detaching</strong>: The connection is being deleted.</p>
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
         * <p>The ID of the VPC connection.</p>
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
         * <p>The ID of the Enterprise Edition transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-bp1su1ytdxtataupl****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The feature attributes of the VPC connection. This parameter is deprecated. We recommend that you use the Options parameter instead.</p>
         */
        @NameInMap("TransitRouterVPCAttachmentOptions")
        public java.util.Map<String, String> transitRouterVPCAttachmentOptions;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1h8vbrbcgohcju5****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the account that owns the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>1250123456123456</p>
         */
        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        /**
         * <p>The ID of the region where the VPC is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("VpcRegionId")
        public String vpcRegionId;

        /**
         * <p>The zone mappings of the VPC connection. This includes the vSwitches and elastic network interfaces (ENIs) in the associated VPC.</p>
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

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setManagedService(String managedService) {
            this.managedService = managedService;
            return this;
        }
        public String getManagedService() {
            return this.managedService;
        }

        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachments setOptions(ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions options) {
            this.options = options;
            return this;
        }
        public ListTransitRouterVpcAttachmentsResponseBodyTransitRouterAttachmentsOptions getOptions() {
            return this.options;
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
