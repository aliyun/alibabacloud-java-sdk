// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("BackupTime")
    public String backupTime;

    @NameInMap("BackupPeriod")
    public String backupPeriod;

    @NameInMap("RetentionPeriod")
    public Integer retentionPeriod;

    @NameInMap("Active")
    public Boolean active;

    public static ModifyBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanRequest self = new ModifyBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyBackupPlanRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public ModifyBackupPlanRequest setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }
    public String getBackupTime() {
        return this.backupTime;
    }

    public ModifyBackupPlanRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public ModifyBackupPlanRequest setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }
    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public ModifyBackupPlanRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

}
