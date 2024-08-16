// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteEntryRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Default values:</p>
     * <ul>
     * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters and request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
     * <p>The new description of the route.</p>
     * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterRouteEntryDescription")
    public String transitRouterRouteEntryDescription;

    /**
     * <p>The ID of the route.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rte-ksssq7kto4wfdx****</p>
     */
    @NameInMap("TransitRouterRouteEntryId")
    public String transitRouterRouteEntryId;

    /**
     * <p>The new name of the route.</p>
     * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
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
