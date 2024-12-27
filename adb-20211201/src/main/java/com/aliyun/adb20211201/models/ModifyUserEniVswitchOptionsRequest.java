// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyUserEniVswitchOptionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-rj9ixufmywqq98z******,vsw-rj95ij6wcz656v7******</p>
     */
    @NameInMap("VSwitchOptions")
    public String vSwitchOptions;

    public static ModifyUserEniVswitchOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserEniVswitchOptionsRequest self = new ModifyUserEniVswitchOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserEniVswitchOptionsRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public ModifyUserEniVswitchOptionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyUserEniVswitchOptionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyUserEniVswitchOptionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUserEniVswitchOptionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyUserEniVswitchOptionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyUserEniVswitchOptionsRequest setVSwitchOptions(String vSwitchOptions) {
        this.vSwitchOptions = vSwitchOptions;
        return this;
    }
    public String getVSwitchOptions() {
        return this.vSwitchOptions;
    }

}
