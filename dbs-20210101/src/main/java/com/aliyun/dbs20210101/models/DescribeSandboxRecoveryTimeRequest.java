// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeRequest extends TeaModel {
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
