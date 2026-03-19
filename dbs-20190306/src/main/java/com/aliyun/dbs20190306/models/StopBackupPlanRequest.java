// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class StopBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01XXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>A client token to ensure the idempotence of the request. This prevents the same request from being sent repeatedly.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The method used to pause the backup plan. Valid values:</p>
     * <ul>
     * <li><p>ALL: Pauses the backup schedule, full data backup jobs, incremental log backup jobs, and restore jobs.</p>
     * </li>
     * <li><p>PLAN: Pauses only the backup schedule.</p>
     * </li>
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
