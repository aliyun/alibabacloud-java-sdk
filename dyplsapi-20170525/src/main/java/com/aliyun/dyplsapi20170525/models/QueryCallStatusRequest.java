// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallStatusRequest extends TeaModel {
    @NameInMap("CallNo")
    public String callNo;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SubsId")
    public String subsId;

    public static QueryCallStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallStatusRequest self = new QueryCallStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallStatusRequest setCallNo(String callNo) {
        this.callNo = callNo;
        return this;
    }
    public String getCallNo() {
        return this.callNo;
    }

    public QueryCallStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCallStatusRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public QueryCallStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCallStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCallStatusRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
