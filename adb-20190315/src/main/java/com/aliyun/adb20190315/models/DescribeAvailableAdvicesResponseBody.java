// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAvailableAdvicesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeAvailableAdvicesResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAvailableAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableAdvicesResponseBody self = new DescribeAvailableAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableAdvicesResponseBody setItems(java.util.List<DescribeAvailableAdvicesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAvailableAdvicesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAvailableAdvicesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAvailableAdvicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAvailableAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableAdvicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAvailableAdvicesResponseBodyItems extends TeaModel {
        @NameInMap("AdviceDate")
        public String adviceDate;

        @NameInMap("AdviceId")
        public String adviceId;

        @NameInMap("AdviceType")
        public String adviceType;

        @NameInMap("Benefit")
        public String benefit;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SQL")
        public String SQL;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAvailableAdvicesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableAdvicesResponseBodyItems self = new DescribeAvailableAdvicesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableAdvicesResponseBodyItems setAdviceDate(String adviceDate) {
            this.adviceDate = adviceDate;
            return this;
        }
        public String getAdviceDate() {
            return this.adviceDate;
        }

        public DescribeAvailableAdvicesResponseBodyItems setAdviceId(String adviceId) {
            this.adviceId = adviceId;
            return this;
        }
        public String getAdviceId() {
            return this.adviceId;
        }

        public DescribeAvailableAdvicesResponseBodyItems setAdviceType(String adviceType) {
            this.adviceType = adviceType;
            return this;
        }
        public String getAdviceType() {
            return this.adviceType;
        }

        public DescribeAvailableAdvicesResponseBodyItems setBenefit(String benefit) {
            this.benefit = benefit;
            return this;
        }
        public String getBenefit() {
            return this.benefit;
        }

        public DescribeAvailableAdvicesResponseBodyItems setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAvailableAdvicesResponseBodyItems setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAvailableAdvicesResponseBodyItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAvailableAdvicesResponseBodyItems setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

        public DescribeAvailableAdvicesResponseBodyItems setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
