// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SetAuthConfigRequest extends TeaModel {
    @NameInMap("Key1")
    public String key1;

    @NameInMap("Key2")
    public String key2;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    public static SetAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAuthConfigRequest self = new SetAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetAuthConfigRequest setKey1(String key1) {
        this.key1 = key1;
        return this;
    }
    public String getKey1() {
        return this.key1;
    }

    public SetAuthConfigRequest setKey2(String key2) {
        this.key2 = key2;
        return this;
    }
    public String getKey2() {
        return this.key2;
    }

    public SetAuthConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetAuthConfigRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SetAuthConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetAuthConfigRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
