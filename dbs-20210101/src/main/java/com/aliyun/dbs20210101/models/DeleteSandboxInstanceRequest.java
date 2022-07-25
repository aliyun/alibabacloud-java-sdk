// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DeleteSandboxInstanceRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteSandboxInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSandboxInstanceRequest self = new DeleteSandboxInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSandboxInstanceRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DeleteSandboxInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
