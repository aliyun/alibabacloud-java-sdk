// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The bandwidth value of the inter-region connection. Unit: Mbps.</p>
     * <ul>
     * <li><p>When <strong>BandwidthType</strong> is set to <strong>BandwidthPackage</strong>, this parameter specifies the bandwidth value that the inter-region connection can use.</p>
     * </li>
     * <li><p>When <strong>BandwidthType</strong> is set to <strong>DataTransfer</strong>, this parameter specifies the maximum bandwidth value of the inter-region connection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The method that is used to allocate bandwidth to the inter-region connection. Valid values:</p>
     * <ul>
     * <li><p><strong>BandwidthPackage</strong>: allocates bandwidth from a bandwidth plan.</p>
     * </li>
     * <li><p><strong>DataTransfer</strong>: does not allocate bandwidth to the inter-region connection and charges based on pay-by-traffic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BandwidthPackage</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The ID of the bandwidth plan that you want to associate with the inter-region connection.</p>
     * <blockquote>
     * <p>You do not need to configure this parameter when <strong>BandwidthType</strong> is set to <strong>DataTransfer</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cenbwp-3xrxupouolw5ou****</p>
     */
    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The default line type.</p>
     * <p>Valid values: Platinum and Gold. Default value: Gold.</p>
     * <p>You can set this parameter to Platinum only when the bandwidth allocation method is pay-by-traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>Gold</p>
     */
    @NameInMap("DefaultLinkType")
    public String defaultLinkType;

    /**
     * <p>Specifies whether to perform a dry run to check information such as the permissions and instance status. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, the system creates an inter-region connection.</p>
     * </li>
     * <li><p><strong>true</strong>: sends a check request. The system checks the required parameters and request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, a request ID is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the peer transit router instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-m5eq27g6bndum7e88****</p>
     */
    @NameInMap("PeerTransitRouterId")
    public String peerTransitRouterId;

    /**
     * <p>The ID of the region where the peer transit router instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("PeerTransitRouterRegionId")
    public String peerTransitRouterRegionId;

    /**
     * <p>The ID of the region where the local Enterprise Edition transit router instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag information.</p>
     * <p>You can specify at most 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterPeerAttachmentRequestTag> tag;

    /**
     * <p>The description of the inter-region connection.</p>
     * <p>The description is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The name of the inter-region connection.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The ID of the local Enterprise Edition transit router instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTransitRouterPeerAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPeerAttachmentRequest self = new CreateTransitRouterPeerAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPeerAttachmentRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public CreateTransitRouterPeerAttachmentRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateTransitRouterPeerAttachmentRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public CreateTransitRouterPeerAttachmentRequest setCenBandwidthPackageId(String cenBandwidthPackageId) {
        this.cenBandwidthPackageId = cenBandwidthPackageId;
        return this;
    }
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    public CreateTransitRouterPeerAttachmentRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterPeerAttachmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterPeerAttachmentRequest setDefaultLinkType(String defaultLinkType) {
        this.defaultLinkType = defaultLinkType;
        return this;
    }
    public String getDefaultLinkType() {
        return this.defaultLinkType;
    }

    public CreateTransitRouterPeerAttachmentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterPeerAttachmentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterPeerAttachmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterPeerAttachmentRequest setPeerTransitRouterId(String peerTransitRouterId) {
        this.peerTransitRouterId = peerTransitRouterId;
        return this;
    }
    public String getPeerTransitRouterId() {
        return this.peerTransitRouterId;
    }

    public CreateTransitRouterPeerAttachmentRequest setPeerTransitRouterRegionId(String peerTransitRouterRegionId) {
        this.peerTransitRouterRegionId = peerTransitRouterRegionId;
        return this;
    }
    public String getPeerTransitRouterRegionId() {
        return this.peerTransitRouterRegionId;
    }

    public CreateTransitRouterPeerAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterPeerAttachmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterPeerAttachmentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterPeerAttachmentRequest setTag(java.util.List<CreateTransitRouterPeerAttachmentRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterPeerAttachmentRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterPeerAttachmentRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public CreateTransitRouterPeerAttachmentRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public CreateTransitRouterPeerAttachmentRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class CreateTransitRouterPeerAttachmentRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that you want to attach.</p>
         * <p>You cannot specify an empty string as a tag key. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_A1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that you want to attach to the specified resource.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>Each key-value pair must be unique. You can specify at most 20 tag values in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>value_A1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterPeerAttachmentRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterPeerAttachmentRequestTag self = new CreateTransitRouterPeerAttachmentRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterPeerAttachmentRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterPeerAttachmentRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
