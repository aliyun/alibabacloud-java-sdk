// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class StartHanaDatabaseAsyncRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-000a9ipe******sme</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The database name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HXE</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0000hrh******vhr3i</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static StartHanaDatabaseAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        StartHanaDatabaseAsyncRequest self = new StartHanaDatabaseAsyncRequest();
        return TeaModel.build(map, self);
    }

    public StartHanaDatabaseAsyncRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StartHanaDatabaseAsyncRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public StartHanaDatabaseAsyncRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
