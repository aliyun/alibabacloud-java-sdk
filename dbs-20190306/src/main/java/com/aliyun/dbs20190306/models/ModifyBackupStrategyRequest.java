// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupPeriod")
    public String backupPeriod;

    @NameInMap("BackupStartTime")
    public String backupStartTime;

    @NameInMap("BackupStrategyType")
    public String backupStrategyType;

    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupStrategyRequest self = new ModifyBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupStrategyRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupStrategyRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public ModifyBackupStrategyRequest setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public ModifyBackupStrategyRequest setBackupStrategyType(String backupStrategyType) {
        this.backupStrategyType = backupStrategyType;
        return this;
    }
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    public ModifyBackupStrategyRequest setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
        this.backupLogIntervalSeconds = backupLogIntervalSeconds;
        return this;
    }
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    public ModifyBackupStrategyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
