// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyEipAddressAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the EIP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7uj6i0d****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the EIP.</p>
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

    public static ModifyEipAddressAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipAddressAttributeRequest self = new ModifyEipAddressAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEipAddressAttributeRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public ModifyEipAddressAttributeRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public ModifyEipAddressAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyEipAddressAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyEipAddressAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEipAddressAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyEipAddressAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
