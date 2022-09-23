// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPurchasedResListRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("City")
    public String city;

    @NameInMap("IsDisplayPool")
    public Boolean isDisplayPool;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResBindStatus")
    public Integer resBindStatus;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    public static QueryPurchasedResListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPurchasedResListRequest self = new QueryPurchasedResListRequest();
        return TeaModel.build(map, self);
    }

    public QueryPurchasedResListRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public QueryPurchasedResListRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryPurchasedResListRequest setIsDisplayPool(Boolean isDisplayPool) {
        this.isDisplayPool = isDisplayPool;
        return this;
    }
    public Boolean getIsDisplayPool() {
        return this.isDisplayPool;
    }

    public QueryPurchasedResListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPurchasedResListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryPurchasedResListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPurchasedResListRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryPurchasedResListRequest setResBindStatus(Integer resBindStatus) {
        this.resBindStatus = resBindStatus;
        return this;
    }
    public Integer getResBindStatus() {
        return this.resBindStatus;
    }

    public QueryPurchasedResListRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public QueryPurchasedResListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPurchasedResListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryPurchasedResListRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

}
