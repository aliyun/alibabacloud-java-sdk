// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyHpcClusterAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The **ClientToken** value must contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotency](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the HPC cluster. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the HPC cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>The name of the HPC cluster. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the HPC cluster. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyHpcClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHpcClusterAttributeRequest self = new ModifyHpcClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHpcClusterAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyHpcClusterAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyHpcClusterAttributeRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public ModifyHpcClusterAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyHpcClusterAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyHpcClusterAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHpcClusterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHpcClusterAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHpcClusterAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
