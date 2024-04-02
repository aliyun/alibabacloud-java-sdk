// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeViewContentRequest extends TeaModel {
    @NameInMap("AuditResult")
    public String auditResult;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("KeywordId")
    public String keywordId;

    @NameInMap("Label")
    public String label;

    @NameInMap("LibType")
    public String libType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Suggestion")
    public String suggestion;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeViewContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeViewContentRequest self = new DescribeViewContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeViewContentRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public DescribeViewContentRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeViewContentRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeViewContentRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DescribeViewContentRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeViewContentRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeViewContentRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeViewContentRequest setKeywordId(String keywordId) {
        this.keywordId = keywordId;
        return this;
    }
    public String getKeywordId() {
        return this.keywordId;
    }

    public DescribeViewContentRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public DescribeViewContentRequest setLibType(String libType) {
        this.libType = libType;
        return this;
    }
    public String getLibType() {
        return this.libType;
    }

    public DescribeViewContentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeViewContentRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeViewContentRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeViewContentRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeViewContentRequest setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public DescribeViewContentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeViewContentRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
