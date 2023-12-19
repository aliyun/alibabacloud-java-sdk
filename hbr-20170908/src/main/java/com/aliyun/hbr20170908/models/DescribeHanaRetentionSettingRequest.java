// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaRetentionSettingRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DescribeHanaRetentionSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaRetentionSettingRequest self = new DescribeHanaRetentionSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHanaRetentionSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHanaRetentionSettingRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeHanaRetentionSettingRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
