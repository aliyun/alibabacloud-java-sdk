// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryMediaInfoJobListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaInfoJobIds")
    public String mediaInfoJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaInfoJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaInfoJobListRequest self = new QueryMediaInfoJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaInfoJobListRequest setMediaInfoJobIds(String mediaInfoJobIds) {
        this.mediaInfoJobIds = mediaInfoJobIds;
        return this;
    }
    public String getMediaInfoJobIds() {
        return this.mediaInfoJobIds;
    }

    public QueryMediaInfoJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaInfoJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaInfoJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaInfoJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
