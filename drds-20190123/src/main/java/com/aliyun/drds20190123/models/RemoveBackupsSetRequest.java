// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveBackupsSetRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("BackupId")
    @Validation(required = true)
    public String backupId;

    public static RemoveBackupsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackupsSetRequest self = new RemoveBackupsSetRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBackupsSetRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public RemoveBackupsSetRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
