// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class StopHanaDatabaseAsyncRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000dw******45ijer</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The database name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BWP</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0006wkn******gzkn</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static StopHanaDatabaseAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        StopHanaDatabaseAsyncRequest self = new StopHanaDatabaseAsyncRequest();
        return TeaModel.build(map, self);
    }

    public StopHanaDatabaseAsyncRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopHanaDatabaseAsyncRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public StopHanaDatabaseAsyncRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
