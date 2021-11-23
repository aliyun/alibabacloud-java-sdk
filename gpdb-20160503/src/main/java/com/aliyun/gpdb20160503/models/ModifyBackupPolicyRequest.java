// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyBackupPolicyRequest extends TeaModel {
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EnableRecoveryPoint")
    public Boolean enableRecoveryPoint;

    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("RecoveryPointPeriod")
    public String recoveryPointPeriod;

    public static ModifyBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPolicyRequest self = new ModifyBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPolicyRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupPolicyRequest setEnableRecoveryPoint(Boolean enableRecoveryPoint) {
        this.enableRecoveryPoint = enableRecoveryPoint;
        return this;
    }
    public Boolean getEnableRecoveryPoint() {
        return this.enableRecoveryPoint;
    }

    public ModifyBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public ModifyBackupPolicyRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public ModifyBackupPolicyRequest setRecoveryPointPeriod(String recoveryPointPeriod) {
        this.recoveryPointPeriod = recoveryPointPeriod;
        return this;
    }
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

}
