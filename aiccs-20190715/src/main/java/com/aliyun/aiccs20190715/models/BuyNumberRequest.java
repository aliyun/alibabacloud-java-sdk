// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class BuyNumberRequest extends TeaModel {
    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("GuaranteedPackageLevel")
    public Integer guaranteedPackageLevel;

    @NameInMap("IsCuteNumber")
    public Boolean isCuteNumber;

    @NameInMap("LevelId")
    public Integer levelId;

    @NameInMap("MonthlyPrice")
    public String monthlyPrice;

    @NameInMap("NumberArray")
    public String numberArray;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RealNameInsId")
    public Long realNameInsId;

    @NameInMap("RegionNameCity")
    public String regionNameCity;

    @NameInMap("RegionNameProvince")
    public String regionNameProvince;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpecId")
    public Long specId;

    public static BuyNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        BuyNumberRequest self = new BuyNumberRequest();
        return TeaModel.build(map, self);
    }

    public BuyNumberRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public BuyNumberRequest setGuaranteedPackageLevel(Integer guaranteedPackageLevel) {
        this.guaranteedPackageLevel = guaranteedPackageLevel;
        return this;
    }
    public Integer getGuaranteedPackageLevel() {
        return this.guaranteedPackageLevel;
    }

    public BuyNumberRequest setIsCuteNumber(Boolean isCuteNumber) {
        this.isCuteNumber = isCuteNumber;
        return this;
    }
    public Boolean getIsCuteNumber() {
        return this.isCuteNumber;
    }

    public BuyNumberRequest setLevelId(Integer levelId) {
        this.levelId = levelId;
        return this;
    }
    public Integer getLevelId() {
        return this.levelId;
    }

    public BuyNumberRequest setMonthlyPrice(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
        return this;
    }
    public String getMonthlyPrice() {
        return this.monthlyPrice;
    }

    public BuyNumberRequest setNumberArray(String numberArray) {
        this.numberArray = numberArray;
        return this;
    }
    public String getNumberArray() {
        return this.numberArray;
    }

    public BuyNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BuyNumberRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BuyNumberRequest setRealNameInsId(Long realNameInsId) {
        this.realNameInsId = realNameInsId;
        return this;
    }
    public Long getRealNameInsId() {
        return this.realNameInsId;
    }

    public BuyNumberRequest setRegionNameCity(String regionNameCity) {
        this.regionNameCity = regionNameCity;
        return this;
    }
    public String getRegionNameCity() {
        return this.regionNameCity;
    }

    public BuyNumberRequest setRegionNameProvince(String regionNameProvince) {
        this.regionNameProvince = regionNameProvince;
        return this;
    }
    public String getRegionNameProvince() {
        return this.regionNameProvince;
    }

    public BuyNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BuyNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BuyNumberRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
