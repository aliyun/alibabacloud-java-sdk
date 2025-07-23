// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ResetBackupRequest extends TeaModel {
    /**
     * <p>The ID of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-fdb897sdfg5****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    public static ResetBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetBackupRequest self = new ResetBackupRequest();
        return TeaModel.build(map, self);
    }

    public ResetBackupRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
