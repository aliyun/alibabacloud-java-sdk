// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaWorkflowIds")
    public String mediaWorkflowIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static QueryMediaWorkflowListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowListRequest self = new QueryMediaWorkflowListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaWorkflowListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaWorkflowListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMediaWorkflowListRequest setMediaWorkflowIds(String mediaWorkflowIds) {
        this.mediaWorkflowIds = mediaWorkflowIds;
        return this;
    }
    public String getMediaWorkflowIds() {
        return this.mediaWorkflowIds;
    }

    public QueryMediaWorkflowListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
