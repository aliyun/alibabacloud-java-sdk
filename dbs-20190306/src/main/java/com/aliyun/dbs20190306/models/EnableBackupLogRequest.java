// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class EnableBackupLogRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan. Call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi******</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>Any string value.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableMysqlPhysicalBackupBinlog")
    public String enableMysqlPhysicalBackupBinlog;

    @NameInMap("OwnerId")
    public String ownerId;

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

    public EnableBackupLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableBackupLogRequest setEnableMysqlPhysicalBackupBinlog(String enableMysqlPhysicalBackupBinlog) {
        this.enableMysqlPhysicalBackupBinlog = enableMysqlPhysicalBackupBinlog;
        return this;
    }
    public String getEnableMysqlPhysicalBackupBinlog() {
        return this.enableMysqlPhysicalBackupBinlog;
    }

    public EnableBackupLogRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
