// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifySupplierPriceAndPriceCentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20220713****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>10026780-55789045****</p>
     */
    @NameInMap("LmItemId")
    public String lmItemId;

    /**
     * <strong>example:</strong>
     * <p>1002****</p>
     */
    @NameInMap("LmShopId")
    public String lmShopId;

    /**
     * <strong>example:</strong>
     * <p>4880</p>
     */
    @NameInMap("PriceCent")
    public String priceCent;

    /**
     * <strong>example:</strong>
     * <p>490073602****</p>
     */
    @NameInMap("SkuId")
    public String skuId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SupplierPrice")
    public String supplierPrice;

    public static ModifySupplierPriceAndPriceCentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySupplierPriceAndPriceCentRequest self = new ModifySupplierPriceAndPriceCentRequest();
        return TeaModel.build(map, self);
    }

    public ModifySupplierPriceAndPriceCentRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifySupplierPriceAndPriceCentRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ModifySupplierPriceAndPriceCentRequest setLmShopId(String lmShopId) {
        this.lmShopId = lmShopId;
        return this;
    }
    public String getLmShopId() {
        return this.lmShopId;
    }

    public ModifySupplierPriceAndPriceCentRequest setPriceCent(String priceCent) {
        this.priceCent = priceCent;
        return this;
    }
    public String getPriceCent() {
        return this.priceCent;
    }

    public ModifySupplierPriceAndPriceCentRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public ModifySupplierPriceAndPriceCentRequest setSupplierPrice(String supplierPrice) {
        this.supplierPrice = supplierPrice;
        return this;
    }
    public String getSupplierPrice() {
        return this.supplierPrice;
    }

}
