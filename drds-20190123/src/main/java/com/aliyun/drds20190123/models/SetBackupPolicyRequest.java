// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupPolicyRequest extends TeaModel {
    /**
     * <p>The databases to be backed up. Separate multiple databases with commas (,).</p>
     * <br>
     * <p>>  This parameter takes effect only when the backup level is database level.</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The level of the backup. Valid values:</p>
     * <br>
     * <p>*   db: The database type.</p>
     * <p>*   instance: instance</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>Specifies whether to enable log Backup. Valid values:</p>
     * <br>
     * <p>*   1: enabled.</p>
     * <p>*   0: disabled.</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup mode. Valid values:</p>
     * <br>
     * <p>*   **Logic **: logical backup</p>
     * <p>*   **phy**: physical backup</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The retention period of the backup data. Value range: 7 to 730.</p>
     */
    @NameInMap("DataBackupRetentionPeriod")
    public String dataBackupRetentionPeriod;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The log retention period. Valid values: 7 to 730. This value must be less than or equal to the number of data backup days.</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    /**
     * <p>The end time of the backup.</p>
     */
    @NameInMap("PreferredBackupEndTime")
    public String preferredBackupEndTime;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <br>
     * <p>*   0: Monday</p>
     * <p>*   1: Tuesday</p>
     * <p>*   2: Wednesday</p>
     * <p>*   3: Thursday</p>
     * <p>*   4: Friday</p>
     * <p>*   5: Saturday</p>
     * <p>*   6: Sunday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The start time of the backup.</p>
     */
    @NameInMap("PreferredBackupStartTime")
    public String preferredBackupStartTime;

    public static SetBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackupPolicyRequest self = new SetBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetBackupPolicyRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public SetBackupPolicyRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public SetBackupPolicyRequest setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public SetBackupPolicyRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public SetBackupPolicyRequest setDataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
        this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
        return this;
    }
    public String getDataBackupRetentionPeriod() {
        return this.dataBackupRetentionPeriod;
    }

    public SetBackupPolicyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public SetBackupPolicyRequest setPreferredBackupEndTime(String preferredBackupEndTime) {
        this.preferredBackupEndTime = preferredBackupEndTime;
        return this;
    }
    public String getPreferredBackupEndTime() {
        return this.preferredBackupEndTime;
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

}
