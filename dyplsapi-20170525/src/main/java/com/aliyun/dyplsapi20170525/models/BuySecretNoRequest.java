// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BuySecretNoRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("DisplayPool")
    public Boolean displayPool;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    @NameInMap("SpecId")
    public Long specId;

    public static BuySecretNoRequest build(java.util.Map<String, ?> map) throws Exception {
        BuySecretNoRequest self = new BuySecretNoRequest();
        return TeaModel.build(map, self);
    }

    public BuySecretNoRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public BuySecretNoRequest setDisplayPool(Boolean displayPool) {
        this.displayPool = displayPool;
        return this;
    }
    public Boolean getDisplayPool() {
        return this.displayPool;
    }

    public BuySecretNoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BuySecretNoRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BuySecretNoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BuySecretNoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BuySecretNoRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public BuySecretNoRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
