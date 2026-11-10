// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterCidrRequest extends TeaModel {
    /**
     * <p>The CIDR block of the transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the transit router CIDR block.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the transit router CIDR block. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the transit router CIDR block is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the transit router CIDR block.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to allow the system to automatically add a route for the transit router CIDR block to the transit router route table. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong> (default): allows the system to automatically add the route.</p>
     * <p>   If you set this parameter to true, after you create a VPN connection of the private network gateway type and create a route learning correlation for the VPN connection, the system automatically adds a route entry to the transit router route table that is associated with the VPN connection:</p>
     * <p>A blackhole route whose destination CIDR block is the transit router CIDR block. The transit router CIDR block refers to the CIDR block from which a gateway IP address is assigned to the IPsec connection. The blackhole route is propagated only to the route table of the VBR under the transit router.</p>
     * </li>
     * <li><p><strong>false</strong>: does not allow the system to automatically add the route.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PublishCidrRoute")
    public Boolean publishCidrRoute;

    /**
     * <p>The region ID of the transit router.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
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
     * <p>The instance ID of the transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-p0w3x8c9em72a40nw****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTransitRouterCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterCidrRequest self = new CreateTransitRouterCidrRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterCidrRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateTransitRouterCidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterCidrRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTransitRouterCidrRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterCidrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTransitRouterCidrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterCidrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterCidrRequest setPublishCidrRoute(Boolean publishCidrRoute) {
        this.publishCidrRoute = publishCidrRoute;
        return this;
    }
    public Boolean getPublishCidrRoute() {
        return this.publishCidrRoute;
    }

    public CreateTransitRouterCidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterCidrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterCidrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterCidrRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
