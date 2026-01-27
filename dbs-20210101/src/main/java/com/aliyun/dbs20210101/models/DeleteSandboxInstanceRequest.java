// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DeleteSandboxInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/437215.html">DescribeBackupPlanList</a> operation to query the ID of the backup schedule.</p>
     * <blockquote>
     * <p>If your instance is an ApsaraDB RDS for MySQL instance, you can <a href="https://help.aliyun.com/document_detail/193091.html">configure automatic access to a data source</a> to automatically add the instance to DBS and obtain the ID of the backup schedule.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1hxxxx8xxxxxa</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The ID of the sandbox instance. You can call the <a href="https://help.aliyun.com/document_detail/437257.html">DescribeSandboxInstances</a> operation to query the ID of the sandbox instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1jxxxxnxxx1xc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZoneId")
    public String zoneId;

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

    public DeleteSandboxInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
