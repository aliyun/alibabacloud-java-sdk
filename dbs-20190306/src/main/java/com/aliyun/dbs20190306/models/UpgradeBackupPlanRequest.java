// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class UpgradeBackupPlanRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01e****</p>
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

    /**
     * <p>The specifications of the instance. Valid values:</p>
     * <ul>
     * <li>micro</li>
     * <li>small</li>
     * <li>medium</li>
     * <li>large</li>
     * <li>xlarge</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>micro</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    @NameInMap("OwnerId")
    public String ownerId;

    public static UpgradeBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeBackupPlanRequest self = new UpgradeBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeBackupPlanRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public UpgradeBackupPlanRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeBackupPlanRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public UpgradeBackupPlanRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
