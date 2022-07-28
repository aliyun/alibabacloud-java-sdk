// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyStorageStrategyRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DuplicationArchivePeriod")
    public Integer duplicationArchivePeriod;

    @NameInMap("DuplicationInfrequentAccessPeriod")
    public Integer duplicationInfrequentAccessPeriod;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyStorageStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStorageStrategyRequest self = new ModifyStorageStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStorageStrategyRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyStorageStrategyRequest setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public ModifyStorageStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyStorageStrategyRequest setDuplicationArchivePeriod(Integer duplicationArchivePeriod) {
        this.duplicationArchivePeriod = duplicationArchivePeriod;
        return this;
    }
    public Integer getDuplicationArchivePeriod() {
        return this.duplicationArchivePeriod;
    }

    public ModifyStorageStrategyRequest setDuplicationInfrequentAccessPeriod(Integer duplicationInfrequentAccessPeriod) {
        this.duplicationInfrequentAccessPeriod = duplicationInfrequentAccessPeriod;
        return this;
    }
    public Integer getDuplicationInfrequentAccessPeriod() {
        return this.duplicationInfrequentAccessPeriod;
    }

    public ModifyStorageStrategyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
