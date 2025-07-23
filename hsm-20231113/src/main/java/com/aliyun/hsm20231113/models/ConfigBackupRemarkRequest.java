// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigBackupRemarkRequest extends TeaModel {
    /**
     * <p>The ID of the backup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-fdb897sdfg****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The name of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The description of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>Test backup.</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static ConfigBackupRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigBackupRemarkRequest self = new ConfigBackupRemarkRequest();
        return TeaModel.build(map, self);
    }

    public ConfigBackupRemarkRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ConfigBackupRemarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigBackupRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
