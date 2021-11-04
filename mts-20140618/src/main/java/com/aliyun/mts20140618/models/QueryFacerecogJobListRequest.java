// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFacerecogJobListRequest extends TeaModel {
    @NameInMap("FacerecogJobIds")
    public String facerecogJobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryFacerecogJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFacerecogJobListRequest self = new QueryFacerecogJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFacerecogJobListRequest setFacerecogJobIds(String facerecogJobIds) {
        this.facerecogJobIds = facerecogJobIds;
        return this;
    }
    public String getFacerecogJobIds() {
        return this.facerecogJobIds;
    }

    public QueryFacerecogJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryFacerecogJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryFacerecogJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryFacerecogJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
