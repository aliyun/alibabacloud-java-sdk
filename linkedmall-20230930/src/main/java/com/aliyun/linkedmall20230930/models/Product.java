// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Product extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Apple/苹果</p>
     */
    @NameInMap("brandName")
    public String brandName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    @NameInMap("categoryChain")
    public java.util.List<Category> categoryChain;

    /**
     * <strong>example:</strong>
     * <p>201856501</p>
     */
    @NameInMap("categoryLeafId")
    public Long categoryLeafId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/descpath/O1CN01wciRDp22AEU14435dsf34">https://img.alicdn.com/descpath/O1CN01wciRDp22AEU14435dsf34</a></p>
     */
    @NameInMap("descPath")
    public String descPath;

    /**
     * <strong>example:</strong>
     * <p>110000</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("extendProperties")
    public java.util.List<ProductExtendProperty> extendProperties;

    /**
     * <strong>example:</strong>
     * <p>100+</p>
     */
    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    @NameInMap("images")
    public java.util.List<String> images;

    /**
     * <strong>example:</strong>
     * <p>21000017-4580902812</p>
     */
    @NameInMap("lmItemId")
    public String lmItemId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i3/2214281521988/O1CN01w4vomR1QYYEx6nyr5_!!2214281521988.jpg">https://img.alicdn.com/imgextra/i3/2214281521988/O1CN01w4vomR1QYYEx6nyr5_!!2214281521988.jpg</a></p>
     */
    @NameInMap("picUrl")
    public String picUrl;

    /**
     * <strong>example:</strong>
     * <p>660460842235822080</p>
     */
    @NameInMap("productId")
    public String productId;

    @NameInMap("productSpecs")
    public java.util.List<ProductSpec> productSpecs;

    /**
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("productStatus")
    public String productStatus;

    /**
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("productType")
    public String productType;

    @NameInMap("properties")
    public java.util.List<ProductProperty> properties;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
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
    public java.util.List<Sku> skus;

    /**
     * <strong>example:</strong>
     * <p>100+</p>
     */
    @NameInMap("soldQuantity")
    public String soldQuantity;

    /**
     * <strong>example:</strong>
     * <p>3040203000000000000</p>
     */
    @NameInMap("taxCode")
    public String taxCode;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("taxRate")
    public Integer taxRate;

    /**
     * <strong>example:</strong>
     * <p>发财树</p>
     */
    @NameInMap("title")
    public String title;

    public static Product build(java.util.Map<String, ?> map) throws Exception {
        Product self = new Product();
        return TeaModel.build(map, self);
    }

    public Product setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public Product setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public Product setCategoryChain(java.util.List<Category> categoryChain) {
        this.categoryChain = categoryChain;
        return this;
    }
    public java.util.List<Category> getCategoryChain() {
        return this.categoryChain;
    }

    public Product setCategoryLeafId(Long categoryLeafId) {
        this.categoryLeafId = categoryLeafId;
        return this;
    }
    public Long getCategoryLeafId() {
        return this.categoryLeafId;
    }

    public Product setDescPath(String descPath) {
        this.descPath = descPath;
        return this;
    }
    public String getDescPath() {
        return this.descPath;
    }

    public Product setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public Product setExtendProperties(java.util.List<ProductExtendProperty> extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public java.util.List<ProductExtendProperty> getExtendProperties() {
        return this.extendProperties;
    }

    public Product setFuzzyQuantity(String fuzzyQuantity) {
        this.fuzzyQuantity = fuzzyQuantity;
        return this;
    }
    public String getFuzzyQuantity() {
        return this.fuzzyQuantity;
    }

    public Product setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public Product setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public Product setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public Product setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public Product setProductSpecs(java.util.List<ProductSpec> productSpecs) {
        this.productSpecs = productSpecs;
        return this;
    }
    public java.util.List<ProductSpec> getProductSpecs() {
        return this.productSpecs;
    }

    public Product setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }
    public String getProductStatus() {
        return this.productStatus;
    }

    public Product setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public Product setProperties(java.util.List<ProductProperty> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<ProductProperty> getProperties() {
        return this.properties;
    }

    public Product setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public Product setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Product setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public Product setSkus(java.util.List<Sku> skus) {
        this.skus = skus;
        return this;
    }
    public java.util.List<Sku> getSkus() {
        return this.skus;
    }

    public Product setSoldQuantity(String soldQuantity) {
        this.soldQuantity = soldQuantity;
        return this;
    }
    public String getSoldQuantity() {
        return this.soldQuantity;
    }

    public Product setTaxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }
    public String getTaxCode() {
        return this.taxCode;
    }

    public Product setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public Integer getTaxRate() {
        return this.taxRate;
    }

    public Product setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
