// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SetSuppressionListLevelRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SuppressionListLevel")
    public String suppressionListLevel;

    public static SetSuppressionListLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSuppressionListLevelRequest self = new SetSuppressionListLevelRequest();
        return TeaModel.build(map, self);
    }

    public SetSuppressionListLevelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetSuppressionListLevelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetSuppressionListLevelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetSuppressionListLevelRequest setSuppressionListLevel(String suppressionListLevel) {
        this.suppressionListLevel = suppressionListLevel;
        return this;
    }
    public String getSuppressionListLevel() {
        return this.suppressionListLevel;
    }

}
