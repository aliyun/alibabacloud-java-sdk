// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The private number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecretNo")
    public String secretNo;

    public static QuerySecretNoDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretNoDetailRequest self = new QuerySecretNoDetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecretNoDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySecretNoDetailRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public QuerySecretNoDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySecretNoDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySecretNoDetailRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

}
