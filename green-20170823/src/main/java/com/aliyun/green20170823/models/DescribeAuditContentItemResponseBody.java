// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeAuditContentItemResponseBody extends TeaModel {
    @NameInMap("AuditContentItemList")
    public java.util.List<DescribeAuditContentItemResponseBodyAuditContentItemList> auditContentItemList;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuditContentItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuditContentItemResponseBody self = new DescribeAuditContentItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuditContentItemResponseBody setAuditContentItemList(java.util.List<DescribeAuditContentItemResponseBodyAuditContentItemList> auditContentItemList) {
        this.auditContentItemList = auditContentItemList;
        return this;
    }
    public java.util.List<DescribeAuditContentItemResponseBodyAuditContentItemList> getAuditContentItemList() {
        return this.auditContentItemList;
    }

    public DescribeAuditContentItemResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAuditContentItemResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuditContentItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuditContentItemResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuditContentItemResponseBodyAuditContentItemList extends TeaModel {
        @NameInMap("Audit")
        public Integer audit;

        @NameInMap("AuditIllegalReasons")
        public java.util.List<String> auditIllegalReasons;

        @NameInMap("AuditResult")
        public String auditResult;

        @NameInMap("Content")
        public String content;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ParentTaskId")
        public String parentTaskId;

        @NameInMap("Sn")
        public Integer sn;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        public static DescribeAuditContentItemResponseBodyAuditContentItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuditContentItemResponseBodyAuditContentItemList self = new DescribeAuditContentItemResponseBodyAuditContentItemList();
            return TeaModel.build(map, self);
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setAudit(Integer audit) {
            this.audit = audit;
            return this;
        }
        public Integer getAudit() {
            return this.audit;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setAuditIllegalReasons(java.util.List<String> auditIllegalReasons) {
            this.auditIllegalReasons = auditIllegalReasons;
            return this;
        }
        public java.util.List<String> getAuditIllegalReasons() {
            return this.auditIllegalReasons;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setAuditResult(String auditResult) {
            this.auditResult = auditResult;
            return this;
        }
        public String getAuditResult() {
            return this.auditResult;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setParentTaskId(String parentTaskId) {
            this.parentTaskId = parentTaskId;
            return this;
        }
        public String getParentTaskId() {
            return this.parentTaskId;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setSn(Integer sn) {
            this.sn = sn;
            return this;
        }
        public Integer getSn() {
            return this.sn;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAuditContentItemResponseBodyAuditContentItemList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
