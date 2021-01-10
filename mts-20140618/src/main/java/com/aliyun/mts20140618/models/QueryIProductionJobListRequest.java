// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryIProductionJobListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("IProductionJobIds")
    public String IProductionJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static QueryIProductionJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobListRequest self = new QueryIProductionJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryIProductionJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryIProductionJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryIProductionJobListRequest setIProductionJobIds(String IProductionJobIds) {
        this.IProductionJobIds = IProductionJobIds;
        return this;
    }
    public String getIProductionJobIds() {
        return this.IProductionJobIds;
    }

    public QueryIProductionJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
