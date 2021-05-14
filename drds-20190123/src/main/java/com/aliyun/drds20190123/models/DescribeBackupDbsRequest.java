// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupDbsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("PreferredRestoreTime")
    public String preferredRestoreTime;

    @NameInMap("BackupId")
    public String backupId;

    public static DescribeBackupDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDbsRequest self = new DescribeBackupDbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDbsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeBackupDbsRequest setPreferredRestoreTime(String preferredRestoreTime) {
        this.preferredRestoreTime = preferredRestoreTime;
        return this;
    }
    public String getPreferredRestoreTime() {
        return this.preferredRestoreTime;
    }

    public DescribeBackupDbsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

}
