// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** is different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **false** (default): performs a dry run and performs the actual request.</p>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
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
     * <p>The description of the route.</p>
     * <br>
     * <p>The description must be 0 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("TransitRouterRouteEntryDescription")
    public String transitRouterRouteEntryDescription;

    /**
     * <p>The destination CIDR block of the route.</p>
     */
    @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    public String transitRouterRouteEntryDestinationCidrBlock;

    /**
     * <p>The name of the route.</p>
     * <br>
     * <p>The name must be 0 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -.</p>
     */
    @NameInMap("TransitRouterRouteEntryName")
    public String transitRouterRouteEntryName;

    /**
     * <p>The ID of the network instance connection that you want to specify as the next hop.</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopId")
    public String transitRouterRouteEntryNextHopId;

    /**
     * <p>The type of the next hop. Valid values:</p>
     * <br>
     * <p>*   **BlackHole**: routes network traffic to a black hole. All packets that match this route are dropped. If you select this option, you do not need to specify the next hop information.</p>
     * <p>*   **Attachment**: routes network traffic to a network instance connection. If you select this option, you must specify the ID of the network instance connection. All packets that match this route are routed to the specified network instance connection.</p>
     */
    @NameInMap("TransitRouterRouteEntryNextHopType")
    public String transitRouterRouteEntryNextHopType;

    /**
     * <p>The ID of the route table of the Enterprise Edition transit router.</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    public static CreateTransitRouterRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteEntryRequest self = new CreateTransitRouterRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
        this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
        return this;
    }
    public String getTransitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
        this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
        return this;
    }
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
        this.transitRouterRouteEntryName = transitRouterRouteEntryName;
        return this;
    }
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
        this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
        this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
        return this;
    }
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    public CreateTransitRouterRouteEntryRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

}
