// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteDNAFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBId")
    public String DBId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrimaryKeys")
    public String primaryKeys;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteDNAFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNAFilesRequest self = new DeleteDNAFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDNAFilesRequest setDBId(String DBId) {
        this.DBId = DBId;
        return this;
    }
    public String getDBId() {
        return this.DBId;
    }

    public DeleteDNAFilesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteDNAFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDNAFilesRequest setPrimaryKeys(String primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }
    public String getPrimaryKeys() {
        return this.primaryKeys;
    }

    public DeleteDNAFilesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteDNAFilesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
