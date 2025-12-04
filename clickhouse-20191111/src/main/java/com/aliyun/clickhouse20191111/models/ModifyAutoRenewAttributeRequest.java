// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1uy5ff6*****</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public String duration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeRequest self = new ModifyAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public ModifyAutoRenewAttributeRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public ModifyAutoRenewAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAutoRenewAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoRenewAttributeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyAutoRenewAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoRenewAttributeRequest setRenewalStatus(String renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    public ModifyAutoRenewAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoRenewAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
