// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Sku extends TeaModel {
    /**
     * <p>The barcode.</p>
     * 
     * <strong>example:</strong>
     * <p>6922454329176</p>
     */
    @NameInMap("barcode")
    public String barcode;

    /**
     * <p>Indicates whether the SKU is available for sale.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <p>The reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("discountRetailPrice")
    public Long discountRetailPrice;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>110000</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>The fuzzy available inventory.</p>
     * 
     * <strong>example:</strong>
     * <p>In stock
     * Out of stock
     * Low stock</p>
     */
    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    /**
     * <p>The list price in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>999900</p>
     */
    @NameInMap("markPrice")
    public Long markPrice;

    /**
     * <p>The SKU image.</p>
     * 
     * <strong>example:</strong>
     * <p>https:////img.alicdn.com/imgextra///img.alicdn.com/imgextra/i2/2216003305543/O1CN010DEQCX1qokFYGRfPE_!!2216003305543.png</p>
     */
    @NameInMap("picUrl")
    public String picUrl;

    /**
     * <p>The suggested retail price in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>999900</p>
     */
    @NameInMap("platformPrice")
    public Long platformPrice;

    /**
     * <p>The distributor purchase price in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>19800</p>
     */
    @NameInMap("price")
    public Long price;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The available inventory. <notice>Currently, the value of this field is uniformly set to -1 and has no practical significance.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    /**
     * <p>The SKU sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("rankValue")
    public Long rankValue;

    /**
     * <p>The shop ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>The SKU remark.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample SKU remark</p>
     */
    @NameInMap("skuAlias")
    public String skuAlias;

    /**
     * <p>skuId</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822081</p>
     */
    @NameInMap("skuId")
    public String skuId;

    /**
     * <p>sku</p>
     */
    @NameInMap("skuSpecs")
    public java.util.List<SkuSpec> skuSpecs;

    /**
     * <p>The SKU sales specifications used to assist frontend filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>Color:Sky blue</p>
     */
    @NameInMap("skuSpecsCode")
    public String skuSpecsCode;

    /**
     * <p>The SKU control status.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("skuStatus")
    public String skuStatus;

    /**
     * <p>The reserved field.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("suggestedRetailPrice")
    public Long suggestedRetailPrice;

    /**
     * <p>The SKU title. <notice>Distributors should concatenate the value or valueAlias (if available) from the SkuSpec struct to form the SKU title for customer display. Do not use this field directly as the SKU title for customer display.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>Sky blue</p>
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

    public Sku setDiscountRetailPrice(Long discountRetailPrice) {
        this.discountRetailPrice = discountRetailPrice;
        return this;
    }
    public Long getDiscountRetailPrice() {
        return this.discountRetailPrice;
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

    public Sku setSkuAlias(String skuAlias) {
        this.skuAlias = skuAlias;
        return this;
    }
    public String getSkuAlias() {
        return this.skuAlias;
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

    public Sku setSuggestedRetailPrice(Long suggestedRetailPrice) {
        this.suggestedRetailPrice = suggestedRetailPrice;
        return this;
    }
    public Long getSuggestedRetailPrice() {
        return this.suggestedRetailPrice;
    }

    public Sku setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
