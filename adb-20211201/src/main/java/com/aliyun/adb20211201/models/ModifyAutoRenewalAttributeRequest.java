// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewalAttributeRequest extends TeaModel {
    /**
     * <p>The duration of the auto-renewal. Default value: 1. Valid values:</p>
     * <ul>
     * <li>When <strong>AutoRenewalPeriod</strong> is set to <strong>Month</strong>, the value ranges from 1 to 11 (integer).</li>
     * <li>When <strong>AutoRenewalPeriod</strong> is set to <strong>Month</strong>, the valid values are 1, 2, 3, and 5 (integer).</li>
     * </ul>
     * <blockquote>
     * <p> Longer renewal periods offer better pricing. Renewing for 1 year is more cost-effective than renewing for 10 or 11 months.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewalPeriod")
    public String autoRenewalPeriod;

    /**
     * <p>Auto-renewal duration. Valid values:</p>
     * <ul>
     * <li>Year.</li>
     * <li>Month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("AutoRenewalPeriodUnit")
    public String autoRenewalPeriodUnit;

    /**
     * <p>The renewal method. Valid values:</p>
     * <ul>
     * <li><strong>AutoRenewal</strong>: The cluster is automatically renewed.</li>
     * <li><strong>Normal</strong>: The cluster is manually renewed. Before the cluster expires, the system sends you a reminder by SMS message.</li>
     * <li><strong>NotRenewal</strong>: The cluster is not renewed. Reminders are only sent three days before cluster expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AutoRenewal</p>
     */
    @NameInMap("AutoRenewalStatus")
    public String autoRenewalStatus;

    /**
     * <p>The ID of cluster.</p>
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
     * <p>The region ID.</p>
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
