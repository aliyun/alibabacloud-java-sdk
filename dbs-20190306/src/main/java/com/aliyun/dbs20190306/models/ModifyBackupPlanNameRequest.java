// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupPlanNameRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0XXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The name of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi0XXXX</p>
     */
    @NameInMap("BackupPlanName")
    public String backupPlanName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

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

    public ModifyBackupPlanNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupPlanNameRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
