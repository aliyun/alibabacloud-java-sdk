// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryRandomResRequest extends TeaModel {
    @NameInMap("City")
    public String city;

    @NameInMap("IsCuteNumber")
    public Boolean isCuteNumber;

    @NameInMap("LevelId")
    public Long levelId;

    @NameInMap("NumberCount")
    public Integer numberCount;

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

    @NameInMap("SpecId")
    public Long specId;

    public static QueryRandomResRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRandomResRequest self = new QueryRandomResRequest();
        return TeaModel.build(map, self);
    }

    public QueryRandomResRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryRandomResRequest setIsCuteNumber(Boolean isCuteNumber) {
        this.isCuteNumber = isCuteNumber;
        return this;
    }
    public Boolean getIsCuteNumber() {
        return this.isCuteNumber;
    }

    public QueryRandomResRequest setLevelId(Long levelId) {
        this.levelId = levelId;
        return this;
    }
    public Long getLevelId() {
        return this.levelId;
    }

    public QueryRandomResRequest setNumberCount(Integer numberCount) {
        this.numberCount = numberCount;
        return this;
    }
    public Integer getNumberCount() {
        return this.numberCount;
    }

    public QueryRandomResRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRandomResRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryRandomResRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryRandomResRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryRandomResRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryRandomResRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
