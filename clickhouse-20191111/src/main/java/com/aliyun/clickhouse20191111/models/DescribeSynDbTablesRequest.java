// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbTablesRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraDB for ClickHouse cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbClusterId")
    public String dbClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the ApsaraDB RDS for MySQL instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SynDb")
    public String synDb;

    public static DescribeSynDbTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynDbTablesRequest self = new DescribeSynDbTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynDbTablesRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public DescribeSynDbTablesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSynDbTablesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSynDbTablesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSynDbTablesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSynDbTablesRequest setSynDb(String synDb) {
        this.synDb = synDb;
        return this;
    }
    public String getSynDb() {
        return this.synDb;
    }

}
