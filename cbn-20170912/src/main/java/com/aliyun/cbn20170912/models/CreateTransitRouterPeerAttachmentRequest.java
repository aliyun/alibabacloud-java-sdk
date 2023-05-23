// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPeerAttachmentRequest extends TeaModel {
    /**
     * <p>The tags.</p>
     */
    @NameInMap("AutoPublishRouteEnabled")
    public Boolean autoPublishRouteEnabled;

    /**
     * <p>The tag keys of the resources. </p>
     * <br>
     * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.  </p>
     * <br>
     * <p>You can specify at most 20 tag keys.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The tag values of the resources. </p>
     * <br>
     * <p>The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.  </p>
     * <br>
     * <p>Each tag key has a unique tag value. You can specify at most 20 tag values in each call.</p>
     */
    @NameInMap("CenBandwidthPackageId")
    public String cenBandwidthPackageId;

    /**
     * <p>The ID of the peer transit router.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description of the inter-region connection.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the inter-region connection.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to check the request but not perform the operation. The system checks the permissions and the status of the specified instances. Valid values:</p>
     * <br>
     * <p>*   **false** (default): checks the request. If the request passes the check, the inter-region connection is created.</p>
     * <p>*   **true**: checks the request but does not perform the operation. The inter-region connection is not created after the request passes the check. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the system returns the ID of the request.</p>
     */
    @NameInMap("PeerTransitRouterId")
    public String peerTransitRouterId;

    /**
     * <p>The method that is used to allocate bandwidth to the inter-region connection. Valid values:</p>
     * <br>
     * <p>**BandwidthPackage**: allocates bandwidth from a bandwidth plan.</p>
     * <br>
     * <p>**DataTransfer**: uses pay-by-data-transfer bandwidth.</p>
     */
    @NameInMap("PeerTransitRouterRegionId")
    public String peerTransitRouterRegionId;

    /**
     * <p>Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no.</p>
     * <p>*   **true**: yes.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>614519</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterPeerAttachmentRequestTag> tag;

    /**
     * <p>The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.</p>
     * <br>
     * <p>>  If you set **BandwidthType** to **DataTransfer**, you do not need to set this parameter.</p>
     */
    @NameInMap("TransitRouterAttachmentDescription")
    public String transitRouterAttachmentDescription;

    /**
     * <p>The bandwidth value of the inter-region connection. Unit: Mbit/s.</p>
     * <br>
     * <p>*   If you set **BandwidthType** to **BandwidthPackage**, this parameter specifies the bandwidth that is available for the inter-region connection.</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   If you set **BandwidthType** to **DataTransfer**, this parameter specifies the bandwidth limit of the inter-region connection.</p>
     */
    @NameInMap("TransitRouterAttachmentName")
    public String transitRouterAttachmentName;

    /**
     * <p>The ID of the region where the peer transit router is deployed.</p>
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
         * <p>master</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>## Background information</p>
         * <br>
         * <p>By default, 1 Kbit/s of bandwidth is provided for inter-region communication between transit routers. This allows you to test the connectivity of inter-region IPv4 networks. To allow services that are deployed in different regions to communicate with each other, you must create an inter-region connection and allocate bandwidth resources to the connection.  </p>
         * <br>
         * <p>Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods: </p>
         * <br>
         * <p>- **Allocate bandwidth resources from a bandwidth plan**:  You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information, see [CreateCenBandwidthPackage](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/createcenbandwidthpackage).</p>
         * <br>
         * <p>- **Use pay-by-data-transfer bandwidth resources**:  You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see [Cross-region data transfers](https://www.alibabacloud.com/help/en/cloud-data-transmission/latest/cross-region-data-transfers).</p>
         * <br>
         * <br>
         * <p>## Usage notes</p>
         * <br>
         * <p>**CreateTransitRouterPeerAttachment** is an asynchronous operation. After you send a request, the system returns the inter-region connection ID but the operation is still being performed in the system background. You can call **ListTransitRouterPeerAttachments** to query the status of an inter-region connection.  </p>
         * <br>
         * <p>- If an inter-region connection is in the **Attaching** state, the inter-region connection is being created. You can query the inter-region connection but cannot perform other regions.</p>
         * <p>- If an inter-region connection is in the **Attached** state, the inter-region connection is created.</p>
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
