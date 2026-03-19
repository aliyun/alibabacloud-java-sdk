// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyStorageStrategyRequest extends TeaModel {
    /**
     * <p>Backup plan ID. Obtain this parameter\&quot;s value by calling the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsqdss5tmh****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>Backup data retention period, in days. Valid values: 0 to 1825.</p>
     * <blockquote>
     * <p>Default value: 730 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>730</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <strong>example:</strong>
     * <p>encrypted</p>
     */
    @NameInMap("BackupStorageEncryptMethod")
    public String backupStorageEncryptMethod;

    /**
     * <p>An arbitrary string used to ensure the idempotence of the request and prevent duplicate submissions.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstest</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Time to convert to Archive Storage. This value must be less than the backup data retention period (BackupRetentionPeriod parameter). For more information about Archive Storage, see <a href="https://help.aliyun.com/document_detail/51374.html">Storage Type Overview</a>.</p>
     * <blockquote>
     * <p>Default value: 365 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>366</p>
     */
    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    /**
     * <p>Time to convert to Infrequent Access storage. This value must be less than the Archive Storage period (DuplicationArchivePeriod parameter). For more information about Infrequent Access storage, see <a href="https://help.aliyun.com/document_detail/51374.html">Storage Type Overview</a>.</p>
     * <blockquote>
     * <p>Default value: 180 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>190</p>
     */
    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("IncrementBackupRetentionPeriod")
    public String incrementBackupRetentionPeriod;

    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("IncrementDuplicationArchivePeriod")
    public String incrementDuplicationArchivePeriod;

    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("IncrementDuplicationInfrequentAccessPeriod")
    public String incrementDuplicationInfrequentAccessPeriod;

    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("LogDuplicationArchivePeriod")
    public String logDuplicationArchivePeriod;

    /**
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("LogDuplicationInfrequentAccessPeriod")
    public String logDuplicationInfrequentAccessPeriod;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyStorageStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageStrategyRequest self = new ModifyStorageStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStorageStrategyRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyStorageStrategyRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyStorageStrategyRequest setBackupStorageEncryptMethod(String backupStorageEncryptMethod) {
        this.backupStorageEncryptMethod = backupStorageEncryptMethod;
        return this;
    }
    public String getBackupStorageEncryptMethod() {
        return this.backupStorageEncryptMethod;
    }

    public ModifyStorageStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyStorageStrategyRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public ModifyStorageStrategyRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public ModifyStorageStrategyRequest setIncrementBackupRetentionPeriod(String incrementBackupRetentionPeriod) {
        this.incrementBackupRetentionPeriod = incrementBackupRetentionPeriod;
        return this;
    }
    public String getIncrementBackupRetentionPeriod() {
        return this.incrementBackupRetentionPeriod;
    }

    public ModifyStorageStrategyRequest setIncrementDuplicationArchivePeriod(String incrementDuplicationArchivePeriod) {
        this.incrementDuplicationArchivePeriod = incrementDuplicationArchivePeriod;
        return this;
    }
    public String getIncrementDuplicationArchivePeriod() {
        return this.incrementDuplicationArchivePeriod;
    }

    public ModifyStorageStrategyRequest setIncrementDuplicationInfrequentAccessPeriod(String incrementDuplicationInfrequentAccessPeriod) {
        this.incrementDuplicationInfrequentAccessPeriod = incrementDuplicationInfrequentAccessPeriod;
        return this;
    }
    public String getIncrementDuplicationInfrequentAccessPeriod() {
        return this.incrementDuplicationInfrequentAccessPeriod;
    }

    public ModifyStorageStrategyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyStorageStrategyRequest setLogDuplicationArchivePeriod(String logDuplicationArchivePeriod) {
        this.logDuplicationArchivePeriod = logDuplicationArchivePeriod;
        return this;
    }
    public String getLogDuplicationArchivePeriod() {
        return this.logDuplicationArchivePeriod;
    }

    public ModifyStorageStrategyRequest setLogDuplicationInfrequentAccessPeriod(String logDuplicationInfrequentAccessPeriod) {
        this.logDuplicationInfrequentAccessPeriod = logDuplicationInfrequentAccessPeriod;
        return this;
    }
    public String getLogDuplicationInfrequentAccessPeriod() {
        return this.logDuplicationInfrequentAccessPeriod;
    }

    public ModifyStorageStrategyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
