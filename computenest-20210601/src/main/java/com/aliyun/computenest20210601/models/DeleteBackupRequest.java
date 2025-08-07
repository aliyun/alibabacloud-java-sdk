// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeleteBackupRequest extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-385d35fb088f453c8fa1</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    public static DeleteBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupRequest self = new DeleteBackupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
