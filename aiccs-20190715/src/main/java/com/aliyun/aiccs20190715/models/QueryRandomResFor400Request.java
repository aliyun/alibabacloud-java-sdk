// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryRandomResFor400Request extends TeaModel {
    @NameInMap("LevelId")
    public Long levelId;

    @NameInMap("NumberCount")
    public Integer numberCount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpecId")
    public Long specId;

    public static QueryRandomResFor400Request build(java.util.Map<String, ?> map) throws Exception {
        QueryRandomResFor400Request self = new QueryRandomResFor400Request();
        return TeaModel.build(map, self);
    }

    public QueryRandomResFor400Request setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

    public QueryRandomResFor400Request setNumberCount(Integer numberCount) {
        this.numberCount = numberCount;
        return this;
    }
    public Integer getNumberCount() {
        return this.numberCount;
    }

    public QueryRandomResFor400Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRandomResFor400Request setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryRandomResFor400Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRandomResFor400Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryRandomResFor400Request setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
