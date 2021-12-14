// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryUsagesRequest extends TeaModel {
    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Type")
    public Integer type;

    public static QueryUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUsagesRequest self = new QueryUsagesRequest();
        return TeaModel.build(map, self);
    }

    public QueryUsagesRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public QueryUsagesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryUsagesRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryUsagesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryUsagesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryUsagesRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
