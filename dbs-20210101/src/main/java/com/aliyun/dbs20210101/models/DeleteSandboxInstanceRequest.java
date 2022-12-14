// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DeleteSandboxInstanceRequest extends TeaModel {
    // The ID of the backup schedule. You can call the [DescribeBackupPlanList](~~437215~~) operation to obtain the ID of the backup schedule.
    // 
    // >  If your instance is an ApsaraDB RDS for MySQL instance, you can configure [automatic access to the instance](~~193091~~) to automatically add the instance to DBS and obtain the ID of the backup schedule.
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    // The ID of the sandbox instance. You can call the [DescribeSandboxInstances](~~437257~~) operation to obtain the ID of the sandbox instance.
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
