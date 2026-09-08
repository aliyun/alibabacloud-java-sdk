// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPeerAttachmentAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow the Enterprise Edition transit router to automatically advertise routes of the inter-region connection to the peer region.</p>
     * <ul>
     * <li><strong>false</strong> (default): no.</li>
     * <li><strong>true</strong>: yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The bandwidth value of the inter-region connection. Unit: Mbit/s.</p>
     * <ul>
     * <li>If <strong>BandwidthType</strong> is set to <strong>BandwidthPackage</strong>, this parameter specifies the bandwidth that the inter-region connection can use.</li>
     * <li>If <strong>BandwidthType</strong> is set to <strong>DataTransfer</strong>, this parameter specifies the bandwidth limit of the inter-region connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The bandwidth allocation method. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthPackage</strong>: allocates bandwidth from a bandwidth package.</li>
     * <li><strong>DataTransfer</strong>: does not allocate bandwidth to the inter-region connection. Billing is based on the traffic volume.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BandwidthPackage</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The ID of the bandwidth package to be associated with the inter-region connection.</p>
     * <p>&lt;props=&quot;china&quot;&gt;If you do not specify a bandwidth package ID, the test bandwidth is used. The default test bandwidth is 1 Kbit/s and is intended only for testing (IPv4) network connectivity.</p>
     * <blockquote>
     * <p>If <strong>BandwidthType</strong> is set to <strong>DataTransfer</strong>, you do not need to configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cenbwp-3xrxupouolw5ou****</p>
     */
    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The default link type.</p>
     * <p>Valid values: Platinum and Gold. Default value: Gold.</p>
     * <p>The value can be set to Platinum only when the bandwidth allocation method is pay-by-data-transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>Gold</p>
     */
    @NameInMap("DefaultLinkType")
    public String defaultLinkType;

    /**
     * <p>Specifies whether to perform a dry run, including permission and instance status verification. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request and directly modifies the configuration of the inter-region connection after the request passes the check.</li>
     * <li><strong>true</strong>: sends a check request. Only the check is performed and the configuration of the inter-region connection is not modified. The check items include whether required parameters are specified and the request format. If the check fails, the corresponding error is returned. If the check succeeds, the corresponding request ID is returned.</li>
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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new description of the inter-region connection.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The ID of the inter-region connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-ft94dcrbc3e5taun3x</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The new name of the inter-region connection.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    public static UpdateTransitRouterPeerAttachmentAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPeerAttachmentAttributeRequest self = new UpdateTransitRouterPeerAttachmentAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
        this.autoPublishRouteEnabled = autoPublishRouteEnabled;
        return this;
    }
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setCenBandwidthPackageId(String cenBandwidthPackageId) {
        this.cenBandwidthPackageId = cenBandwidthPackageId;
        return this;
    }
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setDefaultLinkType(String defaultLinkType) {
        this.defaultLinkType = defaultLinkType;
        return this;
    }
    public String getDefaultLinkType() {
        return this.defaultLinkType;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
        this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
        return this;
    }
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public UpdateTransitRouterPeerAttachmentAttributeRequest setTransitRouterAttachmentName(String transitRouterAttachmentName) {
        this.transitRouterAttachmentName = transitRouterAttachmentName;
        return this;
    }
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

}
