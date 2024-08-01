// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditPolicyRequest extends TeaModel {
    /**
     * <p>The request source for the audit log feature. Set the value to <strong>Console</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Console</p>
     */
    @NameInMap("AuditLogSwitchSource")
    public String auditLogSwitchSource;

    /**
     * <p>Specifies whether to enable the audit log feature. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong></li>
     * <li><strong>disabled</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AuditStatus")
    public String auditStatus;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1785659e3f****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the audit log feature. Valid values:</p>
     * <ul>
     * <li><strong>Trail</strong>: free trial edition.</li>
     * <li><strong>Standard</strong>: official edition.</li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>Trail</strong>. Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and the free trial edition of the feature can no longer be applied for. We recommend that you set this parameter to <strong>Standard</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The log retention period. Valid values: 1 to 365 days. Default value: 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StoragePeriod")
    public Integer storagePeriod;

    public static ModifyAuditPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditPolicyRequest self = new ModifyAuditPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAuditPolicyRequest setAuditLogSwitchSource(String auditLogSwitchSource) {
        this.auditLogSwitchSource = auditLogSwitchSource;
        return this;
    }
    public String getAuditLogSwitchSource() {
        return this.auditLogSwitchSource;
    }

    public ModifyAuditPolicyRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public ModifyAuditPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAuditPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAuditPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAuditPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAuditPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAuditPolicyRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public ModifyAuditPolicyRequest setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }
    public Integer getStoragePeriod() {
        return this.storagePeriod;
    }

}
