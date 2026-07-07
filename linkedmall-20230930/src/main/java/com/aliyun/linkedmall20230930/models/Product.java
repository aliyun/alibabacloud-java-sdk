// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Product extends TeaModel {
    /**
     * <p>The brand name.</p>
     * 
     * <strong>example:</strong>
     * <p>Apple/苹果</p>
     */
    @NameInMap("brandName")
    public String brandName;

    /**
     * <p>Indicates whether the product is available for sale. This is a calculated value.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <p>The category chain.</p>
     */
    @NameInMap("categoryChain")
    public java.util.List<Category> categoryChain;

    /**
     * <p>The leaf category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>201****501</p>
     */
    @NameInMap("categoryLeafId")
    public Long categoryLeafId;

    /**
     * <p>The product description URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/descpath/O1CN01wciRDp22AEU1*******f34">https://img.alicdn.com/descpath/O1CN01wciRDp22AEU1*******f34</a></p>
     */
    @NameInMap("descPath")
    public String descPath;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>110000</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>The product\&quot;s extended properties.</p>
     */
    @NameInMap("extendProperties")
    public java.util.List<ProductExtendProperty> extendProperties;

    /**
     * <p>The stock status.</p>
     * 
     * <strong>example:</strong>
     * <p>有货</p>
     */
    @NameInMap("fuzzyQuantity")
    public String fuzzyQuantity;

    /**
     * <p>The product images.</p>
     */
    @NameInMap("images")
    public java.util.List<String> images;

    /**
     * <p>The warehousing status.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("inGroup")
    public Boolean inGroup;

    /**
     * <p>The purchase limit rules.</p>
     */
    @NameInMap("limitRules")
    public java.util.List<LimitRule> limitRules;

    /**
     * <p>The LM product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2100<strong><strong>7-458</strong></strong>812</p>
     */
    @NameInMap("lmItemId")
    public String lmItemId;

    /**
     * <p>The main product image URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i3/221*******988/O1CN01w4vomR1QYYEx6nyr5_!!221******988.jpg">https://img.alicdn.com/imgextra/i3/221*******988/O1CN01w4vomR1QYYEx6nyr5_!!221******988.jpg</a></p>
     */
    @NameInMap("picUrl")
    public String picUrl;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>660460842******080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The product specifications.</p>
     */
    @NameInMap("productSpecs")
    public java.util.List<ProductSpec> productSpecs;

    /**
     * <p>The product status.</p>
     * 
     * <strong>example:</strong>
     * <p>Online</p>
     */
    @NameInMap("productStatus")
    public String productStatus;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("productType")
    public String productType;

    /**
     * <p>The product attributes.</p>
     */
    @NameInMap("properties")
    public java.util.List<ProductProperty> properties;

    /**
     * <p>The inventory.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is fixed at -1 and can be ignored.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("quantity")
    public Long quantity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3239281273******823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The service promises.&gt;Notice:  Suppliers maintain all service promises. If a supplier fails to update this information in a timely manner, the service promise labels for some products may be inaccurate. Distributors should display this information to their customers with caution.</p>
     */
    @NameInMap("servicePromises")
    public java.util.List<String> servicePromises;

    /**
     * <p>The channel shop ID.</p>
     * 
     * <strong>example:</strong>
     * <p>210*****7</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>The product SKUs.</p>
     */
    @NameInMap("skus")
    public java.util.List<Sku> skus;

    /**
     * <p>The quantity sold.</p>
     * 
     * <strong>example:</strong>
     * <p>100+</p>
     */
    @NameInMap("soldQuantity")
    public String soldQuantity;

    /**
     * <p>The tax code.</p>
     * 
     * <strong>example:</strong>
     * <p>3040203000*******000</p>
     */
    @NameInMap("taxCode")
    public String taxCode;

    /**
     * <p>The tax rate.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("taxRate")
    public Integer taxRate;

    /**
     * <p>The product title.</p>
     * 
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

    public Product setInGroup(Boolean inGroup) {
        this.inGroup = inGroup;
        return this;
    }
    public Boolean getInGroup() {
        return this.inGroup;
    }

    public Product setLimitRules(java.util.List<LimitRule> limitRules) {
        this.limitRules = limitRules;
        return this;
    }
    public java.util.List<LimitRule> getLimitRules() {
        return this.limitRules;
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

    public Product setServicePromises(java.util.List<String> servicePromises) {
        this.servicePromises = servicePromises;
        return this;
    }
    public java.util.List<String> getServicePromises() {
        return this.servicePromises;
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
