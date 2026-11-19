// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SearchProductsRequest extends TeaModel {
    /**
     * <p>The brand name.</p>
     * 
     * <strong>example:</strong>
     * <p>Plants</p>
     */
    @NameInMap("brandName")
    public String brandName;

    /**
     * <p>The list of category IDs.</p>
     */
    @NameInMap("categoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>The end time of the creation. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("createEndTime")
    public String createEndTime;

    /**
     * <p>The start time of the creation. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("createStartTime")
    public String createStartTime;

    /**
     * <p>The cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>899192313AB192938441CCW</p>
     */
    @NameInMap("cursor")
    public String cursor;

    /**
     * <p>The maximum distribution purchase price, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("distributionHighPrice")
    public Long distributionHighPrice;

    /**
     * <p>The maximum distribution premium rate. A value of 244 indicates 2.44%.</p>
     * 
     * <strong>example:</strong>
     * <p>244</p>
     */
    @NameInMap("distributionHighPriceRatio")
    public Long distributionHighPriceRatio;

    /**
     * <p>The minimum distribution purchase price, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("distributionLowPrice")
    public Long distributionLowPrice;

    /**
     * <p>The minimum distribution premium rate. A value of 133 indicates 1.33%.</p>
     * 
     * <strong>example:</strong>
     * <p>133</p>
     */
    @NameInMap("distributionLowPriceRatio")
    public Long distributionLowPriceRatio;

    /**
     * <p>The maximum strikethrough price, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("highMarkPrice")
    public Long highMarkPrice;

    /**
     * <p>The maximum suggested retail price, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("highPrice")
    public Long highPrice;

    /**
     * <p>Specifies whether the product is added to the inventory.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("inGroup")
    public Boolean inGroup;

    /**
     * <p>The end time when the product was added to the inventory. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("inGroupEndTime")
    public String inGroupEndTime;

    /**
     * <p>The start time when the product was added to the inventory. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("inGroupStartTime")
    public String inGroupStartTime;

    /**
     * <p>The inventory risk level.</p>
     * 
     * <strong>example:</strong>
     * <p>Low</p>
     */
    @NameInMap("inventoryRiskLevel")
    public String inventoryRiskLevel;

    /**
     * <p>The LM product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxxx</p>
     */
    @NameInMap("lmItemId")
    public String lmItemId;

    /**
     * <p>The minimum strikethrough price, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("lowMarkPrice")
    public Long lowMarkPrice;

    /**
     * <p>The minimum suggested retail price, in cents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("lowPrice")
    public Long lowPrice;

    /**
     * <p>The end time of the modification. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("modifyEndTime")
    public String modifyEndTime;

    /**
     * <p>The start time of the modification. The format is yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("modifyStartTime")
    public String modifyStartTime;

    /**
     * <p>The sort field.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be used in combination with the sort direction parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>soldQuantity (sorts by sales volume. If not specified, the default is descending order of creation time)</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>The sort direction.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter must be used in combination with the sort field parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items per page.</p>
     * <blockquote>
     * <ul>
     * <li>Maximum value: 20.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The source platform.</p>
     * 
     * <strong>example:</strong>
     * <p>Taobao (sourced from Taobao)
     * Tmall (sourced from Tmall)
     * Cbu (sourced from the 1688 distribution platform)</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>Plants</p>
     */
    @NameInMap("productName")
    public String productName;

    /**
     * <p>The product status.</p>
     * 
     * <strong>example:</strong>
     * <p>Sellable</p>
     */
    @NameInMap("productStatus")
    public String productStatus;

    /**
     * <p>The ID of the purchaser.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PIDxxxx</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>The tax rate.</p>
     * <blockquote>
     * <ul>
     * <li>You can combine multiple tax rate enum values. Separate the values with commas (,). Example: Rate0,Rate1.</li>
     * <li>HasRate cannot be combined with other enum values.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Rate0</p>
     */
    @NameInMap("taxRate")
    public String taxRate;

    /**
     * <p>The sales mode.</p>
     * 
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

    public SearchProductsRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
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
