// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryUsertagExistenceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UsertagPosition")
    public Integer usertagPosition;

    public static QueryUsertagExistenceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUsertagExistenceRequest self = new QueryUsertagExistenceRequest();
        return TeaModel.build(map, self);
    }

    public QueryUsertagExistenceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryUsertagExistenceRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryUsertagExistenceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryUsertagExistenceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryUsertagExistenceRequest setUsertagPosition(Integer usertagPosition) {
        this.usertagPosition = usertagPosition;
        return this;
    }
    public Integer getUsertagPosition() {
        return this.usertagPosition;
    }

}
