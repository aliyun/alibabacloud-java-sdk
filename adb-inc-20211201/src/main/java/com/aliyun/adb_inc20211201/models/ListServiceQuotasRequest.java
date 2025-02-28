// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ListServiceQuotasRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("CategoryEnum")
    public String categoryEnum;

    @NameInMap("DimensionGroupKey")
    public String dimensionGroupKey;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("UseCache")
    public Boolean useCache;

    public static ListServiceQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQuotasRequest self = new ListServiceQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceQuotasRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public ListServiceQuotasRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ListServiceQuotasRequest setCategoryEnum(String categoryEnum) {
        this.categoryEnum = categoryEnum;
        return this;
    }
    public String getCategoryEnum() {
        return this.categoryEnum;
    }

    public ListServiceQuotasRequest setDimensionGroupKey(String dimensionGroupKey) {
        this.dimensionGroupKey = dimensionGroupKey;
        return this;
    }
    public String getDimensionGroupKey() {
        return this.dimensionGroupKey;
    }

    public ListServiceQuotasRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public ListServiceQuotasRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServiceQuotasRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceQuotasRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceQuotasRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListServiceQuotasRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ListServiceQuotasRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListServiceQuotasRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListServiceQuotasRequest setUseCache(Boolean useCache) {
        this.useCache = useCache;
        return this;
    }
    public Boolean getUseCache() {
        return this.useCache;
    }

}
