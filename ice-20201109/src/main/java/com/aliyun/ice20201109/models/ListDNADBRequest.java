// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNADBRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2288c6ca184c0e47098a5b665e2a12****,78dc866518b843259669df58ed30****</p>
     */
    @NameInMap("DBIds")
    public String DBIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListDNADBRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDNADBRequest self = new ListDNADBRequest();
        return TeaModel.build(map, self);
    }

    public ListDNADBRequest setDBIds(String DBIds) {
        this.DBIds = DBIds;
        return this;
    }
    public String getDBIds() {
        return this.DBIds;
    }

    public ListDNADBRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListDNADBRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDNADBRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListDNADBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
