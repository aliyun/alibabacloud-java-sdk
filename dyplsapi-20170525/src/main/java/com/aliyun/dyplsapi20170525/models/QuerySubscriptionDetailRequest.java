// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNoX")
    public String phoneNoX;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubsId")
    public String subsId;

    public static QuerySubscriptionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailRequest self = new QuerySubscriptionDetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySubscriptionDetailRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public QuerySubscriptionDetailRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public QuerySubscriptionDetailRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QuerySubscriptionDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySubscriptionDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySubscriptionDetailRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
