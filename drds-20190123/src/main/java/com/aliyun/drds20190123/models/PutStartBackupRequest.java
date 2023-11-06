// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutStartBackupRequest extends TeaModel {
    /**
     * <p>If you need to back up data at the database level, you must specify the list of databases to be backed up, and separate multiple databases with commas (,).</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The backup level. Valid values:</p>
     * <br>
     * <p>*   instance: instance</p>
     * <p>*   db: The database type.</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>The backup mode. For more information, see [backup mode](~~108631~~) and the valid values are as follows:</p>
     * <br>
     * <p>*   phy: fast backup</p>
     * <p>*   logic: Consistent backup</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static PutStartBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutStartBackupRequest self = new PutStartBackupRequest();
        return TeaModel.build(map, self);
    }

    public PutStartBackupRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public PutStartBackupRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public PutStartBackupRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public PutStartBackupRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
