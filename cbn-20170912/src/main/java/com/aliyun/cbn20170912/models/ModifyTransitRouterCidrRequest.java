// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterCidrRequest extends TeaModel {
    /**
     * <p>The new CIDR block of the transit router.</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new description of the transit router CIDR block.</p>
     * <br>
     * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: performs a dry run and sends the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The new name of the transit router CIDR block.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.</p>
     * <p>- **true**: yes</p>
     * <p>  </p>
     * <p>  A value of **true** specifies that after you create a private VPN connection and enable route learning for the connection, the system automatically adds the following blackhole route to the route table of the transit router to which the VPN connection is attached:</p>
     * <br>
     * <p>   The destination CIDR block of the blackhole route is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections. </p>
     * <br>
     * <p>    The blackhole route is advertised only to the route tables of virtual border routers (VBRs) that are connected to the transit router. </p>
     * <p>-  **false**: no</p>
     */
    @NameInMap("PublishCidrRoute")
    public Boolean publishCidrRoute;

    /**
     * <p>The ID of the region where the transit router is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](https://help.aliyun.com/document_detail/132080.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the CIDR block.</p>
     * <br>
     * <p>You can call the [ListTransitRouterCidr](https://help.aliyun.com/document_detail/462772.html) operation to query the ID of a CIDR block.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransitRouterCidrId")
    public String transitRouterCidrId;

    /**
     * <p>The ID of the transit router.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ModifyTransitRouterCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterCidrRequest self = new ModifyTransitRouterCidrRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterCidrRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public ModifyTransitRouterCidrRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouterCidrRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTransitRouterCidrRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTransitRouterCidrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyTransitRouterCidrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTransitRouterCidrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTransitRouterCidrRequest setPublishCidrRoute(Boolean publishCidrRoute) {
        this.publishCidrRoute = publishCidrRoute;
        return this;
    }
    public Boolean getPublishCidrRoute() {
        return this.publishCidrRoute;
    }

    public ModifyTransitRouterCidrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTransitRouterCidrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTransitRouterCidrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTransitRouterCidrRequest setTransitRouterCidrId(String transitRouterCidrId) {
        this.transitRouterCidrId = transitRouterCidrId;
        return this;
    }
    public String getTransitRouterCidrId() {
        return this.transitRouterCidrId;
    }

    public ModifyTransitRouterCidrRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
