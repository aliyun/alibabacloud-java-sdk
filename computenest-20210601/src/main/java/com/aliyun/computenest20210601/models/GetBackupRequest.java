// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetBackupRequest extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-cad4a85ff5e340388b93</p>
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
