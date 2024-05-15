// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswdRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
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
     * <p>The new VNC password of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VncPassword")
    public String vncPassword;

    public static ModifyInstanceVncPasswdRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswdRequest self = new ModifyInstanceVncPasswdRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVncPasswdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceVncPasswdRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceVncPasswdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceVncPasswdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceVncPasswdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceVncPasswdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyInstanceVncPasswdRequest setVncPassword(String vncPassword) {
        this.vncPassword = vncPassword;
        return this;
    }
    public String getVncPassword() {
        return this.vncPassword;
    }

}
