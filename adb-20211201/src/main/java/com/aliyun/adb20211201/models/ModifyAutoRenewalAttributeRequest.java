// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewalAttributeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewalPeriod")
    public String autoRenewalPeriod;

    /**
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("AutoRenewalPeriodUnit")
    public String autoRenewalPeriodUnit;

    /**
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("AutoRenewalStatus")
    public String autoRenewalStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6pl56w1j8h****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
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

    public static ModifyAutoRenewalAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewalAttributeRequest self = new ModifyAutoRenewalAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewalAttributeRequest setAutoRenewalPeriod(String autoRenewalPeriod) {
        this.autoRenewalPeriod = autoRenewalPeriod;
        return this;
    }
    public String getAutoRenewalPeriod() {
        return this.autoRenewalPeriod;
    }

    public ModifyAutoRenewalAttributeRequest setAutoRenewalPeriodUnit(String autoRenewalPeriodUnit) {
        this.autoRenewalPeriodUnit = autoRenewalPeriodUnit;
        return this;
    }
    public String getAutoRenewalPeriodUnit() {
        return this.autoRenewalPeriodUnit;
    }

    public ModifyAutoRenewalAttributeRequest setAutoRenewalStatus(String autoRenewalStatus) {
        this.autoRenewalStatus = autoRenewalStatus;
        return this;
    }
    public String getAutoRenewalStatus() {
        return this.autoRenewalStatus;
    }

    public ModifyAutoRenewalAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAutoRenewalAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoRenewalAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoRenewalAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoRenewalAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoRenewalAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
