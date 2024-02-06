// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAvailableAdvicesResponseBody extends TeaModel {
    /**
     * <p>The queried suggestions.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAvailableAdvicesResponseBodyItems> items;

    /**
     * <p>The page number of the returned page. The value must be an integer that is greater than 0. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page. Default value: 30. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned. The value must be an integer that is greater than or equal to 0. Default value: 0.</p>
     */
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
        /**
         * <p>The time when the suggestion was generated. The time follows the ISO 8601 standard in the yyyyMMdd format. The time is displayed in UTC.</p>
         */
        @NameInMap("AdviceDate")
        public String adviceDate;

        /**
         * <p>The suggestion ID.</p>
         */
        @NameInMap("AdviceId")
        public String adviceId;

        /**
         * <p>The type of the suggestion. Valid values:</p>
         * <br>
         * <p>*   **Index**: index optimization.</p>
         * <p>*   **Tiering**: hot and cold data optimization.</p>
         */
        @NameInMap("AdviceType")
        public String adviceType;

        /**
         * <p>The benefit of the suggestion.</p>
         */
        @NameInMap("Benefit")
        public String benefit;

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <br>
         * <p>*   **30** (default)</p>
         * <p>*   **50**</p>
         * <p>*   **100**</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The reason why the suggestion was generated.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The SQL statement that is used to apply the suggestion.</p>
         */
        @NameInMap("SQL")
        public String SQL;

        /**
         * <p>The total number of entries returned. Minimum value: 0. Default value: 0.</p>
         */
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
