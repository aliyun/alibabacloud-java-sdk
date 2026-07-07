// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfo extends TeaModel {
    /**
     * <p>Reason for not being sellable</p>
     * 
     * <strong>example:</strong>
     * <p>不可售</p>
     */
    @NameInMap("canNotSellReason")
    public String canNotSellReason;

    /**
     * <p>Indicates whether the SKU is sellable</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <p>Area code</p>
     * 
     * <strong>example:</strong>
     * <p>330106109</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>Blur inventory availability</p>
     * 
     * <strong>example:</strong>
     * <p>有货</p>
     */
    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    /**
     * <p>Strikethrough price, in cents</p>
     * 
     * <strong>example:</strong>
     * <p>999900</p>
     */
    @NameInMap("markPrice")
    public Long markPrice;

    /**
     * <p>Distributor purchase price, in cents</p>
     * 
     * <strong>example:</strong>
     * <p>19800</p>
     */
    @NameInMap("price")
    public Long price;

    /**
     * <p>Product ID</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>Available inventory</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    /**
     * <p>Shop ID</p>
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
     * <p>SKU control status</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("skuStatus")
    public String skuStatus;

    /**
     * <p>SKU title</p>
     * 
     * <strong>example:</strong>
     * <p>天蓝色</p>
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
