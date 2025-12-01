// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StopBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The method that is used to stop the backup schedule. Valid values:</p>
     * <ul>
     * <li>ALL: stops the backup schedule, full data backup tasks, incremental log backup tasks, and restore tasks</li>
     * <li>PLAN: stops only the backup schedule.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("StopMethod")
    public String stopMethod;

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

    public StopBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StopBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public StopBackupPlanRequest setStopMethod(String stopMethod) {
        this.stopMethod = stopMethod;
        return this;
    }
    public String getStopMethod() {
        return this.stopMethod;
    }

}
