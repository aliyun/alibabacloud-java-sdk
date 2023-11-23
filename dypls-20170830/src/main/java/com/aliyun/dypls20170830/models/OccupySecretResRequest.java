// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class OccupySecretResRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("IsDisplayPool")
    public Boolean isDisplayPool;

    @NameInMap("NoLike")
    public String noLike;

    @NameInMap("OrderDetailId")
    public Long orderDetailId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PartnerKey")
    public String partnerKey;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResType")
    public Long resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNoType")
    public Integer secretNoType;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("secretNo")
    public String secretNo;

    public static OccupySecretResRequest build(java.util.Map<String, ?> map) throws Exception {
        OccupySecretResRequest self = new OccupySecretResRequest();
        return TeaModel.build(map, self);
    }

    public OccupySecretResRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public OccupySecretResRequest setIsDisplayPool(Boolean isDisplayPool) {
        this.isDisplayPool = isDisplayPool;
        return this;
    }
    public Boolean getIsDisplayPool() {
        return this.isDisplayPool;
    }

    public OccupySecretResRequest setNoLike(String noLike) {
        this.noLike = noLike;
        return this;
    }
    public String getNoLike() {
        return this.noLike;
    }

    public OccupySecretResRequest setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
        return this;
    }
    public Long getOrderDetailId() {
        return this.orderDetailId;
    }

    public OccupySecretResRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public OccupySecretResRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OccupySecretResRequest setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
        return this;
    }
    public String getPartnerKey() {
        return this.partnerKey;
    }

    public OccupySecretResRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public OccupySecretResRequest setResType(Long resType) {
        this.resType = resType;
        return this;
    }
    public Long getResType() {
        return this.resType;
    }

    public OccupySecretResRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public OccupySecretResRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public OccupySecretResRequest setSecretNoType(Integer secretNoType) {
        this.secretNoType = secretNoType;
        return this;
    }
    public Integer getSecretNoType() {
        return this.secretNoType;
    }

    public OccupySecretResRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public OccupySecretResRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

}
