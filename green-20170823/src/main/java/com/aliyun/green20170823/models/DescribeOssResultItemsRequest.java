// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssResultItemsRequest extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxScore")
    public Float maxScore;

    @NameInMap("MinScore")
    public Float minScore;

    @NameInMap("Object")
    public String object;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryId")
    public String queryId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Stock")
    public Boolean stock;

    @NameInMap("StockTaskId")
    public Long stockTaskId;

    @NameInMap("Suggestion")
    public String suggestion;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeOssResultItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssResultItemsRequest self = new DescribeOssResultItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssResultItemsRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public DescribeOssResultItemsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssResultItemsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeOssResultItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssResultItemsRequest setMaxScore(Float maxScore) {
        this.maxScore = maxScore;
        return this;
    }
    public Float getMaxScore() {
        return this.maxScore;
    }

    public DescribeOssResultItemsRequest setMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }
    public Float getMinScore() {
        return this.minScore;
    }

    public DescribeOssResultItemsRequest setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public DescribeOssResultItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssResultItemsRequest setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public DescribeOssResultItemsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeOssResultItemsRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeOssResultItemsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOssResultItemsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeOssResultItemsRequest setStock(Boolean stock) {
        this.stock = stock;
        return this;
    }
    public Boolean getStock() {
        return this.stock;
    }

    public DescribeOssResultItemsRequest setStockTaskId(Long stockTaskId) {
        this.stockTaskId = stockTaskId;
        return this;
    }
    public Long getStockTaskId() {
        return this.stockTaskId;
    }

    public DescribeOssResultItemsRequest setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public DescribeOssResultItemsRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
