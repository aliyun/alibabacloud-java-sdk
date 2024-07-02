// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Sku extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6922454329176</p>
     */
    @NameInMap("barcode")
    public String barcode;

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
     * <p>https:////img.alicdn.com/imgextra///img.alicdn.com/imgextra/i2/2216003305543/O1CN010DEQCX1qokFYGRfPE_!!2216003305543.png</p>
     */
    @NameInMap("picUrl")
    public String picUrl;

    /**
     * <strong>example:</strong>
     * <p>999900</p>
     */
    @NameInMap("platformPrice")
    public Long platformPrice;

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
     * <p>3</p>
     */
    @NameInMap("rankValue")
    public Long rankValue;

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

    @NameInMap("skuSpecs")
    public java.util.List<SkuSpec> skuSpecs;

    /**
     * <strong>example:</strong>
     * <p>颜色分类:天蓝色</p>
     */
    @NameInMap("skuSpecsCode")
    public String skuSpecsCode;

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

    public static Sku build(java.util.Map<String, ?> map) throws Exception {
        Sku self = new Sku();
        return TeaModel.build(map, self);
    }

    public Sku setBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }
    public String getBarcode() {
        return this.barcode;
    }

    public Sku setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public Sku setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public Sku setFuzzyQuantity(String fuzzyQuantity) {
        this.fuzzyQuantity = fuzzyQuantity;
        return this;
    }
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    public Sku setMarkPrice(Long markPrice) {
        this.markPrice = markPrice;
        return this;
    }
    public Long getMarkPrice() {
        return this.markPrice;
    }

    public Sku setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public Sku setPlatformPrice(Long platformPrice) {
        this.platformPrice = platformPrice;
        return this;
    }
    public Long getPlatformPrice() {
        return this.platformPrice;
    }

    public Sku setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public Sku setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public Sku setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public Sku setRankValue(Long rankValue) {
        this.rankValue = rankValue;
        return this;
    }
    public Long getRankValue() {
        return this.rankValue;
    }

    public Sku setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public Sku setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public Sku setSkuSpecs(java.util.List<SkuSpec> skuSpecs) {
        this.skuSpecs = skuSpecs;
        return this;
    }
    public java.util.List<SkuSpec> getSkuSpecs() {
        return this.skuSpecs;
    }

    public Sku setSkuSpecsCode(String skuSpecsCode) {
        this.skuSpecsCode = skuSpecsCode;
        return this;
    }
    public String getSkuSpecsCode() {
        return this.skuSpecsCode;
    }

    public Sku setSkuStatus(String skuStatus) {
        this.skuStatus = skuStatus;
        return this;
    }
    public String getSkuStatus() {
        return this.skuStatus;
    }

    public Sku setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
