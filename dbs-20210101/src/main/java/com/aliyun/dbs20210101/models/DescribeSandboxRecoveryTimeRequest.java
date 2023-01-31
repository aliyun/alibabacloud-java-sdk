// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can call the [DescribeBackupPlanList](~~437215~~) operation to obtain the ID of the backup schedule. If you set this parameter to the backup schedule ID obtained by calling the DescribeBackupPlanList operation, the dbs prefix must be removed. Otherwise, the call fails.</p>
     * <br>
     * <p>>  If your instance is an ApsaraDB RDS for MySQL instance, you can configure [automatic access to the instance](~~193091~~) to automatically add the instance to DBS and obtain the ID of the backup schedule.</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    public static DescribeSandboxRecoveryTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxRecoveryTimeRequest self = new DescribeSandboxRecoveryTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxRecoveryTimeRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

}
