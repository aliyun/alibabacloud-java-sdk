// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SearchProductsRequest extends TeaModel {
    /**
     * <p>Brand name</p>
     * 
     * <strong>example:</strong>
     * <p>绿植</p>
     */
    @NameInMap("brandName")
    public String brandName;

    /**
     * <p>Collection of category IDs</p>
     */
    @NameInMap("categoryIds")
    public java.util.List<String> categoryIds;

    /**
     * <p>Creation end time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("createEndTime")
    public String createEndTime;

    /**
     * <p>Creation start time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("createStartTime")
    public String createStartTime;

    /**
     * <p>Upper limit of distribution purchase price</p>
     * 
     * <strong>example:</strong>
     * <p>100（单位：分）</p>
     */
    @NameInMap("distributionHighPrice")
    public Long distributionHighPrice;

    /**
     * <p>Upper limit of distribution premium rate</p>
     * 
     * <strong>example:</strong>
     * <p>244（2.44%）</p>
     */
    @NameInMap("distributionHighPriceRatio")
    public Long distributionHighPriceRatio;

    /**
     * <p>Lower limit of distribution purchase price</p>
     * 
     * <strong>example:</strong>
     * <p>100（单位：分）</p>
     */
    @NameInMap("distributionLowPrice")
    public Long distributionLowPrice;

    /**
     * <p>Lower limit of distribution premium rate</p>
     * 
     * <strong>example:</strong>
     * <p>133（1.33%）</p>
     */
    @NameInMap("distributionLowPriceRatio")
    public Long distributionLowPriceRatio;

    /**
     * <p>Upper limit of strikethrough price</p>
     * 
     * <strong>example:</strong>
     * <p>100（单位：分）</p>
     */
    @NameInMap("highMarkPrice")
    public Long highMarkPrice;

    /**
     * <p>Upper limit of suggested retail price</p>
     * 
     * <strong>example:</strong>
     * <p>100（单位：分）</p>
     */
    @NameInMap("highPrice")
    public Long highPrice;

    /**
     * <p>Whether the product is in inventory</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("inGroup")
    public Boolean inGroup;

    /**
     * <p>End time of the product’s entry period.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("inGroupEndTime")
    public String inGroupEndTime;

    /**
     * <p>Inventory start time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("inGroupStartTime")
    public String inGroupStartTime;

    /**
     * <p>Inventory risk level</p>
     * 
     * <strong>example:</strong>
     * <p>Low</p>
     */
    @NameInMap("inventoryRiskLevel")
    public String inventoryRiskLevel;

    /**
     * <p>LM product ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-xxxxx</p>
     */
    @NameInMap("lmItemId")
    public String lmItemId;

    /**
     * <p>Lower limit of strikethrough price</p>
     * 
     * <strong>example:</strong>
     * <p>100（单位：分）</p>
     */
    @NameInMap("lowMarkPrice")
    public Long lowMarkPrice;

    /**
     * <p>Lower limit of suggested retail price</p>
     * 
     * <strong>example:</strong>
     * <p>100（单位：分）</p>
     */
    @NameInMap("lowPrice")
    public Long lowPrice;

    /**
     * <p>Modification end time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("modifyEndTime")
    public String modifyEndTime;

    /**
     * <p>Modification start time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-02 12:23:34
     * (yyyy-MM-dd HH:mm:ss)</p>
     */
    @NameInMap("modifyStartTime")
    public String modifyStartTime;

    /**
     * <p>Sort field</p>
     * <blockquote>
     * <ul>
     * <li>Used in combination with the sort direction field</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>soldQuantity（按销量排序，不填默认创建时间倒序)</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>Sort direction</p>
     * <blockquote>
     * <ul>
     * <li>Used in combination with the sort field</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>Page number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * <blockquote>
     * <ul>
     * <li>Maximum of 20 items per page</li>
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
     * <p>Source platform</p>
     * 
     * <strong>example:</strong>
     * <p>Taobao（来源淘宝）
     * Tmall（来源天猫）
     * Cbu（来源1688分销货盘）</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>Product ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxx</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>Product name</p>
     * 
     * <strong>example:</strong>
     * <p>绿植</p>
     */
    @NameInMap("productName")
    public String productName;

    /**
     * <p>Product status</p>
     * 
     * <strong>example:</strong>
     * <p>Sellable</p>
     */
    @NameInMap("productStatus")
    public String productStatus;

    /**
     * <p>Purchaser ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PIDxxxx</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>Tax rate</p>
     * <blockquote>
     * <ul>
     * <li><p>Supports combining multiple tax rate enumeration values as request parameters. Use commas to separate them, for example: Rate0,Rate1.</p>
     * </li>
     * <li><p>HasRate cannot be combined with other enumeration values as request parameters.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Rate0</p>
     */
    @NameInMap("taxRate")
    public String taxRate;

    /**
     * <p>Sales pattern</p>
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
