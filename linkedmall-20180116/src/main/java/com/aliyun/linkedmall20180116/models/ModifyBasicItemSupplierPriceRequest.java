// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicItemSupplierPriceRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("LmShopId")
    public Long lmShopId;

    @NameInMap("SkuId")
    public Long skuId;

    @NameInMap("SupplierPrice")
    public Long supplierPrice;

    public static ModifyBasicItemSupplierPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicItemSupplierPriceRequest self = new ModifyBasicItemSupplierPriceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBasicItemSupplierPriceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyBasicItemSupplierPriceRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ModifyBasicItemSupplierPriceRequest setLmShopId(Long lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public Long getLmShopId() {
        return this.lmShopId;
    }

    public ModifyBasicItemSupplierPriceRequest setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public ModifyBasicItemSupplierPriceRequest setSupplierPrice(Long supplierPrice) {
        this.supplierPrice = supplierPrice;
        return this;
    }
    public Long getSupplierPrice() {
        return this.supplierPrice;
    }

}
