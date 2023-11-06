// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveBackupsSetRequest extends TeaModel {
    /**
     * <p>The ID of the backup set. You can call the [DescribeBackupSets](~~139331~~) interface to query the ID of a backup set.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static RemoveBackupsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackupsSetRequest self = new RemoveBackupsSetRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBackupsSetRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public RemoveBackupsSetRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
