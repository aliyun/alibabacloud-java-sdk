// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupDbsRequest extends TeaModel {
    /**
     * <p>Query by backup set ID</p>
     * 
     * <strong>example:</strong>
     * <p>201908367</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of a DRDS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>Query by restoration time.</p>
     * 
     * <strong>example:</strong>
     * <p>1568632541236</p>
     */
    @NameInMap("PreferredRestoreTime")
    public String preferredRestoreTime;

    public static DescribeBackupDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDbsRequest self = new DescribeBackupDbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDbsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
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

}
