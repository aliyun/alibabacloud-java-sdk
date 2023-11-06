// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartRestoreRequest extends TeaModel {
    /**
     * <p>The name of the database to be restored. Separate multiple databases with commas (,).</p>
     * <br>
     * <p>>  If you do not specify any database name, all databases in the instance are restored by default.</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The ID of the DRDS backup set.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system restores data by time (PreferredBackupTime).</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The level of the backup. Valid values:</p>
     * <br>
     * <p>*   db: The database level.</p>
     * <p>*   instance: the instance level.</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>The backup method. Valid values:</p>
     * <br>
     * <p>*   logic: the logical backup.</p>
     * <p>*   phy: fast backup</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The restoration time of the instance, in the format of`  yyyy-MM-dd HH:mm:ss `.</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    public static StartRestoreRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRestoreRequest self = new StartRestoreRequest();
        return TeaModel.build(map, self);
    }

    public StartRestoreRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public StartRestoreRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public StartRestoreRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public StartRestoreRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public StartRestoreRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public StartRestoreRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

}
