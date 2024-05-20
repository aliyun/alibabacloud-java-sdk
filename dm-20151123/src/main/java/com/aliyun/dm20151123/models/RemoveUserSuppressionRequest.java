// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class RemoveUserSuppressionRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SuppressionIds")
    public String suppressionIds;

    public static RemoveUserSuppressionRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserSuppressionRequest self = new RemoveUserSuppressionRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserSuppressionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveUserSuppressionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveUserSuppressionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveUserSuppressionRequest setSuppressionIds(String suppressionIds) {
        this.suppressionIds = suppressionIds;
        return this;
    }
    public String getSuppressionIds() {
        return this.suppressionIds;
    }

}
