// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionRequest extends TeaModel {
    /**
     * <p>The ID of the ENI.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The permission on the ENI. Set the value to InstanceAttach.</p>
     * <br>
     * <p>InstanceAttach: allows authorized users to attach the ENI to an ECS instance. The ENI and the ECS instance must reside in the same zone.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The ID of the Alibaba Cloud partner (a certified ISV) or individual user.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateNetworkInterfacePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfacePermissionRequest self = new CreateNetworkInterfacePermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfacePermissionRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public CreateNetworkInterfacePermissionRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public CreateNetworkInterfacePermissionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNetworkInterfacePermissionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkInterfacePermissionRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

    public CreateNetworkInterfacePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkInterfacePermissionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNetworkInterfacePermissionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
