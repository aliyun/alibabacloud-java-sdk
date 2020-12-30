// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StopBackupPlanRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("StopMethod")
    public String stopMethod;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static StopBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        StopBackupPlanRequest self = new StopBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public StopBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public StopBackupPlanRequest setStopMethod(String stopMethod) {
        this.stopMethod = stopMethod;
        return this;
    }
    public String getStopMethod() {
        return this.stopMethod;
    }

    public StopBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StopBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
