// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <strong>example:</strong>
     * <p>110000</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <strong>example:</strong>
     * <p>有货</p>
     */
    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    /**
     * <strong>example:</strong>
     * <p>999900</p>
     */
    @NameInMap("markPrice")
    public Long markPrice;

    /**
     * <strong>example:</strong>
     * <p>19800</p>
     */
    @NameInMap("price")
    public Long price;

    /**
     * <strong>example:</strong>
     * <p>660460842235822080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    /**
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <strong>example:</strong>
     * <p>660460842235822081</p>
     */
    @NameInMap("skuId")
    public String skuId;

    /**
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("skuStatus")
    public String skuStatus;

    /**
     * <strong>example:</strong>
     * <p>天蓝色</p>
     */
    @NameInMap("title")
    public String title;

    public static SkuSaleInfo build(java.util.Map<String, ?> map) throws Exception {
        SkuSaleInfo self = new SkuSaleInfo();
        return TeaModel.build(map, self);
    }

    public SkuSaleInfo setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public SkuSaleInfo setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public SkuSaleInfo setFuzzyQuantity(String fuzzyQuantity) {
        this.fuzzyQuantity = fuzzyQuantity;
        return this;
    }
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    public SkuSaleInfo setMarkPrice(Long markPrice) {
        this.markPrice = markPrice;
        return this;
    }
    public Long getMarkPrice() {
        return this.markPrice;
    }

    public SkuSaleInfo setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public SkuSaleInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SkuSaleInfo setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public SkuSaleInfo setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public SkuSaleInfo setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public SkuSaleInfo setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
        return this;
    }
    public String getSkuStatus() {
        return this.skuStatus;
    }

    public SkuSaleInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
