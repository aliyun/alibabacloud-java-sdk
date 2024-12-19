// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicItemSupplierPriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>10000****-6193664*****</p>
     */
    @NameInMap("LmItemId")
    public String lmItemId;

    /**
     * <strong>example:</strong>
     * <p>1002****</p>
     */
    @NameInMap("LmShopId")
    public Long lmShopId;

    /**
     * <strong>example:</strong>
     * <p>490073602****</p>
     */
    @NameInMap("SkuId")
    public Long skuId;

    /**
     * <strong>example:</strong>
     * <p>4800</p>
     */
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
