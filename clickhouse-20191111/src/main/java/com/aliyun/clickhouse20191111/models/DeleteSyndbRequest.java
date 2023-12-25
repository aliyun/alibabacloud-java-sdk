// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSyndbRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
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
     * <p>The name of the database in the ApsaraDB RDS for MySQL instance. The database is used for data synchronization.</p>
     */
    @NameInMap("SynDb")
    public String synDb;

    public static DeleteSyndbRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyndbRequest self = new DeleteSyndbRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSyndbRequest setDbClusterId(String dbClusterId) {
        this.dbClusterId = dbClusterId;
        return this;
    }
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    public DeleteSyndbRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteSyndbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSyndbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSyndbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteSyndbRequest setSynDb(String synDb) {
        this.synDb = synDb;
        return this;
    }
    public String getSynDb() {
        return this.synDb;
    }

}
