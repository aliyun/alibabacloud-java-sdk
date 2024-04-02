// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class ExportOssResultRequest extends TeaModel {
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

    @NameInMap("PageSize")
    public Integer pageSize;

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

    public static ExportOssResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportOssResultRequest self = new ExportOssResultRequest();
        return TeaModel.build(map, self);
    }

    public ExportOssResultRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public ExportOssResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ExportOssResultRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportOssResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportOssResultRequest setMaxScore(Float maxScore) {
        this.maxScore = maxScore;
        return this;
    }
    public Float getMaxScore() {
        return this.maxScore;
    }

    public ExportOssResultRequest setMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }
    public Float getMinScore() {
        return this.minScore;
    }

    public ExportOssResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExportOssResultRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ExportOssResultRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExportOssResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ExportOssResultRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ExportOssResultRequest setStock(Boolean stock) {
        this.stock = stock;
        return this;
    }
    public Boolean getStock() {
        return this.stock;
    }

    public ExportOssResultRequest setStockTaskId(Long stockTaskId) {
        this.stockTaskId = stockTaskId;
        return this;
    }
    public Long getStockTaskId() {
        return this.stockTaskId;
    }

    public ExportOssResultRequest setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public ExportOssResultRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
