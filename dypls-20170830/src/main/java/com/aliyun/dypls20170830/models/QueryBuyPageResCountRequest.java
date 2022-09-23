// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryBuyPageResCountRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("Like")
    public String like;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpecId")
    public Long specId;

    public static QueryBuyPageResCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuyPageResCountRequest self = new QueryBuyPageResCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuyPageResCountRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryBuyPageResCountRequest setLike(String like) {
        this.like = like;
        return this;
    }
    public String getLike() {
        return this.like;
    }

    public QueryBuyPageResCountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryBuyPageResCountRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryBuyPageResCountRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public QueryBuyPageResCountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryBuyPageResCountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryBuyPageResCountRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
