// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteVirtualBorderRouterRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. This token must be unique across requests. The token can contain only ASCII characters and must not exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the VBR is deployed. You can call the <code>DescribeRegions</code> operation to obtain the latest list of regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The client-side CIDR block. This parameter is required only when you delete a VBR that is part of a dual-tunnel connection.</p>
     */
    @NameInMap("UserCidr")
    public String userCidr;

    /**
     * <p>The ID of the VBR to delete.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    public static DeleteVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualBorderRouterRequest self = new DeleteVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteVirtualBorderRouterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteVirtualBorderRouterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteVirtualBorderRouterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteVirtualBorderRouterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteVirtualBorderRouterRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

    public DeleteVirtualBorderRouterRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

}
