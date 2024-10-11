// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSlowQueryResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>48CBEEBE-FA07-5A06-8BA4-567B92ADD6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSlowQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryResponseBody self = new DescribeSlowQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryResponseBody setData(java.util.List<DescribeSlowQueryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSlowQueryResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSlowQueryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSlowQueryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSlowQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlowQueryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSlowQueryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>::ffff:10.1.XX.XX</p>
         */
        @NameInMap("InitialAddress")
        public String initialAddress;

        /**
         * <strong>example:</strong>
         * <p>7c28bbbb-753b-4eba-98b1-efcbe2b9bdf6</p>
         */
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InitialUser")
        public String initialUser;

        /**
         * <strong>example:</strong>
         * <p>1024000000</p>
         */
        @NameInMap("MemoryUsage")
        public Long memoryUsage;

        /**
         * <strong>example:</strong>
         * <p>select * from test order by score limit 1;</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        /**
         * <strong>example:</strong>
         * <p>2021-02-02T08:30:00Z</p>
         */
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        /**
         * <strong>example:</strong>
         * <p>QueryFinish</p>
         */
        @NameInMap("QueryState")
        public String queryState;

        /**
         * <strong>example:</strong>
         * <p>9141300000</p>
         */
        @NameInMap("ReadBytes")
        public Long readBytes;

        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("ReadRows")
        public Long readRows;

        /**
         * <strong>example:</strong>
         * <p>8174</p>
         */
        @NameInMap("ResultBytes")
        public Long resultBytes;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResultRows")
        public Long resultRows;

        public static DescribeSlowQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowQueryResponseBodyData self = new DescribeSlowQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSlowQueryResponseBodyData setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeSlowQueryResponseBodyData setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeSlowQueryResponseBodyData setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeSlowQueryResponseBodyData setMemoryUsage(Long memoryUsage) {
            this.memoryUsage = memoryUsage;
            return this;
        }
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        public DescribeSlowQueryResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeSlowQueryResponseBodyData setQueryDurationMs(Long queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public Long getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeSlowQueryResponseBodyData setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public DescribeSlowQueryResponseBodyData setQueryState(String queryState) {
            this.queryState = queryState;
            return this;
        }
        public String getQueryState() {
            return this.queryState;
        }

        public DescribeSlowQueryResponseBodyData setReadBytes(Long readBytes) {
            this.readBytes = readBytes;
            return this;
        }
        public Long getReadBytes() {
            return this.readBytes;
        }

        public DescribeSlowQueryResponseBodyData setReadRows(Long readRows) {
            this.readRows = readRows;
            return this;
        }
        public Long getReadRows() {
            return this.readRows;
        }

        public DescribeSlowQueryResponseBodyData setResultBytes(Long resultBytes) {
            this.resultBytes = resultBytes;
            return this;
        }
        public Long getResultBytes() {
            return this.resultBytes;
        }

        public DescribeSlowQueryResponseBodyData setResultRows(Long resultRows) {
            this.resultRows = resultRows;
            return this;
        }
        public Long getResultRows() {
            return this.resultRows;
        }

    }

}
