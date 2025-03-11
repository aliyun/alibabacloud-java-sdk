// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class StartRestoreRequest extends TeaModel {
    /**
     * <p>The name of the database to be restored. Separate multiple databases with commas (,).</p>
     * <blockquote>
     * <p> If you do not specify any database name, all databases in the instance are restored by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test1,test2</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The ID of the DRDS backup set.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system restores data by time (PreferredBackupTime).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>23***</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The level of the backup. Valid values:</p>
     * <ul>
     * <li>db: The database level.</li>
     * <li>instance: the instance level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>The backup method. Valid values:</p>
     * <ul>
     * <li>logic: the logical backup.</li>
     * <li>phy: fast backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>phy</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The ID of the DRDS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds********</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The restoration time of the instance, in the format of<code> yyyy-MM-dd HH:mm:ss</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-10 20:18:18</p>
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
