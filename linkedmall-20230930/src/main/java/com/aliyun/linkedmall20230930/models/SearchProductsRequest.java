// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SearchProductsRequest extends TeaModel {
    @NameInMap("brandName")
    public String brandName;

    @NameInMap("categoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("createEndTime")
    public String createEndTime;

    /**
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("createStartTime")
    public String createStartTime;

    @NameInMap("distributionHighPrice")
    public Long distributionHighPrice;

    /**
     * <strong>example:</strong>
     * <p>244（2.44%）</p>
     */
    @NameInMap("distributionHighPriceRatio")
    public Long distributionHighPriceRatio;

    @NameInMap("distributionLowPrice")
    public Long distributionLowPrice;

    /**
     * <strong>example:</strong>
     * <p>133（1.33%）</p>
     */
    @NameInMap("distributionLowPriceRatio")
    public Long distributionLowPriceRatio;

    @NameInMap("highMarkPrice")
    public Long highMarkPrice;

    @NameInMap("highPrice")
    public Long highPrice;

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
    @NameInMap("inGroupEndTime")
    public String inGroupEndTime;

    /**
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("inGroupStartTime")
    public String inGroupStartTime;

    /**
     * <strong>example:</strong>
     * <p>Low</p>
     */
    @NameInMap("inventoryRiskLevel")
    public String inventoryRiskLevel;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxxx</p>
     */
    @NameInMap("lmItemId")
    public String lmItemId;

    @NameInMap("lowMarkPrice")
    public Long lowMarkPrice;

    @NameInMap("lowPrice")
    public Long lowPrice;

    /**
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("modifyEndTime")
    public String modifyEndTime;

    /**
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("modifyStartTime")
    public String modifyStartTime;

    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Taobao</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("productId")
    public String productId;

    @NameInMap("productName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>Sellable</p>
     */
    @NameInMap("productStatus")
    public String productStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PIDxxxx</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <strong>example:</strong>
     * <p>Rate0</p>
     */
    @NameInMap("taxRate")
    public String taxRate;

    /**
     * <strong>example:</strong>
     * <p>JingXiao</p>
     */
    @NameInMap("tradeModeAndCredit")
    public String tradeModeAndCredit;

    public static SearchProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchProductsRequest self = new SearchProductsRequest();
        return TeaModel.build(map, self);
    }

    public SearchProductsRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public SearchProductsRequest setCategoryIds(java.util.List<String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public SearchProductsRequest setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public String getCreateEndTime() {
        return this.createEndTime;
    }

    public SearchProductsRequest setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public String getCreateStartTime() {
        return this.createStartTime;
    }

    public SearchProductsRequest setDistributionHighPrice(Long distributionHighPrice) {
        this.distributionHighPrice = distributionHighPrice;
        return this;
    }
    public Long getDistributionHighPrice() {
        return this.distributionHighPrice;
    }

    public SearchProductsRequest setDistributionHighPriceRatio(Long distributionHighPriceRatio) {
        this.distributionHighPriceRatio = distributionHighPriceRatio;
        return this;
    }
    public Long getDistributionHighPriceRatio() {
        return this.distributionHighPriceRatio;
    }

    public SearchProductsRequest setDistributionLowPrice(Long distributionLowPrice) {
        this.distributionLowPrice = distributionLowPrice;
        return this;
    }
    public Long getDistributionLowPrice() {
        return this.distributionLowPrice;
    }

    public SearchProductsRequest setDistributionLowPriceRatio(Long distributionLowPriceRatio) {
        this.distributionLowPriceRatio = distributionLowPriceRatio;
        return this;
    }
    public Long getDistributionLowPriceRatio() {
        return this.distributionLowPriceRatio;
    }

    public SearchProductsRequest setHighMarkPrice(Long highMarkPrice) {
        this.highMarkPrice = highMarkPrice;
        return this;
    }
    public Long getHighMarkPrice() {
        return this.highMarkPrice;
    }

    public SearchProductsRequest setHighPrice(Long highPrice) {
        this.highPrice = highPrice;
        return this;
    }
    public Long getHighPrice() {
        return this.highPrice;
    }

    public SearchProductsRequest setInGroup(Boolean inGroup) {
        this.inGroup = inGroup;
        return this;
    }
    public Boolean getInGroup() {
        return this.inGroup;
    }

    public SearchProductsRequest setInGroupEndTime(String inGroupEndTime) {
        this.inGroupEndTime = inGroupEndTime;
        return this;
    }
    public String getInGroupEndTime() {
        return this.inGroupEndTime;
    }

    public SearchProductsRequest setInGroupStartTime(String inGroupStartTime) {
        this.inGroupStartTime = inGroupStartTime;
        return this;
    }
    public String getInGroupStartTime() {
        return this.inGroupStartTime;
    }

    public SearchProductsRequest setInventoryRiskLevel(String inventoryRiskLevel) {
        this.inventoryRiskLevel = inventoryRiskLevel;
        return this;
    }
    public String getInventoryRiskLevel() {
        return this.inventoryRiskLevel;
    }

    public SearchProductsRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public SearchProductsRequest setLowMarkPrice(Long lowMarkPrice) {
        this.lowMarkPrice = lowMarkPrice;
        return this;
    }
    public Long getLowMarkPrice() {
        return this.lowMarkPrice;
    }

    public SearchProductsRequest setLowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
        return this;
    }
    public Long getLowPrice() {
        return this.lowPrice;
    }

    public SearchProductsRequest setModifyEndTime(String modifyEndTime) {
        this.modifyEndTime = modifyEndTime;
        return this;
    }
    public String getModifyEndTime() {
        return this.modifyEndTime;
    }

    public SearchProductsRequest setModifyStartTime(String modifyStartTime) {
        this.modifyStartTime = modifyStartTime;
        return this;
    }
    public String getModifyStartTime() {
        return this.modifyStartTime;
    }

    public SearchProductsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchProductsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SearchProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchProductsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public SearchProductsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SearchProductsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SearchProductsRequest setProductStatus(String productStatus) {
        this.productStatus = productStatus;
        return this;
    }
    public String getProductStatus() {
        return this.productStatus;
    }

    public SearchProductsRequest setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public SearchProductsRequest setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public String getTaxRate() {
        return this.taxRate;
    }

    public SearchProductsRequest setTradeModeAndCredit(String tradeModeAndCredit) {
        this.tradeModeAndCredit = tradeModeAndCredit;
        return this;
    }
    public String getTradeModeAndCredit() {
        return this.tradeModeAndCredit;
    }

}
