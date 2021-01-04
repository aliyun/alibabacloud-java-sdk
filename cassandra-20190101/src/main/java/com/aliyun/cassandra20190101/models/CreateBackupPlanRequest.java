// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class CreateBackupPlanRequest extends TeaModel {
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

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPlanRequest self = new CreateBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateBackupPlanRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public CreateBackupPlanRequest setBackupTime(String backupTime) {
        this.backupTime = backupTime;
        return this;
    }
    public String getBackupTime() {
        return this.backupTime;
    }

    public CreateBackupPlanRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public CreateBackupPlanRequest setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }
    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    public CreateBackupPlanRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public CreateBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
