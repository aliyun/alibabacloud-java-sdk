// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class PurchaseResourcesRequest extends TeaModel {
    @NameInMap("BillId")
    public String billId;

    @NameInMap("BuyNumber")
    public Integer buyNumber;

    @NameInMap("IsDisplayPool")
    public Boolean isDisplayPool;

    @NameInMap("NoLike")
    public String noLike;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("ResType")
    public Integer resType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SpecId")
    public Long specId;

    @NameInMap("UsageScenarios")
    public String usageScenarios;

    public static PurchaseResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseResourcesRequest self = new PurchaseResourcesRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseResourcesRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public PurchaseResourcesRequest setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
        return this;
    }
    public Integer getBuyNumber() {
        return this.buyNumber;
    }

    public PurchaseResourcesRequest setIsDisplayPool(Boolean isDisplayPool) {
        this.isDisplayPool = isDisplayPool;
        return this;
    }
    public Boolean getIsDisplayPool() {
        return this.isDisplayPool;
    }

    public PurchaseResourcesRequest setNoLike(String noLike) {
        this.noLike = noLike;
        return this;
    }
    public String getNoLike() {
        return this.noLike;
    }

    public PurchaseResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PurchaseResourcesRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public PurchaseResourcesRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public PurchaseResourcesRequest setResType(Integer resType) {
        this.resType = resType;
        return this;
    }
    public Integer getResType() {
        return this.resType;
    }

    public PurchaseResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PurchaseResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PurchaseResourcesRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

    public PurchaseResourcesRequest setUsageScenarios(String usageScenarios) {
        this.usageScenarios = usageScenarios;
        return this;
    }
    public String getUsageScenarios() {
        return this.usageScenarios;
    }

}
