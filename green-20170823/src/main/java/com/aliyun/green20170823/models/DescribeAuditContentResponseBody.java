// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditContentResponseBody extends TeaModel {
    @NameInMap("AuditContentList")
    public java.util.List<DescribeAuditContentResponseBodyAuditContentList> auditContentList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuditContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditContentResponseBody self = new DescribeAuditContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditContentResponseBody setAuditContentList(java.util.List<DescribeAuditContentResponseBodyAuditContentList> auditContentList) {
        this.auditContentList = auditContentList;
        return this;
    }
    public java.util.List<DescribeAuditContentResponseBodyAuditContentList> getAuditContentList() {
        return this.auditContentList;
    }

    public DescribeAuditContentResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuditContentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditContentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuditContentResponseBodyAuditContentListFrameResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Offset")
        public Integer offset;

        @NameInMap("Url")
        public String url;

        public static DescribeAuditContentResponseBodyAuditContentListFrameResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditContentResponseBodyAuditContentListFrameResults self = new DescribeAuditContentResponseBodyAuditContentListFrameResults();
            return TeaModel.build(map, self);
        }

        public DescribeAuditContentResponseBodyAuditContentListFrameResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeAuditContentResponseBodyAuditContentListFrameResults setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public DescribeAuditContentResponseBodyAuditContentListFrameResults setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeAuditContentResponseBodyAuditContentListResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeAuditContentResponseBodyAuditContentListResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditContentResponseBodyAuditContentListResults self = new DescribeAuditContentResponseBodyAuditContentListResults();
            return TeaModel.build(map, self);
        }

        public DescribeAuditContentResponseBodyAuditContentListResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeAuditContentResponseBodyAuditContentListResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeAuditContentResponseBodyAuditContentListResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class DescribeAuditContentResponseBodyAuditContentList extends TeaModel {
        @NameInMap("Audit")
        public Integer audit;

        @NameInMap("AuditIllegalReasons")
        public java.util.List<String> auditIllegalReasons;

        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Content")
        public String content;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FrameResults")
        public java.util.List<DescribeAuditContentResponseBodyAuditContentListFrameResults> frameResults;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NewUrl")
        public String newUrl;

        @NameInMap("RequestTime")
        public String requestTime;

        @NameInMap("Results")
        public java.util.List<DescribeAuditContentResponseBodyAuditContentListResults> results;

        @NameInMap("ScanFinishedTime")
        public String scanFinishedTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Url")
        public String url;

        public static DescribeAuditContentResponseBodyAuditContentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditContentResponseBodyAuditContentList self = new DescribeAuditContentResponseBodyAuditContentList();
            return TeaModel.build(map, self);
        }

        public DescribeAuditContentResponseBodyAuditContentList setAudit(Integer audit) {
            this.audit = audit;
            return this;
        }
        public Integer getAudit() {
            return this.audit;
        }

        public DescribeAuditContentResponseBodyAuditContentList setAuditIllegalReasons(java.util.List<String> auditIllegalReasons) {
            this.auditIllegalReasons = auditIllegalReasons;
            return this;
        }
        public java.util.List<String> getAuditIllegalReasons() {
            return this.auditIllegalReasons;
        }

        public DescribeAuditContentResponseBodyAuditContentList setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public DescribeAuditContentResponseBodyAuditContentList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeAuditContentResponseBodyAuditContentList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAuditContentResponseBodyAuditContentList setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeAuditContentResponseBodyAuditContentList setFrameResults(java.util.List<DescribeAuditContentResponseBodyAuditContentListFrameResults> frameResults) {
            this.frameResults = frameResults;
            return this;
        }
        public java.util.List<DescribeAuditContentResponseBodyAuditContentListFrameResults> getFrameResults() {
            return this.frameResults;
        }

        public DescribeAuditContentResponseBodyAuditContentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAuditContentResponseBodyAuditContentList setNewUrl(String newUrl) {
            this.newUrl = newUrl;
            return this;
        }
        public String getNewUrl() {
            return this.newUrl;
        }

        public DescribeAuditContentResponseBodyAuditContentList setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public DescribeAuditContentResponseBodyAuditContentList setResults(java.util.List<DescribeAuditContentResponseBodyAuditContentListResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DescribeAuditContentResponseBodyAuditContentListResults> getResults() {
            return this.results;
        }

        public DescribeAuditContentResponseBodyAuditContentList setScanFinishedTime(String scanFinishedTime) {
            this.scanFinishedTime = scanFinishedTime;
            return this;
        }
        public String getScanFinishedTime() {
            return this.scanFinishedTime;
        }

        public DescribeAuditContentResponseBodyAuditContentList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeAuditContentResponseBodyAuditContentList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAuditContentResponseBodyAuditContentList setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public DescribeAuditContentResponseBodyAuditContentList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
