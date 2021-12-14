// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Buy400NumberRequest extends TeaModel {
    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("GuaranteedPackageLevel")
    public String guaranteedPackageLevel;

    @NameInMap("MonthlyPrice")
    public String monthlyPrice;

    @NameInMap("Number")
    public String number;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RealNameInsId")
    public String realNameInsId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpecId")
    public String specId;

    public static Buy400NumberRequest build(java.util.Map<String, ?> map) throws Exception {
        Buy400NumberRequest self = new Buy400NumberRequest();
        return TeaModel.build(map, self);
    }

    public Buy400NumberRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public Buy400NumberRequest setGuaranteedPackageLevel(String guaranteedPackageLevel) {
        this.guaranteedPackageLevel = guaranteedPackageLevel;
        return this;
    }
    public String getGuaranteedPackageLevel() {
        return this.guaranteedPackageLevel;
    }

    public Buy400NumberRequest setMonthlyPrice(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
        return this;
    }
    public String getMonthlyPrice() {
        return this.monthlyPrice;
    }

    public Buy400NumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public Buy400NumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public Buy400NumberRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public Buy400NumberRequest setRealNameInsId(String realNameInsId) {
        this.realNameInsId = realNameInsId;
        return this;
    }
    public String getRealNameInsId() {
        return this.realNameInsId;
    }

    public Buy400NumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public Buy400NumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public Buy400NumberRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

}
