// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSlowQueryResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        // 查询源地址
        @NameInMap("InitialAddress")
        public String initialAddress;

        // 查询ID
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        // 查询用户
        @NameInMap("InitialUser")
        public String initialUser;

        // 查询内存使用峰值
        @NameInMap("MemoryUsage")
        public Long memoryUsage;

        @NameInMap("Query")
        public String query;

        // 查询持续时间 毫秒
        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        // 查询起始时间 UTC时间
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        // 查询状态
        @NameInMap("QueryState")
        public String queryState;

        @NameInMap("ReadBytes")
        public Long readBytes;

        @NameInMap("ReadRows")
        public Long readRows;

        @NameInMap("ResultBytes")
        public Long resultBytes;

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
