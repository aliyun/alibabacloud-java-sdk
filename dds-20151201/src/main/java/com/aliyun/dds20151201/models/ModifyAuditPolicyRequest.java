// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditPolicyRequest extends TeaModel {
    /**
     * <p>The source of the request. Set this parameter to <strong>Console</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Console</p>
     */
    @NameInMap("AuditLogSwitchSource")
    public String auditLogSwitchSource;

    /**
     * <p>The status of the audit log. Valid values:</p>
     * <ul>
     * <li><p><strong>enable</strong>: Enables the audit log feature.</p>
     * </li>
     * <li><p><strong>disabled</strong>: Disables the audit log feature.</p>
     * </li>
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

    /**
     * <p>This parameter is effective only for the <strong>V2_Standard</strong> (DAS Enterprise Edition (NoSQL Compatible) audit log) edition. It specifies the hot storage duration for the audit log. Valid values: 0 to 7. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("HotStoragePeriod")
    public Integer hotStoragePeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The edition of the audit log. Valid values:</p>
     * <ul>
     * <li><p><strong>Trial</strong>: Trial Edition.</p>
     * </li>
     * <li><p><strong>Standard</strong>: Standard Edition.</p>
     * </li>
     * <li><p><strong>V2_Standard</strong>: DAS Enterprise Edition (NoSQL Compatible) audit log.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>The default value of this parameter is <strong>Trial</strong>. Starting from January 6, 2022, the Standard edition is being rolled out across regions, and new applications for the Trial edition are no longer accepted.</p>
     * </li>
     * <li><p>Starting from February 2026, the DAS Enterprise Edition (NoSQL Compatible) audit log will be rolled out across regions, and new applications for the Standard edition will no longer be accepted.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <ul>
     * <li><p>For the <strong>Standard</strong> edition, this parameter specifies the retention period for the audit log. Valid values: 1 to 365. The default value is 30. Unit: days.</p>
     * </li>
     * <li><p>For the <strong>V2_Standard</strong> (DAS Enterprise Edition (NoSQL Compatible) audit log) edition, this parameter specifies the cold storage duration for the audit log. Valid values: 30, 180, 365, 1095, and 1825. Unit: days.</p>
     * </li>
     * </ul>
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

    public ModifyAuditPolicyRequest setHotStoragePeriod(Integer hotStoragePeriod) {
        this.hotStoragePeriod = hotStoragePeriod;
        return this;
    }
    public Integer getHotStoragePeriod() {
        return this.hotStoragePeriod;
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
