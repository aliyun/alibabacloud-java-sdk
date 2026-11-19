// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfo extends TeaModel {
    /**
     * <p>The unsellable reason.</p>
     * 
     * <strong>example:</strong>
     * <p>Unsellable</p>
     */
    @NameInMap("canNotSellReason")
    public String canNotSellReason;

    /**
     * <p>The sellable status of the SKU.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <p>The division code.</p>
     * 
     * <strong>example:</strong>
     * <p>330106109</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>The fuzzy available inventory.</p>
     * 
     * <strong>example:</strong>
     * <p>In stock</p>
     */
    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    /**
     * <p>The strikethrough price in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>999900</p>
     */
    @NameInMap("markPrice")
    public Long markPrice;

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
     * <p>The available inventory.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    /**
     * <p>The store ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>skuId</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822081</p>
     */
    @NameInMap("skuId")
    public String skuId;

    /**
     * <p>The control status of the SKU.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("skuStatus")
    public String skuStatus;

    /**
     * <p>The SKU title.</p>
     * 
     * <strong>example:</strong>
     * <p>Sky blue</p>
     */
    @NameInMap("title")
    public String title;

    public static SkuSaleInfo build(java.util.Map<String, ?> map) throws Exception {
        SkuSaleInfo self = new SkuSaleInfo();
        return TeaModel.build(map, self);
    }

    public SkuSaleInfo setCanNotSellReason(String canNotSellReason) {
        this.canNotSellReason = canNotSellReason;
        return this;
    }
    public String getCanNotSellReason() {
        return this.canNotSellReason;
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
