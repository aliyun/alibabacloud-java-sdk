// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class EnableBackupRequest extends TeaModel {
    /**
     * <p>The ID of the backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-1736207****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the HSM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hsm-cn-mp90fxef****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupRequest self = new EnableBackupRequest();
        return TeaModel.build(map, self);
    }

    public EnableBackupRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public EnableBackupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
