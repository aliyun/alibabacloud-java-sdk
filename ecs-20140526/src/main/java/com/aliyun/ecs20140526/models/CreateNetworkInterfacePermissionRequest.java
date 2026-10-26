// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfacePermissionRequest extends TeaModel {
    /**
     * <p>The account ID of the Alibaba Cloud partner (certified ISV) or the individual user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The ID of the Elastic network interface controller (NIC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp14v2sdd3v8htln****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The Elastic network interface controller (NIC) permission action. Only InstanceAttach is supported.</p>
     * <p>InstanceAttach: allows the authorized user to attach your Elastic network interface controller (NIC) to their ECS instance. The ECS instance and the Elastic network interface controller (NIC) must reside in the same active zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceAttach</p>
     */
    @NameInMap("Permission")
    public String permission;

    /**
     * <p>The region of the Elastic network interface controller (NIC) permission. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
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
