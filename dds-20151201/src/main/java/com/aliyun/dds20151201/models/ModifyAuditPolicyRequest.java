// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditPolicyRequest extends TeaModel {
    /**
     * <p>The request source for the audit log feature. Set the value to **Console**.</p>
     */
    @NameInMap("AuditLogSwitchSource")
    public String auditLogSwitchSource;

    /**
     * <p>Specifies whether the audit log feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **enable**</p>
     * <p>*   **disabled**</p>
     */
    @NameInMap("AuditStatus")
    public String auditStatus;

    /**
     * <p>The ID of the instance.</p>
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
     * <br>
     * <p>*   **Trail**: the free trial edition</p>
     * <p>*   **Standard**: the official edition</p>
     * <br>
     * <p>>  Default value: **Trial**. Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and new applications for the free trial edition have ended. We recommend that you set this parameter to **Standard**.</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The log retention period. Valid values: 1 to 365 days. Default value: 30 days.</p>
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
