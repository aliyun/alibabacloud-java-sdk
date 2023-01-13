// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a precheck to check information such as the permissions and instance status. Valid values:</p>
     * <br>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, the name and description of the route are modified.</p>
     * <p>*   **true**: prechecks the request but does not modify the name or description of the transit router. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
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
     * <p>The new description of the route.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -. You can also leave the description empty.</p>
     */
    @NameInMap("TransitRouterRouteEntryDescription")
    public String transitRouterRouteEntryDescription;

    /**
     * <p>The ID of the route entry.</p>
     */
    @NameInMap("TransitRouterRouteEntryId")
    public String transitRouterRouteEntryId;

    /**
     * <p>The new name of the route.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -. You can also leave the name empty.</p>
     */
    @NameInMap("TransitRouterRouteEntryName")
    public String transitRouterRouteEntryName;

    public static UpdateTransitRouterRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteEntryRequest self = new UpdateTransitRouterRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterRouteEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterRouteEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterRouteEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterRouteEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterRouteEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterRouteEntryRequest setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
        this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
        return this;
    }
    public String getTransitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }

    public UpdateTransitRouterRouteEntryRequest setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
        this.transitRouterRouteEntryId = transitRouterRouteEntryId;
        return this;
    }
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    public UpdateTransitRouterRouteEntryRequest setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
        this.transitRouterRouteEntryName = transitRouterRouteEntryName;
        return this;
    }
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }

}
