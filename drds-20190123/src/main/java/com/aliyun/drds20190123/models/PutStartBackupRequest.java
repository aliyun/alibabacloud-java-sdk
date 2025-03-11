// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutStartBackupRequest extends TeaModel {
    /**
     * <p>If you need to back up data at the database level, you must specify the list of databases to be backed up, and separate multiple databases with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>db_1, db_2</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The backup level. Valid values:</p>
     * <ul>
     * <li>instance: instance</li>
     * <li>db: The database type.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>The backup mode. For more information, see <a href="https://help.aliyun.com/document_detail/108631.html">backup mode</a> and the valid values are as follows:</p>
     * <ul>
     * <li>phy: fast backup</li>
     * <li>logic: Consistent backup</li>
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
     * <p>drds****c6vxxyzd</p>
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
