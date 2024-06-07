// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindBatchAxgShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AxgBindList")
    public String axgBindListShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BindBatchAxgShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindBatchAxgShrinkRequest self = new BindBatchAxgShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindBatchAxgShrinkRequest setAxgBindListShrink(String axgBindListShrink) {
        this.axgBindListShrink = axgBindListShrink;
        return this;
    }
    public String getAxgBindListShrink() {
        return this.axgBindListShrink;
    }

    public BindBatchAxgShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindBatchAxgShrinkRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindBatchAxgShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindBatchAxgShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
