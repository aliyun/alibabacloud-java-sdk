// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryVoiceNumberStockCountRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("NumberType")
    public Integer numberType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Province")
    public String province;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpecIds")
    public String specIds;

    public static QueryVoiceNumberStockCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceNumberStockCountRequest self = new QueryVoiceNumberStockCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryVoiceNumberStockCountRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryVoiceNumberStockCountRequest setNumberType(Integer numberType) {
        this.numberType = numberType;
        return this;
    }
    public Integer getNumberType() {
        return this.numberType;
    }

    public QueryVoiceNumberStockCountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryVoiceNumberStockCountRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryVoiceNumberStockCountRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryVoiceNumberStockCountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryVoiceNumberStockCountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryVoiceNumberStockCountRequest setSpecIds(String specIds) {
        this.specIds = specIds;
        return this;
    }
    public String getSpecIds() {
        return this.specIds;
    }

}
