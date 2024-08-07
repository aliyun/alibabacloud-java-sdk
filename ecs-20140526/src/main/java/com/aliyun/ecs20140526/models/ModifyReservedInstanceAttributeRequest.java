// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-example</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the reserved instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The new name of the reserved instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecsri-uf61hdhue4kcorqsk****</p>
     */
    @NameInMap("ReservedInstanceId")
    public String reservedInstanceId;

    /**
     * <p>The new description of the reserved instance. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>testReservedInstanceName</p>
     */
    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyReservedInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceAttributeRequest self = new ModifyReservedInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyReservedInstanceAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyReservedInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyReservedInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyReservedInstanceAttributeRequest setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
        return this;
    }
    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    public ModifyReservedInstanceAttributeRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public ModifyReservedInstanceAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyReservedInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
