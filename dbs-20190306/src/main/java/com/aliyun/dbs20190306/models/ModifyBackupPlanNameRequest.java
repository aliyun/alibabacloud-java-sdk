// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanNameRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupPlanName")
    public String backupPlanName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ModifyBackupPlanNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupPlanNameRequest self = new ModifyBackupPlanNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupPlanNameRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupPlanNameRequest setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
        return this;
    }
    public String getBackupPlanName() {
        return this.backupPlanName;
    }

    public ModifyBackupPlanNameRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupPlanNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
