// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPeerAttachmentAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no</p>
     * <p>*   **true**: yes</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The bandwidth value of the inter-region connection. Unit: Mbit/s.</p>
     * <br>
     * <p>*   This parameter specifies the maximum bandwidth value for the inter-region connection if you set **BandwidthType** to **BandwidthPackage**.</p>
     * <p>*   This parameter specifies the bandwidth throttling threshold for the inter-region connection if you set **BandwidthType** to **DataTransfer**.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The bandwidth allocation method. Valid values:</p>
     * <br>
     * <p>*   **BandwidthPackage**: allocates bandwidth from a bandwidth plan.</p>
     * <p>*   **DataTransfer**: bandwidth is billed based on the pay-by-data-transfer metering method.</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.</p>
     * <br>
     * <p>>  If you set **BandwidthType** to **DataTransfer**, you do not need to set this parameter.</p>
     */
    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The default line type.</p>
     * <br>
     * <p>Valid values: Platinum and Gold.</p>
     * <br>
     * <p>Platinum is supported only when BandwidthType is set to DataTransfer.</p>
     */
    @NameInMap("DefaultLinkType")
    public String defaultLinkType;

    /**
     * <p>Specifies whether to perform a dry run to check information such as the permissions and the instance status. Default values:</p>
     * <br>
     * <p>*   **false** (default): performs a dry run and sends the request.</p>
     * <p>*   **true**: performs a dry run. The system checks the required parameters and request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the system returns the ID of the request.</p>
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
     * <br>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The ID of the inter-region connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The new name of the inter-region connection.</p>
     * <br>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
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
