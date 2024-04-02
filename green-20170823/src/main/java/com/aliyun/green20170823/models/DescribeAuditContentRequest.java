// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditContentRequest extends TeaModel {
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

    @NameInMap("KeywordId")
    public String keywordId;

    @NameInMap("Label")
    public String label;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LibType")
    public String libType;

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

    @NameInMap("Suggestion")
    public String suggestion;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuditContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditContentRequest self = new DescribeAuditContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuditContentRequest setAuditResult(String auditResult) {
        this.auditResult = auditResult;
        return this;
    }
    public String getAuditResult() {
        return this.auditResult;
    }

    public DescribeAuditContentRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeAuditContentRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuditContentRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DescribeAuditContentRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeAuditContentRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeAuditContentRequest setKeywordId(String keywordId) {
        this.keywordId = keywordId;
        return this;
    }
    public String getKeywordId() {
        return this.keywordId;
    }

    public DescribeAuditContentRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public DescribeAuditContentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAuditContentRequest setLibType(String libType) {
        this.libType = libType;
        return this;
    }
    public String getLibType() {
        return this.libType;
    }

    public DescribeAuditContentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditContentRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeAuditContentRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeAuditContentRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAuditContentRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeAuditContentRequest setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public DescribeAuditContentRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeAuditContentRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
