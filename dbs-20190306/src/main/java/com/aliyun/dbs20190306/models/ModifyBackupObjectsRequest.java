// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupObjectsRequest extends TeaModel {
    @NameInMap("BackupObjects")
    public String backupObjects;

    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyBackupObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupObjectsRequest self = new ModifyBackupObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupObjectsRequest setBackupObjects(String backupObjects) {
        this.backupObjects = backupObjects;
        return this;
    }
    public String getBackupObjects() {
        return this.backupObjects;
    }

    public ModifyBackupObjectsRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupObjectsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupObjectsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
