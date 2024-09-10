// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfo extends TeaModel {
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

    @NameInMap("limitRules")
    public java.util.List<LimitRule> limitRules;

    /**
     * <strong>example:</strong>
     * <p>21000017-4580902812</p>
     */
    @NameInMap("lmItemId")
    public String lmItemId;

    /**
     * <strong>example:</strong>
     * <p>660460842235822080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("productStatus")
    public String productStatus;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("shopId")
    public String shopId;

    @NameInMap("skus")
    public java.util.List<SkuSaleInfo> skus;

    /**
     * <strong>example:</strong>
     * <p>发财树</p>
     */
    @NameInMap("title")
    public String title;

    public static ProductSaleInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductSaleInfo self = new ProductSaleInfo();
        return TeaModel.build(map, self);
    }

    public ProductSaleInfo setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public ProductSaleInfo setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public ProductSaleInfo setFuzzyQuantity(String fuzzyQuantity) {
        this.fuzzyQuantity = fuzzyQuantity;
        return this;
    }
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    public ProductSaleInfo setLimitRules(java.util.List<LimitRule> limitRules) {
        this.limitRules = limitRules;
        return this;
    }
    public java.util.List<LimitRule> getLimitRules() {
        return this.limitRules;
    }

    public ProductSaleInfo setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public ProductSaleInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ProductSaleInfo setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }
    public String getProductStatus() {
        return this.productStatus;
    }

    public ProductSaleInfo setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public ProductSaleInfo setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProductSaleInfo setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public ProductSaleInfo setSkus(java.util.List<SkuSaleInfo> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<SkuSaleInfo> getSkus() {
        return this.skus;
    }

    public ProductSaleInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
