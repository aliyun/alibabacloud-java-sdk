// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupPolicyRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("PreferredBackupStartTime")
    public String preferredBackupStartTime;

    @NameInMap("PreferredBackupEndTime")
    public String preferredBackupEndTime;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("BackupLevel")
    public String backupLevel;

    @NameInMap("BackupDbNames")
    public String backupDbNames;

    @NameInMap("BackupLog")
    public String backupLog;

    @NameInMap("DataBackupRetentionPeriod")
    public String dataBackupRetentionPeriod;

    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    public static SetBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackupPolicyRequest self = new SetBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetBackupPolicyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public SetBackupPolicyRequest setPreferredBackupStartTime(String preferredBackupStartTime) {
        this.preferredBackupStartTime = preferredBackupStartTime;
        return this;
    }
    public String getPreferredBackupStartTime() {
        return this.preferredBackupStartTime;
    }

    public SetBackupPolicyRequest setPreferredBackupEndTime(String preferredBackupEndTime) {
        this.preferredBackupEndTime = preferredBackupEndTime;
        return this;
    }
    public String getPreferredBackupEndTime() {
        return this.preferredBackupEndTime;
    }

    public SetBackupPolicyRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public SetBackupPolicyRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public SetBackupPolicyRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public SetBackupPolicyRequest setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public SetBackupPolicyRequest setDataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
        this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
        return this;
    }
    public String getDataBackupRetentionPeriod() {
        return this.dataBackupRetentionPeriod;
    }

    public SetBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

}
