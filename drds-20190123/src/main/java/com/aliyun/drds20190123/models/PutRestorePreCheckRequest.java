// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutRestorePreCheckRequest extends TeaModel {
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupLevel")
    public String backupLevel;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    public static PutRestorePreCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        PutRestorePreCheckRequest self = new PutRestorePreCheckRequest();
        return TeaModel.build(map, self);
    }

    public PutRestorePreCheckRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public PutRestorePreCheckRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public PutRestorePreCheckRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public PutRestorePreCheckRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public PutRestorePreCheckRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public PutRestorePreCheckRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

}
