// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretNoDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the number pool.</p>
     * <p>Log on to the Phone Number Protection console and obtain the <strong>Number Pool Key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2258****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The privacy number, which is the X number.</p>
     * <p>Log on to the Phone Number Protection console and obtain the X number on the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page. Alternatively, view the <strong>SecretNo</strong> parameter in the response when you call a number binding operation such as <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-bindaxb">BindAxb</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
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
