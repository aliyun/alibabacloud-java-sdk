// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class EnableBackupLogRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static EnableBackupLogRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupLogRequest self = new EnableBackupLogRequest();
        return TeaModel.build(map, self);
    }

    public EnableBackupLogRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public EnableBackupLogRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public EnableBackupLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
