// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetBackupRequest extends TeaModel {
    /**
     * <p>The ID of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-fdb897sdf****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    public static GetBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBackupRequest self = new GetBackupRequest();
        return TeaModel.build(map, self);
    }

    public GetBackupRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
