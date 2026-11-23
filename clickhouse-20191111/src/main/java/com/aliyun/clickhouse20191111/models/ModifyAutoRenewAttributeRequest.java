// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeRequest extends TeaModel {
    /**
     * <p>The cluster IDs. Separate multiple cluster IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-bp1uy5ff6*****</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The renewal duration. Default value: <strong>1</strong>.</p>
     * <ul>
     * <li><p>If PeriodUnit is set to <strong>Month</strong>, valid values are 1 to 11.</p>
     * </li>
     * <li><p>If PeriodUnit is set to <strong>Year</strong>, valid values are 1, 2, 3, and 5.</p>
     * <blockquote>
     * <p>A longer subscription duration offers a greater discount. For example, a 1-year subscription is more cost-effective than a 10-month or 11-month subscription.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
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
     * <p>The unit of the renewal duration, which is the unit of the Duration parameter. Valid values: Month and Year.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The renewal status. Valid values:</p>
     * <ul>
     * <li><p><strong>AutoRenewal</strong>: Auto-renewal.</p>
     * </li>
     * <li><p><strong>Normal</strong>: Manual renewal.</p>
     * </li>
     * <li><p><strong>NotRenewal</strong>: No renewal upon expiration.</p>
     * </li>
     * </ul>
     * 
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
