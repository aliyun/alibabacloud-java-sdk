// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DisableBackupLogRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan. To get this ID, call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCziJZNwH****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to disable only the log backup feature for a physical backup of a MySQL database.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableMysqlPhysicalBackupBinlogOnly")
    public String disableMysqlPhysicalBackupBinlogOnly;

    @NameInMap("OwnerId")
    public String ownerId;

    public static DisableBackupLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableBackupLogRequest self = new DisableBackupLogRequest();
        return TeaModel.build(map, self);
    }

    public DisableBackupLogRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DisableBackupLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableBackupLogRequest setDisableMysqlPhysicalBackupBinlogOnly(String disableMysqlPhysicalBackupBinlogOnly) {
        this.disableMysqlPhysicalBackupBinlogOnly = disableMysqlPhysicalBackupBinlogOnly;
        return this;
    }
    public String getDisableMysqlPhysicalBackupBinlogOnly() {
        return this.disableMysqlPhysicalBackupBinlogOnly;
    }

    public DisableBackupLogRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
