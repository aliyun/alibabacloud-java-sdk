// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QuerySimplePoolInfoListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolName")
    public String poolName;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QuerySimplePoolInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySimplePoolInfoListRequest self = new QuerySimplePoolInfoListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySimplePoolInfoListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySimplePoolInfoListRequest setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public QuerySimplePoolInfoListRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySimplePoolInfoListRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public QuerySimplePoolInfoListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySimplePoolInfoListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
