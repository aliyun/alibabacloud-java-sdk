// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAppliedAdvicesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAppliedAdvicesResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAppliedAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliedAdvicesResponseBody self = new DescribeAppliedAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppliedAdvicesResponseBody setItems(java.util.List<DescribeAppliedAdvicesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAppliedAdvicesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAppliedAdvicesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppliedAdvicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAppliedAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppliedAdvicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppliedAdvicesResponseBodyItems extends TeaModel {
        @NameInMap("AdviceId")
        public String adviceId;

        @NameInMap("Benefit")
        public String benefit;

        @NameInMap("BuildSQL")
        public String buildSQL;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("RollbackSQL")
        public String rollbackSQL;

        @NameInMap("SQL")
        public String SQL;

        @NameInMap("SubmitStatus")
        public String submitStatus;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAppliedAdvicesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppliedAdvicesResponseBodyItems self = new DescribeAppliedAdvicesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAppliedAdvicesResponseBodyItems setAdviceId(String adviceId) {
            this.adviceId = adviceId;
            return this;
        }
        public String getAdviceId() {
            return this.adviceId;
        }

        public DescribeAppliedAdvicesResponseBodyItems setBenefit(String benefit) {
            this.benefit = benefit;
            return this;
        }
        public String getBenefit() {
            return this.benefit;
        }

        public DescribeAppliedAdvicesResponseBodyItems setBuildSQL(String buildSQL) {
            this.buildSQL = buildSQL;
            return this;
        }
        public String getBuildSQL() {
            return this.buildSQL;
        }

        public DescribeAppliedAdvicesResponseBodyItems setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public DescribeAppliedAdvicesResponseBodyItems setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAppliedAdvicesResponseBodyItems setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAppliedAdvicesResponseBodyItems setRollbackSQL(String rollbackSQL) {
            this.rollbackSQL = rollbackSQL;
            return this;
        }
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSubmitStatus(String submitStatus) {
            this.submitStatus = submitStatus;
            return this;
        }
        public String getSubmitStatus() {
            return this.submitStatus;
        }

        public DescribeAppliedAdvicesResponseBodyItems setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public DescribeAppliedAdvicesResponseBodyItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
