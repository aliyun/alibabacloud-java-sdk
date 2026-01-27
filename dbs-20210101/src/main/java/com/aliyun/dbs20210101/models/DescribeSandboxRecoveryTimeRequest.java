// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/437215.html">DescribeBackupPlanList</a> operation to obtain the ID of the backup schedule. If you set this parameter to the backup schedule ID obtained by calling the DescribeBackupPlanList operation, the dbs prefix must be removed. Otherwise, the call fails.</p>
     * <blockquote>
     * <p>If your instance is an ApsaraDB RDS for MySQL instance, you can <a href="https://help.aliyun.com/document_detail/193091.html">configure automatic access to a data source</a> to automatically add the instance to DBS and obtain the ID of the backup schedule.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1jyjal15l****</p>
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
