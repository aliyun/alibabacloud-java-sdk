// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SearchProductsResponseBody extends TeaModel {
    @NameInMap("products")
    public java.util.List<SearchProductsResponseBodyProducts> products;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Integer total;

    public static SearchProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchProductsResponseBody self = new SearchProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchProductsResponseBody setProducts(java.util.List<SearchProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<SearchProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public SearchProductsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class SearchProductsResponseBodyProductsCategoryChain extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>201792301</p>
         */
        @NameInMap("categoryId")
        public Long categoryId;

        @NameInMap("isLeaf")
        public Boolean isLeaf;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("level")
        public Integer level;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("parentId")
        public Long parentId;

        public static SearchProductsResponseBodyProductsCategoryChain build(java.util.Map<String, ?> map) throws Exception {
            SearchProductsResponseBodyProductsCategoryChain self = new SearchProductsResponseBodyProductsCategoryChain();
            return TeaModel.build(map, self);
        }

        public SearchProductsResponseBodyProductsCategoryChain setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public SearchProductsResponseBodyProductsCategoryChain setIsLeaf(Boolean isLeaf) {
            this.isLeaf = isLeaf;
            return this;
        }
        public Boolean getIsLeaf() {
            return this.isLeaf;
        }

        public SearchProductsResponseBodyProductsCategoryChain setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public SearchProductsResponseBodyProductsCategoryChain setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchProductsResponseBodyProductsCategoryChain setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class SearchProductsResponseBodyProducts extends TeaModel {
        @NameInMap("bandName")
        public String bandName;

        @NameInMap("canNotSellReason")
        public String canNotSellReason;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("canSell")
        public Boolean canSell;

        @NameInMap("categoryChain")
        public java.util.List<SearchProductsResponseBodyProductsCategoryChain> categoryChain;

        @NameInMap("credit")
        public java.util.List<String> credit;

        /**
         * <strong>example:</strong>
         * <p>￥-9998.95 ~ ￥-9977.90</p>
         */
        @NameInMap("diffPrice")
        public String diffPrice;

        /**
         * <strong>example:</strong>
         * <p>￥0.05 ~ ￥21.10</p>
         */
        @NameInMap("distributionPrice")
        public String distributionPrice;

        /**
         * <strong>example:</strong>
         * <p>-100.00% ~ -99.79%</p>
         */
        @NameInMap("distributionPriceRatio")
        public String distributionPriceRatio;

        /**
         * <strong>example:</strong>
         * <p>Taobao</p>
         */
        @NameInMap("externalPlatformType")
        public String externalPlatformType;

        /**
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("inGroup")
        public Boolean inGroup;

        /**
         * <strong>example:</strong>
         * <p>2025-01-02 12:23:34
         * (yyyy-MM-dd HH:mm:ss)</p>
         */
        @NameInMap("inGroupTime")
        public String inGroupTime;

        /**
         * <strong>example:</strong>
         * <p>Low</p>
         */
        @NameInMap("inventoryRiskLevel")
        public String inventoryRiskLevel;

        /**
         * <strong>example:</strong>
         * <p>HasInvoice</p>
         */
        @NameInMap("invoiceType")
        public String invoiceType;

        /**
         * <strong>example:</strong>
         * <p>xxx-xxxxx</p>
         */
        @NameInMap("lmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/xxx.jpg">https://img.alicdn.com/xxx.jpg</a></p>
         */
        @NameInMap("picUrl")
        public String picUrl;

        /**
         * <strong>example:</strong>
         * <p>￥9999.00 ~ ￥9999.00</p>
         */
        @NameInMap("platformPrice")
        public String platformPrice;

        /**
         * <strong>example:</strong>
         * <p>￥9999.00 ~ ￥9999.00</p>
         */
        @NameInMap("platformReservePrice")
        public String platformReservePrice;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        @NameInMap("productName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("shopName")
        public String shopName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("soldQuantity")
        public String soldQuantity;

        /**
         * <strong>example:</strong>
         * <p>3040203000000000000</p>
         */
        @NameInMap("taxCode")
        public String taxCode;

        @NameInMap("taxRate")
        public Long taxRate;

        /**
         * <strong>example:</strong>
         * <p>JingXiao</p>
         */
        @NameInMap("tradeMode")
        public String tradeMode;

        public static SearchProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            SearchProductsResponseBodyProducts self = new SearchProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public SearchProductsResponseBodyProducts setBandName(String bandName) {
            this.bandName = bandName;
            return this;
        }
        public String getBandName() {
            return this.bandName;
        }

        public SearchProductsResponseBodyProducts setCanNotSellReason(String canNotSellReason) {
            this.canNotSellReason = canNotSellReason;
            return this;
        }
        public String getCanNotSellReason() {
            return this.canNotSellReason;
        }

        public SearchProductsResponseBodyProducts setCanSell(Boolean canSell) {
            this.canSell = canSell;
            return this;
        }
        public Boolean getCanSell() {
            return this.canSell;
        }

        public SearchProductsResponseBodyProducts setCategoryChain(java.util.List<SearchProductsResponseBodyProductsCategoryChain> categoryChain) {
            this.categoryChain = categoryChain;
            return this;
        }
        public java.util.List<SearchProductsResponseBodyProductsCategoryChain> getCategoryChain() {
            return this.categoryChain;
        }

        public SearchProductsResponseBodyProducts setCredit(java.util.List<String> credit) {
            this.credit = credit;
            return this;
        }
        public java.util.List<String> getCredit() {
            return this.credit;
        }

        public SearchProductsResponseBodyProducts setDiffPrice(String diffPrice) {
            this.diffPrice = diffPrice;
            return this;
        }
        public String getDiffPrice() {
            return this.diffPrice;
        }

        public SearchProductsResponseBodyProducts setDistributionPrice(String distributionPrice) {
            this.distributionPrice = distributionPrice;
            return this;
        }
        public String getDistributionPrice() {
            return this.distributionPrice;
        }

        public SearchProductsResponseBodyProducts setDistributionPriceRatio(String distributionPriceRatio) {
            this.distributionPriceRatio = distributionPriceRatio;
            return this;
        }
        public String getDistributionPriceRatio() {
            return this.distributionPriceRatio;
        }

        public SearchProductsResponseBodyProducts setExternalPlatformType(String externalPlatformType) {
            this.externalPlatformType = externalPlatformType;
            return this;
        }
        public String getExternalPlatformType() {
            return this.externalPlatformType;
        }

        public SearchProductsResponseBodyProducts setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchProductsResponseBodyProducts setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SearchProductsResponseBodyProducts setInGroup(Boolean inGroup) {
            this.inGroup = inGroup;
            return this;
        }
        public Boolean getInGroup() {
            return this.inGroup;
        }

        public SearchProductsResponseBodyProducts setInGroupTime(String inGroupTime) {
            this.inGroupTime = inGroupTime;
            return this;
        }
        public String getInGroupTime() {
            return this.inGroupTime;
        }

        public SearchProductsResponseBodyProducts setInventoryRiskLevel(String inventoryRiskLevel) {
            this.inventoryRiskLevel = inventoryRiskLevel;
            return this;
        }
        public String getInventoryRiskLevel() {
            return this.inventoryRiskLevel;
        }

        public SearchProductsResponseBodyProducts setInvoiceType(String invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public String getInvoiceType() {
            return this.invoiceType;
        }

        public SearchProductsResponseBodyProducts setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public SearchProductsResponseBodyProducts setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public SearchProductsResponseBodyProducts setPlatformPrice(String platformPrice) {
            this.platformPrice = platformPrice;
            return this;
        }
        public String getPlatformPrice() {
            return this.platformPrice;
        }

        public SearchProductsResponseBodyProducts setPlatformReservePrice(String platformReservePrice) {
            this.platformReservePrice = platformReservePrice;
            return this;
        }
        public String getPlatformReservePrice() {
            return this.platformReservePrice;
        }

        public SearchProductsResponseBodyProducts setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchProductsResponseBodyProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public SearchProductsResponseBodyProducts setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public SearchProductsResponseBodyProducts setSoldQuantity(String soldQuantity) {
            this.soldQuantity = soldQuantity;
            return this;
        }
        public String getSoldQuantity() {
            return this.soldQuantity;
        }

        public SearchProductsResponseBodyProducts setTaxCode(String taxCode) {
            this.taxCode = taxCode;
            return this;
        }
        public String getTaxCode() {
            return this.taxCode;
        }

        public SearchProductsResponseBodyProducts setTaxRate(Long taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public Long getTaxRate() {
            return this.taxRate;
        }

        public SearchProductsResponseBodyProducts setTradeMode(String tradeMode) {
            this.tradeMode = tradeMode;
            return this;
        }
        public String getTradeMode() {
            return this.tradeMode;
        }

    }

}
